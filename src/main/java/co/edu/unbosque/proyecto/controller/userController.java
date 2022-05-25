package co.edu.unbosque.proyecto.controller;


import co.edu.unbosque.proyecto.Pojo.UserPojo;
import co.edu.unbosque.proyecto.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "https://localhost:8080")
public class userController {

    @Autowired
    co.edu.unbosque.proyecto.service.userService userService;

    @PostMapping("/createUser")
    public ResponseEntity<User> createUser(@RequestBody UserPojo userPojo){

        User user= new User(userPojo.getId(),userPojo.getNombre(),userPojo.getPrioridad(),userPojo.getEdad());
        userService.registerUser(user);
        return new ResponseEntity(user, HttpStatus.OK);
    }

}
