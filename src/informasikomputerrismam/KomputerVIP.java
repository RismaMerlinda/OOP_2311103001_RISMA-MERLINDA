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

public class KomputerVIP extends Komputer {
    protected boolean vipCard;

    public KomputerVIP(String namaWarnet, float hargaPerJam, int jumlahKomputer, boolean vipCard) {
        super(namaWarnet, hargaPerJam, jumlahKomputer);
        this.vipCard = vipCard;
    }

    @Override
    public void informasi() {
        super.informasi();
        System.out.println("Benefit Member VIP:");
        System.out.println("Diskon 100% untuk bermain di atas 1 jam");
        System.out.println("Gratis minuman setiap 4 jam bermain");
        System.out.println("Prioritas booking komputer gaming");
    }

    @Override
    public void bermain(int jam) {
        super.bermain(jam);
    }

    public void bermain(int jam, int menitTambahan) {
        System.out.println("Main selama " + jam + " jam dan " + menitTambahan + " menit tambahan.");
    }
}