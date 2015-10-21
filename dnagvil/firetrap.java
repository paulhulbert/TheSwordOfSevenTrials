/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dnagvil;

import every.*;
import firevil.firelauncherup;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Dad
 */
public class firetrap extends room2 {  
    
    
    private ImageIcon tree;
    
    public firetrap( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom, world w )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom, w);
        
//        
//        tree = new ImageIcon( getClass().getResource("GreatDeku.jpg") );
        
        
        
        firelauncherup trap1 = new firelauncherup( this.getweap3(), this, 896, 491 );
        
        trap1.settarget(mainchar);
        
        this.addneutral(trap1);
        
        firelauncherup trap2 = new firelauncherup( this.getweap3(), this, 796, 491 );
        
        trap2.settarget(mainchar);
        
        this.addneutral(trap2);
        
        firelauncherup trap3 = new firelauncherup( this.getweap3(), this, 696, 491 );
        
        trap3.settarget(mainchar);
        
        this.addneutral(trap3);
        
        firelauncherup trap4 = new firelauncherup( this.getweap3(), this, 596, 491 );
        
        trap4.settarget(mainchar);
        
        this.addneutral(trap4);
        
        
        platform base1 = new hardblock( -50, 450, 250, 50, Color.GRAY, Color.BLACK, false, this.getweap3() );
        
        this.addplatform(base1);
        
        
        unit sign1 = new sign( 1000, 441, this.getweap3(), this, "Warning! Ice" );
        
        this.addneutral(sign1);
        
        
    }
    
    
    
    
    
    
}

