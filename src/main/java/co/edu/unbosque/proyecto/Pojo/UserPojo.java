package co.edu.unbosque.proyecto.Pojo;

public class UserPojo {

    private long id ;
    private String nombre ;
    private int edad;
    private String prioridad;
    private String correo;
    private String pass;

    public UserPojo() {
    }

    public UserPojo(long id, String nombre, int edad, String prioridad, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.prioridad = prioridad;
        this.correo = correo;
    }

    public UserPojo(long id, String password) {
        this.id = id;
        this.pass = password;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return pass;
    }

    public void setPassword(String password) {
        this.pass = password;
    }
}
