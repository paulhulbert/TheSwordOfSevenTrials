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
public class bowroom extends room2 {  
    
    private unit pillar;
    
    public bowroom( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom, sostworld w )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom, w );
        
        
        platform ceiling1 = new ceiling( base, weap3 );
        this.addplatform(ceiling1);
        
        //###################################
        pillar = new bowpillar( this, 500, 500, w );
        
        unit oldsign = new sign( 300, 441, getweap3(), this, "In Bowvil" );
        
        pillar.settrigger( w.hitbow );
        //###################################
        
        this.addbag(pillar);
        
        addneutral(oldsign);
        
        
    }
    
    @Override
    public void extrainit()
    {
        super.extrainit();
        
        pillar.respawn();
        
        super.getpanel().getsavefile().gettrigger("sostrooms_bowroom_entered").settrigger(true);
    }
    
    
}
