package com.kkcheah.badminton_player_profile.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ControllerIT {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testGet() throws Exception{
        ResponseEntity<String> response = restTemplate.getForEntity("/test", String.class);
        System.out.println("testGet log: " + response.toString());
        assertThat(response.getStatusCode()).isEqualTo(HttpStatusCode.valueOf(200));
    }

}
