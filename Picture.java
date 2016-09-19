/**
 * This Class represents a picture of two people around a campfire at night. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Dana Sabatino (based on a work by Michael Kšlling and David J. Barnes)
 * @version 2016.09.19
 */
public class Picture
{
    private Person PersonLeft;
    private Person PersonRight;
    private Square Grass;
    private Square NightSky;
    private Triangle RedFire;
    private Triangle YellowFire;
    private Circle Rock1;
    private Circle Rock2;
    private Circle Rock3;
    private Circle Moon;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        Grass = new Square();
        Grass.changeColor("green");
        Grass.moveHorizontal(-350);
        Grass.moveVertical(20);
        Grass.changeSize(600);
        Grass.makeVisible();
        
        NightSky = new Square();
        NightSky.changeColor("black");
        NightSky.moveHorizontal(-310);
        NightSky.moveVertical(-475);
        NightSky.changeSize(500);
        NightSky.makeVisible();
        
        PersonLeft = new Person();
        PersonLeft.changeColor("blue");
        PersonLeft.moveHorizontal(-215);
        PersonLeft.moveVertical(-75);
        PersonLeft.changeSize(200, 75);
        PersonLeft.makeVisible();
        
        PersonRight = new Person();
        PersonRight.changeColor("blue");
        PersonRight.moveHorizontal(150);
        PersonRight.moveVertical(-75);
        PersonRight.changeSize(200, 75);
        PersonRight.makeVisible();
        
        RedFire = new Triangle();
        RedFire.changeColor("red");
        RedFire.moveHorizontal(40);
        RedFire.moveVertical(-50);
        RedFire.changeSize(150,100);
        RedFire.makeVisible();
        
        YellowFire = new Triangle();
        YellowFire.changeColor("yellow");
        YellowFire.moveHorizontal(40);
        YellowFire.changeSize(80,53);
        YellowFire.makeVisible();
        
        Rock1 = new Circle();
        Rock1.changeColor("magenta");
        Rock1.moveHorizontal(40);
        Rock1.moveVertical(135);
        Rock1.changeSize(35);
        Rock1.makeVisible();
        
        Rock2 = new Circle();
        Rock2.changeColor("magenta");
        Rock2.moveHorizontal(5);
        Rock2.moveVertical(135);
        Rock2.changeSize(35);
        Rock2.makeVisible();
        
        Rock3 = new Circle();
        Rock3.changeColor("magenta");
        Rock3.moveHorizontal(-30);
        Rock3.moveVertical(135);
        Rock3.changeSize(35);
        Rock3.makeVisible();
        
        Moon = new Circle();
        Moon.changeColor("white");
        Moon.moveHorizontal(75);
        Moon.moveVertical(-40);
        Moon.changeSize(45);
        Moon.makeVisible();
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (Grass != null)   // only if it's painted already...
        {
            Grass.changeColor("white");
            NightSky.changeColor("white");
            PersonLeft.changeColor("black");
            PersonRight.changeColor("black");
            RedFire.changeColor("black");
            YellowFire.changeColor("white");
            Rock1.changeColor("black");
            Rock2.changeColor("black");
            Rock3.changeColor("black");
            Moon.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (Grass != null)   // only if it's painted already...
        {
            Grass.changeColor("green");
            NightSky.changeColor("black");
            PersonLeft.changeColor("blue");
            PersonRight.changeColor("blue");
            RedFire.changeColor("red");
            YellowFire.changeColor("yellow");
            Rock1.changeColor("magenta");
            Rock2.changeColor("magenta");
            Rock3.changeColor("magenta");
            Moon.changeColor("white");
        }
    }
}
