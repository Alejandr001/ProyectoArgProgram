

package universidadgrupo20.Entidades;


public class Materia {
    private int idMateria;
    private String nombre;
    private int anioMateria;
    private boolean activo;
private double nota;

    public int getIdMateria() {
        return idMateria;
    }

    public Materia(int idMateria) {
        this.idMateria = idMateria;
    }

    public Materia(String nombre, int anioMateria, double nota) {
        this.nombre = nombre;
        this.anioMateria = anioMateria;
        this.nota = nota;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }
    public void getIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnioMateria() {
        return anioMateria;
    }

    public void setAnioMateria(int anioMateria) {
        this.anioMateria = anioMateria;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public Materia(String nombre, int anioMateria, boolean activo) {
        this.nombre = nombre;
        this.anioMateria = anioMateria;
        this.activo = activo;
    }

    public Materia() {
    }

    public Materia(int idMateria, String nombre, int anioMateria, boolean activo) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.anioMateria = anioMateria;
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Materia{" + "idMateria=" + idMateria + ", nombre=" + nombre + ", anioMateria=" + anioMateria + '}';
    }

    
    }

