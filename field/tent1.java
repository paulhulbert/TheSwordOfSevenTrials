/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package field;
import every.*;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
/**
 *
 * @author Dad
 */
public class tent1 extends insideroom {
    
    private trigger gotnote;
    private trigger gotsword;
    
    private unit noteunit;
    private unit swordpart;
    
    public tent1( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom )
    {
        super(panel, background, base, platforms, bags, maincharacter, leftroom, rightroom, middleroom);
        
//        this.getweap2().add( new halfmadesword( 510, 420, 1, 0, 0 ) );
        
//        this.getweap2().add( new note( 650, 420, "note1") );
        
        noteunit = new builders.talk_note1( weap3, this );
        
        addneutral( noteunit );
        
        swordpart = new builders.halfsword( weap3, this );
        
        addneutral( swordpart );
        
        gotnote = new trigger( false, "builders_talk_note1_spoke1" );
        gotsword = new trigger( false, "builders_halfsword_spoke1" );
    }
    
    
    @Override
    public void extrastuff( Graphics g )
    {
        if ( gotnote.gettrigger( constants.getpanel() ) ) {
            neutral.remove(noteunit);
        }
        
        if ( gotsword.gettrigger(constants.getpanel()) ) {
            neutral.remove(swordpart);
        }
    }
    
}
