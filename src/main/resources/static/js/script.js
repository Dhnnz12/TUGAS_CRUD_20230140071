const API_URL = "/ktp";

$(document).ready(function() {

    loadKtpData();


    $('#ktpForm').on('submit', function(e) {
        e.preventDefault();

        const id = $('#id').val();
        const method = id ? 'PUT' : 'POST';
        const url = id ? `${API_URL}/${id}` : API_URL;

        const payload = {
            nomorKtp: $('#nomorKtp').val(),
            namaLengkap: $('#namaLengkap').val(),
            alamat: $('#alamat').val(),
            tanggalLahir: $('#tanggalLahir').val(),
            jenisKelamin: $('#jenisKelamin').val()
        };

        $.ajax({
            url: url,
            type: method,
            contentType: "application/json",
            data: JSON.stringify(payload),
            success: function() {
                alert(id ? "Data penduduk berhasil diperbarui!" : "Data penduduk berhasil disimpan!");
                resetForm();
                loadKtpData();
            },
            error: function(xhr) {
                // Menangkap pesan error dari GlobalExceptionHandler di Backend
                const response = xhr.responseJSON;
                let message = response ? (response.message || "Terjadi kesalahan validasi") : "Gagal terhubung ke server";
                alert("Error: " + message);
            }
        });
    });
});


function loadKtpData() {
    $.ajax({
        url: API_URL,
        type: 'GET',
        success: function(data) {
            let html = '';
            if (data.length === 0) {
                html = '<tr><td colspan="4" class="text-center text-muted">Belum ada data tersedia</td></tr>';
            } else {
                data.forEach(item => {
                    html += `
                        <tr>
                            <td><strong>${item.nomorKtp}</strong></td>
                            <td>${item.namaLengkap}</td>
                            <td><span class="badge ${item.jenisKelamin === 'Laki-laki' ? 'bg-info' : 'bg-danger'}">${item.jenisKelamin}</span></td>
                            <td class="text-center">
                                <button class="btn btn-sm btn-warning me-1" onclick="editKtp(${item.id})">Edit</button>
                                <button class="btn btn-sm btn-danger" onclick="deleteKtp(${item.id})">Hapus</button>
                            </td>
                        </tr>`;
                });
            }
            $('#ktpTableBody').html(html);
        }
    });
}


function editKtp(id) {
    $.get(`${API_URL}/${id}`, function(data) {
        $('#id').val(data.id);
        $('#nomorKtp').val(data.nomorKtp).prop('readonly', true); // No KTP tidak boleh diubah saat edit
        $('#namaLengkap').val(data.namaLengkap);
        $('#alamat').val(data.alamat);
        $('#tanggalLahir').val(data.tanggalLahir);
        $('#jenisKelamin').val(data.jenisKelamin);

        $('#formTitle').text("Edit Data KTP");
        $('#btnSubmit').text("Update Data").removeClass('btn-primary').addClass('btn-info text-white');
    });
}


function deleteKtp(id) {
    if (confirm("Apakah Anda yakin ingin menghapus data ini secara permanen?")) {
        $.ajax({
            url: `${API_URL}/${id}`,
            type: 'DELETE',
            success: function(response) {
                alert(response); // Menampilkan pesan sukses dari backend
                loadKtpData();
            },
            error: function() {
                alert("Gagal menghapus data penduduk.");
            }
        });
    }
}


function resetForm() {
    $('#ktpForm')[0].reset();
    $('#id').val('');
    $('#nomorKtp').prop('readonly', false);
    $('#formTitle').text("Form Input KTP");
    $('#btnSubmit').text("Simpan Data").removeClass('btn-info text-white').addClass('btn-primary');
}