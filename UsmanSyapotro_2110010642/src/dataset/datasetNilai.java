/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;

import java.util.ArrayList;

/**
 *
 * @author W11
 */
public class datasetNilai {
    private ArrayList<Integer> nilaiID;
    private ArrayList<Integer> mahasiswaID;
    private ArrayList<Integer> kelasID;
    private ArrayList<Integer> nilai;

    public datasetNilai(){
       nilaiID=new ArrayList<Integer>();
       mahasiswaID=new ArrayList<Integer>();
       kelasID=new ArrayList<Integer>();
       nilai=new ArrayList<Integer>();
   }
//method
   public void insertnilaiID(Integer isi){
       this.nilaiID.add(isi);
   }
   
   public void insertmahasiswaID(Integer isi){
       this.mahasiswaID.add(isi);
   }
   
   public void insertkelasID(Integer isi){
       this.kelasID.add(isi);
   }
   
   public void insertnilai(Integer isi){
       this.nilai.add(isi);
   }

   //keluaran ArrayList
   public ArrayList<Integer> getrecordnilaiID(){
       return this.nilaiID;
   }
   
   public ArrayList<Integer> getrecordmahasiswaID(){
       return this.mahasiswaID;
   }
   
   public ArrayList<Integer> getrecordkelasID(){
       return this.kelasID;
   }
   
   public ArrayList<Integer> getrecordnilai(){
       return this.nilai;
   }
    
}
