package com.example.demo.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.dto.Purchase;
import com.example.demo.service.PurchaseService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/purchases")
@RequiredArgsConstructor
@CrossOrigin("*")
public class PurchaseController {

    private final PurchaseService purchaseService;

    @GetMapping
    public List<Purchase> getAll() {
        return purchaseService.getAll();
    }

    @PostMapping
    public ResponseEntity<Purchase> create(@RequestBody Purchase p) {
        return ResponseEntity.ok(purchaseService.create(p));
    }
}
