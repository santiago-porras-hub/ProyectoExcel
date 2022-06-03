package co.edu.unbosque.proyecto.repositories;

import co.edu.unbosque.proyecto.Pojo.UserPojo;
import co.edu.unbosque.proyecto.models.User;

import java.util.List;

public interface UserRepository {

   void registerUser(User user );
   String loginUser(UserPojo user);
   List<User> findAll();

   User buscarPorId(Long id);
}
