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
public class Penghuni {
    private String nama, alamat, noktp, nohp;
    
    public Penghuni(String nm, String almt, String ktp, String hp) {
        nama = nm;
        alamat = almt;
        noktp = ktp;
        nohp = hp;
    }
    
    public void infoPenghuni(){
        System.out.println("\nINFO PENGHUNI KAMAR");
        System.out.println("Nama   : "+nama);
        System.out.println("Alamat : "+alamat);
        System.out.println("NO KTP : "+noktp);
        System.out.println("NO HP  : "+nohp);
        System.out.println("");
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNoktp() {
        return noktp;
    }

    public void setNoktp(String noktp) {
        this.noktp = noktp;
    }

    public String getNohp() {
        return nohp;
    }

    public void setNohp(String nohp) {
        this.nohp = nohp;
    }
    
}
