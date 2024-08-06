package dev.willtet.messaging_springboot.controller;

import dev.willtet.messaging_springboot.service.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class kafkaController {
    @Autowired
    private Producer service;

    @GetMapping("/{message}")
    public ResponseEntity<Object> message(@PathVariable("message") String message){
        service.sendMessage(message);
        return ResponseEntity.ok().body("Enviado com sucesso");
    }
}
