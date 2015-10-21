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
public class muse2 extends room2 {  
    
    
    
    public muse2( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom, world w )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom, w);
        
        
        
        
        unit stand1 = new builders.scrollstand(weap3, this, 500, 500 - 47);
        stand1.setName("Essay on Monster3");
        stand1.setStatement("Monster3");
        this.addneutral(stand1);
        
        
        
        unit stand2 = new builders.scrollstand(weap3, this, 900, 500 - 47);
        stand2.setName("The Sword of Seven Trials");
        stand2.setStatement("The Sword of Seven Trials is an ancient mythological weapon.");
        stand2.setStatement("It is said to be the only weapon that can cut through the Goblin Armour.");
        stand2.setStatement("The room said to contain the weapon has seven pillars leading up to it.");
        stand2.setStatement("It is said that if someone were to strike all the pillars with the correct weapon, the Sword will appear.");
        stand2.setStatement("All the pillars have simple descriptions except for the last one.");
        stand2.setStatement("On the sign for the last pillar is written, \"Go to the top of Hilden's creation, and use your weapons in the order they are in these rooms.\"");
        this.addneutral(stand2);
    }
    
    
    
    
    
}

