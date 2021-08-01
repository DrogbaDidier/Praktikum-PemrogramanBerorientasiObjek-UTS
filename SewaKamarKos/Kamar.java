/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SewaKamarKos;

/**
 *
 * @author kevin
 */
public class Kamar {
    private Penghuni sewa;
    private String nokamar, kapasitas, tglmasuk;
    
    public Kamar(String kmr, String kpsts, String tgl, Penghuni x ){
        nokamar = kmr;
        kapasitas = kpsts;
        tglmasuk = tgl;
        sewa = x;
    }

    public Penghuni getSewa() {
        return sewa;
    }

    public void setSewa(Penghuni sewa) {
        this.sewa = sewa;
    }

    public String getNokamar() {
        return nokamar;
    }

    public void setNokamar(String nokamar) {
        this.nokamar = nokamar;
    }

    public String getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(String kapasitas) {
        this.kapasitas = kapasitas;
    }

    public String getTglmasuk() {
        return tglmasuk;
    }

    public void setTglmasuk(String tglmasuk) {
        this.tglmasuk = tglmasuk;
    }
    
    public void infoKamar(){
        System.out.println("INFO KAMAR KOS");
        System.out.println("No Kamar      : "+nokamar);
        System.out.println("Kapasitas     : "+kapasitas);
        System.out.println("Tanggal Masuk : "+tglmasuk);
        sewa.infoPenghuni();
    }
}
