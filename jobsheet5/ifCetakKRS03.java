import java.util.Scanner;
public class ifCetakKRS03 {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
        
        System.out.println("---Cetak KRS SIAKAD---");
        System.out.println("Apakah UKT sudah lunas? (true/false)");
        boolean uktLunas = input.nextBoolean();

    if (uktLunas) {
        System.out.println("Pembayaran UKT Terverivikasi");
        System.out.println("Silahkan cetak KRS dan minta tandaatangan DPA");
        
    }
    }
}