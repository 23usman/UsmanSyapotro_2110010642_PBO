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
public class datasetMahasiswa {
    private ArrayList<String> nim;
    private ArrayList<String> nama;
    private ArrayList<String> jeniskelamin;
    private ArrayList<String> tglLahir;
    private ArrayList<String> program_studi;
    private ArrayList<String> alamat;
    private ArrayList<String> nohp;

     public datasetMahasiswa(){
       nim=new ArrayList<String>();
       nama=new ArrayList<String>();
       jeniskelamin=new ArrayList<String>();
       tglLahir=new ArrayList<String>();
       program_studi=new ArrayList<String>();
       alamat=new ArrayList<String>();
       nohp=new ArrayList<String>();
   }
//method
   public void insertnim(String isi){
       this.nim.add(isi);
   }
   
   public void insertnama(String isi){
       this.nama.add(isi);
   }
   
   public void insertjeniskelamin(String isi){
       this.jeniskelamin.add(isi);
   }
   
   public void inserttglLahir(String isi){
       this.tglLahir.add(isi);
   }

   public void insertprogram_studi(String isi){
       this.program_studi.add(isi);
   }
   
   public void insertalamat(String isi){
       this.alamat.add(isi);
   }
   
   public void insertnohp(String isi){
       this.nohp.add(isi);
   }

   //keluaran ArrayList
   public ArrayList<String> getrecordnim(){
       return this.nim;
   }
   
   public ArrayList<String> getrecordnama(){
       return this.nama;
   }
   
   public ArrayList<String> getrecordjeniskelamin(){
       return this.jeniskelamin;
   }
   
   public ArrayList<String> getrecordtglLahir(){
       return this.tglLahir;
   }
    
   public ArrayList<String> getrecordprogram_studi(){
       return this.program_studi;
   }
   
   public ArrayList<String> getrecordalamat(){
       return this.alamat;
   }
   
  public ArrayList<String> getrecordnohp(){
       return this.nohp;
   }
}
