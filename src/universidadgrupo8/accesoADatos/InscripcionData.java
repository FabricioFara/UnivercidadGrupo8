
package universidadgrupo8.accesoADatos;

import java.sql.*;


public class InscripcionData {
    private Connection con = null;
    private AlumnoData ad = new AlumnoData();
    private MateriaData md = new MateriaData();

    public InscripcionData() {
        this.con = Conexion.getConexion();
    }
    
    
}
