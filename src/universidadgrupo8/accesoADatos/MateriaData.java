
package universidadgrupo8.accesoADatos;

import java.sql.Connection;


public class MateriaData {
        
     Connection con = null;

    public MateriaData() {
        
        con = Conexion.getConexion();
    }
     
     
    
    
}
