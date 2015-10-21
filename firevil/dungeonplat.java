/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package firevil;

import every.*;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Dad
 */
public class dungeonplat extends room {  
    
    
    private platform state1;
    
    public dungeonplat( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom, world w )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom);
        
        state1 = new platform( 700, 490, 100, 10, new Color( 63, 33, 20 ), false, this.getweap3() );
        
        addplatform(state1);
        
        state1.setWarppoint(this);
        state1.setWarps(true);
        state1.setWarpx(750);
        state1.setWarpy(500 - constants.taldoheight());
        
        platform state1a = new hardblock( 500, 450, 40, 50, Color.RED, Color.BLACK, false, this.getweap3());
        
        this.addplatform( state1a );
        
        platform state2 = new hardblock( 900, 450, 40, 50, Color.RED, Color.BLACK, false, this.getweap3());
        
        this.addplatform( state2 );
        
        
        
        firelauncherup trap1 = new firelauncherup( this.getweap3(), this, 896, 491 );
        
        trap1.settarget(mainchar);
        
        this.addneutral(trap1);
        
        firelauncherup trap2 = new firelauncherup( this.getweap3(), this, 560, 491 );
        
        trap2.settarget(mainchar);
        
        this.addneutral(trap2);
        
        platform mover = new platform( 500, 300, 20, 5, Color.RED, true, this.getweap3());
        
        mover.makestep(2, 0, 440, "blankweap");
        
        
        this.addplatform( mover );
        
        firelauncher trap3 = new firelauncher( this.getweap3(), this, 521, 291 );
        
        trap3.settarget(mainchar);
        
        this.addneutral(trap3);
        
        world w1 = new firedun.firedungeon(mainchar, panel);
        state1.setWarppoint(w1.getentry());
        w1.setexit(this);
        w1.getentry().setWarpx(750);
        
        
    }
    
    @Override
    public void setwarproom( room targ )
    {
        state1.setWarppoint(targ);
        
    }
    
    @Override
    public void paintextra( Graphics g )
    {
        
        ImageIcon portal = new ImageIcon( getClass().getResource("Portal.png") );
        
        
        g.drawImage(portal.getImage(), 690, 360, 120, 150, null);
        
    }
    
    
    @Override
    public void resetroom()
    {
        super.resetroom();
        
        int x = terrain.get(4).getx1();
        
        x += terrain.get(4).getx2() - terrain.get(4).getx1();
        
        neutral.get(3).setx( x );
        
        
    }
    
}
