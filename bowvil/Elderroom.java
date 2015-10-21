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
public class Elderroom extends room2 {  
    
    
    
    
    public Elderroom( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom, bowvillage w )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom, w);
        
        unit eld = new elder( weap3, this, 500, 500, w.openportal );
        
        this.addneutral(eld);
        
    }
    
    
    
}

