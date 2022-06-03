package co.edu.unbosque.proyecto.controller;


import co.edu.unbosque.proyecto.Pojo.MessagePojo;
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
@CrossOrigin(origins = "https://localhost:4200")
public class userController {

    @Autowired
    private emailService emailService;
    @Autowired
    co.edu.unbosque.proyecto.service.userService userService;


    @GetMapping("/listUser")
    public List<UserPojo> listUser(){
        return userService.list();
    }

    @PostMapping("/createUser")
    public MessagePojo createUser(@RequestBody UserPojo userPojo){
        MessagePojo userPojo1= new MessagePojo();
        User user= new User(userPojo.getId(),userPojo.getNombre(),userPojo.getPrioridad(),userPojo.getEdad(),userPojo.getPassword(),userPojo.getCorreo());
        userService.registerUser(user);
        userPojo1.setMessage("registrado");
        return userPojo1;
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

    @PostMapping("/login")
    public MessagePojo login(@RequestBody UserPojo userPojo){
        String nUser=userService.loginUser(userPojo);
        MessagePojo userPojo1= new MessagePojo();
        userPojo1.setMessage(nUser);
        return userPojo1;
    }



}
