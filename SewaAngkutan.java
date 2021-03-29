
/**
 * Write a description of class SewaKamera here.
 *
 * @author (Adika, Hafizh, Naufal)
 * @version (30 Maret 2021)
 */
public class SewaAngkutan
{
   private Sewa angkutan;
   
   public SewaAngkutan() {
       angkutan = null; 
    }
    
    public void Konfirmasi(Sewa jenisangkutan) {
        angkutan = jenisangkutan;
    }
    
   public void Transaksi() {
       if(angkutan != null) {
        angkutan.ProsesData();
        }
        else {
        System.out.println("Harap memilih paket");
        }
    }
     
}