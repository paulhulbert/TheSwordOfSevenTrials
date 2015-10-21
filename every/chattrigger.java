/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package every;

import java.util.ArrayList;

/**
 *
 * @author Dad
 */
public class chattrigger {
    
    public ArrayList<String> chats;
    public trigger t;
    
    public trigger secondtrig;
    public boolean has_secondtrig;
    public boolean newvalue;
    
    public boolean activated = false;
    
    public chattrigger( trigger t )
    {
        this.t = t;
        
        has_secondtrig = false;
        
        secondtrig = new trigger( false );
        
        chats = new ArrayList<>();
        
        newvalue = false;
    }
    
    public chattrigger( trigger t, trigger t2, boolean newvalue )
    {
        this.t = t;
        
        has_secondtrig = true;
        
        secondtrig = t2;
        
        chats = new ArrayList<>();
        
        this.newvalue = newvalue;
    }
    
    
    public void addchat( String s )
    {
        chats.add(s);
        
    }
    
    public void setnewchat( unit u )
    {
        u.clearstatements();
        
        activated = true;
        
        if ( has_secondtrig ) {
            secondtrig.settrigger(newvalue, constants.getpanel());
        }
        
        for ( int c = 0; c < chats.size(); c++ ) {
            
            u.setStatement(chats.get(c));
            
        }
        
        
    }
    
}
