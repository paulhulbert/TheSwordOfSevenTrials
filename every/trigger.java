/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package every;


import java.io.Serializable;
import javax.swing.JOptionPane;
/**
 *
 * @author Dad
 */
public class trigger implements Serializable {
    
    private boolean value;
    
    private trigger t;
    
    private boolean has_other_trigger;
    
    private String name;
    
    public trigger( boolean start )
    {
        value = start;
        has_other_trigger = false;
    }
    
    public trigger( boolean start, String name )
    {
        value = start;
        has_other_trigger = true;
        this.name = name;
    }
    
    
    public String getname()
    {
        return name;
    }
    
    public void settrigger( boolean bool )
    {
        value = bool;
//        if ( has_other_trigger ) {
//            t.settrigger(bool);
//        }
    }
    
    public boolean gettrigger()
    {
        if ( !has_other_trigger ) {
            return value;
        }
        
        return value;
        
//        return constants.getpanel().getsavefile().gettrigger(name).gettrigger();
    }
    
    public void switchtrigger()
    {
        if ( value ){
            value = false;
        }
        else {
            value = true;
        }
//        if ( has_other_trigger ) {
//            t.settrigger(value);
//        }
            
    }
    
    
    
    public void settrigger( boolean bool, jpanel1 panel )
    {
        value = bool;
        if ( !has_other_trigger ) {
            return;
        }
        panel.getsavefile().gettrigger(name).settrigger(bool);
    }
    
    public boolean gettrigger(jpanel1 panel)
    {
//        if ( has_other_trigger ) {
//            settrigger(t.gettrigger());
//        }
        
        if ( !has_other_trigger ) {
            return value;
        }
        value = panel.getsavefile().gettrigger(name).gettrigger();
//        if ( constants.cheatbool ) {
//            constants.cheatbool = false;
//            JOptionPane.showMessageDialog(null, panel.teststringa);
//        }
        
        return value;
    }
    
    public void switchtrigger(jpanel1 panel)
    {
        if ( value ){
            value = false;
        }
        else {
            value = true;
        }
//        if ( has_other_trigger ) {
//            t.settrigger(value);
//        }
        
        if ( !has_other_trigger ) {
            return;
        }
        panel.getsavefile().gettrigger(name).settrigger(value);
            
    }
    
}
