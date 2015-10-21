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
public class phalanxfaceright extends room {  
    
    
    public phalanxfaceright( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom);
        
        
        unit spearman = new builders.spearman(weap3, this, 330, 413);
        
        spearman.setdir(2);
        
        this.addneutral(spearman);
        
        unit spearman2 = new builders.spearman(weap3, this, 380, 413);
        
        spearman2.setdir(2);
        
        this.addneutral(spearman2);
        
        unit spearman3 = new builders.spearman(weap3, this, 430, 413);
        
        spearman3.setdir(2);
        
        this.addneutral(spearman3);
        
        unit spearman4 = new builders.spearman(weap3, this, 480, 413);
        
        spearman4.setdir(2);
        
        this.addneutral(spearman4);
        
        unit spearman5 = new builders.spearman(weap3, this, 530, 413);
        
        spearman5.setdir(2);
        
        this.addneutral(spearman5);
        
        
        
        
        
        
    }
    
    
    
    
    
}

