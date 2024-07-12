package com.kkcheah.badminton_player_profile.controller;

import com.kkcheah.badminton_player_profile.dto.Player;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @GetMapping("/test")
    public String getCall(){
        return "getCall has been called";
    }

    @PostMapping("/register")
    @ResponseBody
    public String callRegister(@RequestBody Player player){
        System.out.println("player registered");
        return "name: " + player.getName() + "\nage: " + player.getAge();
    }

    @GetMapping("/userId/{id}")
    public String getUser(@PathVariable Integer id){
        return "Id: " + id;
    }
}
