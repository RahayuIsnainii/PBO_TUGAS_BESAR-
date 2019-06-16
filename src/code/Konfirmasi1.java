package code;

public class Konfirmasi1 {
    private String metodeBayar;

    public Konfirmasi1(String metodeBayar) {
        this.metodeBayar = metodeBayar;
    }

    @Override
    public String toString() {
        return this.metodeBayar;
    }

    public String getMetodeBayar() {
        return metodeBayar;
    }

    public void setMetodeBayar(String metodeBayar) {
        this.metodeBayar = metodeBayar;
    }    
}
