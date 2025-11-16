package com.example.dirtyLittleSecret.controller;

import com.example.dirtyLittleSecret.model.dlsModel;
import com.example.dirtyLittleSecret.service.dlsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = {
        "http://dls.srinath.online",
        "https://dls.srinath.online",
        "https://srinath318.github.io",
        "http://127.0.0.1:5500"
})
public class dlsController {

    @Autowired
    dlsService dlsService;

    @GetMapping("")
    public String homePage(){
        return "Share your Dirty Little Secret";
    }

    @GetMapping("/getRandom")
    public String getRandom(){
        return dlsService.getRandomService();
    }

    @GetMapping("/allSecrets")
    public List<dlsModel> allSecrets(){
        return dlsService.allSecretsService();
    }

    @PostMapping("")
    public String postSecret(@RequestParam String secret){
        dlsService.postSecretService(secret);
        return "'" + secret + "'" + " stored successfully";
    }
}
