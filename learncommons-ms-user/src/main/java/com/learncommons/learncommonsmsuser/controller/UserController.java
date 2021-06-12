package com.learncommons.learncommonsmsuser.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learncommons.learncommonsmscommons.dto.DTOUser;
import com.learncommons.learncommonsmscommons.enumeration.Gender;
import com.learncommons.learncommonsmscommons.model.User;

@RestController
@RequestMapping("/user")
public class UserController {

    private final List<User> USERS_ON_DATABASE = Arrays.asList(
    		new User(1, "Lovrenco", "p4$$w0rd", Gender.MALE),
    		new User(2, "Nerone90", "p4$$w0rd", Gender.MALE),
    		new User(3, "Chicca", "p4$$w0rd", Gender.FEMALE)
    );

    
    
    @GetMapping("/{idUser}")
    public ResponseEntity<DTOUser> getUserByIdUser( @PathVariable int idUser ){
    	User user = USERS_ON_DATABASE.stream()
    			.filter(u -> u.getIdUser()==idUser).findFirst()
    			.orElseThrow( () -> new RuntimeException("id user '"+idUser+"' not found") );
        return ResponseEntity.ok( user.toDTOUser() );
    }

}
