/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package castle;

import every.*;
import java.awt.Color;
import java.util.ArrayList;

public class inside_history extends insideroom {
    
    
    private platform state1;
    
    
    public inside_history( jpanel1 panel, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter )
    {
        super(panel, Color.GRAY, Color.DARK_GRAY, platforms, bags, maincharacter, null, null, null);
        
        this.setroomdim(200, 170, 1100, 500);
        
        state1 = new platform( 240, 420, 50, 80, Color.black, false, this.getweap3() );
        
        state1.setSolid(false);
        state1.setWarppoint(this);
        state1.setWarps(true);
        state1.setWarpx(warpx);
        state1.setWarpy(warpy - constants.taldoheight());
        
        this.addplatform(state1);
        
        unit stand1 = new builders.scrollstand(weap3, this, 600, 500 - 47);
        stand1.setName("History of the World");
        stand1.setStatement("The Recent History of the Throne");
        stand1.setStatement("The Kingdom was happy and strong.  The King was the greater than any before.");
        stand1.setStatement("Then tragedy struck.");
        stand1.setStatement("The Queen had a child, the first heir, but that night the King and Queen were killed.");
        stand1.setStatement("The King's nephew Arnoth, had arranged the murder to take the kingdom.");
        stand1.setStatement("However, the child's nurse ran with the child.");
        stand1.setStatement("This caused Arnoth to flee the kingdom because he could not take the throne.");
        stand1.setStatement("Without legally being the heir, he would have to live in fear of the child's return.");
        stand1.setStatement("To this day the child is thought to be in hiding still, waiting for the threat of Arnoth to be gone.");
        this.addneutral(stand1);
        
        unit stand2 = new builders.scrollstand(weap3, this, 800, 500 - 47);
        stand2.setName("Book of the Sword");
        stand2.setStatement("The Sword of Seven Trials is a mythical weapon said to require the help of every village to obtain.");
        stand2.setStatement("It is said to be able to break any armour.");
        stand2.setStatement("It was rumored to have been used by Rold the warrior in his fabled wars against the Goblins.");
        stand2.setStatement("He was said to have used it as the only way to break the Great Goblin's Armour.");
        this.addneutral(stand2);
        
    }
    
    
    
    @Override
    public void setwarproom( room r )
    {
        state1.setWarppoint(r);
        
    }
    
    
    
    

    @Override
    public void setWarpx(int warpx) {
        this.warpx = warpx;
        state1.setWarpx(warpx);
    }

    

    @Override
    public void setWarpy(int warpy) {
        this.warpy = warpy;
        state1.setWarpy(warpy - constants.taldoheight());
    }
    
    
    
    
    
}


