import java.util.Scanner;
public class nestedUjianSkripsi03 {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);

    System.out.println("Apakah manusia sudah bebas kompen? (yes/no): ");
    String bebasKompen = sc.nextLine();
    System.out.print("Masukkan jumlah log bimbingan Pembimbing 1: ");
    int bimbinganP1 = sc.nextInt();
    System.out.print("Masukkan jumlah log bimbingan Pembimbing 2: ");
    int bimbinganP2 = sc.nextInt();
    String pesan = "";

    if (bebasKompen.equalsIgnoreCase("yes")){
        if (bimbinganP1 >= 8 && bimbinganP2 >= 4){
            pesan = "Semua syarat terpenuhi, Mahasiswa boleh mendaftar ujian skripsi";
        } else if (bimbinganP1 < 8 && bimbinganP2 >= 4){
            pesan = "Gagal! Log bimbingan P1 kurang dari 8kali dan P2 kuurang dari 4 kali";
        } else if (bimbinganP1 < 8){
            pesan = "Gagal! Log bimbingan P1 belum mencapai 8 kali";
        } else {
            pesan = "Gagal! Log bimbingan P2 belum mencapai 4 kali";
        }
    } else {
        pesan = "Gagal! Mahasiswa masih memiliki tanggungan kompen";
}
System.out.println(pesan);
    }
}