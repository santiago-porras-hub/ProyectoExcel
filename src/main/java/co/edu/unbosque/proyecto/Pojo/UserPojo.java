package co.edu.unbosque.proyecto.Pojo;

public class UserPojo {

    private long id ;
    private String nombre ;
    private int edad;
    private String prioridad;

    public UserPojo() {
    }

    public UserPojo(long id, String nombre, int edad, String prioridad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.prioridad = prioridad;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }
}
