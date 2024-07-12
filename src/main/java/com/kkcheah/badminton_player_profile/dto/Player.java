package com.kkcheah.badminton_player_profile.dto;

public class Player {
    private Integer id;
    private String name;

    private Integer age;

    Player() {};

    Player(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public Integer getAge(){
        return this.age;
    }

}
