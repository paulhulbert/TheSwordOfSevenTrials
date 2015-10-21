/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package every;


import builders.w1_vil1build;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.NoSuchElementException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import javax.swing.ImageIcon;


/**
 *
 * @author Dad
 */
public class jpanel1 extends JPanel {
    
    private boolean isondoinroom = false;
    
    private unit mainperson;
    
    private boolean shouldchat;
    
    private boolean paused;
    private Timer timer;
    
    private int weapearned = 7;
    
    public boolean created = false;
    public boolean historyread = false;
    public boolean readinghistory = false;
    public boolean onfirstscreen = true;
    public boolean onsecondscreen = false;
    public boolean onmainscreen = false;
    
    public int youwoncounter = 0;
    
    
    private String tilnswords = "Go to the Sword of Seven Trials.";
    
    private String firstscreen_filename = "startmenu_none";
    private String secondscreen_filename = "history_black";
    
    private boolean overexit = false;
    private boolean overinventory = false;
    private boolean oversave = false;
    
    private boolean overquit = false;
    private boolean overtryagain = false;
    
    public boolean overhammerbutton = false;
    public boolean overswordbutton = false;
    public boolean overbowbutton = false;
    public boolean overspearbutton = false;
    public boolean overfirebutton = false;
    public boolean overdinagbutton = false;
    public boolean overgobclawsbutton = false;
    public boolean oversuperhammerbutton = false;
    public boolean oversostbutton = false;
    public boolean overscbutton = false;
    public boolean overbombsbutton = false;
    
    private ImageIcon endgamepic;
    
//    public boolean gotweap1 = true;
//    public boolean gotweap2 = true;
//    public boolean gotweap3 = true;
//    public boolean gotweap4 = true;
//    public boolean gotweap5 = true;
//    public boolean gotweap6 = true;
//    public boolean gotweap7 = true;
//    public boolean gotweap8 = true;
//    public boolean gotweap9 = true;
//    public boolean gotweap10 = true;
//    public boolean gotweap11 = true;
//    public boolean gotweap12 = true;
    
    
    private room currentroom;
    
    private room startroom;
    
    private Color grass;
    private Color sky;
    
    private boolean isattacking = false;
    private boolean isattacking2 = false;
    
    
    private room taldorespawn;
    
    
    private savefile savefile1;
    
    
    
    
    public void cheat()
    {
//        mainperson.setjumpvar(45);
        
        
        
        if( constants.cheatbool ) {
            constants.cheatbool = false;
            mainperson.setjumpvar(20);
            mainperson.setspeed(5);
            
        }
        else {
            constants.cheatbool = true;
            mainperson.setjumpvar(45);
            mainperson.setspeed(15);
        }
        
//        getsavefile().gettrigger("gotweap_sost").settrigger(constants.cheatbool);
        
//        JOptionPane.showMessageDialog(this, getsavefile().gettrigger("world1_elderroom_spoke1").gettrigger() );
        
        
        
        
    }

    public String getTilnswords() {
        return tilnswords;
    }

    public void setTilnswords(String tilnswords) {
        this.tilnswords = tilnswords;
    }
    
    
    
    
    public boolean is_ondo_in_room()
    {
        if ( isondoinroom ) {
            isondoinroom = false;
            return true;
        }
        else {
            isondoinroom = true;
            return false;
        }
    }
    
    public void setroom( room current )
    {
        currentroom.resetroom();
        currentroom = current;
        mainperson.setroom(current);
        
    }
    
    public void attackon()
    {
        isattacking = true;
    }
    
    public void attackoff()
    {
        isattacking = false;
    }
    
    public void attack2on()
    {
        isattacking2 = true;
    }
    
    public void attack2off()
    {
        isattacking2 = false;
    }
    
    
    public void clicker( int x, int y ) {
        if ( paused ) {
            currentroom.clickit(x, y);
        }
        
            if ( x > 1280 && x < 1370 && y > -5 && y < 35 ) {
                System.exit(0);
            }
            
            if ( x > 1280 && x < 1370 && y > 85 && y < 125 && youwoncounter == 0 ) {
                save();
            }
            
            
            if ( x > 1280 && x < 1370 && y > 40 && y < 80 && youwoncounter == 0 ) {
                if ( !getpaused() ) {
                    getmainperson().getroom().settoobjectives(true);
                }
                else {
                    unpause();
                    resetchat();
                }
            }
        
            
        if ( mainperson.getlife() <= 0 && youwoncounter == 0 ) {
            
            if ( x > 450 && x < 600 && y > 400 && y < 480 ) {
                
                currentroom.taldorespawn();
                
            }
            
            if ( x > 700 && x < 850 && y > 400 && y < 480 ) {
                
                System.exit(0);
                
            }
            
        }
        
    }

    public int getWeapearned() {
        return weapearned;
    }

    public void setWeapearned(int weapearned) {
        this.weapearned = weapearned;
    }
    
    
    
    public unit getmainperson()
    {
        return mainperson;
    }
    
    public boolean getpaused()
    {
        return paused;
    }
    
    public void pause()
    {
        paused = true;
        
    }
    
    public void unpause()
    {
        paused = false;
        currentroom.settoobjectives(false);
    }
    
    public void resetchat()
    {
        currentroom.setcurrentchat(0);
    }

    public savefile getsavefile() {
        return savefile1;
    }
    
    
    public void settaldorespawn( room r )
    {
        
        taldorespawn = r;
        
    }
    
    public room gettaldorespawn()
    {
        return taldorespawn;
        
        
    }
    
    
    
