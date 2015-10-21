/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package every;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Dad
 */
public class firstroom extends room {
    
    private platform state1;
    private platform state3;
    
    private room hammerplace;
    
    int howfar;
    
    private world1.boy kid;
    
    private ImageIcon portal;
    
    
    
    public firstroom( jpanel1 panel, ArrayList<platform> b1, ArrayList<unit> b2, unit mainperson, room blank )
    {
        super( panel, new Color( 105, 213, 201 ), new Color( 7, 173, 7 ), b1, b2, mainperson, blank, blank, blank );
        
        
        portal = new ImageIcon( getClass().getResource("Portal.png") );
        
        platform mover = new platform( 40, 300, 40, 10, Color.RED, true, this.getweap3());
        
        mover.makestep(1, 1, 150, "blankweap");
        
        
        this.addplatform( mover );
        
        platform station = new platform( 150, 450, 50, 10, Color.RED, false, this.getweap3() );
        this.addplatform(station);
        
        
        platform station3 = new platform( 100, 250, 50, 10, Color.RED, false, this.getweap3() ); // warppoint
        
        this.addplatform(station3);
        
        
        hammerplace = new world1.hammerroom(panel, constants.speardunwall, constants.speardunfloor, new ArrayList<platform>(), new ArrayList<unit>(), mainchar, null, null, null);
        
        station3.setWarps(false);
        station3.setWarpx(200);
        station3.setWarpy(500 - constants.taldoheight());
        
        
        
        state1 = station;
        state3 = station3;
        
        kid = new world1.boy(getweap3(), this, 1500, 500 - 75, mainperson);
        if ( !getpanel().getsavefile().gotweap2_charm.gettrigger() ) {
            addneutral(kid);
        }
        
        
        
        howfar = 0;
    }
    
    @Override
    public void settaldorespawn()
    {
        
        getpanel().settaldorespawn(constants.startingroom);
        
    }
    
    
    public void setlundtarget( unit t )
    {
        kid.settarget(t);
    }
    
    @Override
    public void setwarproom( room targ )
    {
        hammerplace = new world1.hammerroom(this.getpanel(), constants.speardunwall, constants.speardunfloor, new ArrayList<platform>(), new ArrayList<unit>(), mainchar, null, null, null);
        hammerplace.setwarproom(this);
        
        state3.setWarppoint(hammerplace);
        
    }
    
    @Override
    public void resetroom()
    {
        super.resetroom();
        
//        neutral.remove(kid);
        
        if ( howfar < 6 ) {
            howfar = 0;
        } else {
            state3.setWarps(true);
        }
        
        
        
    }
    
    
    @Override
    public void paintextra( Graphics g )
    {
        
        
        
        
        
        if ( howfar > 5 ) {
            g.drawImage(portal.getImage(), 100, 160, 50, 90, null);
        }
        
        
        
        
        if ( howfar == 6 ) {
            state3.setWarps(true);
        }
        if ( howfar < 6 && mainchar.getcurrentplat() == 3 ) {
        for ( int c = 0; c < weap1.size(); c++ ) {
            if ( weap1.get(c).name.equals("handsword") ) {
                if ( howfar == 0 || howfar == 1 ) {
                    howfar = 1;
                } else {
                    howfar = 0;
                }
                return;
            }
            if ( weap1.get(c).name.equals("spear") ) {
                if ( howfar == 1 || howfar == 2 ) {
                    howfar = 2;
                } else {
                    howfar = 0;
                }
                return;
            }
            if ( weap1.get(c).name.equals("bow") ) {
                if ( howfar == 2 || howfar == 3 ) {
                    howfar = 3;
                } else {
                    howfar = 0;
                }
                return;
            }
            if ( weap1.get(c).name.equals("fireball") ) {
                if ( howfar == 3 || howfar == 4 ) {
                    howfar = 4;
                } else {
                    howfar = 0;
                }
                return;
            }
            if ( weap1.get(c).name.equals("dnagup") ) {
                if ( howfar == 4 || howfar == 5 ) {
                    howfar = 5;
                } else {
                    howfar = 0;
                }
                return;
            }
            if ( weap1.get(c).name.equals("gobclaws_taldo") ) {
                if ( howfar == 5 || howfar == 6 ) {
                    howfar = 6;
                } else {
                    howfar = 0;
                    
                }
                return;
            }
        }
        }
        
        
        
    }
    
    
    
}
