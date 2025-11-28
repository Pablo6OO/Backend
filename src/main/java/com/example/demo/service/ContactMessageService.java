package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dto.ContactMessage;
import com.example.demo.repository.ContactMessageRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ContactMessageService {

    private final ContactMessageRepository contactMessageRepository;

    public ContactMessage create(ContactMessage m) {
        return contactMessageRepository.save(m);
    }

    public List<ContactMessage> getAll() {
        return contactMessageRepository.findAll();
    }
}
