package modelo;

public class Oradores {

    private int id;
    private String nombre;
    private String apellido;
    private String tema;

    public Oradores(int id, String nombre, String apellido, String tema) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tema = tema;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

}