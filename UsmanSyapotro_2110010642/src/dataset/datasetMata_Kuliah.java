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
public class datasetMata_Kuliah {
    private ArrayList<Integer> kode_matakuliah;
    private ArrayList<String> namamatkul;
    private ArrayList<Integer> sks;
    private ArrayList<Integer> semester;

    public datasetMata_Kuliah(){
       kode_matakuliah=new ArrayList<Integer>();
       namamatkul=new ArrayList<String>();
       sks=new ArrayList<Integer>();
       semester=new ArrayList<Integer>();
   }
//method
   public void insertkode_matakuliah(Integer isi){
       this.kode_matakuliah.add(isi);
   }
   
   public void insertnamamatkul(String isi){
       this.namamatkul.add(isi);
   }
   
   public void insertsks(Integer isi){
       this.sks.add(isi);
   }
   
   public void insertsemester(Integer isi){
       this.semester.add(isi);
   }

   //keluaran ArrayList
   public ArrayList<Integer> getrecordkode_matakuliah(){
       return this.kode_matakuliah;
   }
   
   public ArrayList<String> getrecordnamamatkul(){
       return this.namamatkul;
   }
   
   public ArrayList<Integer> getrecordsks(){
       return this.sks;
   }
   
   public ArrayList<Integer> getrecordsemester(){
       return this.semester;
   }
    
    
}
