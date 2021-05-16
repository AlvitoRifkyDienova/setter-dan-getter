/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjualan;

/**
 *
 * @author MOKLET-1
 */
public class isi {
    public static void main (String args[]){
        
    Penjualan user = new Penjualan();
  user.setMerek ("Honda");
  user.setJenis ("Beat");
  user.setHarga (15000000);
 System.out.println("==== Penjualan sepeda motor ====");
  System.out.println("Merek : "+ user.getMerek ());
  System.out.println("Jenis : "+user.getJenis());
  System.out.println("Hatga : "+user.getHarga());
    }
}
