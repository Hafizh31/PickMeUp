import java.util.Scanner;
/**
 * Write a description of class DSLR here.
 *
 * @author (Adika, Hafizh, Naufal)
 * @version (30 Maret 2021)
 */
public class pickup implements Sewa
{
    public void JenisPaket() {
        Scanner input = new Scanner(System.in);
        System.out.println("\nMau sewa paket yang mana? :\n1. Paket1(Dengan Supir)\n2. Paket2(Tanpa Supir) ");
        int paket = input.nextInt();
        System.out.println("Anda akan menyewa pickup dengan Paket " + paket );
        System.out.println("Terimakasih telah menggunakan jasa kami");
    }

    public void ProsesData() {
        JenisPaket();
        }
    
}