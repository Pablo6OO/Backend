package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dto.Purchase;
import com.example.demo.repository.PurchaseRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PurchaseService {

    private final PurchaseRepository purchaseRepository;

    public Purchase create(Purchase p) {
        return purchaseRepository.save(p);
    }

    public List<Purchase> getAll() {
        return purchaseRepository.findAll();
    }
}
