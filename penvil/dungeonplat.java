/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package penvil;

import every.*;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Dad
 */
public class dungeonplat extends room2 {  
    
    
    private platform state1;
    
    
    
    private room bombplace;
    
    int howfar;
    
    private boolean opened;
    
    public dungeonplat( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom, world w )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom, w);
        
        state1 = new platform( 700, 490, 100, 10, new Color( 63, 33, 20 ), false, this.getweap3() );
        
        addplatform(state1);
        
        state1.setWarppoint(this);
        state1.setWarps(false);
        state1.setWarpx(200);
        state1.setWarpy(500 - constants.taldoheight());
        
        
        
        platform state1b = new hardblock( 540, 450, 420, 50, Color.RED, Color.RED, false, this.getweap3());
        
        this.addplatform( state1b );
        
        platform state2b = new hardblock( 580, 400, 340, 50, Color.RED, Color.RED, false, this.getweap3());
        
        this.addplatform( state2b );
        
        platform state3b = new hardblock( 620, 350, 260, 50, Color.RED, Color.RED, false, this.getweap3());
        
        this.addplatform( state3b );
        
        platform state4b = new hardblock( 660, 300, 180, 50, Color.RED, Color.RED, false, this.getweap3());
        
        this.addplatform( state4b );
        
        
        opened = false;
    }
    
    
    public void setwarproom()
    {
        bombplace = new bombroom(getpanel(), constants.speardunwall, constants.speardunfloor, new ArrayList<platform>(), new ArrayList<unit>(), mainchar, null, null, null);
        bombplace.setwarproom(this);
        state1.setWarppoint(bombplace);
        
    }
    
    
    
    
    
    @Override
    public void paintextra( Graphics g )
    {
        
        
        ImageIcon portal = new ImageIcon( getClass().getResource("Portal.png") );
        
        
        g.drawImage(portal.getImage(), 690, 360, 120, 150, null);
        
        
        
        if ( howfar == 6 && !opened ) {
            state1.setWarps(true);
            for ( int c = 0; c < terrain.size(); c++ ) {
                terrain.remove(1);
            
            }
            addplatform(state1);
        }
        if ( howfar < 6 && ( mainchar.getcurrentplat() != -1 || mainchar.getcurrentplat() != 0 ) ) {
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
    
    
    
    @Override
    public void resetroom()
    {
        super.resetroom();
        
        if ( howfar < 6 ) {
            howfar = 0;
        } else {
            state1.setWarps(true);
        }
        
        
        
    }
}

