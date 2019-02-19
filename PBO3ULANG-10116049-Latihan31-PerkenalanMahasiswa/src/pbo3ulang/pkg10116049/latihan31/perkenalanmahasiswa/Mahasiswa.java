/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3ulang.pkg10116049.latihan31.perkenalanmahasiswa;

/**
 *
 * @author ibadguthwara
 */
public class Mahasiswa {
    public String nim;
    public String nama;
    
    public Mahasiswa(String nim, String nama){
        this.nim = nim;
        this.nama = nama;
    }

    /**
     * @param args the command line arguments
     */
    public void perkenalkanDiri(){
        System.out.println("Nim Mahasiswa  : ".concat(nim));
        System.out.println("Nama Mahasiswa : ".concat(nama));
        System.out.println();
    }
    
}
