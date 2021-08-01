/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Controller.Penjaga;
import SewaKamarKos.Kamar;
import SewaKamarKos.Penghuni;

/**
 *
 * @author kevin
 */
public class Main {
    public static void main(String[] args) {
        Penghuni Zhaclin = new Penghuni ("Zhaclin", "Jl. Garuda No. 4 ", "14045", "08970199403");
        Kamar a = new Kamar("45", "2 Orang", "17 Agustus 1945", Zhaclin);
        Penjaga Indro = new Penjaga("Indro", 21);
        
        Penghuni Fajri = new Penghuni ("Fajri", "Jl. Rajawali 2", "14022", "085157873370");
        Kamar b = new Kamar ("46", "3 Orang", "28 Oktober 1928", Fajri);
        
        
        Indro.tambahKamar(a);
        Indro.tambahKamar(b);
        Indro.bacaKamar();
    }
    
}
