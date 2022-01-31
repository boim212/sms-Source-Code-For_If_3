package for_if_3;

import java.util.Scanner;

public class For_If_3 
{
    public static void main(String[] args) 
    {
         Scanner input = new Scanner(System.in);
        
         int masuk, baris, kolom;
         
         do
         {
             System.out.print("Masukkan Jumlah Pengulangan (Min 3) = ");
             masuk = input.nextInt();
         }
         while(masuk < 3);
         
        System.out.println("");
        System.out.println("+-----Tugas For if 3 -----+");
        System.out.println("+-------------------------+");
        System.out.println("");
        
         for (baris = 0; baris < masuk; baris++) 
         {
             for (kolom = 0; kolom < masuk; kolom++) 
             {
                 if ( (kolom == baris) || (kolom + baris) == (masuk - 1) )
                 {
                     System.out.print(" $ ");
                 }
                 else
                 {
                     System.out.print(" . ");
                 }
             }
             System.out.println(" ");
        }
        System.out.println("");
        System.out.println("+------- 025314020 -------+");
        System.out.println("+-------Program Java------+");
    }
    
}
