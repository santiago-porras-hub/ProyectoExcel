package co.edu.unbosque.proyecto.models;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="usuario")
public class User implements Serializable {

   @Id
   @Column(unique = true,nullable = false)
   private long id;
   private String nombre;
   private String prioridad;
   private int edad;
   private String correo;
   private String pass;

    public User(long id, String nombre, String prioridad, int edad, String pass, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.prioridad = prioridad;
        this.edad = edad;
        this.correo = correo;
        this.pass = pass;
    }


    public User() {

    }

    public User(long id) {
        this.id = id;
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

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
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
