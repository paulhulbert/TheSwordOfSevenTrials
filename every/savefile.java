/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package every;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Dad
 */
public class savefile implements Serializable {
    
    
    public trigger gotweap_sword;
    public trigger gotweap_bow;
    public trigger gotweap_spear;
    public trigger gotweap_dnag;
    public trigger gotweap_fireball;
    public trigger gotweap_hammer;
    public trigger gotweap_gobclaws;
    public trigger gotweap_superhammer;
    public trigger gotweap_sost;
    
    public trigger gotweap2_bomb;
    public trigger gotweap2_charm;
    
    public trigger room3_inroom1_locked;
    
    public trigger sworddungeon_r4_lock;
    
    public trigger sworddun_sworddungeon_r8_lock;
    
    public trigger world1_boy_spoke;
    
    public trigger every_jpanel1_spoke_to_ondo;
    
    public trigger every_jpanel1_spoke_to_sarierce;
    
    public trigger world1_elderroom_spoke1;
    
    public trigger world1_wizardcom_spoke1;
    
    public trigger world1_wizardcom_spokeafternote;
    
    public trigger every_halfmadesword_gothalfsword;
    
    public trigger builders_talk_note1_spoke1;
    
    public trigger builders_halfsword_spoke1;
    
    public trigger bowvil_bowvillage_openportal;
    
    public trigger speardun_speardungeon_r3_lock;
    
    public trigger speardun_speardungeon_r8_lock1;
    
    public trigger speardun_speardungeon_r8_lock2;
    
    public trigger firedun_firedungeon_r1_lock;
    
    public trigger firedun_firedungeon_r7_lock;
    
    public trigger bowdun_bowdungeon_lock_1;
    
    public trigger bowdun_bowdungeon_lock_2;
    
    public trigger bowdun_bowdungeon_lock_3;
    
    public trigger gobdun_gobdungeon_mainlock_1;
    
    public trigger gobdun_gobdungeon_mainlock_2;
    
    public trigger gobdun_gobdungeon_mainlock_3;
    
    public trigger sostrooms_warp_field_hitpillars;
    
    public trigger spearvil_blueweasel_spoke;
    
    public trigger sostrooms_swordroom_entered;
    
    public trigger sostrooms_spearroom_entered;
    
    public trigger sostrooms_bowroom_entered;
    
    public trigger sostrooms_fireroom_entered;
    
    public trigger sostrooms_dnagroom_entered;
    
    public trigger sostrooms_gobroom_entered;
    
    public trigger sostrooms_hammerroom_entered;
    
    public trigger spearvil_spearelder_spoke1;
    
    public trigger firevil_fireelder_spoke1;
    
    
    
    
    
    
    public ArrayList<trigger> triggers;
    
    
    public int taldolife;
    public String taldoweapon;
    
