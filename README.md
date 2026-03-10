# 🪪 KTP Management System

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![MySQL](https://img.shields.io/badge/mysql-%2300f.svg?style=for-the-badge&logo=mysql&logoColor=white)
![HTML5](https://img.shields.io/badge/html5-%23E34F26.svg?style=for-the-badge&logo=html5&logoColor=white)
![CSS3](https://img.shields.io/badge/css3-%231572B6.svg?style=for-the-badge&logo=css3&logoColor=white)
![JavaScript](https://img.shields.io/badge/javascript-%23F7DF1E.svg?style=for-the-badge&logo=javascript&logoColor=black)
![jQuery](https://img.shields.io/badge/jquery-%230769AD.svg?style=for-the-badge&logo=jquery&logoColor=white)

A high-performance full-stack web application for managing KTP (Kartu Tanda Penduduk) digital records. Built with a focus on seamless user experience using **Asynchronous JavaScript (AJAX)** and a robust **Spring Boot** backend.

## ✨ Features
- **Seamless CRUD**: Add, view, edit, and delete records without page refreshes.
- **Dynamic Table**: Responsive data display with real-time UI updates via jQuery.
- **Robust Validation**: Server-side and client-side validation for NIK and required fields.
- **Premium UI**: Modern look featuring "Outfit" typography, glassmorphism effects, and smooth transitions.

## 🛠️ Tech Stack
- **Backend**: Java 25, Spring Boot 4.0.3, Spring Data JPA.
- **Frontend**: HTML5, Modern CSS, jQuery 3.6.0, Bootstrap 5.3.
- **Database**: MySQL 8+ (Configured on Port 3308).



## 📄 API Documentation

| Method | Endpoint | Description |
|--------|----------|-------------|
| `POST` | `/ktp` | Create a new KTP record |
| `GET` | `/ktp` | Retrieve all KTP records |
| `GET` | `/ktp/{id}` | Find a KTP record by ID |
| `PUT` | `/ktp/{id}` | Update an existing record |
| `DELETE` | `/ktp/{id}` | Remove a record permanently |

### 🛰️ Data Model (JSON Payload)
```json
{
  "nomorKtp": "1234567890123456",
  "namaLengkap": "Dhonan IT UMY",
  "alamat": "Yogyakarta, Indonesia",
  "tanggalLahir": "2005-05-20",
  "jenisKelamin": "LAKI-LAKI"
}
