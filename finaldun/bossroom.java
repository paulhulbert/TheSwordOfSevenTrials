/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package finaldun;

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
    
    private trigger locked2;
    
//    private plasmaturret boss;   make this
    
    
    private platform buttona;
    private platform buttonb;
    
    private boolean hitba;
    private boolean hitbb;
    
    private platform lock2;
    private platform lock5;
    private platform lock3;
    private platform lock4;
    
    public unit prisoner1;
    public bossunit boss;    
    
    public AI bossai_melee;
    public AI bossai_ranged;
    
    private boolean ismeleer;
    
//    private bossai plasmaai;  make this
    
    
    public bossroom( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom, finaldungeon w )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom, w);
        
        locked = new trigger( false );
        locked2 = new trigger( true );
        killed = new trigger( false );
        hitba = false;
        hitbb = false;
        
        ismeleer = true;
        
        platform wall1 = new every.wall_right(base, weap3);
        this.addplatform(wall1);
        
        platform ceiling1 = new ceiling( base, weap3 );
        this.addplatform(ceiling1);
        
        platform lock1 = new lockwall(50, 500, 400, base, Color.YELLOW, weap3, locked, panel);
        
        this.addplatform(lock1);
        
        lock2 = new lockwall(900, 500, 400, base, Color.YELLOW, weap3, locked2, panel);
        
        this.addplatform(lock2);
        
        lock3 = new lockwall(1000, 500, 400, base, Color.YELLOW, weap3, locked2, panel);
        
        this.addplatform(lock3);
        
        buttona = new every.button(700, 500, 20, Color.YELLOW, weap3, locked, this, true);
        
        this.addplatform(buttona);
        
        buttonb = new every.button(550, 500, 20, Color.YELLOW, weap3, locked2, this, true);
        
        this.addplatform(buttonb);
        
        lock4 = new lockwall(600, 500, 400, base, Color.YELLOW, weap3, locked, panel);
        
        this.addplatform(lock4);
        
        lock5 = new lockwall(900, 500, 400, base, Color.YELLOW, weap3, locked, panel);
        
        this.addplatform(lock5);
        
        prisoner1 = new finaldun.prisoner(this, 1000, 500 - 79, new noai(), locked );
        addneutral(prisoner1);
        
        
        
        
        boss = new bossunit(this, 1000, 500 );
        
        boss.setWeapon2("fireballsideways");
        
        boss.setcenterx(1175);
        boss.setrex(boss.getx());
        
        boss.settrigger(killed);
        
        bossai_melee = new basicai();
        
        bossai_melee.setperson(boss);
        bossai_melee.settarget(maincharacter);
        
        boss.setai(bossai_melee);
        
        
        bossai_ranged = new bossaileft();
        
        bossai_ranged.setperson(boss);
        bossai_ranged.settarget(maincharacter);
        
//        addbag(boss);
        
        
        
       
    }
    
    
    @Override
    public unit chatter()
    {
        if ( loaded )
        {
            return super.chatter();
        }
        
        if ( super.chatter() != null ) {
            return super.chatter();
        }
        
        if ( hitbb ) {
            return boss;
        }
        
        return prisoner1;
        
    }
    
    
    
    @Override
    public void resetroom()
    {
        
        super.resetroom();
        
        locked.settrigger(false);
        
        boss.setai(bossai_melee);
        boss.setweapon("spear");
            
        
        boss.setcenterx(1015);
        
        
        if ( hitba ) {
            addplatform(buttona);
            hitba = false;
        }
        if ( hitbb ) {
            addplatform( buttonb );
            addplatform( lock2 );
            addplatform( lock3 );
            addplatform( lock4 );
            addplatform( lock5 );
            hitbb = false;
            bags.remove(boss);
            bags.add(prisoner1);
        }
        
        
    }
    
    
    public void teleport()
    {
        if ( mainchar.getcenterx() < 600 ) {
            boss.setcenterx( 1200 );
        } else {
            boss.setcenterx(150);
        }
        
        
    }
    
    
    @Override
    public void step( Graphics g )
    {
        super.step(g);
        
        if ( boss.getlife() <= 0 && getpanel().youwoncounter == 0 ) {
            getpanel().youwoncounter = 1;
        }
        
        if ( boss.getlife() <= 0 ) {
            weap1.clear();
            weap2.clear();
            weap3.clear();
        }
        
        
        
        if ( boss.ismelee.gettrigger() && !ismeleer ) {
            boss.setai(bossai_melee);
            boss.setweapon("spear");
            teleport();
            ismeleer = true;
        }
        
        if ( !boss.ismelee.gettrigger() && ismeleer ) {
            boss.setai(bossai_ranged);
            boss.setweapon("fireballsideways");
            teleport();
            ismeleer = false;
        }
        
        if ( !hitba ) {
            locked2.settrigger(!locked.gettrigger());
        }
        
        if ( !hitbb && locked2.gettrigger() && hitba ) {
            hitbb = true;
            terrain.remove(buttonb);
            terrain.remove(lock2);
            terrain.remove(lock3);
            terrain.remove(lock4);
            terrain.remove(lock5);
            prisoner1.setlife(-1);
            addbag(boss);
        }
        
        
        if ( !hitba && locked.gettrigger() ) {
            hitba = true;
            terrain.remove(buttona);
        }
        
        
        
        
        if ( locked.gettrigger() && !killed.gettrigger() ) {
            
            getpanel().setTilnswords("Ondo?!?!?! No!  How could he have slipped this by me?  Taldo, you must stop him!  The Sword of Seven Trials is the only thing that will break through his armor.  His armor will let him teleport short distances.");
            
        }
        
        
        if ( killed.gettrigger() ) {
            
            getpanel().setTilnswords("Taldo, you must press on.");
            
            
        }
    }
    
}




