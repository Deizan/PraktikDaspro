import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jenis pengguna (dosen/mahasiswa): ");
        String jenisPengguna = input.nextLine().toLowerCase();

        if (jenisPengguna.equals("dosen")) {
            System.out.println("Akses wifi diberikan untuk dosen");
        } else if (jenisPengguna.equals("mahasiswa")) {
            System.out.print("Apakah ingin input jumlah SKS? (ya/tidak): ");
            String pilihan = input.nextLine().toLowerCase();

            if (pilihan.equals("ya")) {
                System.out.print("Masukkan jumlah SKS: ");
                int sks = input.nextInt();

                if (sks >= 12) {
                    System.out.println("Akses wifi diberikan untuk mahasiswa");
                } else {
                    System.out.println("Akses ditolak, SKS kurang dari 12");
                }
            } else {
                System.out.println("Input SKS tidak dilakukan, selesai");
            }
        } else {
            System.out.println("Jenis pengguna tidak valid!");
        }

        input.close();
    }
}