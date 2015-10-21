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
public class bigtorch extends room2 {  
    
    
    public bigtorch( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom, world w )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom, w);
        
        
    }
    
    
    
    @Override
    public void paintextra( Graphics g )
    {
        
    }
    
    
}