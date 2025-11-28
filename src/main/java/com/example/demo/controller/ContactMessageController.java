package com.example.demo.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.dto.ContactMessage;
import com.example.demo.service.ContactMessageService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/contactMessages")
@RequiredArgsConstructor
@CrossOrigin("*")
public class ContactMessageController {

    private final ContactMessageService contactMessageService;

    @GetMapping
    public List<ContactMessage> getAll() {
        return contactMessageService.getAll();
    }

    @PostMapping
    public ResponseEntity<ContactMessage> create(@RequestBody ContactMessage m) {
        return ResponseEntity.ok(contactMessageService.create(m));
    }
}
