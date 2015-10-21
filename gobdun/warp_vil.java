/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gobdun;

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
public class warp_vil extends room2 {  
    
    private platform state1;
    
    private ImageIcon portal;
    
    private ladder ladder1;
    
    private trigger gotweap;
    
    private gobdungeon w1;
    
    private ImageIcon door_closed;
    private ImageIcon door_open;
    private ImageIcon door_rightgreen;
    private ImageIcon door_leftgreen;
    
    private boolean addedboss;
    private boolean removedboss;
    
    
    
    private trigger killed;
    private boolean added;
    
    private unit spear;
    
    private gobboss boss;
    private bossai plasmaai;
    
    private trigger locked;
    
    public warp_vil( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom, gobdungeon w )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom, w );
        
        gotweap = new trigger( false, "gotweap_gobclaws" );
        
        state1 = new platform( 700, 490, 100, 10, new Color( 63, 33, 20 ), false, this.getweap3() );
        
        addplatform(state1);
        
        state1.setWarppoint(this);
        state1.setWarps(false);
        state1.setWarpx(750);
        state1.setWarpy(500 - constants.taldoheight());
        
        portal = new ImageIcon( getClass().getResource("Portal.png") );
        
        door_closed = new ImageIcon( getClass().getResource("Door_Shut.jpg") );
        door_open = new ImageIcon( getClass().getResource("Door_Open.jpg") );
        door_rightgreen = new ImageIcon( getClass().getResource("Door_Right_Green.jpg") );
        door_leftgreen = new ImageIcon( getClass().getResource("Door_Left_green.jpg") );
        
        
        w1 = w;
        
        killed = new trigger( false );
        added = false;
        
        locked = new trigger( false );
        addedboss = false;
        removedboss = false;
        
        
        boss = new gobboss(this, 390, 500, new bossai(locked));
        
        boss.setcenterx(200);
        boss.setrex(boss.getx());
        
        boss.settrigger(killed);
        
        plasmaai = new bossai(locked);
        
        plasmaai.setperson(boss);
        plasmaai.settarget(maincharacter);
        
        boss.setai(plasmaai);
        
        
        spear = new gobclawsitem(weap3, this);
        
        
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
    public void resetroom()
    {
        
        super.resetroom();
        
        
        if ( getpanel().getsavefile().gettrigger("gotweap_gobclaws").gettrigger() ) {
            
            killed.settrigger(true);
            
        } else {
            
            if ( !w1.mainlock_2.gettrigger() && !w1.mainlock_3.gettrigger() && !addedboss ) {
                addbag(boss);
                addedboss = true;
                w1.bossisactive.settrigger(true);
            }
        }
        
        
        
        
        for ( int c = 0; c < bags.size(); c++ ) {
            
            if ( bags.get(c).getName().equals("weakspearlauncher") ) {
                
                bags.remove(c);
                
                c--;
                
            }
            
            
        }
    }
    
    
    @Override
    public void paintextra( Graphics g )
    {
        
        if ( getpanel().getsavefile().gettrigger("gotweap_gobclaws").gettrigger() ) {
            g.drawImage(portal.getImage(), 690, 360, 120, 150, null);
            state1.setWarps(true);
        }
        
        if ( w1.mainlock_2.gettrigger() && w1.mainlock_3.gettrigger() ) {
            g.drawImage(door_closed.getImage(), 390, 260, 200, 240, null);
            g.setColor(constants.gobdunwall);
            g.fillRect(580, 100, 10, 400);
        }
        if ( w1.mainlock_2.gettrigger() && !w1.mainlock_3.gettrigger() ) {
            g.drawImage(door_rightgreen.getImage(), 390, 260, 200, 240, null);
            g.setColor(constants.gobdunwall);
            g.fillRect(580, 100, 10, 400);
        }
        if ( !w1.mainlock_2.gettrigger() && w1.mainlock_3.gettrigger() ) {
            g.drawImage(door_leftgreen.getImage(), 390, 260, 200, 240, null);
            g.setColor(constants.gobdunwall);
            g.fillRect(580, 100, 10, 400);
        }
        if ( !w1.mainlock_2.gettrigger() && !w1.mainlock_3.gettrigger() ) {
            g.drawImage(door_open.getImage(), 340, 260, 300, 240, null);
            
        }
        
        
        
    }
    
    
    
    
    @Override
    public void step( Graphics g )
    {
        super.step(g);
        
        
        
        locked.settrigger(!(w1.mainlock_2.gettrigger() && w1.mainlock_3.gettrigger()));
        
        
        if ( killed.gettrigger() && !removedboss ) {
            removedboss = true;
            bags.remove(boss);
            w1.bossisactive.settrigger(false);
        }
        
        if ( killed.gettrigger() && !added && !getpanel().getsavefile().gettrigger("gotweap_gobclaws").gettrigger() ) {
            addneutral( spear );
            added = true;
        }
        
        if ( getpanel().getsavefile().gettrigger("gotweap_gobclaws").gettrigger() ) {
            
            killed.settrigger(true);
            added = true;
            
        } else {
            if ( !w1.mainlock_2.gettrigger() && !w1.mainlock_3.gettrigger() && !addedboss ) {
                addbag(boss);
                addedboss = true;
                w1.bossisactive.settrigger(true);
            }
        }
        
        if ( getpanel().getsavefile().gettrigger("gotweap_gobclaws").gettrigger() && added ) {
            
            neutral.remove(spear);
            
        }
        
        
        
        if ( !locked.gettrigger() && !killed.gettrigger() ) {
            
            getpanel().setTilnswords("Wow, that is quite a construct.  Mortar and factory, does it make omelets too?");
            
        }
        
        
        if ( killed.gettrigger() ) {
            
            getpanel().setTilnswords("Taldo, you must press on.");
            
            
        }
    }
    
    
    public void setbosslife(int x)
    {
        
        w1.bosslife = x;
        
        
    }
    
    public int getbosslife()
    {
        return w1.bosslife;
    }
    
    
    public void notifytaldodead()
    {
        if ( !killed.gettrigger() ) {
            setbosslife(7);
        }
        
    }
    
    
}


