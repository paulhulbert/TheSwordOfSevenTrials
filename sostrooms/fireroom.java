/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sostrooms;

import every.*;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Dad
 */
public class fireroom extends room2 {  
    
    private unit pillar;
    
    public fireroom( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom, sostworld w )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom, w );
        
        
        platform ceiling1 = new ceiling( base, weap3 );
        this.addplatform(ceiling1);
        
        //###################################
        pillar = new firepillar( this, 500, 500, w );
        
        unit oldsign = new sign( 400, 441, getweap3(), this, "In Firevil" );
        
        pillar.settrigger( w.hitfire );
        //###################################
        
        this.addbag(pillar);
        
        addneutral(oldsign);
        
        
    }
    
    @Override
    public void extrainit()
    {
        super.extrainit();
        
        pillar.respawn();
        
        super.getpanel().getsavefile().gettrigger("sostrooms_fireroom_entered").settrigger(true);
    }
    
    
}