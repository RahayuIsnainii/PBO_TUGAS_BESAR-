package code;

import javax.swing.table.DefaultTableModel;

public class Transaksi2 {
    private double subTotal=0;
    private double ppn=0;
    private double total=0;
    private DefaultTableModel tabel = new DefaultTableModel();
    
    public Transaksi2(){
        getTabel().addColumn("Merk");
        getTabel().addColumn("Harga");
        getTabel().addColumn("Jumlah");
        getTabel().addColumn("Total");
    }

    public double countSubtotal(){
        subTotal=0;
        for (int i=0;i<tabel.getRowCount();i++){
            subTotal=subTotal+Double.parseDouble(tabel.getValueAt(i, 3).toString());
        }
        return subTotal;
    }
    
    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public DefaultTableModel getTabel() {
        return tabel;
    }

    /**
     * @param tabel the tabel to set
     */
    public void setTabel(DefaultTableModel tabel) {
        this.tabel = tabel;
    }
}
