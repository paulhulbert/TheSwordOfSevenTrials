/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package finaldun;

import every.*;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Dad
 */
public class warp_vil extends room {  
    
    private platform state1;
    
    private ImageIcon portal;
    
    private ladder ladder1;
    
    
    public warp_vil( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom, finaldungeon w )
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
        
        
        
        
        ladder1 = new ladderdown( 500, 500, constants.gobdunfloor, this.weap3, this, constants.speardunladder );
        
        this.addplatform(ladder1);
        
        platform l1 = new lockwall(500, 480, 50, base, Color.BLUE, weap3, w.warp_vil_lock1, panel);
        platform l2 = new lockwall(500, 430, 50, base, Color.RED, weap3, w.warp_vil_lock2, panel);
        
        
        this.addplatform(l2);
        this.addplatform(l1);
        
        
        platform h1 = new hardblock(450, 430, 50, 70, base, Color.BLACK, false, weap3);
        
        platform h2 = new hardblock(550, 430, 50, 70, base, Color.BLACK, false, weap3);
        
        this.addplatform(h1);
        this.addplatform(h2);
        
        
        
    }
    
    @Override
    public void setwarproom( room targ )
    {
        state1.setWarppoint(targ);
        
    }
    
    
    @Override
    public void setladder( room targ )
    {
        ladder1.setWarppoint(targ);
    }
    
    
    @Override
    public void paintextra( Graphics g )
    {
        
        
        g.drawImage(portal.getImage(), 690, 360, 120, 150, null);
        
    }
    
    
}


