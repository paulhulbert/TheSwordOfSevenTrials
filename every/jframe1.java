/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package every;

import javax.swing.JFrame;
import javax.swing.Timer;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Cursor;
/**
 *
 * @author Dad
 */
public class jframe1 extends JFrame{
    private jpanel1 pan;
    
    private int cheatstep;
    
    
    public jframe1()
    {
        super("Taldo");
        
        cheatstep = 0;
        
        pan = new jpanel1();
        
        
        add( pan );
        
        
        this.setLocation(-5, -30);
        this.setSize(1382, 1000);
        
        
//        this.setCursor(new Cursor( 12 ));
        
//        this.setResizable(false);
        
        addKeyListener( new keyhand() );
        this.addMouseListener(new mousehand() );
        this.addMouseMotionListener(new mousehand());
    }
    
    
    
    private class mousehand extends MouseAdapter {
        
        @Override
        public void mouseReleased( MouseEvent event )
        {
            
            pan.setOverexit(false);
            pan.setOverinventory(false);
            pan.setOversave(false);
            pan.setOverquit(false);
            pan.setOvertryagain(false);
            
            pan.overhammerbutton = false;
            pan.overswordbutton = false;
            pan.overbowbutton = false;
            pan.overspearbutton = false;
            pan.overfirebutton = false;
            pan.overdinagbutton = false;
            pan.overgobclawsbutton = false;
            pan.oversuperhammerbutton = false;
            pan.oversostbutton = false;
            pan.overscbutton = false;
            pan.overbombsbutton = false;
            
            if ( pan.getcurrentroom().toobjectives ) {
                pan.repaint();
            }
            
            pan.clicker(event.getX() - 8, event.getY() - 30);
            
            int evntx = event.getX() - 8;
            int evnty = event.getY() - 30;
            
            if ( evntx > 850 && evntx < 1170 && evnty > 220 && evnty < 300 ) { // new game
                if ( pan.onfirstscreen ) {
                    pan.creater();
                }
            }
            
            if ( evntx > 930 && evntx < 1080 && evnty > 440 && evnty < 520 ) { // exit
                if ( pan.onfirstscreen ) {
                    System.exit(0);
                }
            }
            
            if ( evntx > 850 && evntx < 1190 && evnty > 620 && evnty < 700 ) { // begin game
                if ( pan.onsecondscreen ) {
                    pan.creater();
                }
            }
            
            if ( evntx > 910 && evntx < 1100 && evnty > 330 && evnty < 410 ) { // load
                if ( !pan.onfirstscreen ) {
                    return;
                }
                
                boolean load = pan.load();
                
                if ( load == false ) {
                    return;
                }
                
                pan.onfirstscreen = false;
                pan.onsecondscreen = false;
                pan.onmainscreen = true;
//                pan.historyread = true;
                pan.created = true;
            }
            
        }
        
