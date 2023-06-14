/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SIAKAD;

/**
 *
 * @author User
 */
public class Registrasi {
    private String pengguna;
    private String nama;
    private String sandi;
    private String status;
  
    public Registrasi(String pengguna, String nama, String sandi, String status) {
        this.pengguna = pengguna;
        this.nama = nama;
        this.sandi = sandi;
        this.status = status;
    }
  
    // Getter dan setter untuk semua atribut
  
    public String getPengguna() {
        return pengguna;
    }
  
    public void setPengguna(String pengguna) {
        this.pengguna = pengguna;
    }
  
    public String getMahasiswa() {
        return nama;
    }
  
    public void setMahasiswa(String nama) {
        this.nama = nama;
    }
  
    public String getSandi() {
        return sandi;
    }
  
    public void setSandi(String sandi) {
        this.sandi = sandi;
    }
  
   public String getstatus() {
        return status;
    }
  
    public void setstatus(String status) {
        this.status = status;
    }
  
    public void displayInfo() {
        System.out.println("Pengguna : " + pengguna);
        System.out.println("Nama Mahasiswa : " + nama);
        System.out.println("Sandi : " + sandi);
        System.out.println("Status : " + status);
    }
   
}
