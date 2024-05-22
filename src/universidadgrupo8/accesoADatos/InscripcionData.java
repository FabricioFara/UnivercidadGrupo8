
package universidadgrupo8.accesoADatos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import universidadgrupo8.entidad.Alumno;
import universidadgrupo8.entidad.Inscripcion;
import universidadgrupo8.entidad.Materia;


public class InscripcionData {
    private Connection con = null;
    private AlumnoData ad = new AlumnoData();
    private MateriaData md = new MateriaData();

    public InscripcionData() {
        this.con = Conexion.getConexion();
    }
    
    public void guardarInscripcion(Inscripcion insc){
    
        String sql = "INSERT INTO inscripciones (id_alumnos,id_materia,nota) VALUES (?,?,?) ";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, insc.getAlumno().getIdAlumno());
            ps.setInt(2, insc.getMateria().getIdMateria());
            ps.setDouble(3, insc.getNota());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()){
                insc.setIdInscripcion(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Inscripcion registrada");
            
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error a acceder a la tabla de inscripciones");
        }
    
    
    }
     public List<Inscripcion> obtenerInscripcion(){
     
         ArrayList<Inscripcion> cursadas = new ArrayList<>();
         
         String sql = "SELECT * FROM inscripciones";
         
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Inscripcion insc=new Inscripcion();
                insc.setIdInscripcion(rs.getInt("id_inscripciones"));
                Alumno alu=ad.buscarAlumno(rs.getInt("id_alumnos"));
                Materia mat=md.buscarmateria(rs.getInt("id_materia"));
                insc.setAlumno(alu);
                insc.setMateria(mat);
                insc.setNota(rs.getDouble("nota"));
                cursadas.add(insc);
                
            
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showInternalMessageDialog(null, "Error a acceder a la tabla de inscripciones");
        }
     return cursadas;
     
     
     }
     
     public void actualizarNota(int idAlumno,int idMateria,double nota){
     
         String sql ="UPDATE incripciones SET nota = ? WHERE id_alumno = ? AND id_materia = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1, nota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idMateria);
            int filas =ps.executeUpdate();
            
            if(filas>0){
                JOptionPane.showInternalMessageDialog(null, "Nota actualizada");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showInternalMessageDialog(null, "Error a acceder a la tabla de inscripciones");
        }
     
     
     }
     public void borrarIncripcionMateriaaAlumno(int idAlumno,int idMateria){
     
         String sql="DELETE FROM inscripciones WHERE id_alumnos = ? AND id_materia = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,idAlumno);
            ps.setInt(2, idMateria);
            
            int filas=ps.executeUpdate();
            if(filas>0){
                JOptionPane.showInternalMessageDialog(null, "Inscripcion eliminada");
            
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showInternalMessageDialog(null, "Error a acceder a la tabla de inscripciones");
        }
     
     
     }
}
