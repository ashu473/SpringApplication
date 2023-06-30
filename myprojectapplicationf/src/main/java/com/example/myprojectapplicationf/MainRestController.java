package com.example.myprojectapplicationf;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {

    @PostMapping("getdummyuser")
    public Userdetail getDummyUser(){
        Userdetail udetail = new Userdetail();
        udetail.setUsername("@Ashutosh");
        udetail.setFname("Ashutosh");
        udetail.setLname("Kumar");
        udetail.setEmail("ashutosh@gmail.com");
        udetail.setPhone("7352590587");
        return udetail;
    }

}
