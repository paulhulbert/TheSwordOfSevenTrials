/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dnagdun;

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
    
    private unit sword;
    
    private bossunit boss;
    
    
    private platform buttona;
    
    private bossai plasmaai;
    
    private platform ceiling2;
    public bossroom( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom, dnagdungeon w )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom, w);
        
        
        platform wall1 = new every.wall_right(base, weap3);
        this.addplatform(wall1);
        
        platform wall2 = new every.wall_left(base, weap3);
        this.addplatform(wall2);
        
        
        locked = new trigger( false );
        killed = new trigger( false );
        added = false;
        
        platform ceiling1 = new every.hardblock(-5, -5, 205, 25, constants.sworddunfloor, constants.sworddunfloor, false, weap3);
        addplatform(ceiling1);
        
        ceiling2 = new every.hardblock(200, -5, 2000, 25, constants.sworddunfloor, constants.sworddunfloor, false, weap3);
        addplatform(ceiling2);
        
        
        ladder1 = new ladderdown( 1050, 500, constants.sworddunfloor, this.weap3, this, "LIGHT_GRAY" );
        
        ladder1.setWarpy(250 - constants.taldoheight());
        
        this.addplatform(ladder1);
        
        
        platform lock1 = new lockwall(1049, 500, 70, base, Color.YELLOW, weap3, locked, panel);
        
        this.addplatform(lock1);
        
        unit sign1 = new sign( 1150, 441, this.getweap3(), this, "If you wish to challenge to Guardian for the weapon step on the button." );
        
        this.addneutral(sign1);
        
        button b1 = new every.button(100, 500, 20, Color.YELLOW, weap3, locked, this, true);
        
        this.addplatform(b1);
        
        buttona = b1;
        
        
        
        boss = new bossunit(this, 1200, -20, new bossai(locked));
        
        boss.setcenterx(1175);
        boss.setrex(boss.getx());
        
        boss.settrigger(killed);
        
        plasmaai = new bossai(locked);
        
        plasmaai.setperson(boss);
        plasmaai.settarget(maincharacter);
        
        boss.setai(plasmaai);
        
        addbag(boss);
        
        sword = new dnagitem(weap3, this);
        
        
        
        platform plat1 = new platform( 500, 350, 100, 10, constants.sworddunfloor, false, this.getweap3() );
        
        addplatform(plat1);
        
        platform plat2 = new platform( 700, 350, 100, 10, constants.sworddunfloor, false, this.getweap3() );
        
        addplatform(plat2);
        
        platform plat3 = new platform( 500, 450, 100, 10, constants.sworddunfloor, false, this.getweap3() );
        
        addplatform(plat3);
        
        platform plat4 = new platform( 700, 450, 100, 10, constants.sworddunfloor, false, this.getweap3() );
        
        addplatform(plat4);
        
        platform mover1 = new hardblock( 400, 300, 50, 50, constants.sworddunfloor, Color.BLACK, true, this.getweap3());
        
        mover1.makestep(0, 3, 150, "blankweap");
        
        addplatform(mover1);
        
        platform mover2 = new hardblock( 450, 450, 50, 50, constants.sworddunfloor, Color.BLACK, true, this.getweap3());
        
        mover2.makestep(3, 0, 300, "blankweap");
        
        addplatform(mover2);
        
        platform mover3 = new hardblock( 850, 450, 50, 50, constants.sworddunfloor, Color.BLACK, true, this.getweap3());
        
        mover3.makestep(0, -3, 150, "blankweap");
        
        addplatform(mover3);
        
        platform mover4 = new hardblock( 850, 250, 50, 50, constants.sworddunfloor, Color.BLACK, true, this.getweap3());
        
        mover4.makestep(-3, 0, 300, "blankweap");
        
        addplatform(mover4);
        
        
        platform mover5 = new hardblock( 300, 150, 50, 50, constants.sworddunfloor, Color.BLACK, true, this.getweap3());
        
        mover5.makestep(0, 6, 300, "blankweap");
        
        addplatform(mover5);
        
        platform mover6 = new hardblock( 1000, 150, 50, 50, constants.sworddunfloor, Color.BLACK, true, this.getweap3());
        
        mover6.makestep(0, 6, 300, "blankweap");
        
        addplatform(mover6);
        
        platform mover7 = new hardblock( 350, 150, 50, 50, constants.sworddunfloor, Color.BLACK, true, this.getweap3());
        
        mover7.makestep(6, 0, 600, "blankweap");
        
        addplatform(mover7);
        
        platform mover8 = new hardblock( 600, 350, 100, 10, constants.sworddunfloor, Color.BLACK, true, this.getweap3());
        
        mover8.makestep(0, 1, 100, "blankweap");
        
        addplatform(mover8);
        
        
        
        
    }
    
    @Override
    public void resetroom()
    {
        super.resetroom();
        
        locked.settrigger(false);
        
        
        ceiling2.setSolid(true);
        
        if ( getpanel().getsavefile().gettrigger("gotweap_dnag").gettrigger() ) {
            
            terrain.remove(buttona);
            killed.settrigger(true);
            
        }
    }
    
    @Override
    public void setladder( room targ )
    {
        ladder1.setWarppoint(targ);
    }
    
    
    
    @Override
    public void step( Graphics g )
    {
        super.step(g);
        
        if ( killed.gettrigger() && !added && !getpanel().getsavefile().gettrigger("gotweap_dnag").gettrigger() ) {
            locked.settrigger(false);
            addneutral( sword );
            added = true;
            terrain.remove(buttona);
        }
        
        if ( getpanel().getsavefile().gettrigger("gotweap_dnag").gettrigger() ) {
            
            terrain.remove(buttona);
            killed.settrigger(true);
            
        }
        
        if ( getpanel().getsavefile().gettrigger("gotweap_dnag").gettrigger() && added ) {
            
            neutral.remove(sword);
            
        }
        
        if ( locked.gettrigger() ) {
            
            ceiling2.setSolid(false);
            
        }
        
        
        if ( !ceiling2.isSolid() && !killed.gettrigger() ) {
            
            getpanel().setTilnswords("A box?  What is it?");
            
        }
        
        
        if ( killed.gettrigger() ) {
            
            getpanel().setTilnswords("Taldo, you must press on.");
            
            
        }
    }
    
}
