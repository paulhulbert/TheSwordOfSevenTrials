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

/**
 *
 * @author Dad
 */
public class warp_field extends room {  
    
    private platform state1;
    
    private ImageIcon portal;
    
    private sostworld w1;
    
    public warp_field( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom, sostworld w )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom );
        
        
        state1 = new platform( 700, 490, 100, 10, new Color( 63, 33, 20 ), false, this.getweap3() );
        
        addplatform(state1);
        
        state1.setWarppoint(this);
        state1.setWarps(true);
        state1.setWarpx(750);
        state1.setWarpy(500 - constants.taldoheight());
        
        portal = new ImageIcon( getClass().getResource("Portal.png") );
        
        
        platform ceiling1 = new ceiling( base, weap3 );
        this.addplatform(ceiling1);
        
        
        platform wall2 = new wall_left( base, weap3 );
        
        this.addplatform(wall2);
        
        this.w1 = w;
        
        unit oldsigna = new sign( 900, 441, getweap3(), this, "Activate all the pillars by striking them with the correct weapon.  When you return to this room they will be reset." );
        
        addneutral(oldsigna);
        
        unit newsigna = new newsign( 400, 500 - 52, getweap3(), this, "Site of the fabled \"Sword of Seven Trials\".  The old signposts are, according to legend, referring to the weapons with which you are to strike them." );
        
        addneutral(newsigna);
    }
    
    @Override
    public void setwarproom( room targ )
    {
        state1.setWarppoint(targ);
        
    }
    
    
    @Override
    public void paintextra( Graphics g )
    {
        
        
        g.drawImage(portal.getImage(), 690, 360, 120, 150, null);
        
    }
    
    
    @Override
    public void extrainit()
    {
        
        if ( w1.hitsword.gettrigger() && w1.hitspear.gettrigger() && w1.hitbow.gettrigger() && w1.hitfire.gettrigger() && w1.hitdnag.gettrigger() && w1.hitgob.gettrigger() && w1.hithammer.gettrigger() ) {
            getpanel().getsavefile().gettrigger("sostrooms_warp_field_hitpillars").settrigger(true);
        }
        
        if ( this.getpanel().getsavefile().gettrigger("gotweap_sost").gettrigger() || this.getpanel().getsavefile().gettrigger("sostrooms_warp_field_hitpillars").gettrigger() ) {
            
            this.getpanel().getsavefile().gettrigger("sostrooms_warp_field_hitpillars").settrigger( true );
            
            
            w1.hitsword.settrigger(true);
            w1.hitspear.settrigger(true);
            w1.hitbow.settrigger(true);
            w1.hitfire.settrigger(true);
            w1.hitdnag.settrigger(true);
            w1.hitgob.settrigger(true);
            w1.hithammer.settrigger(true);
        }
        
        
        if ( !this.getpanel().getsavefile().gettrigger("sostrooms_warp_field_hitpillars").gettrigger()  ) {
            w1.hitsword.settrigger(false);
            w1.hitspear.settrigger(false);
            w1.hitbow.settrigger(false);
            w1.hitfire.settrigger(false);
            w1.hitdnag.settrigger(false);
            w1.hitgob.settrigger(false);
            w1.hithammer.settrigger(false);
        }
    }
    
    
}


