/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package penvil;

import every.*;
import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author Dad
 */
public class monsters2 extends room2 {  
    
    
    public monsters2( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom, world w )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom, w);
        
//        
//        tree = new ImageIcon( getClass().getResource("GreatDeku.jpg") );
        
        
        
        unit man1 = new penvil.penman2(this, 700, 500);
        
        addneutral(man1);
        
    }
    
    
    
    
}



