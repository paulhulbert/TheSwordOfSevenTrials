/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gobvil;

import every.*;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Dad
 */
public class r5 extends room2 {  
    
    private ladder ladder1;
    
    private ImageIcon rocks;
    
    private boolean gotsost;
    
    public r5( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom, gobvillage w )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom, w);
        
        rocks = new ImageIcon( getClass().getResource("taldo_rocks.jpg") );
        
        ladder1 = new ladderdown( 700, 500, base, this.weap3, this, "LIGHT_GRAY" );
        
        
        platform wall1 = new wall_left( base, weap3 );
        
        this.addplatform(wall1);
        
        
        platform ceiling1 = new ceiling( base, weap3 );
        this.addplatform(ceiling1);
        
        gotsost = false;
        
        AI ai1 = new basicai();
        ai1.settarget(mainchar);
        unit bag1 = new builders.gobwarrior(this, 800, 500 - 1, ai1);
        this.addbag(bag1);
        
    }
    
    @Override
    public void setladder( room targ )
    {
        ladder1.setWarppoint(targ);
        
    }
    
    @Override
    public void paintextra( Graphics g )
    {
        
        if ( !getpanel().getsavefile().gettrigger("gotweap_sost").gettrigger() ) {
            g.drawImage(rocks.getImage(), 650, 420, 150, 80, null);
        } else {
            if ( !gotsost ) {
                this.addplatform(ladder1);
                gotsost = true;
            }
        }
    }
    
    
}





