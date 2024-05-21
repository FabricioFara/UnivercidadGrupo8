

package univercidadgrupo8;

import java.sql.Connection;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import universidadgrupo8.accesoADatos.AlumnoData;
import universidadgrupo8.accesoADatos.Conexion;
import universidadgrupo8.accesoADatos.InscripcionData;
import universidadgrupo8.accesoADatos.MateriaData;
import universidadgrupo8.entidad.Alumno;


public class UnivercidadGrupo8 {

    
    public static void main(String[] args) {
        
//        Connection con = Conexion.getConexion();
//        Alumno rosario = new Alumno(7,37829766, "María Rosario", "Perez", LocalDate.of(2000, 02, 15), true);
//        AlumnoData ad = new AlumnoData();
//        List<Alumno> lista = ad.listarAlumnos();
//        
//        //ad.guardarAlumno(rosario);
//        System.out.println(ad.buscarAlumno(5));
//        System.out.println(ad.buscarAlumnoPorDni(349839));
//        ad.modificarAlumno(rosario);
//        System.out.println("Lista de alumnos:");
//        for (Alumno alumno : lista) {
//            System.out.println(alumno);
//        }
//        ad.eliminarAlumno(6);
        
        
        AlumnoData ad = new AlumnoData();
        MateriaData md= new MateriaData();
        InscripcionData id = new InscripcionData();
        
        
    }

}
