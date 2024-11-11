/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package informasikomputerrismam;

/**
 *
 * @author Risma Merlinda
 * 2311103001
 * S1 SI07A
 */
public class InformasiKomputerRismaM {

    /**
     * @param args the command line arguments
     */
    // File: MainApp.java

    public static void main(String[] args) {

        Komputer komputerNonVIP = new Komputer("Warnet Gaming A", 75000.0f, 20);
        KomputerVIP komputerVIP = new KomputerVIP("Warnet Gaming X", 10000.0f, 15, true);
        KomputerPremium komputerPremium = new KomputerPremium("Warnet Gaming Y", 15000.0f, 15, true);
        Komputer komputerNonVIP2 = new Komputer("Warnet Gaming Z", 5000.0f, 15); // Komputer non-VIP tanpa Ruang Privat

        System.out.println("=================== Komputer Non-VIP ===================");
        komputerNonVIP.informasi();
        System.out.println();
        System.out.println("========================================================");

        System.out.println("===================== Komputer VIP =====================");
        komputerVIP.informasi();
        komputerVIP.login("Asep");
        komputerVIP.bermain(2);
        System.out.println();
        System.out.println("========================================================");

        System.out.println("==================== Komputer Premium ==================");
        komputerPremium.informasi();
        komputerPremium.pesan(1);
        komputerPremium.tambahLayanan("Nasi Goreng");
        komputerPremium.tambahLayanan("Nasi Goreng", "Es Teh");
        System.out.println();
        System.out.println("========================================================");
        
        System.out.println("========== Komputer Non-VIP Tanpa Ruang Privat ==========");
        komputerNonVIP2.informasi();
        System.out.println("Benefit Member: Non VIP");
        System.out.println("Harga Per Jam: " + komputerNonVIP2.hargaPerJam);
        System.out.println("Status: Tidak ada benefit khusus.");
        komputerNonVIP2.login("Risma Merlinda");
        komputerNonVIP2.bermain(2);
        System.out.println("Nambah billing selama 2 jam.");
        System.out.println("========================================================");
    }
}