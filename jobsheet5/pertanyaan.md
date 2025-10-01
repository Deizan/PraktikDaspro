PERTANYAAN PRAKTEK
1. - Mengapa pengecekan pada struktur IF tersebut tidak melibatkan kondisi dengan
     operator relasional?
   - Saat program dijalankan, kemudian Anda mengisikan nilai false, bagaimana hasilnya?
   - Sistem perlu memberikan informasi apabila pengguna memasukkan nilai false, maka
     terdapat keluaran “Registrasi ditolak. Silakan lunasi UKT terlebih dahulu”. Modifikasi
     program tersebut dengan menambahkan struktur ELSE!
   - Commit dan push hasil modifikasi Anda ke Github dengan pesan “Modifikasi
     Percobaan 1”
2. - Apa fungsi dari sintaks break?
   - Apa peran dari sintaks default pada struktur pemilihan SWITCH-CASE?
   - Buat file baru dengan nama ifElseCetakKRSNoPresensi.java. File ini berisi program hasil
     transformasi dari program cetak KRS menggunakan struktur SWITCH-CASE yang telah
     dibuat ke dalam bentuk IF-ELSE IF-ELSE.
   - Commit dan push hasil modifikasi Anda ke Github dengan pesan “Modifikasi
     Percobaan 2”
3. - Apa yang terjadi jika mahasiswa menjawab "No" pada pertanyaan bebas kompen?
     Mengapa demikian?
   - Jelaskan maksud dari potongan kode berikut!
     if (bimbinganp1 >= 8 && bimbinganp2 >= 4) {
     }
   - Bagaimana alur pemeriksaan syarat mahasiswa dari awal sampai akhir? Jelaskan secara
     runtut untuk semua kondisi!

   TUGAS/PERTANYAAN
1. - Buka kembali file ifCetakKRSNoPresensi.java, tambahkan baris baru di dalam fungsi main
     untuk melakukan transformasi program cetak KRS hasil modifikasi menggunakan struktur
     IF-ELSE yang telah dibuat ke dalam bentuk Ternary Operator! Commit dan push program
     Anda ke Github dengan pesan “Tugas 1”
2. - Implementasikan flowchart tersebut ke dalam kode program Java dengan struktur
     pemilihan IF-ELSE! Commit dan push program Anda ke Github dengan pesan “Tugas 2”
3. - Implementasikan flowchart yang telah Anda buat untuk Latihan pada Tugas pertemuan
     5 Matakuliah Dasar Pemrograman terkait sistem perpustakaan dan akses WIFI kampus
     ke dalam kode program! Commit dan push program Anda ke Github dengan pesan
     “Tugas 3”

JAWABAN PRAKTEK
1. Mengapa IF tidak pakai operator relasional?
"Karena variabel bertipe boolean bisa langsung diperiksa nilainya (true/false) tanpa perlu == true atau operator lain.'
- Jika dijalankan dengan input false?
"Blok IF tidak dijalankan → tidak ada keluaran jika belum ada ELSE"
- Modifikasi dengan ELSE: "sudah"
- Commit & Push ke GitHub: "sudah"
2. break digunakan untuk menghentikan eksekusi di dalam suatu case pada switch.
Jika tidak ada break, program akan melanjutkan ke case berikutnya (fall-through).
- default dipakai untuk menangani kondisi jika tidak ada satupun case yang cocok.
Ibaratnya seperti else pada struktur if-else.
- "sudah"
- "sudah"
3. mahasiswa belum bebas kompen, sehingga syarat tidak terpenuhi.
Akibatnya, proses (misalnya cetak KRS) ditolak dan program tidak melanjutkan ke tahap berikutnya.
- Kondisi if ini akan bernilai true hanya jika kedua syarat terpenuhi sekaligus, yaitu:
bimbinganp1 minimal 8 kali, dan
bimbinganp2 minimal 4 kali.
Jika salah satu tidak terpenuhi, maka blok IF tidak dijalankan
- Proses pemeriksaan dilakukan berurutan (step by step).
Setiap syarat harus lolos dulu agar bisa lanjut ke syarat berikutnya.
Jika ada satu yang gagal → proses berhenti di situ dengan pesan penolakan.

JAWABAN PERTANYAAN
1. - Tujuannya adalah agar logika pemeriksaan syarat bisa ditulis lebih singkat, ringkas, 
     dan efisien, namun tetap menghasilkan keluaran yang sama. Dengan Ternary Operator, program tetap bisa menampilkan hasil seperti: jika syarat terpenuhi maka cetak KRS berhasil, dan jika syarat tidak terpenuhi maka muncul pesan penolakan.
2. - Jika angka habis dibagi 2 → program menampilkan output “Genap”.
     Jika angka tidak habis dibagi 2 → program menampilkan output “Ganjil”.
     Dengan demikian, program akan mampu menentukan apakah angka yang dimasukkan pengguna termasuk bilangan ganjil atau bilangan genap.
3. - Program ini nantinya akan memeriksa syarat-syarat sesuai alur flowchart, lalu 
     memberikan keluaran apakah mahasiswa berhak mengakses perpustakaan dan WiFi kampus atau ditolak karena belum memenuhi syarat.
     Setelah program selesai dibuat, langkah berikutnya adalah melakukan commit dengan pesan “Tugas 3” dan kemudian push ke GitHub agar hasil pekerjaan tersimpan dengan rapi di repository.