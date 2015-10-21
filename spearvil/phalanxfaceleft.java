/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spearvil;

import every.*;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Dad
 */
public class phalanxfaceleft extends room {  
    
    
    public phalanxfaceleft( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom);
        
        
        unit spearman = new builders.spearman(weap3, this, 830, 413);
        
        this.addneutral(spearman);
        
        unit spearman2 = new builders.spearman(weap3, this, 880, 413);
        
        this.addneutral(spearman2);
        
        unit spearman3 = new builders.spearman(weap3, this, 930, 413);
        
        this.addneutral(spearman3);
        
        unit spearman4 = new builders.spearman(weap3, this, 980, 413);
        
        this.addneutral(spearman4);
        
        unit spearman5 = new builders.spearman(weap3, this, 1030, 413);
        
        this.addneutral(spearman5);
        
        
        
        
        
        
    }
    
    
    
    
    
}