    public jpanel1()
    {
        savefile1 = new savefile();
        
        
        ImageIcon speedpic = new ImageIcon( getClass().getResource( "startmenu_newgame.jpg") );
        speedpic = new ImageIcon( getClass().getResource( "startmenu_load.jpg") );
        speedpic = new ImageIcon( getClass().getResource( "startmenu_exit.jpg") );
        speedpic = new ImageIcon( getClass().getResource( "history_black.jpg") );
        speedpic = new ImageIcon( getClass().getResource( "history_gold.jpg") );
        speedpic = new ImageIcon( getClass().getResource( "exit_in.jpg") );
        speedpic = new ImageIcon( getClass().getResource( "inventory_in.jpg") );
        speedpic = new ImageIcon( getClass().getResource( "save_in.jpg") );
        speedpic = new ImageIcon( getClass().getResource( "youhavedied.jpg") );
        speedpic = new ImageIcon( getClass().getResource( "quit_in.jpg") );
        speedpic = new ImageIcon( getClass().getResource( "quit_out.jpg") );
        speedpic = new ImageIcon( getClass().getResource( "tryagain_in.jpg") );
        speedpic = new ImageIcon( getClass().getResource( "tryagain_out.jpg") );
        speedpic = new ImageIcon( getClass().getResource( "talking_backround.jpg") );
        speedpic = new ImageIcon( getClass().getResource( "bombs_button_in.jpg") );
        speedpic = new ImageIcon( getClass().getResource( "bombs_button_out.jpg") );
        speedpic = new ImageIcon( getClass().getResource( "bombs_dis.jpg") );
        speedpic = new ImageIcon( getClass().getResource( "bow_button_in.jpg") );
        speedpic = new ImageIcon( getClass().getResource( "bow_button_out.jpg") );
        speedpic = new ImageIcon( getClass().getResource( "bow_dis.jpg") );
        speedpic = new ImageIcon( getClass().getResource( "dinag_button_in.jpg") );
        speedpic = new ImageIcon( getClass().getResource( "dinag_button_out.jpg") );
        speedpic = new ImageIcon( getClass().getResource( "dinag_dis.jpg") );
        speedpic = new ImageIcon( getClass().getResource( "fire_button_in.jpg") );
        speedpic = new ImageIcon( getClass().getResource( "fire_button_out.jpg") );
        speedpic = new ImageIcon( getClass().getResource( "fire_dis.jpg") );
        speedpic = new ImageIcon( getClass().getResource( "gobclaws_button_in.jpg") );
        speedpic = new ImageIcon( getClass().getResource( "gobclaws_button_out.jpg") );
        speedpic = new ImageIcon( getClass().getResource( "gobclaws_dis.jpg") );
        speedpic = new ImageIcon( getClass().getResource( "hammer_button_in.jpg") );
        speedpic = new ImageIcon( getClass().getResource( "hammer_button_out.jpg") );
        speedpic = new ImageIcon( getClass().getResource( "hammer_dis.jpg") );
        speedpic = new ImageIcon( getClass().getResource( "sc_button_in.jpg") );
        speedpic = new ImageIcon( getClass().getResource( "sc_button_out.jpg") );
        speedpic = new ImageIcon( getClass().getResource( "sc_dis.jpg") );
        speedpic = new ImageIcon( getClass().getResource( "sost_button_in.jpg") );
        speedpic = new ImageIcon( getClass().getResource( "sost_button_out.jpg") );
        speedpic = new ImageIcon( getClass().getResource( "sost_dis.jpg") );
        speedpic = new ImageIcon( getClass().getResource( "spear_button_in.jpg") );
        speedpic = new ImageIcon( getClass().getResource( "spear_button_out.jpg") );
        speedpic = new ImageIcon( getClass().getResource( "spear_dis.jpg") );
        speedpic = new ImageIcon( getClass().getResource( "superhammer_button_in.jpg") );
        speedpic = new ImageIcon( getClass().getResource( "superhammer_button_out.jpg") );
        speedpic = new ImageIcon( getClass().getResource( "superhammer_dis.jpg") );
        speedpic = new ImageIcon( getClass().getResource( "sword_button_in.jpg") );
        speedpic = new ImageIcon( getClass().getResource( "sword_button_out.jpg") );
        speedpic = new ImageIcon( getClass().getResource( "sword_dis.jpg") );
        speedpic = new ImageIcon( getClass().getResource( "weapons_backround.jpg") );
        
        endgamepic = new ImageIcon( getClass().getResource( "endgame-taldo.png") );
        
        
        timer = new Timer(30, new timehand() ); // should be 25
        timer.start();
        paused = false;
        
        shouldchat = false;
        
        sky = constants.sky;
        grass = constants.grass;
        
        create();
        
        
        
        taldorespawn = mainperson.getroom();
    }
    
    public void chatit()
    {
        shouldchat = true;
    }
    
    
    
    public void setfirstscreen_filename( String s ) 
    {
        
        firstscreen_filename = s;
        
        
    }
    
    public void setsecondscreen_filename( String s ) 
    {
        
        secondscreen_filename = s;
        
        
    }
    
    public room getcurrentroom()
    {
        return currentroom;
    }

    public void setOverexit(boolean overexit) {
        this.overexit = overexit;
    }

    public void setOverinventory(boolean overinventory) {
        this.overinventory = overinventory;
    }

    public void setOversave(boolean oversave) {
        this.oversave = oversave;
    }

    public void setOverquit(boolean overquit) {
        this.overquit = overquit;
    }

    public void setOvertryagain(boolean overtryagain) {
        this.overtryagain = overtryagain;
    }

    public void setOverbombsbutton(boolean overbombsbutton) {
        this.overbombsbutton = overbombsbutton;
    }

    public void setOverbowbutton(boolean overbowbutton) {
        this.overbowbutton = overbowbutton;
    }

    public void setOverdinagbutton(boolean overdinagbutton) {
        this.overdinagbutton = overdinagbutton;
    }

    public void setOverfirebutton(boolean overfirebutton) {
        this.overfirebutton = overfirebutton;
    }

    public void setOvergobclawsbutton(boolean overgobclawsbutton) {
        this.overgobclawsbutton = overgobclawsbutton;
    }

    public void setOverhammerbutton(boolean overhammerbutton) {
        this.overhammerbutton = overhammerbutton;
    }

    public void setOverscbutton(boolean overscbutton) {
        this.overscbutton = overscbutton;
    }

    public void setOversostbutton(boolean oversostbutton) {
        this.oversostbutton = oversostbutton;
    }

    public void setOverspearbutton(boolean overspearbutton) {
        this.overspearbutton = overspearbutton;
    }

    public void setOverswordbutton(boolean overswordbutton) {
        this.overswordbutton = overswordbutton;
    }

