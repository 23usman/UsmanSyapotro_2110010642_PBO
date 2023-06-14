/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SIAKAD;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Nilai {
    private int nilaiID;
    private int mahasiswaID;
    private int kelasID;
    private int nilai;
  
    public Nilai(int nilaiID, int mahasiswaID, int kelasID, int nilai) {
        this.nilaiID = nilaiID;
        this.mahasiswaID = mahasiswaID;
        this.kelasID = kelasID;
        this.nilai = nilai;
    }
  
    // Getter dan setter untuk semua atribut
  
    public int getNilaiID() {
        return nilaiID;
    }
  
    public void setNilaiID(int nilaiID) {
        this.nilaiID = nilaiID;
    }
  
    public int getMahasiswaID() {
        return mahasiswaID;
    }
  
    public void setMahasiswaID(int mahasiswaID) {
        this.mahasiswaID = mahasiswaID;
    }
  
    public int getKelasID() {
        return kelasID;
    }
  
    public void setKelasID(int kelasID) {
        this.kelasID = kelasID;
    }
  
     public int getnilai() {
        return nilai;
    }
  
    public void setnilai(int nilai) {
        this.nilai = nilai;
    }
  
    public void displayInfo() {
        System.out.println("Nilai ID: " + nilaiID);
        System.out.println("Mahasiswa ID: " + mahasiswaID);
        System.out.println("Kelas ID: " + kelasID);
        System.out.println("Nilai: " + nilai);
    }

    
}
