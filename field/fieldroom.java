/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package field;


import every.*;
import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author Dad
 */
public class fieldroom extends room {

    public fieldroom(jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom) {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom);
    }
    
    @Override
    public void settaldorespawn()
    {
        
        getpanel().settaldorespawn(constants.startingroom);
        
    }
    
}
