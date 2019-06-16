package code;

public class Transaksi1 {
    private String namaBarang;
    private int harga;

    public Transaksi1(String namaBarang, int harga) {
        this.namaBarang = namaBarang;
        this.harga = harga;
    }

    @Override
    public String toString() {
        return this.namaBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }
    
    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    
}
