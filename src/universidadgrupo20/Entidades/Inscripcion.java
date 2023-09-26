
package universidadgrupo20.Entidades;


public class Inscripcion {
    private int idInscripcion;
    private String nombre;
    private Materia materia;
    private Alumno alumno;
    private double nota;

    public Inscripcion(double nota, Alumno alumno, Materia materia ) {
        this.materia = materia;
        this.alumno = alumno;
        this.nota = nota;
    }

    public Inscripcion(String nombre, Materia materia, double nota) {
        this.nombre = nombre;
        this.materia = materia;
        this.nota = nota;
    }

    public Inscripcion(int idInscripcion, String nombre, Materia materia, double nota) {
        this.idInscripcion = idInscripcion;
        this.nombre = nombre;
        this.materia = materia;
        this.nota = nota;
    }

    public Inscripcion() {
    }

    public int getIdInscripcion() {
        return idInscripcion;
    }

    public void setIdInscripcion(int idInscripcion) {
        this.idInscripcion = idInscripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
       String insc= idInscripcion+" "+alumno.getApellido()+", "+alumno.getNombre()+" "+materia.getNombre();
       return insc;

   
    }

    public Object getdAlumno() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setIdIncripcion(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setAlumno(Alumno alu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getIdAlumno() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

