/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arabayaris;

import java.awt.AlphaComposite;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author ERHAN
 */
public class Board extends JPanel implements ActionListener{
    private Yol yol;
    private Araba araba;
    private Engel engel;
    private Timer timer;
    private Random rand;
    private int sayac=0;
    private int b_w=512,b_h=512;
    private int Delay=15,q=50;
    
    AlphaComposite ac;
    
    public Board()
    {
        initBoard();
    }
    
    private void initBoard()
    {
        addKeyListener(new TAdapter());
        setFocusable(true);
        setPreferredSize(new Dimension(b_w, b_h));
        
        yol = new Yol(getWidth(),getHeight());
        araba = new Araba(getWidth(),getHeight());
        engel = new Engel(getWidth(),getHeight());
        timer = new Timer(Delay, this);
        timer.start();
    }

    private class TAdapter extends KeyAdapter {

        @Override
        public void keyReleased(KeyEvent e) {
           araba.keyReleased(e);
        }

        @Override
        public void keyPressed(KeyEvent e) {
            araba.keyPressed(e);
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        yol.move();
        araba.move();
        engel.move();
        /*if(sayac%100==0 || sayac==0)
        {
            engel.x = rand.nextInt(168)+109;
            engel.y = rand.nextInt(106)+277;
        }*/
        repaint();
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawObjects(g);
    }
    private void drawObjects(Graphics g) {
        
        
        g.drawImage(yol.getImage(), yol.getX(), yol.getY(),this);
        if(yol.getY()<=512)
        {
            g.drawImage(yol.getImage(), yol.getX(), yol.getY()-512,this);
        }
        g.drawImage(araba.getImage(), araba.getX(), araba.getY(),this);
        g.drawImage(engel.getImage(), engel.getX(), yol.getY(),this);
            
        g.dispose();
        sayac++;
        if(sayac%100==0 && sayac<500)
            yol.a=yol.a+1;
        
    }
}