    public savefile()
    {
        taldolife = 100;
        taldoweapon = "hammer";
        
        triggers = new ArrayList<>();
        triggers.clear();
        
        gotweap_sword = new trigger( false, "gotweap_sword" );
        triggers.add(gotweap_sword);
        gotweap_bow = new trigger( false, "gotweap_bow" );
        triggers.add(gotweap_bow);
        gotweap_spear = new trigger( false, "gotweap_spear" );
        triggers.add(gotweap_spear);
        gotweap_dnag = new trigger( false, "gotweap_dnag" );
        triggers.add(gotweap_dnag);
        gotweap_fireball = new trigger( false, "gotweap_fireball" );
        triggers.add(gotweap_fireball);
        gotweap_hammer = new trigger( false, "gotweap_hammer" );
        triggers.add(gotweap_hammer);
        gotweap_gobclaws = new trigger( false, "gotweap_gobclaws" );
        triggers.add(gotweap_gobclaws);
        gotweap_superhammer = new trigger( false, "gotweap_superhammer" );
        triggers.add(gotweap_superhammer);
        gotweap_sost = new trigger( false, "gotweap_sost" );
        triggers.add(gotweap_sost);
        
        gotweap2_bomb = new trigger( false, "gotweap2_bomb" );
        triggers.add(gotweap2_bomb);
        gotweap2_charm = new trigger( false, "gotweap2_charm" );
        triggers.add(gotweap2_charm);
        
        sworddungeon_r4_lock = new trigger( true, "sworddungeon_r4_lock" );
        triggers.add(sworddungeon_r4_lock);
        
        room3_inroom1_locked = new trigger( false, "room3_inroom1:locked" );
        triggers.add(room3_inroom1_locked);
        
        world1_boy_spoke = new trigger( false, "world1_boy_spoke" );
        triggers.add(world1_boy_spoke);
        
        every_jpanel1_spoke_to_ondo = new trigger( false, "every_jpanel1_spoke_to_ondo" );
        triggers.add(every_jpanel1_spoke_to_ondo);
        
        every_jpanel1_spoke_to_sarierce = new trigger( false, "every_jpanel1_spoke_to_sarierce" );
        triggers.add(every_jpanel1_spoke_to_sarierce);
        
        world1_elderroom_spoke1 = new trigger( false, "world1_elderroom_spoke1" );
        triggers.add(world1_elderroom_spoke1);
        
        world1_wizardcom_spoke1 = new trigger( false, "world1_wizardcom_spoke1" );
        triggers.add(world1_wizardcom_spoke1);
        
        every_halfmadesword_gothalfsword = new trigger( false, "every_halfmadesword_gothalfsword" ); //false
        triggers.add(every_halfmadesword_gothalfsword);
        
        builders_talk_note1_spoke1 = new trigger( false, "builders_talk_note1_spoke1" ); // false
        triggers.add(builders_talk_note1_spoke1);
        
        builders_halfsword_spoke1 = new trigger( false, "builders_halfsword_spoke1" );
        triggers.add(builders_halfsword_spoke1);
        
        world1_wizardcom_spokeafternote = new trigger( false, "world1_wizardcom_spokeafternote" );
        triggers.add(world1_wizardcom_spokeafternote);
        
        bowvil_bowvillage_openportal = new trigger( false, "bowvil_bowvillage_openportal" );
        triggers.add(bowvil_bowvillage_openportal);
        
        sworddun_sworddungeon_r8_lock = new trigger( true, "sworddun_sworddungeon_r8_lock" );
        triggers.add(sworddun_sworddungeon_r8_lock);
        
        speardun_speardungeon_r3_lock = new trigger( true, "speardun_speardungeon_r3_lock" );
        triggers.add(speardun_speardungeon_r3_lock);
        
        speardun_speardungeon_r8_lock1 = new trigger( true, "speardun_speardungeon_r8_lock1" );
        triggers.add(speardun_speardungeon_r8_lock1);
        
        speardun_speardungeon_r8_lock2 = new trigger( true, "speardun_speardungeon_r8_lock2" );
        triggers.add(speardun_speardungeon_r8_lock2);
        
        firedun_firedungeon_r1_lock = new trigger( true, "firedun_firedungeon_r1_lock" );
        triggers.add(firedun_firedungeon_r1_lock);
        
        firedun_firedungeon_r7_lock = new trigger( true, "firedun_firedungeon_r7_lock" );
        triggers.add(firedun_firedungeon_r7_lock);
        
        bowdun_bowdungeon_lock_1 = new trigger( true, "bowdun_bowdungeon_lock_1" );  //true
        triggers.add(bowdun_bowdungeon_lock_1);
        
        bowdun_bowdungeon_lock_2 = new trigger( true, "bowdun_bowdungeon_lock_2" );  //true
        triggers.add(bowdun_bowdungeon_lock_2);
        
        bowdun_bowdungeon_lock_3 = new trigger( true, "bowdun_bowdungeon_lock_3" );  //true
        triggers.add(bowdun_bowdungeon_lock_3);
        
        gobdun_gobdungeon_mainlock_1 = new trigger( true, "gobdun_gobdungeon_mainlock_1" );
        triggers.add(gobdun_gobdungeon_mainlock_1);
        
        gobdun_gobdungeon_mainlock_2 = new trigger( true, "gobdun_gobdungeon_mainlock_2" );
        triggers.add(gobdun_gobdungeon_mainlock_2);
        
        gobdun_gobdungeon_mainlock_3 = new trigger( true, "gobdun_gobdungeon_mainlock_3" );
        triggers.add(gobdun_gobdungeon_mainlock_3);
        
        sostrooms_warp_field_hitpillars = new trigger( false, "sostrooms_warp_field_hitpillars" );
        triggers.add(sostrooms_warp_field_hitpillars);
        
        spearvil_blueweasel_spoke = new trigger( false, "spearvil_blueweasel_spoke" );
        triggers.add(spearvil_blueweasel_spoke);
        
        sostrooms_swordroom_entered = new trigger( false, "sostrooms_swordroom_entered" );
        triggers.add(sostrooms_swordroom_entered);
        
        sostrooms_spearroom_entered = new trigger( false, "sostrooms_spearroom_entered" );
        triggers.add(sostrooms_spearroom_entered);
        
        sostrooms_bowroom_entered = new trigger( false, "sostrooms_bowroom_entered" );
        triggers.add(sostrooms_bowroom_entered);
        
        sostrooms_fireroom_entered = new trigger( false, "sostrooms_fireroom_entered" );
        triggers.add(sostrooms_fireroom_entered);
        
        sostrooms_dnagroom_entered = new trigger( false, "sostrooms_dnagroom_entered" );
        triggers.add(sostrooms_dnagroom_entered);
        
        sostrooms_gobroom_entered = new trigger( false, "sostrooms_gobroom_entered" );
        triggers.add(sostrooms_gobroom_entered);
        
        sostrooms_hammerroom_entered = new trigger( false, "sostrooms_hammerroom_entered" );
        triggers.add(sostrooms_hammerroom_entered);
        
        
        spearvil_spearelder_spoke1 = new trigger( false, "spearvil_spearelder_spoke1" );
        triggers.add(spearvil_spearelder_spoke1);
        
        firevil_fireelder_spoke1 = new trigger( false, "firevil_fireelder_spoke1" );
        triggers.add(firevil_fireelder_spoke1);
        
        
        
        
    }
    
    
    public trigger gettrigger( String name )
    {
        
        for ( int c = 0; c < triggers.size(); c++ ) {
            if ( name.equals(triggers.get(c).getname()) ) {
                return triggers.get(c);
            }
        }
        
        
        return null;
    }

    public int getTaldolife() {
        return taldolife;
    }

    public void setTaldolife(int taldolife) {
        this.taldolife = taldolife;
    }

    public String getTaldoweapon() {
        return taldoweapon;
    }

    public void setTaldoweapon(String taldoweapon) {
        this.taldoweapon = taldoweapon;
    }
    
    
    
    
}
