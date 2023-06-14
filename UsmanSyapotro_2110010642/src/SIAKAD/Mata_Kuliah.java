/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SIAKAD;

/**
 *
 * @author User
 */
public class Mata_Kuliah {
    private int kode_matakuliah;
    private String namamatkul;
    private int sks;
    private int semester;
  
    public Mata_Kuliah(int kode_matakuliah, String namamatkul, int sks, int semester) {
        this.kode_matakuliah = kode_matakuliah;
        this.namamatkul = namamatkul;
        this.sks = sks;
        this.semester = semester;
    }
  
    // Getter dan setter untuk semua atribut
  
    public int getMataKuliahID() {
        return kode_matakuliah;
    }
  
    public void setMataKuliahID(int kode_matakuliah) {
        this.kode_matakuliah = kode_matakuliah;
    }
  
    public String getNamaMatkul() {
        return namamatkul;
    }
  
    public void setNamaMatkul(String namamatkul) {
        this.namamatkul = namamatkul;
    }
  
    public int getSKS() {
        return sks;
    }
  
    public void setSKS(int sks) {
        this.sks = sks;
    }
  
    public int getsemester() {
        return semester;
    }
  
    public void setsemester(int semester) {
        this.semester = semester;
    }
    
    public void displayInfo() {
        System.out.println("Mata Kuliah ID : " + kode_matakuliah);
        System.out.println("Nama : " + namamatkul);
        System.out.println("SKS : " + sks);
        System.out.println("Semester : " + semester);
    }
  
}

    

