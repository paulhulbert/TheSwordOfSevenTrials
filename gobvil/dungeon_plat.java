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
public class dungeon_plat extends room {  
    
    private platform state1;
    
    private ImageIcon portal;
    
    public dungeon_plat( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom, world w )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom );
        
        
        state1 = new platform( 700, 490, 100, 10, new Color( 63, 33, 20 ), false, this.getweap3() );
        
        addplatform(state1);
        
        state1.setWarppoint(this);
        state1.setWarps(true);
        state1.setWarpx(750);
        state1.setWarpy(50 - constants.taldoheight());
        
        portal = new ImageIcon( getClass().getResource("Portal.png") );
        
        
        platform ceiling1 = new ceiling( base, weap3 );
        this.addplatform(ceiling1);
        
        
        
        platform wall1 = new wall_right( base, weap3 );
        
        this.addplatform(wall1);
        
        
        world w1 = new gobdun.gobdungeon( mainchar, panel );
        state1.setWarppoint(w1.getentry());
        w1.setexit(this);
        
        
        AI ai1 = new basicai();
        ai1.settarget(mainchar);
        unit bag1 = new builders.lightgob(this, 800, 500 - 1, ai1);
        this.addbag(bag1);
        
        AI ai2 = new basicai();
        ai2.settarget(mainchar);
        unit bag2 = new builders.lightgob(this, 700, 500 - 1, ai2);
        this.addbag(bag2);
        
        AI ai3 = new basicai();
        ai3.settarget(mainchar);
        unit bag3 = new builders.lightgob(this, 600, 500 - 1, ai3);
        this.addbag(bag3);
        
        AI ai4 = new basicai();
        ai4.settarget(mainchar);
        unit bag4 = new builders.lightgob(this, 500, 500 - 1, ai4);
        this.addbag(bag4);
        
        AI ai5 = new basicai();
        ai5.settarget(mainchar);
        unit bag5 = new builders.lightgob(this, 400, 500 - 1, ai5);
        this.addbag(bag5);
        
        AI ai6 = new basicai();
        ai6.settarget(mainchar);
        unit bag6 = new builders.lightgob(this, 900, 500 - 1, ai6);
        this.addbag(bag6);
        
        
        
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
    
    
}


