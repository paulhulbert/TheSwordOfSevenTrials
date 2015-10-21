/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package speardun;


import every.*;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author Dad
 */
public class bossroom extends room2 {  
    
    private trigger locked;
    private ladder ladder1;
    
    
    
    private trigger killed;
    private boolean added;
    
    private unit spear;
    
    private spearboss boss;
    
    
    private platform buttona;
    
    private bossai plasmaai;
    
    private platform ceiling2;
    
    public bossroom( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom, speardungeon w )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom, w);
        
        
        killed = new trigger( false );
        added = false;
        
        locked = new trigger( false );
        
        platform wall1 = new every.wall_right(base, weap3);
        this.addplatform(wall1);
        
        platform wall2 = new every.wall_left(base, weap3);
        this.addplatform(wall2);
        
        ceiling2 = new every.hardblock(-5, -5, 1105, 25, constants.speardunfloor, constants.speardunfloor, false, weap3);
        addplatform(ceiling2);
        
        platform ceiling1 = new every.hardblock(1100, -5, 1000, 25, constants.speardunfloor, constants.speardunfloor, false, weap3);
        addplatform(ceiling1);
        
        platform lock1 = new lockwall(1000, 500, 400, base, Color.GREEN, weap3, locked, panel);
        
        this.addplatform(lock1);
        
        unit sign1 = new sign( 1100, 441, this.getweap3(), this, "If you wish to challenge to Guardian for the weapon step on the button." );
        
        this.addneutral(sign1);
        
        buttona = new every.button(600, 500, 20, Color.GREEN, weap3, locked, this, true);
        
        this.addplatform(buttona);
        
        
        
        
        ladder1 = new ladderdown( 1100, 500, constants.speardunfloor, this.weap3, this, constants.speardunladder );
        
        this.addplatform(ladder1);
        
        
        
        
        boss = new spearboss(this, 200, -10, new bossai(locked));
        
        boss.setcenterx(200);
        boss.setrex(boss.getx());
        
        boss.settrigger(killed);
        
        plasmaai = new bossai(locked);
        
        plasmaai.setperson(boss);
        plasmaai.settarget(maincharacter);
        
        boss.setai(plasmaai);
        
        addbag(boss);
        
        spear = new spearitem(weap3, this);
        
        
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
        
        locked.settrigger(false);
        
        ceiling2.setSolid(true);
        
        if ( getpanel().getsavefile().gettrigger("gotweap_spear").gettrigger() ) {
            
            terrain.remove(buttona);
            killed.settrigger(true);
            
        }
        
        
        for ( int c = 0; c < bags.size(); c++ ) {
            
            if ( bags.get(c).getName().equals("mobilefiretrap") ) {
                
                bags.remove(c);
                
                c--;
                
            }
            
            
        }
    }
    
    
    @Override
    public void step( Graphics g )
    {
        super.step(g);
        
        if ( killed.gettrigger() && !added && !getpanel().getsavefile().gettrigger("gotweap_spear").gettrigger() ) {
            locked.settrigger(false);
            addneutral( spear );
            added = true;
            terrain.remove(buttona);
        }
        
        if ( getpanel().getsavefile().gettrigger("gotweap_spear").gettrigger() ) {
            
            terrain.remove(buttona);
            killed.settrigger(true);
            
        }
        
        if ( getpanel().getsavefile().gettrigger("gotweap_spear").gettrigger() && added ) {
            
            neutral.remove(spear);
            
        }
        
        if ( locked.gettrigger() ) {
            
            ceiling2.setSolid(false);
            
        }
        
        
        if ( !ceiling2.isSolid() && !killed.gettrigger() ) {
            
            getpanel().setTilnswords("That is a Mobile Factory.  It was developed by the Spearvil people.  The constructs it ejects can only be killed with a sword.");
            
        }
        
        
        if ( killed.gettrigger() ) {
            
            getpanel().setTilnswords("Taldo, you must press on.");
            
            
        }
    }
}





