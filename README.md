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
  "namaLengkap": "Hibrizi Fathin Dhonan",
  "alamat": "Jalan RingRoad Utara, Yogyakarta",
  "tanggalLahir": "2005-01-01",
  "jenisKelamin": "LAKI-LAKI"
}
