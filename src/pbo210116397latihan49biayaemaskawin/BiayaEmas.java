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
public class BiayaEmas {
    
    private double emasKawin;
    private double hargaSatuGram;

    public double getEmasKawin() {
        return emasKawin;
    }

    public void setEmasKawin(double emasKawin) {
        this.emasKawin = emasKawin;
    }

    public double getHargaSatuGram() {
        return hargaSatuGram;
    }

    public void setHargaSatuGram(double hargaSatuGram) {
        this.hargaSatuGram = hargaSatuGram;
    }
    
    public double hitungTotalPembayaran(double emas, double harga) {
        return emas * harga;
    }
    
}
