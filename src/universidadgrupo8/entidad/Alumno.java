
package universidadgrupo8.entidad;

import java.time.LocalDate;
import java.util.Date;


public class Alumno {
    
    private int idAlumno;
    private int dni;
    private String nombre;
    private String apellido;
    private LocalDate fechaNac;
    private boolean estado;

    public Alumno() {
    }

    public Alumno(int idAlumno, int dni, String nombre, String apellido, LocalDate fechaNac, boolean estado) {
        this.idAlumno = idAlumno;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
        this.estado = estado;
    }

    public Alumno(int dni, String nombre, String apellido, LocalDate fechaNac, boolean estado) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
        this.estado = estado;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
    return nombre+" "+ dni;
                }
}
    
    
    

