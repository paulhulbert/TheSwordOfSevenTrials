/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sostrooms;

//import com.sun.org.apache.bcel.internal.generic.LLOAD;
import every.*;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Dad
 */
public class sostroom extends room {  
    
    private unit hangsost;
    
    private boolean added;
    
    private sostworld w1;
    
    public sostroom( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom, sostworld w )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom );
        
        added = false;
        
        w1 = w;
        
        platform ceiling1 = new ceiling( base, weap3 );
        this.addplatform(ceiling1);
        
        
        platform wall2 = new wall_right( base, weap3 );
        
        this.addplatform(wall2);
        
        
        unit oldsign = new sign( 900, 441, getweap3(), this, "The Sword of Seven Trials" );
        
        addneutral(oldsign);
        
        unit newsigna = new newsign( 400, 500 - 52, getweap3(), this, "The wall where the Sword should hang." );
        
        addneutral(newsigna);
        
        
        hangsost = new builders.hangingsost(weap3, this);
        
        
        
    }
    
    
    @Override
    public void extrainit()
    {
        
        
        if ( this.getpanel().getsavefile().gettrigger("sostrooms_warp_field_hitpillars").gettrigger() && !this.getpanel().getsavefile().gettrigger("gotweap_sost").gettrigger() ) {
            
            addneutral( hangsost );
            
            
        }
        
        
    }
    
    @Override
    public void step( Graphics g )
    {
        super.step(g);
        
        if ( w1.hitsword.gettrigger() && w1.hitspear.gettrigger() && w1.hitbow.gettrigger() && w1.hitfire.gettrigger() && w1.hitdnag.gettrigger() && w1.hitgob.gettrigger() && w1.hithammer.gettrigger() ) {
            getpanel().getsavefile().gettrigger("sostrooms_warp_field_hitpillars").settrigger(true);
        }
        
        if ( this.getpanel().getsavefile().gettrigger("gotweap_sost").gettrigger() && added ) {
            neutral.remove(hangsost);
        }
        
        if ( this.getpanel().getsavefile().gettrigger("sostrooms_warp_field_hitpillars").gettrigger() && !this.getpanel().getsavefile().gettrigger("gotweap_sost").gettrigger() && !added ) {
            
            addneutral( hangsost );
            
            added = true;
        }
        
        
        hangsost.setmomenty(2);
        
        
    }
    
    
    
}


