package co.edu.unbosque.proyecto.models;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="usuario")
public class User implements Serializable {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(unique = true,nullable = false)
   private long id;
   private String nombre;
   private String prioridad;
   private String edad;

    public User(long id, String nombre, String prioridad, String edad) {
        this.id = id;
        this.nombre = nombre;
        this.prioridad = prioridad;
        this.edad = edad;
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

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
}
