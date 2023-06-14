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
public class datasetDosen {
    private ArrayList<Integer> dosenID;
    private ArrayList<String> nip;
    private ArrayList<String> nama;
    private ArrayList<String> pendidikan;
    private ArrayList<String> jabatan;

     public datasetDosen(){
       dosenID=new ArrayList<Integer>();
       nip=new ArrayList<String>();
       nama=new ArrayList<String>();
       pendidikan=new ArrayList<String>();
       jabatan=new ArrayList<String>();
   }
//method
   public void insertdosenID(Integer isi){
       this.dosenID.add(isi);
   }
   
   public void insertnip(String isi){
       this.nip.add(isi);
   }
   
   public void insertnama(String isi){
       this.nama.add(isi);
   }
   
   public void insertpendidikan(String isi){
       this.pendidikan.add(isi);
   }
   
   public void insertjabatan(String isi){
       this.jabatan.add(isi);
   }
  

   //keluaran ArrayList
   public ArrayList<Integer> getrecorddosenID(){
       return this.dosenID;
   }
   
   public ArrayList<String> getrecordnip(){
       return this.nip;
   }
   
   public ArrayList<String> getrecordnama(){
       return this.nama;
   }
   
   public ArrayList<String> getrecordpendidikan(){
       return this.pendidikan;
   }
   
   public ArrayList<String> getrecordjabatan(){
       return this.jabatan;
   }
   
}
