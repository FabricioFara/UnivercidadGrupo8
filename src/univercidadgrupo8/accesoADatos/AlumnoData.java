
package univercidadgrupo8.accesoADatos;


import java.sql.*;
import javax.swing.JOptionPane;
import univercidadgrupo8.entidad.Alumno;




public class AlumnoData {
    
    Connection con= null;

    public AlumnoData() {
        
        con=Conexion.getConexion();
    }
    
    public void guardarAlumno(Alumno alumno){
        
        String sql = "INSERT INTO alumnos( dni, apellido, nombre, fechaNacimiento, estado) VALUES (?,?,?,?,?)";
       
        
        try {
            PreparedStatement ps =  con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1,alumno.getDni() );
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4,  Date.valueOf(alumno.getFechaNac()));
            ps.setBoolean(5,alumno.isEstado());
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                alumno.setIdAlumno(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Alumno Guardado");
            }
            ps.close();
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
        }
    
    }
    
}
