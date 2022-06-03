package co.edu.unbosque.proyecto.service;

import co.edu.unbosque.proyecto.Pojo.UserPojo;
import co.edu.unbosque.proyecto.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import co.edu.unbosque.proyecto.repositories.UserRepository;
import java.util.ArrayList;
import java.util.List;


@Service
@Transactional

public class userService {

    @Autowired
    UserRepository userRepository;

    public List<User> list(){

        return userRepository.findAll();
    }

    public User registerUser(User user){

        User newUser= new User(user.getId(), user.getNombre(),user.getPrioridad(),user.getEdad(),user.getPassword(),user.getCorreo());
        userRepository.registerUser(newUser);
        System.out.println(user.getPassword());

        return newUser;
    }

    public String loginUser(UserPojo userPojo){
        return userRepository.loginUser(userPojo);
    }
}
