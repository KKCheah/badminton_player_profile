package com.kkcheah.badminton_player_profile.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String getCall(){
        return "getCall has been called";
    }
}
