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

public class datasetKelas {
    private ArrayList<Integer> kelasID;
    private ArrayList<String> namakelas;
    private ArrayList<String> namadosen;
    private ArrayList<Integer> matakuliahID;

     public datasetKelas(){
       kelasID=new ArrayList<Integer>();
       namakelas=new ArrayList<String>();
       namadosen=new ArrayList<String>();
       matakuliahID=new ArrayList<Integer>();
   }
//method
   public void insertkelasID(Integer isi){
       this.kelasID.add(isi);
   }
   
   public void insertnamakelas(String isi){
       this.namakelas.add(isi);
   }
   
   public void insertnamadosen(String isi){
       this.namadosen.add(isi);
   }
   
   public void insertmatakuliahID(Integer isi){
       this.matakuliahID.add(isi);
   }

   //keluaran ArrayList
   public ArrayList<Integer> getrecordkelasID(){
       return this.kelasID;
   }
   
   public ArrayList<String> getrecordnamakelas(){
       return this.namakelas;
   }
   
   public ArrayList<String> getrecordnamadosen(){
       return this.namadosen;
   }
   
   public ArrayList<Integer> getrecordmatakuliahID(){
       return this.matakuliahID;
   }
    
}