        @Override
        public void mouseDragged( MouseEvent event )
        {
            
            int evntx = event.getX() - 8;
            int evnty = event.getY() - 30;
            
            if ( pan.getcurrentroom().toobjectives ) {
                pan.repaint();
            }
            
            
            if ( !pan.onfirstscreen && !pan.onsecondscreen ) {
                
                
                if ( evntx > 1280 && evntx < 1370 && evnty > -5 && evnty < 35 ) { // new game
                    
                    pan.setOverexit(true);
                    
                } else {
                    pan.setOverexit(false);
                }
                
                
                if ( evntx > 1280 && evntx < 1370 && evnty > 40 && evnty < 80 ) { // new game
                    
                    pan.setOverinventory(true);
                    
                } else {
                    pan.setOverinventory(false);
                }
                
                if ( evntx > 1280 && evntx < 1370 && evnty > 85 && evnty < 125 ) { // new game
                    
                    pan.setOversave(true);
                    
                } else {
                    pan.setOversave(false);
                }
                
                
                if ( evntx > 450 && evntx < 600 && evnty > 400 && evnty < 480 ) { // new game
                    
                    pan.setOvertryagain(true);
                    
                } else {
                    pan.setOvertryagain(false);
                }
                
                if ( evntx > 700 && evntx < 850 && evnty > 400 && evnty < 480 ) { // new game
                    
                    pan.setOverquit(true);
                    
                } else {
                    pan.setOverquit(false);
                }
                
                
                
                
                
                
                
                
                
                
                if ( pan.getcurrentroom().toobjectives ) {
                    
                    if ( evntx > 100 && evntx < 300 && evnty > 110 && evnty < 170 ) { // hammer
                        
                        pan.setOverhammerbutton(true);
                        
                    } else {
                        pan.setOverhammerbutton(false);
                    }
                    
                    
                    if ( evntx > 100 && evntx < 300 && evnty > 180 && evnty < 240 ) { // sword
                        
                        pan.setOverswordbutton(true);
                        
                    } else {
                        pan.setOverswordbutton(false);
                    }
                    
                    
                    if ( evntx > 100 && evntx < 300 && evnty > 250 && evnty < 310 ) { // spear
                        
                        pan.setOverspearbutton(true);
                        
                    } else {
                        pan.setOverspearbutton(false);
                    }
                    
                    
                    if ( evntx > 100 && evntx < 300 && evnty > 320 && evnty < 380 ) { // bow
                        
                        pan.setOverbowbutton(true);
                        
                    } else {
                        pan.setOverbowbutton(false);
                    }
                    
                    
                    if ( evntx > 100 && evntx < 300 && evnty > 390 && evnty < 450 ) { // fire stone
                        
                        pan.setOverfirebutton(true);
                        
                    } else {
                        pan.setOverfirebutton(false);
                    }
                    
                    
                    if ( evntx > 100 && evntx < 300 && evnty > 460 && evnty < 520 ) { // dinag
                        
                        pan.setOverdinagbutton(true);
                        
                    } else {
                        pan.setOverdinagbutton(false);
                    }
                    
                    
                    if ( evntx > 100 && evntx < 300 && evnty > 530 && evnty < 590 ) { // gobclaws
                        
                        pan.setOvergobclawsbutton(true);
                        
                    } else {
                        pan.setOvergobclawsbutton(false);
                    }
                    
                    
                    if ( evntx > 100 && evntx < 300 && evnty > 600 && evnty < 660 ) { // superhammer
                        
                        pan.setOversuperhammerbutton(true);
                        
                    } else {
                        pan.setOversuperhammerbutton(false);
                    }
                    
                    
                    if ( evntx > 100 && evntx < 300 && evnty > 670 && evnty < 730 ) { // sost
                        
                        pan.setOversostbutton(true);
                        
                    } else {
                        pan.setOversostbutton(false);
                    }
                    
                    
                    if ( evntx > 1050 && evntx < 1250 && evnty > 110 && evnty < 170 ) { // sost
                        
                        pan.setOverscbutton(true);
                        
                    } else {
                        pan.setOverscbutton(false);
                    }
                    
                    
                    if ( evntx > 1050 && evntx < 1250 && evnty > 180 && evnty < 240 ) { // sost
                        
                        pan.setOverbombsbutton(true);
                        
                    } else {
                        pan.setOverbombsbutton(false);
                    }
                    
                    
                    
                    
                    
                }
                
                
            }
        }
        
