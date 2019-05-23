/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes.pbo;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class TUBESPBO extends JPanel {
    Image gambar;
    public TUBESPBO() {
        gambar = new ImageIcon(getClass().getResource("gambar/background-ppt-lucu-6028 (1).jpeg")).getImage();
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D gp = (Graphics2D)g.create(); 
        gp.drawImage(gambar, 0, 0, getWidth(), getHeight(), null);
        gp.dispose();
    }
    
}
