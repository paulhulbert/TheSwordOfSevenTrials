/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sworddun;

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
    
    private trigger killed;
    private boolean added;
    
    private unit sword;
    
    private plasmaturret boss;
    
    
    private platform buttona;
    
    private bossai plasmaai;
    
    private platform ceiling2;
    
    public bossroom( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom, sworddungeon w )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom, w);
        
        locked = new trigger( false );
        killed = new trigger( false );
        added = false;
        
        platform wall1 = new every.wall_right(base, weap3);
        this.addplatform(wall1);
        
        
        platform ceiling1 = new every.hardblock(-5, -5, 1105, 25, Color.DARK_GRAY, Color.DARK_GRAY, false, weap3);
        addplatform(ceiling1);
        
        ceiling2 = new every.hardblock(1100, -5, 1000, 25, Color.DARK_GRAY, Color.DARK_GRAY, false, weap3);
        addplatform(ceiling2);
        
        platform lock1 = new lockwall(100, 500, 400, base, Color.YELLOW, weap3, locked, panel);
        
        this.addplatform(lock1);
        
        buttona = new every.button(700, 500, 20, Color.YELLOW, weap3, locked, this, true);
        
        this.addplatform(buttona);
        
        boss = new plasmaturret(this, 1200, -20, new bossai(locked));
        
        boss.setcenterx(1175);
        boss.setrex(boss.getx());
        
        boss.settrigger(killed);
        
        plasmaai = new bossai(locked);
        
        plasmaai.setperson(boss);
        plasmaai.settarget(maincharacter);
        
        boss.setai(plasmaai);
        
        addbag(boss);
        
        sword = new newsword(weap3, this);
        
        unit sign1 = new sign( 100, 441, this.getweap3(), this, "If you wish to challenge the Guardian for the weapon step on the button." );
        
        this.addneutral(sign1);
        
       
    }
    
    
    
    @Override
    public void resetroom()
    {
        
        super.resetroom();
        
        locked.settrigger(false);
        
        ceiling2.setSolid(true);
        
        if ( getpanel().getsavefile().gettrigger("gotweap_sword").gettrigger() ) {
            
            terrain.remove(buttona);
            killed.settrigger(true);
            
        }
    }
    
    
    @Override
    public void step( Graphics g )
    {
        super.step(g);
        
        if ( killed.gettrigger() && !added && !getpanel().getsavefile().gettrigger("gotweap_sword").gettrigger() ) {
            locked.settrigger(false);
            addneutral( sword );
            added = true;
            terrain.remove(buttona);
        }
        
        if ( getpanel().getsavefile().gettrigger("gotweap_sword").gettrigger() ) {
            
            terrain.remove(buttona);
            killed.settrigger(true);
            
        }
        
        if ( getpanel().getsavefile().gettrigger("gotweap_sword").gettrigger() && added ) {
            
            neutral.remove(sword);
            
        }
        
        if ( locked.gettrigger() ) {
            
            ceiling2.setSolid(false);
            
        }
        
        
        if ( !ceiling2.isSolid() && !killed.gettrigger() ) {
            
            getpanel().setTilnswords("That is a Mobile Plasma Cannon.  It was developed by the Firevil people.  Dodge the fireballs and strike it to defeat it.");
            
        }
        
        
        if ( killed.gettrigger() ) {
            
            getpanel().setTilnswords("Taldo, you must press on.");
            
            
        }
    }
    
}




