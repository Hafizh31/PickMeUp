import java.util.Scanner;
/**
 * Write a description of class Main here.
 *
 * @author (Adika, Hafizh, Naufal)
 * @version (30 Maret 2021)
 */
public class Main
{
    public static void main (String args[]){
        System.out.println(
           "WELCOME TO PICK ME UP SOLUTIONS\nSilahkan Pilih Angkutan yang ingin Anda sewakan: \n 1.Becak \n 2.Pickup\n");
        
        becak angkutanbecak = new becak();
        pickup angkutanpickup = new pickup();
         
        SewaAngkutan angkutan1 = new SewaAngkutan();
        SewaAngkutan angkutan2 = new SewaAngkutan();

        Scanner input = new Scanner(System.in);
        int pilihan = input.nextInt();

         switch (pilihan) {
             case 1:
             angkutan1.Konfirmasi(angkutanbecak);
             angkutan1.Transaksi();
                  break;
         
             case 2:
             angkutan2.Konfirmasi(angkutanpickup);
             angkutan2.Transaksi();
                 break;
         }
         
    }
}