

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
import universidadgrupo8.entidad.Inscripcion;
import universidadgrupo8.entidad.Materia;


public class UnivercidadGrupo8 {

    
    public static void main(String[] args) {
        
        Connection con = Conexion.getConexion();
        Alumno rosario = new Alumno(7,37829766, "María Rosario", "Perez", LocalDate.of(2000, 02, 15), true);
        AlumnoData ad = new AlumnoData();
        List<Alumno> lista = ad.listarAlumnos();
        
//        ad.guardarAlumno(rosario);
//        System.out.println(ad.buscarAlumno(5));
//        System.out.println(ad.buscarAlumnoPorDni(349839));
//        ad.modificarAlumno(rosario);
//        System.out.println("Lista de alumnos:");
//        for (Alumno alumno : lista) {
//            System.out.println(alumno);
//        }
//        ad.eliminarAlumno(6);
        
        
        MateriaData md= new MateriaData();
        Materia ingles = new Materia("Inglés", 2024, true);
        InscripcionData id = new InscripcionData();
        
//        System.out.println(md.buscarmateria(1));
//        System.out.println("--------------------------------");
       //md.guardarMateria(ingles);
//        md.eliminarMateria(10);
//        ingles = new Materia(10,"Inglés", 2023, false);
//        md.modificarMateria(ingles);
//        List<Materia> listaMaterias = md.listarMaterias();
//        System.out.println("Lista materias:");
//        for (Materia materia : listaMaterias) {
//            System.out.println(materia);
//        }
        
        Materia lengua = md.buscarmateria(2);
        Inscripcion insc = new Inscripcion(rosario, lengua, 10);
        //id.guardarInscripcion(insc);
        id.actualizarNota(6, 3, 10);
        id.borrarIncripcionMateriaaAlumno(7, 2);
        
        List<Alumno> inscAlumnos = id.obtenerAlumnosXMateria(1);
        
        System.out.println("Lista alumnos de matemáticas:");
        for (Alumno alu : inscAlumnos) {
            System.out.println(alu);
        }
        
        List<Inscripcion> inscripciones = id.obtenerInscripciones();
        System.out.println("Lista de todas las inscripciones:");
            for (Inscripcion inscrip : inscripciones) {
                System.out.println(inscrip);
            }
        
        System.out.println("Lista inscripciones de Gonzalo Gomez:");
        List<Inscripcion> listaAlu = id.obtenerInscripcionesPorAlumno(5);
            for (Inscripcion inscripcion : listaAlu) {
                System.out.println(inscripcion);
            }
        
        System.out.println("Lista de materias cursadas por Gonzalo Gomez:");
        List<Materia> listaMateCur = id.obtenerMateriasCursadas(5);
            for (Materia materia : listaMateCur) {
                System.out.println(materia);
            }
        System.out.println("Lista de materias no cursadas por Gonzalo Gomez:");
        List<Materia> listaMateNoCur= id.obtenerMateriasNOCursadas(5);
            for (Materia materia : listaMateNoCur) {
                System.out.println(materia);
            }
        System.out.println("Lista de alumnos de matemática:");
        List<Alumno> listaAluxMate = id.obtenerAlumnosXMateria(1);
            for (Alumno alumno : listaAluxMate) {
                System.out.println(alumno);
            }
    }

}
