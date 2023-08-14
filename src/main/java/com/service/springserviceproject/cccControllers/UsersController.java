package com.service.springserviceproject.cccControllers;

import com.service.springserviceproject.aaaEntities.abstracts.UsersRepository;
import com.service.springserviceproject.aaaEntities.concretes.Users;
import com.service.springserviceproject.bbbBussines.abstracts.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UsersController  {

    private final UsersService usersService;
    private final UsersRepository usersRepository;

    @Autowired
    public UsersController(UsersService usersService, UsersRepository usersRepository) {
        this.usersService = usersService;
        this.usersRepository = usersRepository;
    }


    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody Users user) {
        Users foundUser = usersRepository.findByName(user.getName());

        if (foundUser != null && foundUser.getPassword().equals(user.getPassword())) {
            return ResponseEntity.ok("Giriş başarılı."); // Başarılı durumda mesajı döndür
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Giriş başarısız."); // Hatalı durumda mesajı döndür
        }
    }

}
