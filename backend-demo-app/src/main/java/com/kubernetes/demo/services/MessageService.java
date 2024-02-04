package com.kubernetes.demo.services;

import com.kubernetes.demo.models.Message;
import com.kubernetes.demo.repositories.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {

    @Autowired
    MessageRepository messageRepository;

    public Message sendMessage(Message message){
        return messageRepository.save(message);
    }

    public List<Message> getAllMessages(){
        return (List<Message>) messageRepository.findAll();
    }
}
