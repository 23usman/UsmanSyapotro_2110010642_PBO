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
public class datasetRegistrasi {
    private ArrayList<String> pengguna;
    private ArrayList<String> nama;
    private ArrayList<String> sandi;
    private ArrayList<String> status;

    public datasetRegistrasi(){
       pengguna=new ArrayList<String>();
       nama=new ArrayList<String>();
       sandi=new ArrayList<String>();
       status=new ArrayList<String>();
   }
//method
   public void insertpengguna(String isi){
       this.pengguna.add(isi);
   }
   
   public void insertnama(String isi){
       this.nama.add(isi);
   }
   
   public void insertsandi(String isi){
       this.sandi.add(isi);
   }
   
   public void insertstatus(String isi){
       this.status.add(isi);
   }

   //keluaran ArrayList
   public ArrayList<String> getrecordpengguna(){
       return this.pengguna;
   }
   
   public ArrayList<String> getrecordnama(){
       return this.nama;
   }
   
   public ArrayList<String> getrecordsandi(){
       return this.sandi;
   }
   
   public ArrayList<String> getrecordstatus(){
       return this.status;
   }
    
    
}
