/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119049.latihan5.kambingglobal;

/**
 * @author 
 * Nama  : Nur Sasongko
 * Kelas : PBOIF2
 * NIM   : 10119049
 * Deskripsi Program : Program untuk menampilkan jumlah kambing global
 */
public class PBOIF210119049Latihan5KambingGlobal {
    
    int jumlahKambing = 88;
    public void getJumlahKambing(){
        System.out.println("Jumlah kambing: " + jumlahKambing);
    }    
    
    public void tambahKambing(){
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah ditambah: " + jumlahKambing);
    }
 
    public static void main(String[] args) {
        PBOIF210119049Latihan5KambingGlobal kambingSusu = new PBOIF210119049Latihan5KambingGlobal();
        
        kambingSusu.getJumlahKambing();
        
        kambingSusu.tambahKambing();
        
        kambingSusu.getJumlahKambing();
    }
    
    
}
