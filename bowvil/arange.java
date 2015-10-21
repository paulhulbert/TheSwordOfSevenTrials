/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bowvil;

import every.*;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Dad
 */
public class arange extends room2 {  
    
    
    public arange( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom, world w )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom, w);
        
        archer a = new archer( weap1, this, 900, 500 - 83 );
        
        this.addneutral(a);
        
        atarget t = new atarget(weap2, this, 610, 500 - 79);
        
        this.addbag(t);
        
    }
    
    
    
    @Override
    public void paintextra( Graphics g )
    {
        
    }
    
    
}
