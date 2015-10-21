/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package every;

import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author Dad
 */
public class insideroom2 extends room {
    
    private world worldin;
    
    public insideroom2( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom, world world_in )
    {
        super( panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom );
        
        worldin = world_in;
    }
    
    public void setworldin( world w ) {
        worldin = w;
    }
    
    public world getworldin()
    {
        return worldin;
    }
    
}
