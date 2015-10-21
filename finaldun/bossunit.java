/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package finaldun;

import every.*;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JOptionPane;
/**
 *
 * @author Dad
 */
public class bossunit extends unit {
    
    
    private int switcher;
    
    private boolean washit;
    
    public trigger ismelee;
    
    
    
    public bossunit( room currentroom, int x, int y )
    {
        super( 15, 0, 8, "spear", x, y, new noai(), currentroom.getweap2(), currentroom, 100, 140 );
        
        ismelee = new trigger(true);
        
        buildvil1();
        
        switcher = 0;
        
    
        washit = false;
        
        setjumpvar(40);
        
        
        this.setName("Ondo");
        this.setStatement("I don't need the Sword badly enough that I won't kill you.");
        
        
    }
    
    
    @Override
    public void dropper()
    {
        super.dropper();
        
        
        getroom().getweap1().add(new weapons.bombexplosion( getrightx() + 10, getcentery(), 0, -15 ) );
        getroom().getweap1().add(new weapons.bombexplosion( getcenterx(), getcentery(), 15, -0 ) );
        getroom().getweap1().add(new weapons.bombexplosion( getleftx(), getcentery(), -15, -0 ) );
        
        getroom().getweap1().add(new weapons.bombexplosion( getrightx() + 10, getcentery(), 0, -8 ) );
        getroom().getweap1().add(new weapons.bombexplosion( getcenterx(), getcentery(), 8, -0 ) );
        getroom().getweap1().add(new weapons.bombexplosion( getleftx(), getcentery(), -8, -0 ) );
        
        getroom().getweap1().add(new weapons.bombexplosion( getcenterx(), getcentery(), 4, -4 ) );
        getroom().getweap1().add(new weapons.bombexplosion( getcenterx(), getcentery(), -4, -4 ) );
        
        getroom().getweap1().add(new weapons.bombexplosion( getcenterx(), getcentery(), 8, -8 ) );
        getroom().getweap1().add(new weapons.bombexplosion( getcenterx(), getcentery(), -8, -8 ) );
            
    }
    
    
    public void setweapon( String w )
    {
        
        mainweapon = w;
        
    }
    
    
    @Override
    public void hit( weapon w )
    {
        if ( washit || !w.checkweap("sost") ) {
            
            
            
            return;
        
        
        }
        if ( w.getatt() > 0 ) {
            getfig().redit();
        }
        
        ismelee.switchtrigger();
//        
//        
        washit = true;
        life -= 1;
        w.hitit();
        w.onhittrigger();
        if ( life > 100 ) {
            life = 100;
        }
        
        
        
    }
    
    
    @Override
    public void step( Graphics g )
    {
        
        super.step(g);
        
        washit = false;
        
        
    }
    
    
    @Override
   public void attack2()
    {
        if ( !ai.canattack() ) {
            return;
        }
        
        lastweapused = 1;
        int temp;
        int temp_opposite;
        if ( dir == 1 ) {
            temp = -1;
            temp_opposite = 1;
        }
        else {
            temp = 1;
            temp_opposite = -1;
        }
        
        
        int xmove;
        
        
        xmove = (int) ( 500 * constants.distance(ai.gettarget().getcenterx(), 0, getcenterx(), 0) / 1200);
        
        
        
        
        current.addneutral(new weapons.movingbomb( current, getcenterx() + 35 * temp, y, temp * xmove, -40));
        
    }
    
    
    
