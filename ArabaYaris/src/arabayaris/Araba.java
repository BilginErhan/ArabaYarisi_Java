/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arabayaris;

import java.awt.event.KeyEvent;

/**
 *
 * @author ERHAN
 */
public class Araba extends Sprite{
    
    private int dx,dy;
    
    public Araba(int x,int y)
    {
        super(x,y);
        x=250;
        y=277;
        initAraba();
    }
    private void initAraba()
    {
        loadImage("araba.png");
        getImageDimensions();
    }
    public void move()
    {
        x+=dx;
        y+=dy;
        
        if (x <= 109) {
            x = 109;
        }
        if(x>=277)
        {
            x=277;
        }

        if (y < 1) {
            y = 1;
        }
        if(y>=383)
        {
            y=383;
        }
    }
    public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            dx = -2;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 2;
        }

        if (key == KeyEvent.VK_UP) {
            dy = -2;
        }

        if (key == KeyEvent.VK_DOWN) {
            dy = 2;
        }
    }
    
    public void keyReleased(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_UP) {
            dy = 0;
        }

        if (key == KeyEvent.VK_DOWN) {
            dy = 0;
        }
    }
}
