package com.kubernetes.demo.controllers;

import com.kubernetes.demo.models.Message;
import com.kubernetes.demo.services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class MessageController {

    @Autowired
    MessageService messageService;

    @PostMapping(value = "/message/send")
    public ResponseEntity<Message> sendMessage(@RequestBody Message message){
        try{
            return ResponseEntity.ok(messageService.sendMessage(message));
        } catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }

    @GetMapping("/messages")
    public ResponseEntity<List<Message>> getAllMessages(){
        try{
            return ResponseEntity.ok(messageService.getAllMessages());
        } catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }

}
