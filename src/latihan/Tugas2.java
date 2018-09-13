/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;
import java.util.Scanner;

/**
 *
 * @author Nita
 */
public class Tugas2 {
     public static void main(String[] args) {
         Scanner scanner = new Scanner (System.in);
         String jenis [] = new String[] {"E","B","A","D","C"};
         int berat [] = new int[]{7,5,4,3,2};
         int bayaran [] = new int[] {10000,7000,5000,3000,2000};
         int harga;
         int jumlah;
         int total=0;
         
            System.out.println("Masukkan Berat :");
            int beratMasukan= scanner.nextInt();
            
          for (int i=0; i<jenis.length; i++) {
              if(beratMasukan >= berat[i]) {
                  jumlah = beratMasukan/berat[i];
                  beratMasukan = beratMasukan%berat[i];
                  harga = jumlah * bayaran[i];
                  total += harga;
                  
                  
            System.out.println("Jenis "+jenis[i]+ " sebanyak " +jumlah);
            System.out.println("Bayaran : Rp. "+harga);
              }
          }
                      System.out.println("Total : " +total);

     }
 
    
}
