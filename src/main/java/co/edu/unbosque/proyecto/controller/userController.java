package co.edu.unbosque.proyecto.controller;


import co.edu.unbosque.proyecto.Pojo.UserPojo;
import co.edu.unbosque.proyecto.models.User;
import co.edu.unbosque.proyecto.service.emailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "https://localhost:8080")
public class userController {

    @Autowired
    private emailService emailService;
    @Autowired
    co.edu.unbosque.proyecto.service.userService userService;




    @PostMapping("/createUser")
    public ResponseEntity<User> createUser(@RequestBody UserPojo userPojo){

        User user= new User(userPojo.getId(),userPojo.getNombre(),userPojo.getPrioridad(),userPojo.getEdad());
        userService.registerUser(user);
        return new ResponseEntity(user, HttpStatus.OK);
    }

    @PostMapping("/sendEmail")
    public String sendEmail(@RequestBody UserPojo emailPojo){
        try{
            emailService.sendEmail(emailPojo.getCorreo(), "Bienvenido", "Email, Password", "gestiondev.ueb@gmail.com");
            return "Correo enviado";
        }catch (Exception e){
            return e.getMessage();
        }

    }

}
