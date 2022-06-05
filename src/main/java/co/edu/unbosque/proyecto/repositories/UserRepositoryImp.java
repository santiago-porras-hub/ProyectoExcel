package co.edu.unbosque.proyecto.repositories;

import co.edu.unbosque.proyecto.Pojo.UserPojo;
import co.edu.unbosque.proyecto.models.User;
import co.edu.unbosque.proyecto.service.userService;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestParam;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class UserRepositoryImp implements UserRepository{

    @PersistenceContext
    EntityManager entityManager;
    co.edu.unbosque.proyecto.service.userService userService;



    @Override
    public void registerUser(User user) {
        System.out.println(user.getEdad());
        entityManager.merge(user);
    }

    @Override
    public String loginUser(UserPojo userPojo) {

        User user = buscarPorId(userPojo.getId());

        if(user.getPassword().equals(userPojo.getPassword())) {
            return "Ingresado correctamente";
        }else{
            return "Credenciales incorrectas";
        }
    }

    @Override
    public List<UserPojo> findAll() {
        String query = " FROM User";
        List<UserPojo> users = entityManager.createQuery(query).getResultList();
        return users;
    }

    @Override
    public User buscarPorId(Long id) {
        String query = "FROM User where id = " + id;
        List<User> users = entityManager.createQuery(query).getResultList();
        System.out.println("Tamanio = "+users.size());
        return users.get(0);
    }

    @Override
    public User editar(UserPojo userPojo, Long id) {
        String query = "FROM User where id = " + id;
        List<User> users = entityManager.createQuery(query).getResultList();
        User user= users.get(0);
        user.setNombre(userPojo.getNombre());
        user.setPrioridad(userPojo.getPrioridad());
        user.setEdad(userPojo.getEdad());
        user.setCorreo(userPojo.getCorreo());
        entityManager.merge(user);
        return user;
    }



}
