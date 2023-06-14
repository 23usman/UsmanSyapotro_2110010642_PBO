/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SIAKAD;

/**
 *
 * @author User
 */
public class Dosen {
    private int dosenID;
    private String nip;
    private String nama;
    private String pendidikan;
    private String jabatan;
  
    public Dosen(int dosenID, String nip, String nama, String pendidikan, String jabatan) {
        this.dosenID = dosenID;
        this.nip = nip;
        this.nama = nama;
        this.jabatan = jabatan;
    }

    
  
    // Getter dan setter untuk semua atribut
  
    public int getDosenID() {
        return dosenID;
    }
  
    public void setDosenID(int dosenID) {
        this.dosenID = dosenID;
    }
    
    public String getNip() {
        return nip;
    }
  
    public void setNip(String nip) {
        this.nip = nip;
    }
  
    public String getNama() {
        return nama;
    }
  
    public void setNama(String nama) {
        this.nama = nama;
    }
    
     public String getPendidikan() {
        return pendidikan;
    }
  
    public void setPendidikan(String pendidikan) {
        this.pendidikan = pendidikan;
    }
  
    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
  
    public void displayInfo() {
        System.out.println("Dosen ID : " + dosenID);
        System.out.println("NIP : " + nip);
        System.out.println("Nama: " + nama);
        System.out.println("Pendidikan: " + pendidikan);
        System.out.println("Jabatan: " + jabatan);
    }
}



    
