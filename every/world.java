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
public class world {
    
    
    protected room exit;
    protected room entry;
    
    protected jpanel1 panel;
    
    protected unit mainperson;
    
    protected ArrayList<platform> blank1 = new ArrayList<platform>();
    protected ArrayList<unit> blank2 = new ArrayList<unit>();
    
    public world( unit mainchar, jpanel1 pan )
    {
        exit = null;
        entry = null;
        mainperson = mainchar;
        panel = pan;
    }
    
    public room getentry2()
    {
        return null;
    }
    
    public void setexit2( room targ )
    {
        
    }
    
    
    public room getentry()
    {
        return entry;
    }
    
    public void setexit( room targ )
    {
        exit = targ;
        entry.setwarproom(targ);
    }
    
    
    
}
