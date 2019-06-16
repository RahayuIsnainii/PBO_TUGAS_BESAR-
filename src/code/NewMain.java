package code;

import desain.Transaksi;
import desain.awal;

public class NewMain {

    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        awal splash = new awal();
        for(int i=0; i<=100; i++){
            Thread.sleep(40);
            splash.setVisible(true);
 //           splash.jLabel1.setText("Loading . .");
            splash.jProgressBar1.setValue(i);
            
            if(i==100){
                new Transaksi().setVisible(true);
                splash.dispose();
            }
        }
    }
}
