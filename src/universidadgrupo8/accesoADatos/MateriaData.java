
package universidadgrupo8.accesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import universidadgrupo8.entidad.Materia;


public class MateriaData {
        
     Connection con = null;

    public MateriaData() {
        
        con = Conexion.getConexion();
    }
     
     public void guardarMateria(Materia materia){
     
         String sql = "INSERT INTO materia( nombre,año, estado) VALUES (?,?,?)";
         
         try {
             PreparedStatement ps =  con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
             ps.setString(1,materia.getNombre());
             ps.setInt(2,materia.getAño());
             ps.setBoolean(3,materia.isEstado());
             ps.executeUpdate();
             
             ResultSet  rs = ps.getGeneratedKeys();
             if(rs.next()){
                 materia.setIdMateria(rs.getInt(1));
                 JOptionPane.showMessageDialog(null, "Materia Guardado");
             
             }
             ps.close();
             
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia");
         }
         
        
     
     
     }
      public Materia buscarmateria(int id){
          
          Materia materia = null;
          
          String sql = "SELECT  nombre, año, estado FROM materia WHERE id_materia = ? AND estado = 1";
          PreparedStatement ps = null;
          
         try {
             ps = con.prepareStatement(sql);
             ps.setInt(1,id);
             ResultSet rs = ps.executeQuery();
             
             if(rs.next()){
                 materia = new Materia();
                 materia.setIdMateria(id);
                 materia.setNombre(rs.getString("nombre"));
                 materia.setAño(rs.getInt("año"));
                 materia.setEstado(true);
                 
             
             }else{
                 JOptionPane.showMessageDialog(null, "No existe la materia");
                ps.close();
             }
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia "+ex.getMessage());
         }
         return materia;
         
         
         
         }
     public List<Materia> listarMaterias(){
    
         String sql = "SELECT id_materia, nombre, año FROM materia WHERE estado = 1";
         List<Materia> materias= new ArrayList<>();
         
         try{
         
             PreparedStatement ps = con.prepareStatement(sql);
             
             ResultSet rs = ps.executeQuery();
             
             while(rs.next()){
             
                 Materia materia = new Materia();
                 materia.setIdMateria(rs.getInt("id_materia"));
                 materia.setNombre(rs.getString("nombre"));
                 materia.setAño(rs.getInt("año"));
                 materia.setEstado(true);
                    
                 materias.add(materia);
             
             }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia "+ex.getMessage());
        }   
         return materias;
    }
     
     public void modificarMateria(Materia materia){
     
           String sql = "UPDATE materia SET nombre = ?,año = ? WHERE id_materia = ?";
           
         try {
             PreparedStatement ps = con.prepareStatement(sql);
             ps.setString(1, materia.getNombre());
             ps.setInt(2, materia.getAño());
             ps.setInt(3,materia.getIdMateria());
             int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "materia Modificado");
            }
             
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia");
         }
         
     
     
     
     
     }
     public void eliminarMateria(int id){
     
         String sql="UPDATE materia SET estado = 0 WHERE id_materia = ?";
        PreparedStatement ps;
         try {
             ps = con.prepareStatement(sql);
             ps.setInt(1,id);
                int exito=ps.executeUpdate();
                if (exito==1) {
                    JOptionPane.showMessageDialog(null,"Materia eliminado");
                }
         } catch (SQLException ex) {
             Logger.getLogger(MateriaData.class.getName()).log(Level.SEVERE, null, ex);
         }
     
     
     
     }

    
}
