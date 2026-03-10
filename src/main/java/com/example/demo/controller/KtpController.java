package com.example.demo.controller;

import com.example.demo.model.Ktp;
import com.example.demo.service.KtpService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ktp")
@CrossOrigin(origins = "*") // Penting: Agar JQuery/Ajax bisa memanggil API ini
public class KtpController {

    @Autowired
    private KtpService ktpService;

    // POST /ktp: Menambah data KTP baru
    @PostMapping
    public ResponseEntity<Ktp> createKtp(@Valid @RequestBody Ktp ktp) {
        return new ResponseEntity<>(ktpService.create(ktp), HttpStatus.CREATED);
    }

    // GET /ktp: Mengambil seluruh data KTP
    @GetMapping
    public List<Ktp> getAllKtp() {
        return ktpService.getAll();
    }

    // GET /ktp/{id}: Mengambil data berdasarkan id
    @GetMapping("/{id}")
    public ResponseEntity<?> getKtpById(@PathVariable Integer id) {
        try {
            return ResponseEntity.ok(ktpService.getById(id));
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }

    // PUT /ktp/{id}: Memperbarui data KTP
    @PutMapping("/{id}")
    public ResponseEntity<?> updateKtp(@PathVariable Integer id, @Valid @RequestBody Ktp ktp) {
        try {
            return ResponseEntity.ok(ktpService.update(id, ktp));
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }

    // DELETE /ktp/{id}: Menghapus data KTP
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteKtp(@PathVariable Integer id) {
        try {
            ktpService.delete(id);
            return ResponseEntity.ok("Data KTP dengan ID " + id + " berhasil dihapus.");
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }
}
