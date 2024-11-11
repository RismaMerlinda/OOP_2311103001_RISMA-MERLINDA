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

public class Komputer {
    protected String namaWarnet;
    protected float hargaPerJam;
    protected int jumlahKomputer;

    public Komputer(String namaWarnet, float hargaPerJam, int jumlahKomputer) {
        this.namaWarnet = namaWarnet;
        this.hargaPerJam = hargaPerJam;
        this.jumlahKomputer = jumlahKomputer;
    }

    public void informasi() {
        System.out.println("INFORMASI KOMPUTER:");
        System.out.println("Jumlah Komputer: " + jumlahKomputer);
        System.out.println("Nama Warnet: " + namaWarnet);
        System.out.println("Harga Per Jam: " + hargaPerJam);
    }

    public void login(String username) {
        System.out.println("Login dengan username: " + username);
    }

    public void bermain(int jam) {
        System.out.println("Main selama " + jam + " jam.");
    }
}