    public void buildvil1()
    {
        figure f = this.getfig();
        
        f.setwidth(33);
        f.setlength(79);
        
        this.sety( this.gety() - f.getlength());
        rey = y;
        


Color sa = new Color(0,0,0);
Color sb = new Color(51,51,51);
Color sc = new Color(255,0,0);




//<editor-fold defaultstate="collapsed" desc="build figure">




setpixel(0, 0, sa);
setpixel(7, 0, sb);
setpixel(8, 0, sb);
setpixel(9, 0, sb);
setpixel(10, 0, sb);
setpixel(11, 0, sb);
setpixel(12, 0, sb);
setpixel(13, 0, sb);
setpixel(14, 0, sb);
setpixel(2, 1, sb);
setpixel(3, 1, sb);
setpixel(4, 1, sb);
setpixel(5, 1, sb);
setpixel(6, 1, sb);
setpixel(7, 1, sa);
setpixel(8, 1, sa);
setpixel(9, 1, sa);
setpixel(10, 1, sa);
setpixel(11, 1, sa);
setpixel(12, 1, sa);
setpixel(13, 1, sa);
setpixel(14, 1, sa);
setpixel(15, 1, sb);
setpixel(16, 1, sb);
setpixel(5, 2, sa);
setpixel(6, 2, sa);
setpixel(7, 2, sa);
setpixel(8, 2, sa);
setpixel(9, 2, sa);
setpixel(10, 2, sa);
setpixel(11, 2, sa);
setpixel(12, 2, sa);
setpixel(13, 2, sa);
setpixel(14, 2, sa);
setpixel(15, 2, sa);
setpixel(16, 2, sa);
setpixel(17, 2, sb);
setpixel(18, 2, sb);
setpixel(19, 2, sb);
setpixel(6, 3, sa);
setpixel(7, 3, sa);
setpixel(8, 3, sa);
setpixel(9, 3, sa);
setpixel(10, 3, sa);
setpixel(11, 3, sa);
setpixel(12, 3, sa);
setpixel(13, 3, sa);
setpixel(14, 3, sa);
setpixel(15, 3, sa);
setpixel(16, 3, sa);
setpixel(17, 3, sa);
setpixel(18, 3, sa);
setpixel(19, 3, sb);
setpixel(20, 3, sb);
setpixel(21, 3, sb);
setpixel(6, 4, sa);
setpixel(7, 4, sa);
setpixel(8, 4, sa);
setpixel(9, 4, sa);
setpixel(10, 4, sa);
setpixel(11, 4, sa);
setpixel(12, 4, sa);
setpixel(13, 4, sa);
setpixel(14, 4, sa);
setpixel(15, 4, sa);
setpixel(16, 4, sa);
setpixel(17, 4, sa);
setpixel(18, 4, sa);
setpixel(19, 4, sa);
setpixel(20, 4, sa);
setpixel(21, 4, sa);
setpixel(22, 4, sb);
setpixel(7, 5, sa);
setpixel(8, 5, sa);
setpixel(9, 5, sa);
setpixel(10, 5, sa);
setpixel(11, 5, sa);
setpixel(12, 5, sa);
setpixel(13, 5, sa);
setpixel(14, 5, sa);
setpixel(15, 5, sa);
setpixel(16, 5, sa);
setpixel(17, 5, sa);
setpixel(18, 5, sa);
setpixel(19, 5, sa);
setpixel(20, 5, sa);
setpixel(21, 5, sa);
setpixel(22, 5, sb);
setpixel(7, 6, sa);
setpixel(8, 6, sa);
setpixel(9, 6, sa);
setpixel(10, 6, sa);
setpixel(11, 6, sa);
setpixel(12, 6, sa);
setpixel(13, 6, sa);
setpixel(14, 6, sc);
setpixel(15, 6, sc);
setpixel(16, 6, sc);
setpixel(17, 6, sc);
setpixel(18, 6, sc);
setpixel(19, 6, sc);
setpixel(20, 6, sa);
setpixel(21, 6, sa);
setpixel(22, 6, sa);
setpixel(23, 6, sb);
setpixel(8, 7, sa);
setpixel(9, 7, sa);
setpixel(10, 7, sa);
setpixel(11, 7, sa);
setpixel(12, 7, sa);
setpixel(13, 7, sa);
setpixel(14, 7, sa);
setpixel(15, 7, sa);
setpixel(16, 7, sc);
setpixel(17, 7, sa);
setpixel(18, 7, sa);
setpixel(19, 7, sa);
setpixel(20, 7, sc);
setpixel(21, 7, sa);
setpixel(22, 7, sa);
setpixel(23, 7, sb);
setpixel(9, 8, sc);
setpixel(10, 8, sa);
setpixel(11, 8, sa);
setpixel(12, 8, sa);
setpixel(13, 8, sa);
setpixel(14, 8, sa);
setpixel(15, 8, sa);
setpixel(16, 8, sa);
setpixel(17, 8, sc);
setpixel(18, 8, sa);
setpixel(19, 8, sa);
setpixel(20, 8, sa);
setpixel(21, 8, sc);
setpixel(22, 8, sa);
setpixel(23, 8, sb);
setpixel(9, 9, sa);
setpixel(10, 9, sc);
setpixel(11, 9, sa);
setpixel(12, 9, sa);
setpixel(13, 9, sa);
setpixel(14, 9, sa);
setpixel(15, 9, sa);
setpixel(16, 9, sa);
setpixel(17, 9, sa);
setpixel(18, 9, sc);
setpixel(19, 9, sc);
setpixel(20, 9, sc);
setpixel(21, 9, sc);
setpixel(22, 9, sa);
setpixel(23, 9, sa);
setpixel(24, 9, sb);
setpixel(9, 10, sa);
setpixel(10, 10, sa);
setpixel(11, 10, sc);
setpixel(12, 10, sa);
setpixel(13, 10, sa);
setpixel(14, 10, sa);
setpixel(15, 10, sa);
setpixel(16, 10, sa);
setpixel(17, 10, sa);
setpixel(18, 10, sa);
setpixel(19, 10, sa);
setpixel(20, 10, sa);
setpixel(21, 10, sa);
setpixel(22, 10, sa);
setpixel(23, 10, sa);
setpixel(24, 10, sb);
setpixel(9, 11, sa);
setpixel(10, 11, sa);
setpixel(11, 11, sa);
setpixel(12, 11, sc);
setpixel(13, 11, sa);
setpixel(14, 11, sa);
setpixel(15, 11, sa);
setpixel(16, 11, sa);
setpixel(17, 11, sa);
setpixel(18, 11, sa);
setpixel(19, 11, sa);
setpixel(20, 11, sa);
setpixel(21, 11, sa);
setpixel(22, 11, sa);
setpixel(23, 11, sa);
setpixel(24, 11, sb);
setpixel(8, 12, sa);
setpixel(9, 12, sa);
setpixel(10, 12, sa);
setpixel(11, 12, sa);
setpixel(12, 12, sa);
setpixel(13, 12, sc);
setpixel(14, 12, sa);
setpixel(15, 12, sa);
setpixel(16, 12, sa);
setpixel(17, 12, sa);
setpixel(18, 12, sa);
setpixel(19, 12, sa);
setpixel(20, 12, sa);
setpixel(21, 12, sa);
setpixel(22, 12, sa);
setpixel(23, 12, sa);
setpixel(24, 12, sb);
setpixel(8, 13, sa);
setpixel(9, 13, sa);
setpixel(10, 13, sa);
setpixel(11, 13, sa);
setpixel(12, 13, sa);
setpixel(13, 13, sa);
setpixel(14, 13, sc);
setpixel(15, 13, sa);
setpixel(16, 13, sa);
setpixel(17, 13, sa);
setpixel(18, 13, sa);
setpixel(19, 13, sa);
setpixel(20, 13, sa);
setpixel(21, 13, sa);
setpixel(22, 13, sa);
setpixel(23, 13, sa);
setpixel(24, 13, sb);
setpixel(7, 14, sa);
setpixel(8, 14, sa);
setpixel(9, 14, sa);
setpixel(10, 14, sa);
setpixel(11, 14, sa);
setpixel(12, 14, sa);
setpixel(13, 14, sa);
setpixel(14, 14, sa);
setpixel(15, 14, sc);
setpixel(16, 14, sc);
setpixel(17, 14, sa);
setpixel(18, 14, sa);
setpixel(19, 14, sa);
setpixel(20, 14, sa);
setpixel(21, 14, sa);
setpixel(22, 14, sa);
setpixel(23, 14, sa);
setpixel(24, 14, sb);
setpixel(7, 15, sa);
setpixel(8, 15, sa);
setpixel(9, 15, sa);
setpixel(10, 15, sa);
setpixel(11, 15, sa);
setpixel(12, 15, sa);
setpixel(13, 15, sa);
setpixel(14, 15, sa);
setpixel(15, 15, sa);
setpixel(16, 15, sa);
setpixel(17, 15, sc);
setpixel(18, 15, sc);
setpixel(19, 15, sa);
setpixel(20, 15, sa);
setpixel(21, 15, sa);
setpixel(22, 15, sa);
setpixel(23, 15, sa);
setpixel(24, 15, sb);
setpixel(10, 16, sc);
setpixel(11, 16, sc);
setpixel(12, 16, sc);
setpixel(13, 16, sc);
setpixel(14, 16, sc);
setpixel(15, 16, sc);
setpixel(16, 16, sc);
setpixel(17, 16, sc);
setpixel(18, 16, sc);
setpixel(19, 16, sc);
setpixel(20, 16, sc);
setpixel(21, 16, sc);
setpixel(24, 16, sb);
setpixel(10, 17, sa);
setpixel(11, 17, sa);
setpixel(12, 17, sa);
setpixel(13, 17, sa);
setpixel(14, 17, sa);
setpixel(15, 17, sa);
setpixel(16, 17, sa);
setpixel(17, 17, sa);
setpixel(18, 17, sa);
setpixel(19, 17, sa);
setpixel(20, 17, sa);
setpixel(21, 17, sa);
setpixel(9, 18, sa);
setpixel(10, 18, sa);
setpixel(11, 18, sa);
setpixel(12, 18, sa);
setpixel(13, 18, sa);
setpixel(14, 18, sa);
setpixel(15, 18, sa);
setpixel(16, 18, sa);
setpixel(17, 18, sc);
setpixel(18, 18, sc);
setpixel(19, 18, sc);
setpixel(20, 18, sc);
setpixel(21, 18, sc);
setpixel(22, 18, sc);
setpixel(8, 19, sa);
setpixel(9, 19, sa);
setpixel(10, 19, sa);
setpixel(11, 19, sa);
setpixel(12, 19, sc);
setpixel(13, 19, sc);
setpixel(14, 19, sc);
setpixel(15, 19, sc);
setpixel(16, 19, sc);
setpixel(17, 19, sc);
setpixel(18, 19, sc);
setpixel(19, 19, sa);
setpixel(20, 19, sa);
setpixel(21, 19, sa);
setpixel(22, 19, sa);
setpixel(23, 19, sa);
setpixel(8, 20, sa);
setpixel(9, 20, sa);
setpixel(10, 20, sa);
setpixel(11, 20, sc);
setpixel(12, 20, sc);
setpixel(13, 20, sa);
setpixel(14, 20, sa);
setpixel(15, 20, sa);
setpixel(16, 20, sa);
setpixel(17, 20, sa);
setpixel(18, 20, sc);
setpixel(19, 20, sa);
setpixel(20, 20, sa);
setpixel(21, 20, sa);
setpixel(22, 20, sa);
setpixel(23, 20, sa);
setpixel(8, 21, sa);
setpixel(9, 21, sa);
setpixel(10, 21, sa);
setpixel(11, 21, sc);
setpixel(12, 21, sa);
setpixel(13, 21, sa);
setpixel(14, 21, sa);
setpixel(15, 21, sa);
setpixel(16, 21, sa);
setpixel(17, 21, sa);
setpixel(18, 21, sc);
setpixel(19, 21, sc);
setpixel(20, 21, sa);
setpixel(21, 21, sa);
setpixel(22, 21, sa);
setpixel(23, 21, sa);
setpixel(24, 21, sa);
setpixel(8, 22, sa);
setpixel(9, 22, sa);
setpixel(10, 22, sa);
setpixel(11, 22, sc);
setpixel(12, 22, sa);
setpixel(13, 22, sa);
setpixel(14, 22, sa);
setpixel(15, 22, sa);
setpixel(16, 22, sa);
setpixel(17, 22, sa);
setpixel(18, 22, sa);
setpixel(19, 22, sc);
setpixel(20, 22, sa);
setpixel(21, 22, sa);
setpixel(22, 22, sa);
setpixel(23, 22, sa);
setpixel(24, 22, sa);
setpixel(8, 23, sa);
setpixel(9, 23, sa);
setpixel(10, 23, sa);
setpixel(11, 23, sc);
setpixel(12, 23, sa);
setpixel(13, 23, sa);
setpixel(14, 23, sa);
setpixel(15, 23, sa);
setpixel(16, 23, sa);
setpixel(17, 23, sa);
setpixel(18, 23, sa);
setpixel(19, 23, sc);
setpixel(20, 23, sa);
setpixel(21, 23, sa);
setpixel(22, 23, sa);
setpixel(23, 23, sa);
setpixel(24, 23, sa);
setpixel(8, 24, sa);
setpixel(9, 24, sa);
setpixel(10, 24, sa);
setpixel(11, 24, sc);
setpixel(12, 24, sa);
setpixel(13, 24, sa);
setpixel(14, 24, sa);
setpixel(15, 24, sa);
setpixel(16, 24, sa);
setpixel(17, 24, sa);
setpixel(18, 24, sa);
setpixel(19, 24, sc);
setpixel(20, 24, sa);
setpixel(21, 24, sa);
setpixel(22, 24, sa);
setpixel(23, 24, sa);
setpixel(24, 24, sa);
setpixel(25, 24, sa);
setpixel(8, 25, sa);
setpixel(9, 25, sa);
setpixel(10, 25, sa);
setpixel(11, 25, sc);
setpixel(12, 25, sa);
setpixel(13, 25, sa);
setpixel(14, 25, sa);
setpixel(15, 25, sa);
setpixel(16, 25, sa);
setpixel(17, 25, sa);
setpixel(18, 25, sa);
setpixel(19, 25, sc);
setpixel(20, 25, sc);
setpixel(21, 25, sa);
setpixel(22, 25, sa);
setpixel(23, 25, sa);
setpixel(24, 25, sa);
setpixel(25, 25, sa);
setpixel(8, 26, sa);
setpixel(9, 26, sa);
setpixel(10, 26, sa);
setpixel(11, 26, sc);
setpixel(12, 26, sa);
setpixel(13, 26, sa);
setpixel(14, 26, sa);
setpixel(15, 26, sa);
setpixel(16, 26, sa);
setpixel(17, 26, sa);
setpixel(18, 26, sa);
setpixel(19, 26, sc);
setpixel(20, 26, sc);
setpixel(21, 26, sa);
setpixel(22, 26, sa);
setpixel(23, 26, sa);
setpixel(24, 26, sa);
setpixel(25, 26, sa);
setpixel(26, 26, sa);
setpixel(8, 27, sa);
setpixel(9, 27, sa);
setpixel(10, 27, sa);
setpixel(11, 27, sc);
setpixel(12, 27, sc);
setpixel(13, 27, sa);
setpixel(14, 27, sa);
setpixel(15, 27, sa);
setpixel(16, 27, sa);
setpixel(17, 27, sa);
setpixel(18, 27, sc);
setpixel(19, 27, sc);
setpixel(20, 27, sb);
setpixel(21, 27, sb);
setpixel(22, 27, sb);
setpixel(23, 27, sc);
setpixel(24, 27, sb);
setpixel(25, 27, sb);
setpixel(26, 27, sa);
setpixel(8, 28, sa);
setpixel(9, 28, sa);
setpixel(10, 28, sa);
setpixel(11, 28, sa);
setpixel(12, 28, sc);
setpixel(13, 28, sa);
setpixel(14, 28, sa);
setpixel(15, 28, sa);
setpixel(16, 28, sc);
setpixel(17, 28, sc);
setpixel(18, 28, sc);
setpixel(19, 28, sa);
setpixel(20, 28, sa);
setpixel(21, 28, sa);
setpixel(22, 28, sc);
setpixel(23, 28, sa);
setpixel(24, 28, sa);
setpixel(25, 28, sb);
setpixel(26, 28, sc);
setpixel(27, 28, sb);
setpixel(28, 28, sb);
setpixel(29, 28, sb);
setpixel(30, 28, sb);
setpixel(31, 28, sb);
setpixel(8, 29, sa);
setpixel(9, 29, sa);
setpixel(10, 29, sa);
setpixel(11, 29, sa);
setpixel(12, 29, sc);
setpixel(13, 29, sc);
setpixel(14, 29, sc);
setpixel(15, 29, sc);
setpixel(16, 29, sc);
setpixel(17, 29, sa);
setpixel(18, 29, sa);
setpixel(19, 29, sa);
setpixel(20, 29, sa);
setpixel(21, 29, sc);
setpixel(22, 29, sc);
setpixel(23, 29, sa);
setpixel(24, 29, sa);
setpixel(25, 29, sc);
setpixel(26, 29, sa);
setpixel(27, 29, sa);
setpixel(28, 29, sa);
setpixel(29, 29, sa);
setpixel(30, 29, sa);
setpixel(31, 29, sa);
setpixel(32, 29, sb);
setpixel(33, 29, sb);
setpixel(8, 30, sa);
setpixel(9, 30, sa);
setpixel(10, 30, sa);
setpixel(11, 30, sa);
setpixel(12, 30, sa);
setpixel(13, 30, sb);
setpixel(14, 30, sa);
setpixel(15, 30, sa);
setpixel(16, 30, sa);
setpixel(17, 30, sa);
setpixel(18, 30, sa);
setpixel(19, 30, sa);
setpixel(20, 30, sc);
setpixel(21, 30, sc);
setpixel(22, 30, sa);
setpixel(23, 30, sa);
setpixel(24, 30, sa);
setpixel(25, 30, sc);
setpixel(26, 30, sa);
setpixel(27, 30, sa);
setpixel(28, 30, sa);
setpixel(29, 30, sa);
setpixel(30, 30, sa);
setpixel(31, 30, sa);
setpixel(32, 30, sa);
setpixel(33, 30, sa);
setpixel(8, 31, sa);
setpixel(9, 31, sa);
setpixel(10, 31, sa);
setpixel(11, 31, sa);
setpixel(12, 31, sa);
setpixel(13, 31, sb);
setpixel(14, 31, sb);
setpixel(15, 31, sa);
setpixel(16, 31, sa);
setpixel(17, 31, sa);
setpixel(18, 31, sc);
setpixel(19, 31, sc);
setpixel(20, 31, sc);
setpixel(21, 31, sa);
setpixel(22, 31, sa);
setpixel(23, 31, sa);
setpixel(24, 31, sa);
setpixel(25, 31, sc);
setpixel(26, 31, sa);
setpixel(27, 31, sa);
setpixel(28, 31, sa);
setpixel(29, 31, sa);
setpixel(30, 31, sa);
setpixel(31, 31, sa);
setpixel(32, 31, sa);
setpixel(33, 31, sa);
setpixel(8, 32, sa);
setpixel(9, 32, sa);
setpixel(10, 32, sa);
setpixel(11, 32, sa);
setpixel(12, 32, sa);
setpixel(13, 32, sa);
setpixel(14, 32, sb);
setpixel(15, 32, sb);
setpixel(16, 32, sa);
setpixel(17, 32, sc);
setpixel(18, 32, sc);
setpixel(19, 32, sa);
setpixel(20, 32, sa);
setpixel(21, 32, sa);
setpixel(22, 32, sa);
setpixel(23, 32, sa);
setpixel(24, 32, sc);
setpixel(25, 32, sc);
setpixel(26, 32, sa);
setpixel(27, 32, sa);
setpixel(28, 32, sa);
setpixel(29, 32, sa);
setpixel(30, 32, sa);
setpixel(31, 32, sa);
setpixel(32, 32, sa);
setpixel(33, 32, sa);
setpixel(8, 33, sa);
setpixel(9, 33, sa);
setpixel(10, 33, sa);
setpixel(11, 33, sa);
setpixel(12, 33, sa);
setpixel(13, 33, sa);
setpixel(14, 33, sa);
setpixel(15, 33, sb);
setpixel(16, 33, sc);
setpixel(17, 33, sb);
setpixel(18, 33, sa);
setpixel(19, 33, sa);
setpixel(20, 33, sa);
setpixel(21, 33, sa);
setpixel(22, 33, sa);
setpixel(23, 33, sa);
setpixel(24, 33, sc);
setpixel(25, 33, sa);
setpixel(26, 33, sa);
setpixel(27, 33, sa);
setpixel(28, 33, sa);
setpixel(29, 33, sa);
setpixel(30, 33, sa);
setpixel(31, 33, sa);
setpixel(32, 33, sa);
setpixel(33, 33, sa);
setpixel(8, 34, sa);
setpixel(9, 34, sa);
setpixel(10, 34, sa);
setpixel(11, 34, sa);
setpixel(12, 34, sa);
setpixel(13, 34, sa);
setpixel(14, 34, sa);
setpixel(15, 34, sa);
setpixel(16, 34, sa);
setpixel(17, 34, sb);
setpixel(18, 34, sb);
setpixel(19, 34, sb);
setpixel(20, 34, sa);
setpixel(21, 34, sa);
setpixel(22, 34, sa);
setpixel(23, 34, sa);
setpixel(24, 34, sc);
setpixel(25, 34, sa);
setpixel(26, 34, sa);
setpixel(27, 34, sa);
setpixel(28, 34, sa);
setpixel(29, 34, sa);
setpixel(30, 34, sa);
setpixel(31, 34, sa);
setpixel(32, 34, sa);
setpixel(33, 34, sa);
setpixel(9, 35, sc);
setpixel(10, 35, sa);
setpixel(11, 35, sa);
setpixel(12, 35, sa);
setpixel(13, 35, sa);
setpixel(14, 35, sa);
setpixel(15, 35, sa);
setpixel(16, 35, sa);
setpixel(17, 35, sa);
setpixel(18, 35, sa);
setpixel(19, 35, sa);
setpixel(20, 35, sb);
setpixel(21, 35, sa);
setpixel(22, 35, sa);
setpixel(23, 35, sa);
setpixel(24, 35, sc);
setpixel(25, 35, sa);
setpixel(26, 35, sa);
setpixel(27, 35, sa);
setpixel(28, 35, sa);
setpixel(29, 35, sa);
setpixel(30, 35, sa);
setpixel(31, 35, sa);
setpixel(32, 35, sa);
setpixel(33, 35, sa);
setpixel(9, 36, sc);
setpixel(10, 36, sc);
setpixel(11, 36, sa);
setpixel(12, 36, sa);
setpixel(13, 36, sa);
setpixel(14, 36, sa);
setpixel(15, 36, sa);
setpixel(16, 36, sa);
setpixel(17, 36, sa);
setpixel(18, 36, sa);
setpixel(19, 36, sa);
setpixel(20, 36, sa);
setpixel(21, 36, sb);
setpixel(22, 36, sb);
setpixel(23, 36, sb);
setpixel(24, 36, sc);
setpixel(25, 36, sb);
setpixel(26, 36, sb);
setpixel(27, 36, sb);
setpixel(28, 36, sb);
setpixel(29, 36, sb);
setpixel(30, 36, sb);
setpixel(31, 36, sb);
setpixel(32, 36, sb);
setpixel(33, 36, sb);
setpixel(9, 37, sa);
setpixel(10, 37, sc);
setpixel(11, 37, sc);
setpixel(12, 37, sa);
setpixel(13, 37, sa);
setpixel(14, 37, sa);
setpixel(15, 37, sa);
setpixel(16, 37, sa);
setpixel(17, 37, sa);
setpixel(18, 37, sa);
setpixel(19, 37, sa);
setpixel(20, 37, sa);
setpixel(21, 37, sa);
setpixel(22, 37, sa);
setpixel(23, 37, sa);
setpixel(24, 37, sa);
setpixel(25, 37, sa);
setpixel(26, 37, sa);
setpixel(9, 38, sa);
setpixel(10, 38, sc);
setpixel(11, 38, sa);
setpixel(12, 38, sc);
setpixel(13, 38, sc);
setpixel(14, 38, sc);
setpixel(15, 38, sc);
setpixel(16, 38, sa);
setpixel(17, 38, sa);
setpixel(18, 38, sa);
setpixel(19, 38, sa);
setpixel(20, 38, sa);
setpixel(21, 38, sa);
setpixel(22, 38, sa);
setpixel(23, 38, sa);
setpixel(24, 38, sa);
setpixel(25, 38, sa);
setpixel(26, 38, sa);
setpixel(10, 39, sc);
setpixel(11, 39, sa);
setpixel(12, 39, sa);
setpixel(13, 39, sa);
setpixel(14, 39, sa);
setpixel(15, 39, sc);
setpixel(16, 39, sc);
setpixel(17, 39, sc);
setpixel(18, 39, sa);
setpixel(19, 39, sa);
setpixel(20, 39, sa);
setpixel(21, 39, sa);
setpixel(22, 39, sa);
setpixel(23, 39, sa);
setpixel(24, 39, sa);
setpixel(25, 39, sa);
setpixel(26, 39, sa);
setpixel(10, 40, sa);
setpixel(11, 40, sc);
setpixel(12, 40, sa);
setpixel(13, 40, sa);
setpixel(14, 40, sa);
setpixel(15, 40, sa);
setpixel(16, 40, sa);
setpixel(17, 40, sc);
setpixel(18, 40, sc);
setpixel(19, 40, sc);
setpixel(20, 40, sa);
setpixel(21, 40, sa);
setpixel(22, 40, sa);
setpixel(23, 40, sa);
setpixel(24, 40, sa);
setpixel(25, 40, sa);
setpixel(26, 40, sa);
setpixel(10, 41, sa);
setpixel(11, 41, sc);
setpixel(12, 41, sa);
setpixel(13, 41, sa);
setpixel(14, 41, sa);
setpixel(15, 41, sa);
setpixel(16, 41, sa);
setpixel(17, 41, sa);
setpixel(18, 41, sa);
setpixel(19, 41, sc);
setpixel(20, 41, sc);
setpixel(21, 41, sc);
setpixel(22, 41, sa);
setpixel(23, 41, sa);
setpixel(24, 41, sa);
setpixel(25, 41, sa);
setpixel(26, 41, sa);
setpixel(10, 42, sa);
setpixel(11, 42, sc);
setpixel(12, 42, sc);
setpixel(13, 42, sa);
setpixel(14, 42, sa);
setpixel(15, 42, sa);
setpixel(16, 42, sa);
setpixel(17, 42, sa);
setpixel(18, 42, sa);
setpixel(19, 42, sa);
setpixel(20, 42, sa);
setpixel(21, 42, sc);
setpixel(22, 42, sc);
setpixel(23, 42, sc);
setpixel(24, 42, sc);
setpixel(25, 42, sc);
setpixel(26, 42, sc);
setpixel(10, 43, sa);
setpixel(11, 43, sa);
setpixel(12, 43, sc);
setpixel(13, 43, sa);
setpixel(14, 43, sa);
setpixel(15, 43, sa);
setpixel(16, 43, sa);
setpixel(17, 43, sa);
setpixel(18, 43, sa);
setpixel(19, 43, sa);
setpixel(20, 43, sa);
setpixel(21, 43, sa);
setpixel(22, 43, sa);
setpixel(23, 43, sa);
setpixel(24, 43, sa);
setpixel(25, 43, sb);
setpixel(26, 43, sa);
setpixel(10, 44, sa);
setpixel(11, 44, sa);
setpixel(12, 44, sc);
setpixel(13, 44, sa);
setpixel(14, 44, sa);
setpixel(15, 44, sa);
setpixel(16, 44, sa);
setpixel(17, 44, sa);
setpixel(18, 44, sa);
setpixel(19, 44, sa);
setpixel(20, 44, sa);
setpixel(21, 44, sa);
setpixel(22, 44, sa);
setpixel(23, 44, sa);
setpixel(24, 44, sb);
setpixel(25, 44, sa);
setpixel(10, 45, sa);
setpixel(11, 45, sa);
setpixel(12, 45, sc);
setpixel(13, 45, sc);
setpixel(14, 45, sa);
setpixel(15, 45, sa);
setpixel(16, 45, sa);
setpixel(17, 45, sa);
setpixel(18, 45, sa);
setpixel(19, 45, sa);
setpixel(20, 45, sa);
setpixel(21, 45, sa);
setpixel(22, 45, sa);
setpixel(23, 45, sa);
setpixel(24, 45, sb);
setpixel(25, 45, sa);
setpixel(10, 46, sa);
setpixel(11, 46, sa);
setpixel(12, 46, sa);
setpixel(13, 46, sc);
setpixel(14, 46, sa);
setpixel(15, 46, sa);
setpixel(16, 46, sa);
setpixel(17, 46, sa);
setpixel(18, 46, sa);
setpixel(19, 46, sa);
setpixel(20, 46, sa);
setpixel(21, 46, sa);
setpixel(22, 46, sa);
setpixel(23, 46, sa);
setpixel(24, 46, sb);
setpixel(25, 46, sa);
setpixel(10, 47, sa);
setpixel(11, 47, sa);
setpixel(12, 47, sa);
setpixel(13, 47, sc);
setpixel(14, 47, sc);
setpixel(15, 47, sa);
setpixel(16, 47, sa);
setpixel(17, 47, sa);
setpixel(18, 47, sa);
setpixel(19, 47, sa);
setpixel(20, 47, sa);
setpixel(21, 47, sa);
setpixel(22, 47, sa);
setpixel(23, 47, sa);
setpixel(24, 47, sb);
setpixel(25, 47, sa);
setpixel(10, 48, sa);
setpixel(11, 48, sa);
setpixel(12, 48, sa);
setpixel(13, 48, sa);
setpixel(14, 48, sc);
setpixel(15, 48, sa);
setpixel(16, 48, sa);
setpixel(17, 48, sa);
setpixel(18, 48, sa);
setpixel(19, 48, sa);
setpixel(20, 48, sa);
setpixel(21, 48, sa);
setpixel(22, 48, sa);
setpixel(23, 48, sb);
setpixel(24, 48, sa);
setpixel(10, 49, sa);
setpixel(11, 49, sa);
setpixel(12, 49, sa);
setpixel(13, 49, sa);
setpixel(14, 49, sa);
setpixel(15, 49, sc);
setpixel(16, 49, sa);
setpixel(17, 49, sa);
setpixel(18, 49, sa);
setpixel(19, 49, sa);
setpixel(20, 49, sa);
setpixel(21, 49, sa);
setpixel(22, 49, sa);
setpixel(23, 49, sb);
setpixel(24, 49, sa);
setpixel(10, 50, sa);
setpixel(11, 50, sa);
setpixel(12, 50, sa);
setpixel(13, 50, sa);
setpixel(14, 50, sa);
setpixel(15, 50, sc);
setpixel(16, 50, sc);
setpixel(17, 50, sa);
setpixel(18, 50, sa);
setpixel(19, 50, sa);
setpixel(20, 50, sa);
setpixel(21, 50, sa);
setpixel(22, 50, sa);
setpixel(23, 50, sb);
setpixel(24, 50, sa);
setpixel(10, 51, sa);
setpixel(11, 51, sa);
setpixel(12, 51, sa);
setpixel(13, 51, sa);
setpixel(14, 51, sa);
setpixel(15, 51, sa);
setpixel(16, 51, sc);
setpixel(17, 51, sa);
setpixel(18, 51, sa);
setpixel(19, 51, sa);
setpixel(20, 51, sa);
setpixel(21, 51, sa);
setpixel(22, 51, sa);
setpixel(23, 51, sb);
setpixel(24, 51, sa);
setpixel(10, 52, sa);
setpixel(11, 52, sa);
setpixel(12, 52, sa);
setpixel(13, 52, sa);
setpixel(14, 52, sa);
setpixel(15, 52, sa);
setpixel(16, 52, sc);
setpixel(17, 52, sc);
setpixel(18, 52, sa);
setpixel(19, 52, sa);
setpixel(20, 52, sa);
setpixel(21, 52, sa);
setpixel(22, 52, sb);
setpixel(23, 52, sa);
setpixel(10, 53, sa);
setpixel(11, 53, sa);
setpixel(12, 53, sa);
setpixel(13, 53, sa);
setpixel(14, 53, sa);
setpixel(15, 53, sa);
setpixel(16, 53, sa);
setpixel(17, 53, sc);
setpixel(18, 53, sa);
setpixel(19, 53, sa);
setpixel(20, 53, sa);
setpixel(21, 53, sa);
setpixel(22, 53, sb);
setpixel(23, 53, sa);
setpixel(10, 54, sa);
setpixel(11, 54, sa);
setpixel(12, 54, sa);
setpixel(13, 54, sa);
setpixel(14, 54, sa);
setpixel(15, 54, sa);
setpixel(16, 54, sa);
setpixel(17, 54, sc);
setpixel(18, 54, sc);
setpixel(19, 54, sa);
setpixel(20, 54, sa);
setpixel(21, 54, sa);
setpixel(22, 54, sb);
setpixel(23, 54, sa);
setpixel(11, 55, sa);
setpixel(12, 55, sa);
setpixel(13, 55, sa);
setpixel(14, 55, sa);
setpixel(15, 55, sa);
setpixel(16, 55, sa);
setpixel(17, 55, sa);
setpixel(18, 55, sc);
setpixel(19, 55, sc);
setpixel(20, 55, sc);
setpixel(21, 55, sa);
setpixel(22, 55, sb);
setpixel(23, 55, sa);
setpixel(11, 56, sa);
setpixel(12, 56, sa);
setpixel(13, 56, sa);
setpixel(14, 56, sa);
setpixel(15, 56, sa);
setpixel(16, 56, sa);
setpixel(17, 56, sa);
setpixel(18, 56, sa);
setpixel(19, 56, sa);
setpixel(20, 56, sc);
setpixel(21, 56, sc);
setpixel(22, 56, sb);
setpixel(23, 56, sa);
setpixel(12, 57, sa);
setpixel(13, 57, sa);
setpixel(14, 57, sa);
setpixel(15, 57, sa);
setpixel(16, 57, sa);
setpixel(17, 57, sa);
setpixel(18, 57, sa);
setpixel(19, 57, sc);
setpixel(20, 57, sa);
setpixel(21, 57, sb);
setpixel(22, 57, sa);
setpixel(12, 58, sa);
setpixel(13, 58, sa);
setpixel(14, 58, sa);
setpixel(15, 58, sa);
setpixel(16, 58, sa);
setpixel(17, 58, sa);
setpixel(18, 58, sc);
setpixel(19, 58, sc);
setpixel(20, 58, sa);
setpixel(21, 58, sb);
setpixel(22, 58, sa);
setpixel(12, 59, sa);
setpixel(13, 59, sa);
setpixel(14, 59, sa);
setpixel(15, 59, sa);
setpixel(16, 59, sa);
setpixel(17, 59, sc);
setpixel(18, 59, sc);
setpixel(19, 59, sa);
setpixel(20, 59, sa);
setpixel(21, 59, sa);
setpixel(22, 59, sb);
setpixel(23, 59, sa);
setpixel(12, 60, sa);
setpixel(13, 60, sa);
setpixel(14, 60, sa);
setpixel(15, 60, sa);
setpixel(16, 60, sc);
setpixel(17, 60, sc);
setpixel(18, 60, sa);
setpixel(19, 60, sa);
setpixel(20, 60, sa);
setpixel(21, 60, sa);
setpixel(22, 60, sb);
setpixel(23, 60, sa);
setpixel(12, 61, sa);
setpixel(13, 61, sa);
setpixel(14, 61, sa);
setpixel(15, 61, sa);
setpixel(16, 61, sc);
setpixel(17, 61, sa);
setpixel(18, 61, sa);
setpixel(19, 61, sa);
setpixel(20, 61, sa);
setpixel(21, 61, sa);
setpixel(22, 61, sb);
setpixel(23, 61, sa);
setpixel(12, 62, sa);
setpixel(13, 62, sa);
setpixel(14, 62, sa);
setpixel(15, 62, sc);
setpixel(16, 62, sa);
setpixel(17, 62, sa);
setpixel(18, 62, sa);
setpixel(19, 62, sa);
setpixel(20, 62, sa);
setpixel(21, 62, sa);
setpixel(22, 62, sb);
setpixel(23, 62, sa);
setpixel(12, 63, sa);
setpixel(13, 63, sa);
setpixel(14, 63, sc);
setpixel(15, 63, sc);
setpixel(16, 63, sa);
setpixel(17, 63, sa);
setpixel(18, 63, sa);
setpixel(19, 63, sa);
setpixel(20, 63, sa);
setpixel(21, 63, sa);
setpixel(22, 63, sb);
setpixel(23, 63, sa);
setpixel(12, 64, sa);
setpixel(13, 64, sc);
setpixel(14, 64, sc);
setpixel(15, 64, sa);
setpixel(16, 64, sa);
setpixel(17, 64, sa);
setpixel(18, 64, sa);
setpixel(19, 64, sa);
setpixel(20, 64, sa);
setpixel(21, 64, sa);
setpixel(22, 64, sb);
setpixel(23, 64, sa);
setpixel(12, 65, sc);
setpixel(13, 65, sc);
setpixel(14, 65, sa);
setpixel(15, 65, sa);
setpixel(16, 65, sa);
setpixel(17, 65, sa);
setpixel(18, 65, sa);
setpixel(19, 65, sa);
setpixel(20, 65, sa);
setpixel(21, 65, sa);
setpixel(22, 65, sb);
setpixel(23, 65, sa);
setpixel(12, 66, sc);
setpixel(13, 66, sa);
setpixel(14, 66, sa);
setpixel(15, 66, sa);
setpixel(16, 66, sa);
setpixel(17, 66, sa);
setpixel(18, 66, sa);
setpixel(19, 66, sa);
setpixel(20, 66, sa);
setpixel(21, 66, sa);
setpixel(22, 66, sb);
setpixel(23, 66, sa);
setpixel(11, 67, sc);
setpixel(12, 67, sc);
setpixel(13, 67, sc);
setpixel(14, 67, sc);
setpixel(15, 67, sc);
setpixel(16, 67, sc);
setpixel(17, 67, sc);
setpixel(18, 67, sc);
setpixel(19, 67, sc);
setpixel(20, 67, sc);
setpixel(21, 67, sa);
setpixel(22, 67, sb);
setpixel(23, 67, sa);
setpixel(11, 68, sa);
setpixel(12, 68, sa);
setpixel(13, 68, sa);
setpixel(14, 68, sa);
setpixel(15, 68, sa);
setpixel(16, 68, sa);
setpixel(17, 68, sa);
setpixel(18, 68, sa);
setpixel(19, 68, sa);
setpixel(20, 68, sc);
setpixel(21, 68, sc);
setpixel(22, 68, sb);
setpixel(23, 68, sa);
setpixel(11, 69, sa);
setpixel(12, 69, sa);
setpixel(13, 69, sa);
setpixel(14, 69, sa);
setpixel(15, 69, sa);
setpixel(16, 69, sa);
setpixel(17, 69, sa);
setpixel(18, 69, sa);
setpixel(19, 69, sa);
setpixel(20, 69, sa);
setpixel(21, 69, sb);
setpixel(22, 69, sa);
setpixel(11, 70, sa);
setpixel(12, 70, sa);
setpixel(13, 70, sa);
setpixel(14, 70, sa);
setpixel(15, 70, sa);
setpixel(16, 70, sa);
setpixel(17, 70, sa);
setpixel(18, 70, sa);
setpixel(19, 70, sa);
setpixel(20, 70, sa);
setpixel(21, 70, sb);
setpixel(22, 70, sa);
setpixel(11, 71, sa);
setpixel(12, 71, sa);
setpixel(13, 71, sa);
setpixel(14, 71, sa);
setpixel(15, 71, sa);
setpixel(16, 71, sa);
setpixel(17, 71, sa);
setpixel(18, 71, sa);
setpixel(19, 71, sa);
setpixel(20, 71, sa);
setpixel(21, 71, sb);
setpixel(22, 71, sa);
setpixel(11, 72, sa);
setpixel(12, 72, sa);
setpixel(13, 72, sa);
setpixel(14, 72, sa);
setpixel(15, 72, sa);
setpixel(16, 72, sa);
setpixel(17, 72, sa);
setpixel(18, 72, sa);
setpixel(19, 72, sa);
setpixel(20, 72, sa);
setpixel(21, 72, sb);
setpixel(22, 72, sa);
setpixel(11, 73, sa);
setpixel(12, 73, sa);
setpixel(13, 73, sa);
setpixel(14, 73, sa);
setpixel(15, 73, sa);
setpixel(16, 73, sa);
setpixel(17, 73, sa);
setpixel(18, 73, sa);
setpixel(19, 73, sa);
setpixel(20, 73, sb);
setpixel(21, 73, sa);
setpixel(11, 74, sa);
setpixel(12, 74, sa);
setpixel(13, 74, sa);
setpixel(14, 74, sa);
setpixel(15, 74, sa);
setpixel(16, 74, sa);
setpixel(17, 74, sa);
setpixel(18, 74, sa);
setpixel(19, 74, sa);
setpixel(20, 74, sb);
setpixel(21, 74, sa);
setpixel(11, 75, sa);
setpixel(12, 75, sa);
setpixel(13, 75, sa);
setpixel(14, 75, sa);
setpixel(15, 75, sa);
setpixel(16, 75, sa);
setpixel(17, 75, sa);
setpixel(18, 75, sa);
setpixel(19, 75, sa);
setpixel(20, 75, sb);
setpixel(21, 75, sb);
setpixel(22, 75, sb);
setpixel(23, 75, sb);
setpixel(24, 75, sb);
setpixel(25, 75, sa);
setpixel(26, 75, sa);
setpixel(11, 76, sa);
setpixel(12, 76, sa);
setpixel(13, 76, sa);
setpixel(14, 76, sa);
setpixel(15, 76, sa);
setpixel(16, 76, sa);
setpixel(17, 76, sc);
setpixel(18, 76, sc);
setpixel(19, 76, sc);
setpixel(20, 76, sc);
setpixel(21, 76, sa);
setpixel(22, 76, sa);
setpixel(23, 76, sa);
setpixel(24, 76, sb);
setpixel(25, 76, sb);
setpixel(26, 76, sb);
setpixel(27, 76, sa);
setpixel(28, 76, sa);
setpixel(11, 77, sa);
setpixel(12, 77, sa);
setpixel(13, 77, sa);
setpixel(14, 77, sa);
setpixel(15, 77, sc);
setpixel(16, 77, sc);
setpixel(17, 77, sc);
setpixel(18, 77, sa);
setpixel(19, 77, sa);
setpixel(20, 77, sa);
setpixel(21, 77, sc);
setpixel(22, 77, sc);
setpixel(23, 77, sc);
setpixel(24, 77, sc);
setpixel(25, 77, sa);
setpixel(26, 77, sb);
setpixel(27, 77, sb);
setpixel(28, 77, sb);
setpixel(29, 77, sa);
setpixel(11, 78, sa);
setpixel(12, 78, sa);
setpixel(13, 78, sa);
setpixel(14, 78, sc);
setpixel(15, 78, sc);
setpixel(16, 78, sa);
setpixel(17, 78, sa);
setpixel(18, 78, sa);
setpixel(19, 78, sa);
setpixel(20, 78, sc);
setpixel(21, 78, sc);
setpixel(22, 78, sa);
setpixel(23, 78, sa);
setpixel(24, 78, sa);
setpixel(25, 78, sc);
setpixel(26, 78, sc);
setpixel(27, 78, sa);
setpixel(28, 78, sb);
setpixel(29, 78, sa);
setpixel(11, 79, sa);
setpixel(12, 79, sa);
setpixel(13, 79, sa);
setpixel(14, 79, sc);
setpixel(15, 79, sa);
setpixel(16, 79, sa);
setpixel(17, 79, sa);
setpixel(18, 79, sa);
setpixel(19, 79, sa);
setpixel(20, 79, sc);
setpixel(21, 79, sa);
setpixel(22, 79, sa);
setpixel(23, 79, sa);
setpixel(24, 79, sc);
setpixel(25, 79, sa);
setpixel(26, 79, sa);
setpixel(27, 79, sa);
setpixel(28, 79, sb);
setpixel(29, 79, sa);


for ( int c = 0; c < 79; c++ ) {
    f.erasepixel( 0, c );
}


//</editor-fold>
        
        
    }
    
    
    
}



