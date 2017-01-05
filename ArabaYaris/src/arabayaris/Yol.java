/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arabayaris;

/**
 *
 * @author ERHAN
 */
public class Yol extends Sprite{
    public int hiz,a=5;
    
    public Yol(int x,int y)
    {
        super(x,y);
        initYOL();
    }
    private void initYOL()
    {
        loadImage("yol.png");
        getImageDimensions();
    }
    public void move()
    {
        y+=a;
        if(y>=512)
            y=0;
    }
}
