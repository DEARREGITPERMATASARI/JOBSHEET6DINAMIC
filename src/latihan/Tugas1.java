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
public class Tugas1 {
    public static void main (String [] args) {
        System.out.println("DEAR REGITA PERMATASARI/ XRPL5 / 11" );
        
Scanner scanner = new Scanner(System.in);
System.out.println("Masukkan Bilangan :");
    int uang = scanner.nextInt();
    int pecahan[] = new int[]{5000,2000,1000,500};
    int jumlah;
    
        for(int i=0; i<pecahan.length; i++){
            if (uang >= pecahan[i]) {
                jumlah= uang/pecahan[i];
                uang= uang%pecahan[i];
                System.out.println("Pecahan "+pecahan[i]+" sebanyak " +jumlah+" kepingan");
                
            }
    }

    }
}
                

            
    

