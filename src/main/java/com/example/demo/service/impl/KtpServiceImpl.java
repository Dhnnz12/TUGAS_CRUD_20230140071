package com.example.demo.service.impl;

import com.example.demo.model.Ktp;
import com.example.demo.repository.KtpRepository;
import com.example.demo.service.KtpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KtpServiceImpl implements KtpService {

    @Autowired
    private KtpRepository ktpRepository;

    @Override
    public Ktp create(Ktp ktp) {

        if (ktpRepository.existsByNomorKtp(ktp.getNomorKtp())) {
            throw new RuntimeException("Gagal: Nomor KTP " + ktp.getNomorKtp() + " sudah terdaftar di sistem!");
        }
        return ktpRepository.save(ktp);
    }

    @Override
    public List<Ktp> getAll() {
        return ktpRepository.findAll();
    }

    @Override
    public Ktp getById(Integer id) {
        return ktpRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Data KTP dengan ID " + id + " tidak ditemukan."));
    }

    @Override
    public Ktp update(Integer id, Ktp ktpDetails) {
        Ktp ktp = getById(id);


        ktp.setNamaLengkap(ktpDetails.getNamaLengkap());
        ktp.setAlamat(ktpDetails.getAlamat());
        ktp.setTanggalLahir(ktpDetails.getTanggalLahir());
        ktp.setJenisKelamin(ktpDetails.getJenisKelamin());

        return ktpRepository.save(ktp);
    }

    @Override
    public void delete(Integer id) {
        Ktp ktp = getById(id);
        ktpRepository.delete(ktp);
    }
}
