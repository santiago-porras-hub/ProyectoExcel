package co.edu.unbosque.proyecto.service;

import co.edu.unbosque.proyecto.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import co.edu.unbosque.proyecto.repositories.UserRepository;

@Service
@Transactional

public class userService {

    @Autowired
    UserRepository userRepository;

    public User registerUser(User user){

        User newUser= new User(user.getId(), user.getNombre(),user.getEdad(),user.getPrioridad());
        userRepository.registerUser(newUser);
        return newUser;
    }
}
