/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package informasikomputerrismam;

/**
 *
 * @author Risma Merlinda
 * 2311103001
 * S1 SI07A
 */

public class KomputerPremium extends Komputer {
    protected boolean ruangPrivat;

    public KomputerPremium(String namaWarnet, float hargaPerJam, int jumlahKomputer, boolean ruangPrivat) {
        super(namaWarnet, hargaPerJam, jumlahKomputer);
        this.ruangPrivat = ruangPrivat;
    }

    @Override
    public void informasi() {
        super.informasi();
        System.out.println("Fasilitas Ruang Privat:");
        System.out.println("Ruangan ber AC, Sofa gaming eksklusif");
        System.out.println("Komputer spesifikasi tinggi");
        System.out.println("Koneksi dedicated");
    }

    public void pesan(int nomorKomputer) {
        System.out.println("Memesan komputer nomor: " + nomorKomputer);
    }

    public void tambahLayanan(String makanan) {
        System.out.println("Menambah layanan makanan: " + makanan);
    }

    public void tambahLayanan(String makanan, String minuman) {
        System.out.println("Menambah layanan makanan: " + makanan + " dan minuman: " + minuman);
    }
}