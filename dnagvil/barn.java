/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dnagvil;

import every.*;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author Dad
 */
public class barn extends fieldbackroundroom {  
    
    private unit vil1;
    
    private boolean attacked;
    
    private AI ninjaai;
    private AI vilai;
    
    public barn( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom, world w )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom, w);
        
//        
//        tree = new ImageIcon( getClass().getResource("GreatDeku.jpg") );
        vilai = new noai();
        
        vil1 = new man1(this, 500, 500, vilai);
        
        ninjaai = new basicai();
        
        ninjaai.setperson(vil1);
        ninjaai.settarget(maincharacter);
        
        addbag(vil1);
        
        attacked = false;
        
    }
    
    
    @Override
    public void extrastuff( Graphics g )
    {
        if ( !attacked && weap1.size() > 0 ) {
            attacked = true;
            vil1.switchfig();
            vil1.setai(ninjaai);
            vil1.setDef(0);
        }
        
        
        
    }
    
    
    @Override
    public void extrainit()
    {
        weap1.clear();
        if ( attacked ) {
            attacked = false;
            vil1.switchfig();
        }
        
        vil1.stopleft();
        vil1.stopright();
        
        attacked = false;
        vil1.setai(vilai);
        vil1.setDef(1000);
    }
    
    
    
}