    public void setOversuperhammerbutton(boolean oversuperhammerbutton) {
        this.oversuperhammerbutton = oversuperhammerbutton;
    }
    
    
    
    
    public void printweaponscreen( Graphics g )
    {
        
        
            Font font1 = g.getFont();
            
            g.setFont(new Font( "Serif", Font.BOLD, 14 ));
            
            ImageIcon chatpic = new ImageIcon( getClass().getResource( "weapons_backround.jpg") );
        
        
            g.drawImage(chatpic.getImage(), -5, -5, 1300, 800, null);
            
            
            int weaps = getWeapearned();
            
            
            ImageIcon despic = new ImageIcon( getClass().getResource( "hammer_dis.jpg") );
        
        
            
            
            if ( mainperson.getMainweapon().equals("hammer") ) {
                
                despic = new ImageIcon( getClass().getResource( "hammer_dis.jpg") );
                
            }
            
            if ( mainperson.getMainweapon().equals("handsword") ) {
                
                despic = new ImageIcon( getClass().getResource( "sword_dis.jpg") );
                
            }
            
            if ( mainperson.getMainweapon().equals("bow") ) {
                
                despic = new ImageIcon( getClass().getResource( "bow_dis.jpg") );
                
            }
            
            if ( mainperson.getMainweapon().equals("spear") ) {
                
                despic = new ImageIcon( getClass().getResource( "spear_dis.jpg") );
                
            }
            
            if ( mainperson.getMainweapon().equals("fireball") ) {
                
                despic = new ImageIcon( getClass().getResource( "fire_dis.jpg") );
                
            }
            
            if ( mainperson.getMainweapon().equals("dnag") ) {
                
                despic = new ImageIcon( getClass().getResource( "dinag_dis.jpg") );
                
            }
            
            if ( mainperson.getMainweapon().equals("gobclaws_taldo") ) {
                
                despic = new ImageIcon( getClass().getResource( "gobclaws_dis.jpg") );
                
            }
            
            if ( mainperson.getMainweapon().equals("superhammer") ) {
                
                despic = new ImageIcon( getClass().getResource( "superhammer_dis.jpg") );
                
            }
            
            if ( mainperson.getMainweapon().equals("sost") ) {
                
                despic = new ImageIcon( getClass().getResource( "sost_dis.jpg") );
                
            }
            
            g.drawImage(despic.getImage(), 450, 240, 400, 200, null);
            
            
            ImageIcon despic2;
            
            if ( mainperson.getWeapon2().equals("Tiln") ) {
                
                despic2 = new ImageIcon( getClass().getResource( "sc_dis.jpg") );
                g.drawImage(despic2.getImage(), 450, 450, 400, 200, null);
            }
            
            if ( mainperson.getWeapon2().equals("bomb") ) {
                
                despic2 = new ImageIcon( getClass().getResource( "bombs_dis.jpg") );
                g.drawImage(despic2.getImage(), 450, 450, 400, 200, null);
            }
            
            
            
            
            ImageIcon hammerbuttonpic;
            
            if ( overhammerbutton ) {
                hammerbuttonpic = new ImageIcon( getClass().getResource( "hammer_button_in.jpg") );
            } else {
                hammerbuttonpic = new ImageIcon( getClass().getResource( "hammer_button_out.jpg") );
            }
        
            g.drawImage(hammerbuttonpic.getImage(), 100, 110, 200, 60, null);
            
            
            
            
            
            if ( getsavefile().gotweap_sword.gettrigger() ) {
                ImageIcon swordbuttonpic;
            
            if ( overswordbutton ) {
                swordbuttonpic = new ImageIcon( getClass().getResource( "sword_button_in.jpg") );
            } else {
                swordbuttonpic = new ImageIcon( getClass().getResource( "sword_button_out.jpg") );
            }
        
            g.drawImage(swordbuttonpic.getImage(), 100, 180, 200, 60, null);
            }
            if ( getsavefile().gotweap_spear.gettrigger() ) {
                ImageIcon spearbuttonpic;
            
            if ( overspearbutton ) {
                spearbuttonpic = new ImageIcon( getClass().getResource( "spear_button_in.jpg") );
            } else {
                spearbuttonpic = new ImageIcon( getClass().getResource( "spear_button_out.jpg") );
            }
        
            g.drawImage(spearbuttonpic.getImage(), 100, 250, 200, 60, null);
            }
            
            if ( getsavefile().gotweap_bow.gettrigger() ) {
                ImageIcon bowbuttonpic;
            
            if ( overbowbutton ) {
                bowbuttonpic = new ImageIcon( getClass().getResource( "bow_button_in.jpg") );
            } else {
                bowbuttonpic = new ImageIcon( getClass().getResource( "bow_button_out.jpg") );
            }
        
            g.drawImage(bowbuttonpic.getImage(), 100, 320, 200, 60, null);
            }
            
            if ( getsavefile().gotweap_fireball.gettrigger() ) {
                ImageIcon firebuttonpic;
            
            if ( overfirebutton ) {
                firebuttonpic = new ImageIcon( getClass().getResource( "fire_button_in.jpg") );
            } else {
                firebuttonpic = new ImageIcon( getClass().getResource( "fire_button_out.jpg") );
            }
        
            g.drawImage(firebuttonpic.getImage(), 100, 390, 200, 60, null);
            }
            
            if ( getsavefile().gotweap_gobclaws.gettrigger() ) {
                ImageIcon gobclawsbuttonpic;
            
            if ( overgobclawsbutton ) {
                gobclawsbuttonpic = new ImageIcon( getClass().getResource( "gobclaws_button_in.jpg") );
            } else {
                gobclawsbuttonpic = new ImageIcon( getClass().getResource( "gobclaws_button_out.jpg") );
            }
        
            g.drawImage(gobclawsbuttonpic.getImage(), 100, 530, 200, 60, null);
            }
            
            if ( getsavefile().gotweap_dnag.gettrigger() ) {
                ImageIcon dinagbuttonpic;
            
            if ( overdinagbutton ) {
                dinagbuttonpic = new ImageIcon( getClass().getResource( "dinag_button_in.jpg") );
            } else {
                dinagbuttonpic = new ImageIcon( getClass().getResource( "dinag_button_out.jpg") );
            }
        
            g.drawImage(dinagbuttonpic.getImage(), 100, 460, 200, 60, null);
            }
            
            
            if ( getsavefile().gotweap_superhammer.gettrigger() ) {
                ImageIcon superhammerbuttonpic;
            
            if ( oversuperhammerbutton ) {
                superhammerbuttonpic = new ImageIcon( getClass().getResource( "superhammer_button_in.jpg") );
            } else {
                superhammerbuttonpic = new ImageIcon( getClass().getResource( "superhammer_button_out.jpg") );
            }
        
            g.drawImage(superhammerbuttonpic.getImage(), 100, 600, 200, 60, null);
            }
            
            if ( getsavefile().gotweap_sost.gettrigger() ) {
                ImageIcon sostbuttonpic;
            
            if ( oversostbutton ) {
                sostbuttonpic = new ImageIcon( getClass().getResource( "sost_button_in.jpg") );
            } else {
                sostbuttonpic = new ImageIcon( getClass().getResource( "sost_button_out.jpg") );
            }
        
            g.drawImage(sostbuttonpic.getImage(), 100, 670, 200, 60, null);
            }
            
            
            
            
            if ( getsavefile().gotweap2_bomb.gettrigger() ) {
                ImageIcon bombsbuttonpic;
            
            if ( overbombsbutton ) {
                bombsbuttonpic = new ImageIcon( getClass().getResource( "bombs_button_in.jpg") );
            } else {
                bombsbuttonpic = new ImageIcon( getClass().getResource( "bombs_button_out.jpg") );
            }
        
            g.drawImage(bombsbuttonpic.getImage(), 1050, 180, 200, 60, null);
            }
            
            if ( getsavefile().gotweap2_charm.gettrigger() ) {
                ImageIcon scbuttonpic;
            
            if ( overscbutton ) {
                scbuttonpic = new ImageIcon( getClass().getResource( "sc_button_in.jpg") );
            } else {
                scbuttonpic = new ImageIcon( getClass().getResource( "sc_button_out.jpg") );
            }
        
            g.drawImage(scbuttonpic.getImage(), 1050, 110, 200, 60, null);
            }
            
            
        
            
            g.setFont(font1);
            pause();
        
        
    }
    
    
    public void printchatbackground( Graphics g )
    {
        
        ImageIcon chatpic = new ImageIcon( getClass().getResource( "talking_backround.jpg") );
        
        
        g.drawImage(chatpic.getImage(), 185, 30, 710, 380, null);
        
    }
    
