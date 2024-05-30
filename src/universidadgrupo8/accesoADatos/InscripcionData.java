
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
    public List<Inscripcion> obtenerInscripciones(){
        ArrayList<Inscripcion> cursadas = new ArrayList<>();
        String sql = "SELECT i.id_inscripciones, i.nota, i.id_alumnos, i.id_materia"
                + " FROM inscripciones i, alumnos a WHERE i.id_alumnos = a.id_alumnos AND a.estado = 1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Inscripcion in = new Inscripcion();
                in.setIdInscripcion(rs.getInt("id_inscripciones"));
                Alumno alu = ad.buscarAlumno(rs.getInt("id_alumnos"));
                Materia mat = md.buscarmateria(rs.getInt("id_materia"));
                in.setAlumno(alu);
                in.setMateria(mat);
                in.setNota(rs.getDouble("nota"));
                cursadas.add(in);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al ingresar");
        }
        return cursadas;
    }
    
     
     public List<Inscripcion> obtenerInscripcionesPorAlumno(int idAlumno){
        ArrayList<Inscripcion> cursadas = new ArrayList<>();
        String sql = "SELECT i.id_inscripciones, i.id_alumnos, i.id_materia, nota FROM inscripciones i, materia m"
                + " WHERE id_alumnos = ? AND i.id_materia = m.id_materia AND m.estado = 1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Inscripcion in = new Inscripcion();
                in.setIdInscripcion(rs.getInt("id_inscripciones"));
                Alumno alu = ad.buscarAlumno(rs.getInt("id_alumnos"));
                Materia mat = md.buscarmateria(rs.getInt("id_materia"));
                in.setAlumno(alu);
                in.setMateria(mat);
                in.setNota(rs.getDouble("nota"));
                cursadas.add(in);
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al ingresar");
        }
        return cursadas;
    }
     
     public List<Materia> obtenerMateriasCursadas(int id_alumnos){
        ArrayList<Materia> materias = new ArrayList<>();
        
        String sql = "SELECT i.id_materia, nombre, año FROM materia m, inscripciones i"
                + " WHERE i.id_materia = m.id_materia AND i.id_alumnos = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id_alumnos);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("id_materia"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAño(rs.getInt("año"));
                materias.add(materia);
            }
             ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error a acceder a la tabla de inscripciones");
        }
        
        return materias;
    }
     
     public void actualizarNota(int idAlumno,int idMateria,double nota){
     
         String sql ="UPDATE inscripciones SET nota = ? WHERE id_alumnos = ? AND id_materia = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1, nota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idMateria);
            int filas =ps.executeUpdate();
            
            if(filas>0){
                JOptionPane.showMessageDialog(null, "Nota actualizada");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error a acceder a la tabla de inscripciones");
        }
     
     
     }
     
     public List<Materia> obtenerMateriasNOCursadas(int id_alumnos){
        ArrayList<Materia> materias = new ArrayList<>();
        
        String sql = "SELECT * FROM materia"
                + " WHERE estado = 1 AND id_materia not in (SELECT id_materia FROM inscripciones  WHERE id_alumnos = ?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id_alumnos);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("id_materia"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAño(rs.getInt("año"));
                materias.add(materia);
            }
             ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error a acceder a la tabla de inscripciones");
        }
        
        return materias;
    }
     public void borrarIncripcionMateriaaAlumno(int idAlumno,int idMateria){
     
         String sql="DELETE FROM inscripciones WHERE id_alumnos = ? AND id_materia = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,idAlumno);
            ps.setInt(2, idMateria);
            
            int filas=ps.executeUpdate();
            if(filas>0){
                JOptionPane.showMessageDialog(null, "Inscripcion eliminada");
            
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error a acceder a la tabla de inscripciones");
        }
     
     
     }
     
     public List<Alumno> obtenerAlumnosXMateria(int idMateria){
     
        ArrayList<Alumno> alumnosMateria= new ArrayList<>();
        String sql ="SELECT a.id_alumnos, dni, nombre, apellido,fecha_nacimiento,estado FROM inscripciones i,alumnos a WHERE i.id_alumnos = a.id_alumnos AND id_materia = ? AND a.estado = 1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMateria);
            
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
            
                Alumno alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("id_alumnos"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNac(rs.getDate("fecha_nacimiento").toLocalDate());
                alumno.setEstado(rs.getBoolean("estado"));
                alumnosMateria.add(alumno);
                
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error a acceder a la tabla de inscripciones");
        }
        return alumnosMateria;
}
}