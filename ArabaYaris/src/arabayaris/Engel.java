/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arabayaris;

import java.util.Random;



/**
 *
 * @author ERHAN
 */
public class Engel extends Sprite{
    
    Random rand = new Random();
    public Engel(int x,int y)
    {
        super(x,y);
        initEngel();
    }
    private void initEngel()
    {
        loadImage("engel.png");
        getImageDimensions();
    }
    public void move()
    {
        x=150;
        y=250;
    }

    
}