    public void printyouhavediedscreen( Graphics g )
    {
        
        ImageIcon youdiedpic = new ImageIcon( getClass().getResource( "youhavedied.jpg") );
        
        
            g.drawImage(youdiedpic.getImage(), 350, 200, 600, 300, null);
            
            
            ImageIcon tryagainpic;
            
            if ( overtryagain ) {
                tryagainpic = new ImageIcon( getClass().getResource( "tryagain_in.jpg") );
            } else {
                tryagainpic = new ImageIcon( getClass().getResource( "tryagain_out.jpg") );
            }
        
            g.drawImage(tryagainpic.getImage(), 450, 400, 150, 80, null);
            
            
            ImageIcon quitpic;
            
            if ( overquit ) {
                quitpic = new ImageIcon( getClass().getResource( "quit_in.jpg") );
            } else {
                quitpic = new ImageIcon( getClass().getResource( "quit_out.jpg") );
            }
        
            g.drawImage(quitpic.getImage(), 700, 400, 150, 80, null);
            
            
            
        
    }
    
    
    
    
    @Override
    public void paintComponent( Graphics g )
    {
        super.paintComponent(g);
        
        
        if ( !onmainscreen ) {
            
            
            if ( onfirstscreen ) {
            
                ImageIcon mainmenu_none = new ImageIcon( getClass().getResource( firstscreen_filename + ".jpg") );
        
        
                g.drawImage(mainmenu_none.getImage(), 0, 0, 1366, 768, null);
            
//                g.setColor(Color.BLACK);
//                g.drawRect(850, 220, 320, 80); // new game
//            
//                g.setColor(Color.BLACK);
//                g.drawRect(910, 330, 190, 80); // load
                
//                g.setColor(Color.BLACK);
//                g.drawRect(930, 440, 150, 80); // exit
                
            }
        
            
            if ( onsecondscreen ) {
            
                ImageIcon history_none = new ImageIcon( getClass().getResource( secondscreen_filename + ".jpg") );
        
        
                g.drawImage(history_none.getImage(), 0, 0, 1366, 768, null);
            
//                g.setColor(Color.BLACK);
//                g.drawRect(850, 620, 340, 80); // begin game
                
        
            
            }
            
            
            return;
        }
        
        
        
        
        
        savefile1.gotweap2_charm.settrigger(savefile1.world1_wizardcom_spokeafternote.gettrigger());
        
        if ( isattacking ) {
            mainperson.attack();
        }
        if ( isattacking2 ) {
            mainperson.attack2();
        }
        
        settilntalker();
        
        currentroom.step(g);
        
        if ( shouldchat ) {
            mainperson.chat();
            shouldchat = false;
        }
        
        
        
        ImageIcon sidebarpic = new ImageIcon( getClass().getResource( "side_menu.jpg") );
        
        
        g.drawImage(sidebarpic.getImage(), 1275, -15, 700, 1000, null);
        
        
        ImageIcon exitpic;
        
        if ( overexit ) {
            exitpic = new ImageIcon( getClass().getResource( "exit_in.jpg") );
        } else {
            exitpic = new ImageIcon( getClass().getResource( "exit_out.jpg") );
        }
        
        g.drawImage(exitpic.getImage(), 1280, -5, 90, 40, null);
        
        
        
        ImageIcon inventorypic;
        
        if ( overinventory ) {
            inventorypic = new ImageIcon( getClass().getResource( "inventory_in.jpg") );
        } else {
            inventorypic = new ImageIcon( getClass().getResource( "inventory_out.jpg") );
        }
        
        g.drawImage(inventorypic.getImage(), 1280, 40, 90, 40, null);
        
        
        ImageIcon savepic;
        
        if ( oversave ) {
            savepic = new ImageIcon( getClass().getResource( "save_in.jpg") );
        } else {
            savepic = new ImageIcon( getClass().getResource( "save_out.jpg") );
        }
        
        g.drawImage(savepic.getImage(), 1280, 85, 90, 40, null);
        
        
        g.setColor(Color.RED);
        
        g.fillRect(0, 0, mainperson.getlife() * 2, 20);
        
        g.setColor(constants.fadedred);
        
        g.fillRect(0, 0, 200, 20);
            
        
        if ( youwoncounter > 0 ) {
            
            g.setColor(new Color(0, 0, 0, youwoncounter));
            g.fillRect(-15, -15, 2000, 2000);
            
            if ( youwoncounter < 255 ) {
                youwoncounter++;
            } else {
                
                g.drawImage(endgamepic.getImage(), -8, -8, 1400, 800, null);
                
                
                exitpic = new ImageIcon( getClass().getResource( "exit_out.jpg") );
                
                g.drawImage(exitpic.getImage(), 1280, -5, 90, 40, null);
                
            }
            
            
            
        }
        
        
        
    }
    
    private class timehand implements ActionListener {
        @Override
        public void actionPerformed( ActionEvent event ) 
        {
            if ( !paused || !onmainscreen ) {
                repaint();
            }
        }
    }
    
    public void warper()
    {
       mainperson.getroom().warp();
    }
    
    
    
