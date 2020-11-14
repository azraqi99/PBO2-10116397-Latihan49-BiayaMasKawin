/*
NAMA   : MUHAMMAD AZRAQI SAPUTRA
KELAS  : PBO2
NIM    : 10116397
Deskripsi Program : Biaya Emas Kawin
 */
package pbo210116397latihan49biayaemaskawin;

/**
 *
 * @author Zetro
 */
public class PBO210116397Latihan49BiayaEmasKawin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BiayaEmas bimas = new BiayaEmas();
        bimas.setEmasKawin(15.7);
        bimas.setHargaSatuGram(570000);
        
        System.out.println("Hendri membeli emas kawin : " + bimas.getEmasKawin() 
                + " gram");
        System.out.println("Harga 1 gram emas per bulan oktober ini : Rp. " 
                + bimas.getHargaSatuGram());
        System.out.println();
        
        double emas_kawin = bimas.getEmasKawin();
        double harga_satu_gram = bimas.getHargaSatuGram();
        
        System.out.println("Total pembayaran yang harus dikeluarkan : Rp. " 
                + bimas.hitungTotalPembayaran(emas_kawin, harga_satu_gram));
        
    }
    
}
