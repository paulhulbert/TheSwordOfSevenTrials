/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package every;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author Dad
 */
public class world1_replaceheart extends room {
    
    
    
    public world1_replaceheart( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom);
        
        platform plat0 = new platform( 400, 450, 40, 20, Color.BLUE, false, weap3 );
        
        platform plat1 = new platform( 425, 400, 40, 20, Color.BLUE, false, weap3 );
        
        platform plat2 = new platform( 450, 350, 40, 20, Color.BLUE, false, weap3 );
        
        platform plat3 = new platform( 500, 325, 40, 20, Color.BLUE, false, weap3 );
        
        addplatform(plat0);
        addplatform(plat1);
        addplatform(plat2);
        addplatform(plat3);
        
        weap2.add( new heart( 540, 250, 1, 0, 0 ) );
        
        
        
        
        
        
    }
    
    
    @Override
    public void resetroom()
    {
        super.resetroom();
        
        weap2.add( new heart( 540, 250, 1, 0, 0 ) );
        
    }
    
   
    
}