    public void settilntalker()
    {
       
        if ( !getsavefile().gotweap_sword.gettrigger() && getsavefile().sostrooms_swordroom_entered.gettrigger() ) {
            
            tilnswords = "Go to Swordvil to get the weapon there.";
            return;
        }
        
        if ( !getsavefile().gotweap_spear.gettrigger() && getsavefile().sostrooms_spearroom_entered.gettrigger() ) {
            
            tilnswords = "Go to Spearvil to get the weapon there.";
            
            return;
        }
        
        if ( !getsavefile().gotweap_bow.gettrigger() && getsavefile().sostrooms_bowroom_entered.gettrigger() ) {
            
            tilnswords = "Go to Bowvil to get the weapon there.";
            
            return;
        }
        
        if ( !getsavefile().gotweap_fireball.gettrigger() && getsavefile().sostrooms_fireroom_entered.gettrigger() ) {
            
            tilnswords = "Go to Firevil to get the weapon there.";
            
            return;
        }
        
        if ( !getsavefile().gotweap_dnag.gettrigger() && getsavefile().sostrooms_dnagroom_entered.gettrigger() ) {
            
            tilnswords = "Go to Dnagvil to get the weapon there.";
            
            return;
        }
        
        if ( !getsavefile().gotweap_gobclaws.gettrigger() && getsavefile().sostrooms_gobroom_entered.gettrigger() ) {
            
            tilnswords = "Go to Gobvil to get the weapon there.";
            
            return;
        }
        
        if ( !getsavefile().gotweap_superhammer.gettrigger() && getsavefile().sostrooms_hammerroom_entered.gettrigger() ) {
            
            tilnswords = "Go to Hammervil to get the weapon there.";
            
            return;
        }
        
        
        if ( getsavefile().gotweap_sword.gettrigger() && getsavefile().gotweap_spear.gettrigger() && getsavefile().gotweap_bow.gettrigger() && getsavefile().gotweap_fireball.gettrigger() && getsavefile().gotweap_dnag.gettrigger() && getsavefile().gotweap_gobclaws.gettrigger() && getsavefile().gotweap_superhammer.gettrigger() &&  !getsavefile().gotweap_sost.gettrigger() ) {
            
            tilnswords = "Go get the Sword of Seven Trials";
            
            
            return;
        }
        
        if ( getsavefile().gotweap_sost.gettrigger() ) {
            
            tilnswords = "Go get the Goblin King!";
            
            
        }
        
        
        
        tilnswords = "You must get the Sword of Seven Trials";
        
    }
    
    
    
    
    public void creater()
    {
        
        if ( onsecondscreen ) {
            created = true;
            readinghistory = false;
            create();
            onsecondscreen = false;
            onfirstscreen = false;
            onmainscreen = true;
        }
        
        if ( onfirstscreen ) {
            readinghistory = true;
            historyread = true;
            onfirstscreen = false;
            onsecondscreen = true;
            onmainscreen = false;
        }
        
        
        
//        if ( !created && historyread ) {
//            created = true;
//            readinghistory = false;
//            create();
//        }
//        if ( !historyread ) {
//            historyread = true;
//            readinghistory = true;
//        }
        
    }
    
    
    private void create()
    {
        
        constants.setpanel(this);
        
        ArrayList<platform> blank1 = new ArrayList<>();
        ArrayList<unit> blank2 = new ArrayList<>();
        
        //<editor-fold defaultstate="collapsed" desc="World1 A">
        AI ai0 = new noai();
        
        firstroom room0 = new firstroom( this, blank1, blank2, mainperson, currentroom );
        
        constants.startingroom = room0;
        
        startroom = room0;
        
        currentroom = room0;
        mainperson = new unit( 100, 0, 5, "hammer", 300, 360, ai0, currentroom.getweap1(), currentroom, 100, 140 );
        mainperson.setroom(currentroom);
        currentroom.setmainperson(mainperson);
        
        mainperson.setWeapon2("blankweap");
        
        room0.setlundtarget(mainperson);
        
        
        room room1 = new world1_exit( this, sky, grass, blank1, blank2, mainperson, currentroom, currentroom, currentroom );
        room1.setleftroom( room1 );
        room1.setmiddleroom( room1 );
        
        
        
        
        
        currentroom.setleftroom(room1);
        currentroom.setmiddleroom(currentroom);
        currentroom.setrightroom(currentroom);
        
        setroom(currentroom);
        
        ai0.setperson(mainperson);
        ai0.settarget(mainperson);
        
        
        
        
        
        
        
        currentroom.setwarproom( room1 );
        
        AI ai1 = new basicai();
        
        ai1.settarget(mainperson);
        
        
        
        
        
        
        platform room0_plat0 = new platform( 450, 330, 300, 170, constants.brown, false, room0.getweap3() );
        room0_plat0.setignoreai(true);
        room0.addplatform(room0_plat0);
        
        platform room0_plat1 = new platform( 520, 420, 50, 80, Color.black, false, room0.getweap3() );
        
        room0_plat1.setSolid(false);
        room0_plat1.setWarppoint(room0);
        room0_plat1.setWarps(true);
        room0_plat1.setWarpx(530);
        room0_plat1.setWarpy(500 - constants.taldoheight());
        
        room0.addplatform(room0_plat1);
        
        room room0_inroom1 = new insideroom( this, constants.brown, Color.DARK_GRAY, blank1, blank2, mainperson, currentroom, currentroom, currentroom );
        
        platform room0_inroom1_plat1 = new platform( 520, 420, 50, 80, Color.black, false, room0.getweap3() );
        
        room0_inroom1_plat1.setSolid(false);
        room0_inroom1_plat1.setWarppoint(room0);
        room0_inroom1_plat1.setWarps(true);
        room0_inroom1_plat1.setWarpx(530);
        room0_inroom1_plat1.setWarpy(500 - constants.taldoheight());
        
        
        
        room0_inroom1.addplatform(room0_inroom1_plat1);
        
        
        room0_plat1.setWarppoint(room0_inroom1);
        room0_inroom1.setroomdim(450, 330, 750, 500);
        
        
        platform room0_plat3 = new platform( 750, 330, 200, 170, constants.darkbrown, false, room0.getweap3() );
        room0_plat3.setignoreai(true);
        room0.addplatform(room0_plat3);
        
        platform room0_plat4 = new platform( 830, 420, 50, 80, Color.black, false, room0.getweap3() );
        
        room0_plat4.setSolid(false);
        room0_plat4.setWarppoint(room0);
        room0_plat4.setWarps(true);
        room0_plat4.setWarpx(850);
        room0_plat4.setWarpy(500 - constants.taldoheight());
        
        room0.addplatform(room0_plat4);
        
        room room0_inroom2 = new world1.forge( this, blank1, blank2, mainperson );
        
        platform room0_inroom2_plat1 = new platform( 830, 420, 50, 80, Color.black, false, room0.getweap3() );
        
        room0_inroom2_plat1.setSolid(false);
        room0_inroom2_plat1.setWarppoint(room0);
        room0_inroom2_plat1.setWarps(true);
        room0_inroom2_plat1.setWarpx(850);
        room0_inroom2_plat1.setWarpy(500 - constants.taldoheight());
        
        
        
        room0_inroom2.addplatform(room0_inroom2_plat1);
        
        
        room0_plat4.setWarppoint(room0_inroom2);
        room0_inroom2.setroomdim(750, 330, 950, 500);
        
        unit w1_room1_sign1 = new sign( 300, 441, room0.getweap3(), room0, "The Great Moving Platform.  Created by the wizard Hilden in the year 777." );
        
        room0.addneutral(w1_room1_sign1);
        
        
        taldobuild.drawtaldo(mainperson);
        
        
        
        
        
        
        
        
        
        
        
        room room2 = new room( this, sky, grass, blank1, blank2, mainperson, currentroom, currentroom, currentroom );
        
        room0.setrightroom(room2);
        room2.setrightroom(room2);
        
        platform room2_plat0 = new platform( 550, 330, 200, 170, constants.brown, false, room2.getweap3() );
        room2.addplatform(room2_plat0);
        
        platform room2_plat1 = new platform( 620, 420, 50, 80, Color.black, false, room2.getweap3() );
        
        room2_plat1.setSolid(false);
        room2_plat1.setWarppoint(room2);
        room2_plat1.setWarps(true);
        room2_plat1.setWarpx(620);
        room2_plat1.setWarpy(500 - constants.taldoheight());
        
        room2.addplatform(room2_plat1);
        
        room room2_inroom1 = new insideroom( this, constants.brown, Color.DARK_GRAY, blank1, blank2, mainperson, currentroom, currentroom, currentroom );
        
        platform room2_inroom1_plat1 = new platform( 620, 420, 50, 80, Color.black, false, room2.getweap3() );
        
        room2_inroom1_plat1.setSolid(false);
        room2_inroom1_plat1.setWarppoint(room2);
        room2_inroom1_plat1.setWarps(true);
        room2_inroom1_plat1.setWarpx(620);
        room2_inroom1_plat1.setWarpy(500 - constants.taldoheight());
        
        
        
        room2_inroom1.addplatform(room2_inroom1_plat1);
        
        
        room2_plat1.setWarppoint(room2_inroom1);
        room2_inroom1.setroomdim(550, 330, 750, 500);
        
        
        unit w1_vil1 = new unit( 100, 0, 5, "handsword", 700, 360, new noai(), room2_inroom1.getweap3(), room2_inroom1, 100, 140 );
        
        w1_vil1.setName("Ondo");
        w1_vil1.setStatement("Hello Taldo.  Did you hear the noise before?");
        
        trigger w1_vil1trig = new trigger( false, "every_jpanel1_spoke_to_ondo" );
        
        chattrigger w1_vil1chats = new chattrigger( constants.truetrigger, w1_vil1trig, true );
        
        w1_vil1chats.addchat("Hello Taldo.  Did you hear the noise before?");
        
        w1_vil1.addchattrigger(w1_vil1chats);
        
        
        chattrigger w1_vil1chats2 = new chattrigger( w1_vil1trig );
        
        w1_vil1chats2.addchat("Hello Taldo.  I just got back from my daily rounds with my shop-cart.");
        
        w1_vil1.addchattrigger(w1_vil1chats2);
        
        
        
        
        w1_vil1build.buildvil1(w1_vil1);
        
        room2_inroom1.addneutral(w1_vil1);
        
        
        room room3 = new room( this, sky, grass, blank1, blank2, mainperson, room2, currentroom, currentroom );
        
        room2.setrightroom(room3);
        room3.setrightroom(room3);
        
        
        
        platform room3_plat0 = new platform( 400, 300, 300, 200, constants.brown, false, room2.getweap3() );
        room3.addplatform(room3_plat0);
        
        platform room3_plat1 = new platform( 520, 420, 50, 80, Color.black, false, room2.getweap3() );
        
        room3_plat1.setSolid(false);
        room3_plat1.setWarppoint(room3);
        room3_plat1.setWarps(true);
        room3_plat1.setWarpx(520);
        room3_plat1.setWarpy(500 - constants.taldoheight());
        
        room3.addplatform(room3_plat1);
        
        room room3_inroom1 = new insideroom( this, constants.brown, Color.DARK_GRAY, blank1, blank2, mainperson, currentroom, currentroom, currentroom );
        
        
        platform room3_inroom1_plat1 = new platform( 520, 420, 50, 80, Color.black, false, room2.getweap3() );
        
        room3_inroom1_plat1.setSolid(false);
        room3_inroom1_plat1.setWarppoint(room3);
        room3_inroom1_plat1.setWarps(true);
        room3_inroom1_plat1.setWarpx(520);
        room3_inroom1_plat1.setWarpy(500 - constants.taldoheight());
        
        room3_inroom1.addplatform(room3_inroom1_plat1);
        
        
        room3_plat1.setWarppoint(room3_inroom1);
        room3_inroom1.setroomdim(400, 300, 700, 500);
        
        unit w1_vil2 = new unit( 100, 0, 5, "handsword", 700, 360, new noai(), room2_inroom1.getweap3(), room2_inroom1, 100, 140 );
        
        w1_vil2.setName("Sarierce");
        w1_vil2.setStatement("Hello Taldo.  That commotion earlier was crazy.  What was it?");
        
        trigger w1_vil2trig = new trigger( false, "every_jpanel1_spoke_to_sarierce" );
        
        chattrigger w1_vil2chats = new chattrigger( constants.truetrigger, w1_vil2trig, true );
        
        w1_vil2chats.addchat("Hello Taldo.  That commotion earlier was crazy.  What was it?");
        
        w1_vil2.addchattrigger(w1_vil2chats);
        
        chattrigger w1_vil2chats2 = new chattrigger( w1_vil2trig );
        
        w1_vil2chats2.addchat("Hello Taldo.  Have you seen my Mother?");
        
        w1_vil2chats2.addchat("I am worried about her.  She has seemed so depressed recently.");
        
        w1_vil2.addchattrigger(w1_vil2chats2);
        
        builders.w1_vil2build.buildvil2(w1_vil2);
        
        room3_inroom1.addneutral(w1_vil2);
        
        
        
        
        
        
        room room4 = new room( this, sky, grass, blank1, blank2, mainperson, room3, currentroom, currentroom );
        
        room3.setrightroom(room4);
        room4.setrightroom(room4);
        
        
        
        platform room4_plat0 = new platform( 300, 200, 500, 300, constants.brown, false, room2.getweap3() );
        room4.addplatform(room4_plat0);
        
        platform room4_plat1 = new platform( 520, 420, 50, 80, Color.black, false, room2.getweap3() );
        
        room4_plat1.setSolid(false);
        room4_plat1.setWarppoint(room4);
        room4_plat1.setWarps(true);
        room4_plat1.setWarpx(520);
        room4_plat1.setWarpy(500 - constants.taldoheight());
        
        room4.addplatform(room4_plat1);
        
        room room4_inroom1 = new world1.elderroom(this, blank1, blank2, mainperson );
        
        
        platform room4_inroom1_plat1 = new platform( 520, 420, 50, 80, Color.black, false, room2.getweap3() );
        
        room4_inroom1_plat1.setSolid(false);
        room4_inroom1_plat1.setWarppoint(room4);
        room4_inroom1_plat1.setWarps(true);
        room4_inroom1_plat1.setWarpx(520);
        room4_inroom1_plat1.setWarpy(500 - constants.taldoheight());
        
        room4_inroom1.addplatform(room4_inroom1_plat1);
        
        
        room4_plat1.setWarppoint(room4_inroom1);
        room4_inroom1.setroomdim(300, 200, 800, 500);
        
        
        
        
        
        room room5 = new world1_replaceheart( this, sky, grass, blank1, blank2, mainperson, room4, currentroom, currentroom );
        
        room4.setrightroom(room5);
        room5.setrightroom(room1);
        room1.setleftroom(room5);
        
        
        
        //</editor-fold>
        
        constants.settaldo(mainperson);
        
        
        
        
        //<editor-fold defaultstate="collapsed" desc="field">
        
        room field_room1 = new field.warp_hamvil(this, constants.sky, constants.field, blank1, blank2, mainperson, room0, room0, room0);
        
        room1.setwarproom(field_room1);
        field_room1.setwarproom(room1);
        
        room field_room2 = new room(this, constants.sky, constants.field, blank1, blank2, mainperson, field_room1, room0, room0);
        
        field_room1.setrightroom(field_room2);
        
        room field_room3 = new room(this, constants.sky, constants.field, blank1, blank2, mainperson, field_room2, room0, room0);
        
        field_room2.setrightroom(field_room3);
        
        room field_room4 = new field.tc3(this, blank1, blank2, mainperson, field_room3, room0, room0);
        
        field_room3.setrightroom(field_room4);
        
        room field_room5 = new field.tc2(this, blank1, blank2, mainperson, field_room4, room0, room0);
        
        field_room4.setrightroom(field_room5);
        
        room field_room5_inroom1 = new field.tent1(this, Color.GRAY, constants.field, blank1, blank2, mainperson, room5, currentroom, field_room5);
        
        field_room5.setwarproom(field_room5_inroom1);
        
        field_room5_inroom1.setroomdim(460, 350, 670, 500);
        
        
        
        
        platform field_room5_inroom1_plat1 = new platform( 540, 420, 50, 80, Color.black, false, room2.getweap3() );
        
        field_room5_inroom1_plat1.setSolid(false);
        field_room5_inroom1_plat1.setWarppoint(field_room5);
        field_room5_inroom1_plat1.setWarps(true);
        field_room5_inroom1_plat1.setWarpx(540);
        field_room5_inroom1_plat1.setWarpy(500 - constants.taldoheight());
        
        field_room5_inroom1.addplatform(field_room5_inroom1_plat1);
        
        room field_room5a = new field.tc1(this, blank1, blank2, mainperson, field_room5, room0, room0);
        
        field_room5.setrightroom(field_room5a);
        
        
        
        room field_room6 = new field.warp_dnagvil(this, constants.sky, constants.field, blank1, blank2, mainperson, field_room5a, room0, room0);
        
        field_room5a.setrightroom(field_room6);
        
        room field_room7 = new field.warp_seven(this, constants.sky, constants.field, blank1, blank2, mainperson, field_room6, room0, room0);
        
        field_room6.setrightroom(field_room7);
        
        room field_room8 = new field.warp_castle(this, constants.sky, constants.field, blank1, blank2, mainperson, field_room7, room0, room0);
        
        
        
        field_room7.setrightroom(field_room8);
        
        room field_room9 = new field.warp_bowvil(this, constants.sky, constants.field, blank1, blank2, mainperson, field_room8, room0, room0);
        
        
        
        field_room8.setrightroom(field_room9);
        
        room field_room10 = new room(this, constants.sky, constants.field, blank1, blank2, mainperson, field_room9, room0, room0);
        
        //################################################
        AI field_room10_bag1_ai1 = new basicai();
                
        field_room10_bag1_ai1.settarget(mainperson);
        
        unit field_room10_bag1 = new bag_1( field_room10_bag1_ai1, field_room10.getweap2(), field_room10, 600, 360 );
        field_room10_bag1_ai1.setperson(field_room10_bag1);
        
        field_room10.addbag(field_room10_bag1);
        //################################################
        
        field_room9.setrightroom(field_room10);
        
        room field_room11 = new room(this, constants.sky, constants.field, blank1, blank2, mainperson, field_room10, room0, room0);
        
        
        field_room10.setrightroom(field_room11);
        
        AI field_room11_bag1_ai1 = new basicai();
                
        field_room11_bag1_ai1.settarget(mainperson);
        
        
        unit field_room11_bag1 = new bag_1( field_room11_bag1_ai1, field_room11.getweap2(), field_room11, 600, 360 );
        field_room11_bag1_ai1.setperson(field_room11_bag1);
        
        field_room11.addbag(field_room11_bag1);
        
        
        
        
        
        
        room field_room12 = new field.warp_gobcave(this, constants.sky, constants.field, blank1, blank2, mainperson, field_room11, room0, room0);
        
        field_room11.setrightroom(field_room12);
        
        
        
        room field_room13 = new room(this, constants.sky, constants.field, blank1, blank2, mainperson, field_room12, room0, room0);
        
        //################################################
        AI field_room13_bag1_ai1 = new basicai();
                
        field_room13_bag1_ai1.settarget(mainperson);
        
        unit field_room13_bag1 = new bag_1( field_room13_bag1_ai1, field_room13.getweap2(), field_room13, 600, 360 );
        field_room13_bag1_ai1.setperson(field_room13_bag1);
        
        field_room13.addbag(field_room13_bag1);
        //################################################
        
        field_room12.setrightroom(field_room13);
        
        room field_room14 = new field.warp_spearvil(this, constants.sky, constants.field, blank1, blank2, mainperson, field_room13, room0, room0);
        
        field_room13.setrightroom(field_room14);
        
        room field_room15 = new field.warp_firevil(this, constants.sky, constants.field, blank1, blank2, mainperson, field_room14, room0, room0);
        
        field_room14.setrightroom(field_room15);
        
        room field_room16 = new room(this, constants.sky, constants.field, blank1, blank2, mainperson, field_room15, room0, room0);
        
        field_room15.setrightroom(field_room16);
        
        
        
        //################################################
        AI field_room16_bag1_ai1 = new basicai();
                
        field_room16_bag1_ai1.settarget(mainperson);
        
        unit field_room16_bag1 = new builders.greenspikeelder( field_room16, 1400, 360, field_room16_bag1_ai1 );
        field_room16_bag1_ai1.setperson(field_room16_bag1);
        
        field_room16.addneutral(field_room16_bag1);
        //################################################
        
        
        
        room field_room17 = new field.warp_blankvil(this, constants.sky, constants.field, blank1, blank2, mainperson, field_room16, room0, room0);
        
        field_room16.setrightroom(field_room17);
        
        room field_room18 = new room(this, constants.sky, constants.field, blank1, blank2, mainperson, field_room17, room0, room0);
        
        //################################################
        AI field_room18_bag1_ai1 = new basicai();
                
        field_room18_bag1_ai1.settarget(mainperson);
        
        unit field_room18_bag1 = new builders.greenspikeelder( field_room18, 1400, 360, field_room18_bag1_ai1 );
        field_room18_bag1_ai1.setperson(field_room18_bag1);
        
        field_room18.addneutral(field_room18_bag1);
        //################################################
        
        
        field_room17.setrightroom(field_room18);
        
        room field_room19 = new field.warp_swordvil(this, constants.sky, constants.field, blank1, blank2, mainperson, field_room18, room0, room0);
        
        field_room18.setrightroom(field_room19);
        
        room field_room20 = new room(this, constants.sky, constants.field, blank1, blank2, mainperson, field_room19, room0, room0);
        
        //################################################
        AI field_room20_bag1_ai1 = new basicai();
                
        field_room20_bag1_ai1.settarget(mainperson);
        
        unit field_room20_bag1 = new builders.greenspikeelder( field_room20, 1400, 360, field_room20_bag1_ai1 );
        field_room20_bag1_ai1.setperson(field_room20_bag1);
        
        field_room20.addneutral(field_room20_bag1);
        //################################################
        
        
        field_room19.setrightroom(field_room20);
        
        field_room1.setleftroom(field_room20);
        field_room20.setrightroom(field_room1);
        
        
        
        
        //</editor-fold>
        
        
        
        world swordvill = new swordvil.swordvillage(mainperson, this);
//        room sword_room0 = new swordvil.warp_field(this, constants.sky, constants.swordvil, blank1, blank2, mainperson, room0, room0, room0);
        
        field_room19.setwarproom(swordvill.getentry());
        swordvill.setexit(field_room19);
        
//        room sword_room1 = new swordvil.room1(this, constants.sky, constants.swordvil, blank1, blank2, mainperson, sword_room0, room0, room0);
        
//        sword_room0.setrightroom(sword_room1);
        
        world spearvill = new spearvil.spearvillage(mainperson, this);
//        room sword_room0 = new swordvil.warp_field(this, constants.sky, constants.swordvil, blank1, blank2, mainperson, room0, room0, room0);
        
        field_room14.setwarproom(spearvill.getentry());
        spearvill.setexit(field_room14);
        
        world firevill = new firevil.firevillage(mainperson, this);
//        room sword_room0 = new swordvil.warp_field(this, constants.sky, constants.swordvil, blank1, blank2, mainperson, room0, room0, room0);
        
        field_room15.setwarproom(firevill.getentry());
        firevill.setexit(field_room15);
        
        world bowvill = new bowvil.bowvillage(mainperson, this);
//        room sword_room0 = new swordvil.warp_field(this, constants.sky, constants.swordvil, blank1, blank2, mainperson, room0, room0, room0);
        
        field_room9.setwarproom(bowvill.getentry());
        bowvill.setexit(field_room9);
        
        world dnagvill = new dnagvil.dnagvillage(mainperson, this);
//        room sword_room0 = new swordvil.warp_field(this, constants.sky, constants.swordvil, blank1, blank2, mainperson, room0, room0, room0);
        
        field_room6.setwarproom(dnagvill.getentry());
        dnagvill.setexit(field_room6);
        
        world penvill = new penvil.penvillage(mainperson, this);
//        room sword_room0 = new swordvil.warp_field(this, constants.sky, constants.swordvil, blank1, blank2, mainperson, room0, room0, room0);
        
        field_room17.setwarproom(penvill.getentry());
        penvill.setexit(field_room17);
        
        
        room0.setwarproom(field_room12);
        
        
        
        
        
    }
    
    
    public boolean load()
    {
        
        pause();
        ObjectInputStream input;
        
        savefile tempsavefile = new savefile();
        
        String name = JOptionPane.showInputDialog(null, "Enter the name of your save file.");
        
        if ( name == null || name.equals("") ) {
            if ( created ) {
                unpause();
            }
            unpause();
            return false;
        }
        
//        creater();
        
        
        
        
        try {
            input = new ObjectInputStream( new FileInputStream( name + ".dum" ) );
            
            
            tempsavefile = ( savefile ) input.readObject();
            
        } catch ( IOException e )
        {
            JOptionPane.showMessageDialog(null, "Invalid save file");
            onmainscreen = false;
            onsecondscreen = false;
            onfirstscreen = true;
            unpause();
            return false;
//            System.exit(0);
        }
        catch ( ClassNotFoundException e2 ) {
            JOptionPane.showMessageDialog(null, " classnotfound-jpanel1.load");
            System.exit(0);
        }
        
        if ( !created ) {
            create();
            
        }
        
        savefile1 = tempsavefile;
        
        setroom( startroom );
        
        mainperson.setMainweapon(savefile1.taldoweapon);
        mainperson.setlife(savefile1.taldolife);
        mainperson.setcenterx(500);
        mainperson.sety(500 - constants.taldoheight());
        
        JOptionPane.showMessageDialog(null, "Game loaded");
        unpause();
        return true;
    }
    
    
    public void save()
    {
        pause();
        ObjectOutputStream output;
        
        savefile1.setTaldolife(mainperson.getlife());
        savefile1.setTaldoweapon(mainperson.getMainweapon());
        
        String name = JOptionPane.showInputDialog(null, "Enter the name of your save file.");
        
        if ( name == null || name.equals("") ) {
            unpause();
            return;
        }
        
        try {
            output = new ObjectOutputStream( new FileOutputStream( name + ".dum" ) );
            
            output.writeObject(this.getsavefile());
            
            output.close();
            
            
        } catch ( IOException ioException )
        {
            JOptionPane.showMessageDialog(null, " ioexception-jpanel1.save");
            System.exit(0);
        }
        catch ( NoSuchElementException elementException ) {
            JOptionPane.showMessageDialog(null, " nosuchelement-jpanel1.save");
            System.exit(0);
        }
        
        JOptionPane.showMessageDialog(null, "Game saved");
        unpause();
        
    }
    
    
    
    
}
