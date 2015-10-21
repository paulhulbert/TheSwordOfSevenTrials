/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spearvil;

import every.jpanel1;
import every.platform;
import every.room;
import every.unit;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author Dad
 */
public class resroomclass extends every.room {
    
    private room r;

    public resroomclass(jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom, room r) {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom);
        
        this.r = r;
    }
    
    @Override
    public void step( Graphics g )
    {
        super.step(g);
        
        getpanel().settaldorespawn(r);
        
    }
    
}
