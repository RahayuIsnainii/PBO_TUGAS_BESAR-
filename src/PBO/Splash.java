package PBO;

public class Splash {
    public static void main(String[] args) throws InterruptedException {
        awal splash = new awal();
        for(int i=0; i<=100; i++){
            Thread.sleep(40);
            splash.setVisible(true);
            splash.jLabel1.setText("Loading . .");
            splash.jProgressBar1.setValue(i);
            
            if(i==100){
                new Transaksi().setVisible(true);
                splash.dispose();
            }
        }
    }
}
