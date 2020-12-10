package com.shakhovmv.rostelecom.controller;

import com.shakhovmv.rostelecom.service.UserService;
import com.shakhovmv.rostelecom.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class RostelecomRestController {

    @Autowired
    UserService userService;

    @RequestMapping("/")
    ResponseEntity<Void> main(){return ResponseEntity.ok().build();}

    @RequestMapping(path = "/saveToDB", consumes = "application/json", method = RequestMethod.POST)
    ResponseEntity<Void> saveToDB(@RequestBody User user){
        userService.saveToDB(user);
        return ResponseEntity.ok().build();
    }

    @RequestMapping(path = "/saveToFile", consumes = "application/json", method = RequestMethod.POST)
    ResponseEntity<Void> saveToFile(@RequestBody User user){
        userService.saveToFile(user);
        return ResponseEntity.ok().build();
    }
}