        @Override
        public void mousePressed( MouseEvent event )
        {
            
            int evntx = event.getX() - 8;
            int evnty = event.getY() - 30;
            
            if ( pan.getcurrentroom().toobjectives ) {
                pan.repaint();
            }
            
            
            if ( !pan.onfirstscreen && !pan.onsecondscreen ) {
                
                
                if ( evntx > 1280 && evntx < 1370 && evnty > -5 && evnty < 35 ) { // new game
                    
                    pan.setOverexit(true);
                    
                } else {
                    pan.setOverexit(false);
                }
                
                
                if ( evntx > 1280 && evntx < 1370 && evnty > 40 && evnty < 80 ) { // new game
                    
                    pan.setOverinventory(true);
                    
                } else {
                    pan.setOverinventory(false);
                }
                
                if ( evntx > 1280 && evntx < 1370 && evnty > 85 && evnty < 125 ) { // new game
                    
                    pan.setOversave(true);
                    
                } else {
                    pan.setOversave(false);
                }
                
                
                if ( evntx > 450 && evntx < 600 && evnty > 400 && evnty < 480 ) { // new game
                    
                    pan.setOvertryagain(true);
                    
                } else {
                    pan.setOvertryagain(false);
                }
                
                if ( evntx > 700 && evntx < 850 && evnty > 400 && evnty < 480 ) { // new game
                    
                    pan.setOverquit(true);
                    
                } else {
                    pan.setOverquit(false);
                }
                
                
                
                
                
                
                
                
                
                
                if ( pan.getcurrentroom().toobjectives ) {
                    
                    if ( evntx > 100 && evntx < 300 && evnty > 110 && evnty < 170 ) { // hammer
                        
                        pan.setOverhammerbutton(true);
                        
                    } else {
                        pan.setOverhammerbutton(false);
                    }
                    
                    
                    if ( evntx > 100 && evntx < 300 && evnty > 180 && evnty < 240 ) { // sword
                        
                        pan.setOverswordbutton(true);
                        
                    } else {
                        pan.setOverswordbutton(false);
                    }
                    
                    
                    if ( evntx > 100 && evntx < 300 && evnty > 250 && evnty < 310 ) { // spear
                        
                        pan.setOverspearbutton(true);
                        
                    } else {
                        pan.setOverspearbutton(false);
                    }
                    
                    
                    if ( evntx > 100 && evntx < 300 && evnty > 320 && evnty < 380 ) { // bow
                        
                        pan.setOverbowbutton(true);
                        
                    } else {
                        pan.setOverbowbutton(false);
                    }
                    
                    
                    if ( evntx > 100 && evntx < 300 && evnty > 390 && evnty < 450 ) { // fire stone
                        
                        pan.setOverfirebutton(true);
                        
                    } else {
                        pan.setOverfirebutton(false);
                    }
                    
                    
                    if ( evntx > 100 && evntx < 300 && evnty > 460 && evnty < 520 ) { // dinag
                        
                        pan.setOverdinagbutton(true);
                        
                    } else {
                        pan.setOverdinagbutton(false);
                    }
                    
                    
                    if ( evntx > 100 && evntx < 300 && evnty > 530 && evnty < 590 ) { // gobclaws
                        
                        pan.setOvergobclawsbutton(true);
                        
                    } else {
                        pan.setOvergobclawsbutton(false);
                    }
                    
                    
                    if ( evntx > 100 && evntx < 300 && evnty > 600 && evnty < 660 ) { // superhammer
                        
                        pan.setOversuperhammerbutton(true);
                        
                    } else {
                        pan.setOversuperhammerbutton(false);
                    }
                    
                    
                    if ( evntx > 100 && evntx < 300 && evnty > 670 && evnty < 730 ) { // sost
                        
                        pan.setOversostbutton(true);
                        
                    } else {
                        pan.setOversostbutton(false);
                    }
                    
                    
                    if ( evntx > 1050 && evntx < 1250 && evnty > 110 && evnty < 170 ) { // sost
                        
                        pan.setOverscbutton(true);
                        
                    } else {
                        pan.setOverscbutton(false);
                    }
                    
                    
                    if ( evntx > 1050 && evntx < 1250 && evnty > 180 && evnty < 240 ) { // sost
                        
                        pan.setOverbombsbutton(true);
                        
                    } else {
                        pan.setOverbombsbutton(false);
                    }
                    
                    
                    
                    
                    
                }
                
                
            }
        }
        
