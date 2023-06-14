/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SIAKAD;

/**
 *
 * @author User
 */
public class Kelas {
    private int kelasID;
    private String namakelas;
    private String namadosen;
    private int matakuliahID;
  
    public Kelas(int kelasID, String namakelas, String namadosen, int matakuliahID) {
        this.kelasID = kelasID;
        this.namakelas = namakelas;
        this.namadosen = namadosen;
        this.matakuliahID = matakuliahID;
    }
  
    // Getter dan setter untuk semua atribut
  
    public int getKelasID() {
        return kelasID;
    }
  
    public void setKelasID(int kelasID) {
        this.kelasID = kelasID;
    }
  
    public String getNamaKelas() {
        return namakelas;
    }
  
    public void setNamaKelas(String namakelas) {
        this.namakelas = namakelas;
    }
  
    public String getNamaDosen() {
       return namadosen;
    }
  
    public void setNamaDosen(String namadosen) {
        this.namadosen = namadosen;
    }
  
    public Integer getmatakuliahID() {
       return matakuliahID;
    }
  
    public void setmatakuliahID(Integer matakuliahID) {
        this.matakuliahID = matakuliahID;
    }
  
    public void displayInfo() {
        System.out.println("Kelas ID: " + kelasID);
        System.out.println("Nama: " + namakelas);
        System.out.println("Dosen ID: " + namadosen);
        System.out.println("Mata Kuliah ID: " + matakuliahID);
    }
      
}
