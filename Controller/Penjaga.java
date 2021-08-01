/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import SewaKamarKos.Kamar;

/**
 *
 * @author kevin
 */
public class Penjaga {

    private String namaP;
    private Kamar[] kamar;
    private int index, jumlah;

    public Penjaga(String p, int v) {
        namaP = p;
        jumlah = v;
        kamar = new Kamar[jumlah];
        for (int i = 0; i < kamar.length; i++) {
            kamar[i] = null;
        }
        index = -1;
    }
    public void tambahKamar(Kamar b) {
        index = index + 1;
        kamar[index] = b;
    }
    
    
    public void bacaKamar() {
        System.out.println("Nama Petugas KOS : "+namaP);
        System.out.println("");
        for (int i = 0; i <= index; i++) {
            kamar[i].infoKamar();
        }
    }
}