        @Override
        public void mouseMoved( MouseEvent event )
        {
            
            int evntx = event.getX() - 8;
            int evnty = event.getY() - 30;
            
            if ( pan.getcurrentroom().toobjectives ) {
                pan.repaint();
            }
            
            pan.setOverexit(false);
            pan.setOverinventory(false);
            pan.setOversave(false);
            pan.setOverquit(false);
            pan.setOvertryagain(false);
            
            pan.overhammerbutton = false;
            pan.overswordbutton = false;
            pan.overbowbutton = false;
            pan.overspearbutton = false;
            pan.overfirebutton = false;
            pan.overdinagbutton = false;
            pan.overgobclawsbutton = false;
            pan.oversuperhammerbutton = false;
            pan.oversostbutton = false;
            pan.overscbutton = false;
            pan.overbombsbutton = false;
            
            
            if ( evntx > 850 && evntx < 1170 && evnty > 220 && evnty < 300 ) { // new game
                if ( pan.onfirstscreen ) {
//                    pan.creater();
                    
                    pan.setfirstscreen_filename("startmenu_newgame");
                    return;
                }
            }
            
            if ( evntx > 930 && evntx < 1080 && evnty > 440 && evnty < 520 ) { // exit
                if ( pan.onfirstscreen ) {
//                    System.exit(0);
                    
                    pan.setfirstscreen_filename("startmenu_exit");
                    return;
                }
            }
            
            if ( evntx > 850 && evntx < 1190 && evnty > 620 && evnty < 700 ) { // begin game
                if ( pan.onsecondscreen ) {
//                    pan.creater();
                    
                    pan.setsecondscreen_filename("history_gold");
                    
                    return;
                }
            }
            
            if ( evntx > 910 && evntx < 1100 && evnty > 330 && evnty < 410 ) { // load
                if ( pan.onfirstscreen ) {
                    
                    pan.setfirstscreen_filename("startmenu_load");
                    
                    return;
                }
//                
//                boolean load = pan.load();
//                
//                if ( load == false ) {
//                    return;
//                }
//                
//                pan.onfirstscreen = false;
//                pan.onsecondscreen = false;
//                pan.onmainscreen = true;
////                pan.historyread = true;
//                pan.created = true;
            }
            
            if ( pan.onfirstscreen ) {
                pan.setfirstscreen_filename("startmenu_none");
            }
            if ( pan.onsecondscreen ) {
                pan.setsecondscreen_filename("history_black");
            }
            
            
        }
        
        
    }
    
    private class keyhand extends KeyAdapter {
        
        public void keyPressed( KeyEvent event )
        {
            if ( pan.getmainperson().getdead() ) {
                return;
            }
            
//            if ( event.getKeyCode() == 192 ) {
//                pan.cheat();
//                cheatstep = 1;
//            }
//            
            
            if ( cheatstep == 4 ) {
                if ( event.getKeyCode() == 76 ) {
                    pan.cheat();
                } else {
                    cheatstep = 0;
                }
            }
            if ( cheatstep == 3 ) {
                if ( event.getKeyCode() == 85 ) {
                    cheatstep = 4;
                } else {
                    cheatstep = 0;
                }
            }
            if ( cheatstep == 2 ) {
                if ( event.getKeyCode() == 65 ) {
                    cheatstep = 3;
                } else {
                    cheatstep = 0;
                }
            }
            if ( cheatstep == 1 ) {
                if ( event.getKeyCode() == 80 ) {
                    cheatstep = 2;
                } else {
                    cheatstep = 0;
                }
            }
            if ( event.getKeyCode() == 192 ) {
//                pan.cheat();
                cheatstep = 1;
            }
            
            
            
            
            
            
            
            
            if ( event.getKeyCode() == 37 ) {
                pan.getmainperson().goleft();
            }
            if ( event.getKeyCode() == 39 ) {
                pan.getmainperson().goright();
            }
            if ( event.getKeyCode() == 38 ) {
                pan.getmainperson().jump();
            }
            if ( event.getKeyCode() == 65 ) {
                pan.attackon();
            }
            if ( event.getKeyCode() == 83 ) {
                pan.attack2on();
            }
            if ( event.getKeyCode() == 10 ) {
                pan.warper();
            }
            if ( event.getKeyCode() == 87 ) {
                if ( !pan.getpaused() ) {
                    pan.getmainperson().getroom().settoobjectives(true);
                }
                else {
                    pan.unpause();
                    pan.resetchat();
                }
            }
            if ( event.getKeyCode() == 81 ) {
                if ( !pan.getpaused() ) {
                    pan.getmainperson().chat();
                }
                else {
                    pan.unpause();
                    pan.getmainperson().chat();
                }
            }
            
            
        }
        
        public void keyReleased( KeyEvent event )
        {
            if ( event.getKeyCode() == 37 ) {
                pan.getmainperson().stopleft();
            }
            if ( event.getKeyCode() == 39 ) {
                pan.getmainperson().stopright();
            }
            if ( event.getKeyCode() == 65 ) {
                pan.attackoff();
            }
            if ( event.getKeyCode() == 83 ) {
                pan.attack2off();
            }
            
        }
        
    }
    
        
    
    
        
    
}
