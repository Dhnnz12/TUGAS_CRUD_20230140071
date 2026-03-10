# 🪪 Sistem Manajemen KTP Digital

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![MySQL](https://img.shields.io/badge/mysql-%2300f.svg?style=for-the-badge&logo=mysql&logoColor=white)
![Bootstrap](https://img.shields.io/badge/bootstrap-%237952B3.svg?style=for-the-badge&logo=bootstrap&logoColor=white)
![jQuery](https://img.shields.io/badge/jquery-%230769AD.svg?style=for-the-badge&logo=jquery&logoColor=white)

Aplikasi manajemen data KTP (Kartu Tanda Penduduk) berbasis full-stack yang dibangun menggunakan Spring Boot, MySQL, dan interaksi data berbasis jQuery AJAX.

## ✨ Fitur Unggulan
- **Create**: Tambah record KTP baru dengan validasi data.
- **Read**: Tampilan daftar penduduk dalam tabel responsif dan modern.
- **Update**: Ubah data KTP yang sudah ada secara instan.
- **Delete**: Hapus data dengan konfirmasi keamanan.
- **AJAX Driven**: Semua operasi dilakukan tanpa reload halaman (Single Page Feel).
- **Modern UI**: Desain premium dengan tipografi "Outfit" dan efek transisi yang halus.

## 🛠️ Teknologi yang Digunakan
- **Backend**: Java 25, Spring Boot 4.0.3, Spring Data JPA.
- **Frontend**: HTML5, Modern CSS, JavaScript (jQuery 3.6.0).
- **Database**: MySQL 8+ (Berjalan pada port 3308).



## 📄 Dokumentasi API

| Metode | Endpoint | Deskripsi |
|--------|----------|-------------|
| POST | `/ktp` | Menambah data KTP baru |
| GET | `/ktp` | Mengambil seluruh daftar KTP |
| GET | `/ktp/{id}` | Mencari data KTP berdasarkan ID |
| PUT | `/ktp/{id}` | Memperbarui data KTP yang ada |
| DELETE | `/ktp/{id}` | Menghapus data KTP |

### Struktur Data (JSON)
```json
{
  "nomorKtp": "1234567890123456",
  "namaLengkap": "Dhonan IT UMY",
  "alamat": "Jalan RingRoad Utara, Yogyakarta",
  "tanggalLahir": "2005-01-01",
  "jenisKelamin": "LAKI-LAKI"
}
```
📸 Dokumentasi Visual

🖥️ Antarmuka Pengguna (UI)

1. Dashboard Utama & Input Data
<img width="1901" height="914" alt="image" src="https://github.com/user-attachments/assets/1fb24038-bc42-44db-9ca7-6ff47314923a" />

2. Proses Edit Data
<img width="1919" height="918" alt="image" src="https://github.com/user-attachments/assets/9a1fef91-420d-4e44-966a-b1f88b0f4ea0" />

3. Update Data
<img width="1898" height="924" alt="image" src="https://github.com/user-attachments/assets/68043712-fb47-4589-8382-dd60ba52854c" />

4. Delete Data
<img width="1894" height="916" alt="image" src="https://github.com/user-attachments/assets/98892a2f-8128-447d-b76e-492de40859b3" />

🚀 Pengujian API (Postman)

1. POST (Tambah Data)
<img width="1831" height="887" alt="image" src="https://github.com/user-attachments/assets/44b25fd9-0ebc-47b9-a958-c2fc96e88266" />

2. GET (Ambil Semua Data)
<img width="1911" height="988" alt="image" src="https://github.com/user-attachments/assets/44b5abb7-d227-4bd8-bb46-a5cba03067a1" />

3. GET By ID
<img width="1854" height="1016" alt="image" src="https://github.com/user-attachments/assets/89ee122c-f782-4baf-9244-3e568af47642" />

4. UPDATE
<img width="1915" height="1022" alt="image" src="https://github.com/user-attachments/assets/81d25136-ad52-4be6-ad8f-c90b4f50f587" />

5. DELETE
<img width="1919" height="1019" alt="image" src="https://github.com/user-attachments/assets/075f294b-de9b-4c9d-952f-39e90c44ec5b" />

🚀 Cara Menjalankan Proyek

1. Persiapan Database:
Buat database baru di MySQL dengan nama deploy_3.
Pastikan konfigurasi di src/main/resources/application.properties sudah sesuai dengan username dan password MySQL kamu.

2. Jalankan Backend:
Eksekusi perintah .\mvnw spring-boot:run di terminal, atau klik Run pada kelas Pertemuan3Application di IntelliJ IDEA.

3. Akses Aplikasi:
Buka browser dan arahkan ke alamat http://localhost:8080.



