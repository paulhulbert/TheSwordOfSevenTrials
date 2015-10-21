/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package every;


import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.ImageIcon;


/**
 *
 * @author Dad
 */
public class room {
    
    
    protected boolean loaded;
    private unit loadchat;
    
    protected chattrigger tilntalk;
    
    private unit tiln;
    
    public boolean usedtiln = false;
    
    protected int warpx;
    protected int warpy;  //used by subclasses
    
    
    private jpanel1 panel1;
    protected Color background;
    private Color base;
    protected ArrayList<platform> terrain;
    
    protected String speak;
    protected boolean tospeak;
    protected int currentchat;
    
    public ArrayList<unit> bags;
    
    public ArrayList<unit> neutral;
    
    protected ArrayList<weapon> weap1;
    protected ArrayList<weapon> weap2;
    protected ArrayList<weapon> weap3;
    
    protected ArrayList<hurtpoint> hurtpoints;
    
    public boolean toobjectives = false;
    
    protected room leftroom;
    protected room rightroom;
    protected room uproom1;
    protected room downroom1;
    protected room uproom2;
    protected room downroom2;
    protected room middleroom;
    protected String nameis;
    
    protected figure talkfig;
    
    protected unit mainchar;
    
    protected boolean online;
    
    public room( jpanel1 panel, Color background, Color base, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom )
    {
        panel1 = panel;
        this.background = background;
        this.base = base;
        this.terrain = new ArrayList<platform>();
        this.bags = new ArrayList<unit>();
        
        tospeak = false;
        speak = "";
        nameis = "";
        currentchat = 0;
        loaded = false;
        loadchat = maincharacter;
        
        talkfig = null;
        
        mainchar = maincharacter;
        
        this.leftroom = leftroom;
        this.rightroom = rightroom;
        this.middleroom = middleroom;
        
        uproom1 = null;
        downroom1 = null;
        uproom2 = null;
        downroom2 = null;
        
        weap1 = new ArrayList<weapon>();
        weap2 = new ArrayList<weapon>();
        weap3 = new ArrayList<weapon>();
        
        weap1.add( new blankweap(1, 1, 1 ) );
        weap2.add( new blankweap(1, 1, 1 ) );
        weap3.add( new blankweap(1, 1, 1 ) );
        
        hurtpoints = new ArrayList<hurtpoint>();
        
        hurtpoints.add( new hurtpoint( 1, 1, 0, mainchar ) );
        
        neutral = new ArrayList<unit>();
        
        neutral.add( new unit( 1, 0, 0, "sword", 1000000, 100000000, new noai(), weap3, this, 100, 140 ) );
        
        
        
        online = false;
        
        platform qwe = new platform( -20, 500, 3000, 400, base, false, new ArrayList<weapon>() );
        
        addplatform(qwe);
        
        
        
    }
    
    
    public void taldorespawn()
    {
        settaldorespawn();
        
        constants.gobdun_bossroom.notifytaldodead();
        
        mainchar.setlife(75);
        
        panel1.setroom(getpanel().gettaldorespawn());
        online = false;
        getpanel().gettaldorespawn().onscreen(true);
        mainchar.setcenterx( 300 );
        mainchar.sety(500 - constants.taldoheight());
        
        mainchar.resettaldo();
        
    }
    
    
    public void setladder( room targ )
    {
        
    }
    
    
    public void setloadchat( unit u )
    {
        loadchat = u;
        loaded = true;
        panel1.chatit();
    }

    public int getWarpx() {
        return warpx;
    }

    public void setWarpx(int warpx) {
        this.warpx = warpx;
    }

    public int getWarpy() {
        return warpy;
    }

    public void setWarpy(int warpy) {
        this.warpy = warpy;
    }
    
    public unit chatter()
    {
        if ( loaded ) {
            loaded = false;
            return loadchat;
        }
        for ( int c = 0; c < neutral.size(); c++ ) {
            if ( !neutral.get(c).getdead() && mainchar.getfig().infigure(neutral.get(c).getfig()) ) {
                return neutral.get(c);
            }
        }
        
        for ( int c = 0; c < bags.size(); c++ ) {
            if ( !bags.get(c).getdead() && mainchar.getfig().infigure(bags.get(c).getfig()) ) {
                return bags.get(c);
            }
        }
        
        
        return null;
        
    }
    
    
    public ArrayList<weapon> getweap1()
    {
        return weap1;
    }
    
    public ArrayList<weapon> getweap2()
    {
        return weap2;
    }
    
    public ArrayList<weapon> getweap3()
    {
        return weap3;
    }
    
    public void onscreen( boolean value )
    {
        online = value;
        mainchar.setweapons(weap1);
        extrainit();
    }
    
    public void addplatform( platform plat )
    {
        terrain.add(plat);
    }
    
    public void addplatform( int x, int y, int wide, int tall, Color col, boolean step )
    {
        terrain.add(new platform( x, y, wide, tall, col, step, weap3));
        
    }
    
    public void addbag( unit badguy )
    {
        bags.add(badguy);
    }
    
    public void addbag( int life, int def, int speed, String Weapon, int x, int y, AI ai )
    {
        bags.add( new unit( life, def, speed, Weapon, x, y, ai, weap2, this, 100, 140 ) );
        
    }
    
    public void addneutral( unit badguy )
    {
        neutral.add(badguy);
    }
    
    public void addtiln( unit badguy )
    {
        tiln = badguy;
        neutral.add(badguy);
        
        tilntalk = new chattrigger( constants.truetrigger );
        
        tilntalk.addchat(getpanel().getTilnswords());
        tiln.addchattrigger( tilntalk );
    }
    
    public void removetiln()
    {
        
        for ( int c = 0; c < neutral.size(); c++ ) {
            
            if ( neutral.get(c).getName().equals("Wizard Tiln's Image") ) {
                neutral.remove(c);
                break;
            }
            
        }
        
    }
    
    public void addneutral( int life, int def, int speed, String Weapon, int x, int y, AI ai )
    {
        neutral.add( new unit( life, def, speed, Weapon, x, y, ai, weap2, this, 100, 140 ) );
        
    }
    
    public int getpersonon( unit person )
    {
        
        for ( int c = 0; c < terrain.size(); c++ ) {
            
            if ( !terrain.get(c).isSolid() ) {
                continue;
            }
            if ( person.getrightx() > terrain.get(c).getx1() && person.getleftx() < terrain.get(c).getx2() ) {
                if ( person.gety() + person.getfig().getlength() == terrain.get(c).gety() ) {
                    return c;
                }
            }
            
        }
        
        
        return -1;
    }
    
    
    
    
    public int getnearestplatx( unit u )
    {
        if ( u.getmomenty() != 0 ) {
            return -1;
        }
        
        int smallest = 999999;
        int closest = -1;
        
        for ( int c = 1; c < terrain.size(); c++ ) {
            if ( c == u.getcurrentplat() || terrain.get(c).getignoreai() ) {
                continue;
            }
            
//            if ( terrain.get(c).getx1() > terrain.get(u.getcurrentplat()).getx2() + 2150 ) {
//                continue;
//            }
//            
//            if ( terrain.get(c).getx2() < terrain.get(u.getcurrentplat()).getx1() - 2150 ) {
//                continue;
//            }
            
            
            if ( constants.distance(terrain.get(c).getx1(), 0, u.getcenterx(), 0) < smallest && constants.distance(0, u.gety() + u.getfig().getlength(), 0, terrain.get(c).gety()) < 70 && terrain.get(c).isSolid() && terrain.get(c).gety() < u.gety() + u.getfig().getlength() ) {
                smallest = constants.distance(terrain.get(c).getx1(), 0, u.getcenterx(), 0);
                closest = c;
            }
            
            if ( constants.distance(terrain.get(c).getx2(), 0, u.getcenterx(), 0) < smallest && constants.distance(0, u.gety() + u.getfig().getlength(), 0, terrain.get(c).gety()) < 70 && terrain.get(c).isSolid() && terrain.get(c).gety() < u.gety() + u.getfig().getlength() ) {
                smallest = constants.distance(terrain.get(c).getx1(), 0, u.getcenterx(), 0);
                closest = c;
            }
        }
        
        if ( smallest == 999999 ) {
            return -1;
        }
        
        
        int a = terrain.get(closest).getx2() - terrain.get(closest).getx1();
        
        a /= 2;
        
        a += terrain.get(closest).getx1();
        
        return a;
    }
    
    
    
    
    public int getnearestplaty( unit u )
    {
        if ( u.getmomenty() != 0 ) {
            return -1;
        }
        
        int smallest = 999999;
        int closest = -1;
        
        for ( int c = 1; c < terrain.size(); c++ ) {
            if ( c == u.getcurrentplat() ) {
                continue;
            }
            if ( constants.distance(terrain.get(c).getx1(), 0, u.getcenterx(), 0) < smallest && constants.distance(0, u.gety() + u.getfig().getlength(), 0, terrain.get(c).gety()) < 70 && terrain.get(c).isSolid() && terrain.get(c).gety() < u.gety() + u.getfig().getlength() ) {
                smallest = constants.distance(terrain.get(c).getx1(), 0, u.getcenterx(), 0);
                closest = c;
            }
            
            if ( constants.distance(terrain.get(c).getx2(), 0, u.getcenterx(), 0) < smallest && constants.distance(0, u.gety() + u.getfig().getlength(), 0, terrain.get(c).gety()) < 70 && terrain.get(c).isSolid() && terrain.get(c).gety() < u.gety() + u.getfig().getlength() ) {
                smallest = constants.distance(terrain.get(c).getx1(), 0, u.getcenterx(), 0);
                closest = c;
            }
        }
        
        if ( smallest == 999999 ) {
            return -1;
        }
        
        
        int a = terrain.get(closest).gety();
        
        return a;
    }

    
    
    
    
    public void draw( Graphics g )
    {
        panel1.setBackground(background);
        
        
    }
    
    public void setmainperson( unit person )
    {
        mainchar = person;
    }
    
    public void setleftroom( room left )
    {
        leftroom = left;
        
    }

    public room getDownroom1() {
        return downroom1;
    }

    public void setDownroom1(room downroom1) {
        this.downroom1 = downroom1;
    }

    public room getDownroom2() {
        return downroom2;
    }

    public void setDownroom2(room downroom2) {
        this.downroom2 = downroom2;
    }

    public room getUproom1() {
        return uproom1;
    }

    public void setUproom1(room uproom1) {
        this.uproom1 = uproom1;
    }

    public room getUproom2() {
        return uproom2;
    }

    public void setUproom2(room uproom2) {
        this.uproom2 = uproom2;
    }
    
    
    
    public platform getterrainat( int index )
    {
        return terrain.get(index);
    }
    
    public void setrightroom( room right )
    {
        rightroom = right;
    }
    
    public void setmiddleroom( room middle )
    {
        middleroom = middle;
    }
    
    public void settoobjectives( boolean b ) {
        toobjectives = b;
    }
    
    public void setcurrentchat( int num )
    {
        currentchat = num;
    }
    
    public void talkperson( unit person )
    {
        if ( person.getstatenum() <= currentchat ) {
            panel1.unpause();
            currentchat = 0;
            return;
        }
        speak = person.getstatements( currentchat );
        tospeak = true;
        talkfig = person.getfig();
        nameis = person.getName();
        currentchat++;
        
    }
    
    
    public void clickit( int x, int y ) {
        
        
        
        
        if ( !toobjectives ) {
            return;
        }
        
        int weaps = panel1.getWeapearned();
        
        
        if ( x > 100 && x < 300 && y > 110 && y < 170 ) {
            mainchar.setMainweapon("hammer");
            
        }
            
            
            
        if ( panel1.getsavefile().gotweap_sword.gettrigger() ) {
            if ( x > 100 && x < 300 && y > 180 && y < 240 ) {
                mainchar.setMainweapon("handsword");
            }
        }
        
        if ( panel1.getsavefile().gotweap_spear.gettrigger() ) {
            if ( x > 100 && x < 300 && y > 250 && y < 310 ) {
                mainchar.setMainweapon("spear");
            }
        }
        
        if ( panel1.getsavefile().gotweap_bow.gettrigger() ) {
            if ( x > 100 && x < 300 && y > 320 && y < 380 ) {
                mainchar.setMainweapon("bow");
            }
        }
        
        if ( panel1.getsavefile().gotweap_fireball.gettrigger() ) {
            if ( x > 100 && x < 300 && y > 390 && y < 450 ) {
                mainchar.setMainweapon("fireball");
            }
        }
        
        if ( panel1.getsavefile().gotweap_gobclaws.gettrigger() ) {
            if ( x > 100 && x < 300 && y > 460 && y < 520 ) {
                mainchar.setMainweapon("dnag");
            }
        }
        
        if ( panel1.getsavefile().gotweap_dnag.gettrigger() ) {
            if ( x > 100 && x < 300 && y > 530 && y < 590 ) {
                mainchar.setMainweapon("gobclaws_taldo");
            }
        }
        
        if ( panel1.getsavefile().gotweap_superhammer.gettrigger() ) {
            if ( x > 100 && x < 300 && y > 600 && y < 660 ) {
                mainchar.setMainweapon("superhammer");
            }
        }
        
        if ( panel1.getsavefile().gotweap_sost.gettrigger() ) {
            if ( x > 100 && x < 300 && y > 670 && y < 730 ) {
                mainchar.setMainweapon("sost");
            }
        }
        
        
        
        if ( x > 1050 && x < 1250 && y > 110 && y < 170 && panel1.getsavefile().gotweap2_charm.gettrigger() ) {
            mainchar.setWeapon2("Tiln");
            
        }
        
        if ( x > 1050 && x < 1250 && y > 180 && y < 240 && panel1.getsavefile().gotweap2_bomb.gettrigger() ) {
            mainchar.setWeapon2("bomb");
        }
        
    }
    
    public unit getmainchar()
    {
        return mainchar;
    }
    
    public ArrayList<platform> getterrain()
    {
        return terrain;
    }
    
    public void paintextra( Graphics g )
    {
        
        
    }
    
    public void paintextraover( Graphics g )
    {
        
    }
    
    public void extrastuff( Graphics g )
    {
        
        
    }
    
    public void setwarproom( room targ )
    {
        
    }
    
    public void extrainit()
    {
        
    }
    
    public void settrapdoor( room r )
    {
        
    }
    
    public void step( Graphics g )
    {
        
        
        
        if ( toobjectives ) {
            
            getpanel().printweaponscreen(g);
            
            
            return;
            
        }
        
        if ( panel1.getpaused() ) {
            return;
        }
        
        for ( int c = 0; c < terrain.size(); c++ ) {
            
        
            if ( terrain.get(c).isladder ) {
                terrain.get(c).drawladder(g);
            }
        }
        
        
        paintextra( g );
        
        
        for ( int c = 0; c < terrain.size(); c++ ) {
            
            terrain.get(c).step(g);
            terrain.get(c).inplatform(mainchar);
            
            for ( int z = 0; z < bags.size(); z++ ) {
                terrain.get(c).inplatform(bags.get(z));
            }
            
            for ( int x = 0; x < bags.size(); x++ ) {
                terrain.get(c).inplatform(bags.get(x));
            }
        
        }
        
        for ( int c = 0; c < neutral.size(); c++ ) {
            neutral.get(c).step(g);
            if ( neutral.get(c).name.equals("bomb") && neutral.get(c).getlife() <= 0 ) {
                neutral.remove(c);
                c--;
            }
        }
        
        
        
        for ( int c = 0; c < weap2.size(); c++ ) {
            weap2.get(c).step(g);
            if ( !weap2.get(c).getactive() ) {
                weap2.remove(c);
                continue;
            }
            if ( mainchar.getfig().infigure( weap2.get(c).getfigure() )) {
                mainchar.hit(weap2.get(c));
            }
            
        }
        
        for ( int c = 0; c < bags.size(); c++ ) {
            bags.get(c).step(g);
            
        }
        
        for ( int c = 0; c < weap3.size(); c++ ) {
            weap3.get(c).step(g);
            if ( !weap3.get(c).getactive() ) {
                weap3.remove(c);
                continue;
            }
            if ( mainchar.getfig().infigure( weap3.get(c).getfigure() )) {
                mainchar.hit(weap3.get(c));
            }
            for ( int d = 0; d < bags.size(); d++ ) {
                if ( bags.get(d).getfig().infigure( weap3.get(c).getfigure() )) {
                    bags.get(d).hit(weap3.get(c));
                }
                
            }
        }
        
        for ( int c = 0; c < weap1.size(); c++ ) {
            weap1.get(c).step(g);
            if ( !weap1.get(c).getactive() ) {
                weap1.remove(c);
                continue;
            }
            for ( int d = 0; d < bags.size(); d++ ) {
                if ( bags.get(d).getfig().infigure( weap1.get(c).getfigure() )) {
                    bags.get(d).hit(weap1.get(c));
                }
                
            }
        }
        
        for ( int c = 0; c < hurtpoints.size(); c++ ) {
            
            
            
            if ( mainchar.getfig().infigure(hurtpoints.get(c).getx(), hurtpoints.get(c).gety()) && mainchar != hurtpoints.get(c).getperson() ) {
                mainchar.setlife( mainchar.getlife() - hurtpoints.get(c).getattack() );
            }
            
            
            for ( int d = 0; d < bags.size(); d++ ) {
                if ( bags.get(d).getfig().infigure(hurtpoints.get(c).getx(), hurtpoints.get(c).gety()) && bags.get(d) != hurtpoints.get(c).getperson() ) {
                    bags.get(d).setlife( bags.get(d).getlife() - hurtpoints.get(c).getattack() );
                }
            }
            
        }
        
        
        
        
        
        mainchar.step(g); 
        
        
        
        extrastuff( g );
        
        draw(g);
        
        paintextraover(g);
        
        checkoffscreen();
        
        hurtpoints.clear();
        hurtpoints.add( new hurtpoint( 1, 1, 0, mainchar ) );
        
        
        if ( mainchar.getlife() <= 0 ) {
            
//            taldorespawn();
            
            
            getpanel().printyouhavediedscreen(g);
            
            
            
        }
        
        if ( tospeak ) {
            
            Font font1 = g.getFont();
            
            g.setFont(new Font( "Serif", Font.BOLD, 14 ));
            
            
            getpanel().printchatbackground(g);
            
            painter.chat(g, mainchar.getfig());
            painter.chatto(g, talkfig);
            g.setColor( new Color( 201, 133, 22 ) );
            g.drawString("Taldo", 260, 210);
            g.setColor(Color.BLACK);
            g.drawString(nameis, 760, 210);
            
            
            String[] tokens = speak.split(" ");
            
            int count = tokens.length - 1;
            
            
        
            
            g.setColor(Color.BLACK);
            
            for ( int c = 0; c <= count / 5; c++ ) {
                
                
                String s = tokens[ c * 5 ];
                
                if ( s.equals("blank") ) {
                    s = "";
                }
                
                if ( c * 5 + 1 < count && !tokens[ c * 5 + 1 ].equals("blank") ) {
                    s += " " + tokens[ c * 5 + 1 ];
                }
                
                if ( c * 5 + 2 < count && !tokens[ c * 5 + 2 ].equals("blank") ) {
                    s += " " + tokens[ c * 5 + 2 ];
                }
                
                if ( c * 5 + 3 < count && !tokens[ c * 5 + 3 ].equals("blank") ) {
                    s += " " + tokens[ c * 5 + 3 ];
                }
                
                if ( c * 5 + 4 < count && !tokens[ c * 5 + 4 ].equals("blank") ) {
                    s += " " + tokens[ c * 5 + 4 ];
                }
                        
//                s += " " + tokens[ c * 5 + 2 ] + " " + tokens[ c * 5 + 3 ] + " " + tokens[ c * 5 + 4 ];
                
                g.drawString(s, 450, 250 + c * 15 );
                
            }
            
//            for ( int c = 0; c < count / 5; c++ ) {
//                for ( int d  = 0; d < 5; d++ ) {
//                    if ( c * 5 + d > count ) {
//                        break;
//                    }
//                    g.drawString(tokens[c * 5 + d], 450, d);
//                }
//            }
            
//            g.drawString( speak, 450, 250);
            
            
            
            
            
//            g.drawString("Q   to continue", 543, 368);
//            
//            g.drawString("W to skip", 543, 388);
            
            g.setFont(font1);
            
            
            tospeak = false;
            
            panel1.pause();
            return;
            
        }
        
        
        currentchat = 0;
        
        
        
        
        
        
        
//        g.setColor(Color.MAGENTA);
//        g.fillRect(mainchar.getx() - 3, mainchar.gety() - 3, 6, 6);
        
        
    }
    
    public void addhurtpoint( hurtpoint h )
    {
        hurtpoints.add(h);
    }
    
    public ArrayList<hurtpoint> gethurtpoints()
    {
        return hurtpoints;
    }
    
    public int getmomentxvar()
    {
        return 10;
    }
    
    public double getspeedvar()
    {
        return 1;
    }
    
    public double getspeedupvar()
    {
        return 1;
    }
    
    public void doobjective()
    {
        
    }
    
    
    public void shake1()
    {
        mainchar.shaker();
    }
    
    public void shake2()
    {
        for ( int c = 0; c < bags.size(); c++ ) {
            bags.get(c).shaker();
        }
    }
    
    public void shake3()
    {
        for ( int c = 0; c < neutral.size(); c++ ) {
            neutral.get(c).shaker();
        }
    }
    
    public jpanel1 getpanel()
    {
        return panel1;
    }
    
    public void setroomdim( int x1, int y1, int x2, int y2 )
    {
        
    }
    
    public void checkoffscreen()
    {
        if ( mainchar.getcenterx() < 0 ) {
            panel1.setroom(leftroom);
            online = false;
            leftroom.onscreen(true);
            mainchar.setcenterx( 1254 );
            mainchar.sety(mainchar.gety() - 1);
        }
        if ( mainchar.getcenterx() > 1265 ) {
            panel1.setroom(rightroom);
            online = false;
            rightroom.onscreen(true);
            mainchar.setcenterx( 10 );
            mainchar.sety(mainchar.gety() - 1);
        }
    }
    
    private int distance( int x1, int y1, int x2, int y2 )
    {
        
        return ( int ) Math.sqrt( ( x1 - x2 ) * ( x1 - x2 ) + ( y1 - y2 ) * ( y1 - y2 ));
        
        
    }
    
    public void resetroom()
    {
        for ( int c = 0; c < bags.size(); c++ ) {
            bags.get(c).respawn();
        }
        
        for ( int c = 0; c < neutral.size(); c++ ) {
            neutral.get(c).respawn();
            if ( neutral.get(c).name.equals("bomb") || neutral.get(c).name.equals("Wizard Tiln's Image") ) {
                neutral.remove(c);
                c--;
            }
        }
//        for ( int c = 0; c < weap1.size(); c++ ) {
//            weap1.remove(c);
//        }
//        
//        for ( int c = 0; c < weap2.size(); c++ ) {
//            weap2.remove(c);
//        }
//        for ( int c = 0; c < weap3.size(); c++ ) {
//            weap3.remove(c);
//        }
        
        weap1.clear();
        weap2.clear();
        weap3.clear();
        
        
        usedtiln = false;
        
        settaldorespawn();
    }
    
    
    public void settaldorespawn()
    {
        
        
        
        
    }
    
    public void warp()
    {
        int x = getpersonon( mainchar );
        
//        JOptionPane.showMessageDialog(null, "distance: " + distance( 0, mainchar.gety() + mainchar.getfig().getlength(), 0, terrain.get(3).gety() + terrain.get(3).getlength() ) );
        
        
        room target = this;
        
        boolean b = false;
        
        if ( !terrain.get(x).isWarps() ) {
            for ( int c = 0; c < terrain.size(); c++ ) {
                if ( !terrain.get(c).isSolid() && terrain.get(c).isWarps() ) {
                    if ( mainchar.getleftx() < terrain.get(c).getx2() && mainchar.getrightx() > terrain.get(c).getx1() ) {
                        if ( distance( 0, mainchar.gety() + mainchar.getfig().getlength(), 0, terrain.get(c).gety() + terrain.get(c).getlength() ) < 10 ) {
                            mainchar.setroom(terrain.get(c).getWarppoint());
                            target = terrain.get(c).getWarppoint();
                            b = true;
                            mainchar.setcenterx(terrain.get(c).getWarpx());
                            mainchar.sety(terrain.get(c).getWarpy());
                            
                            
                            break;
                        }
                    }
                }
            }
            
        }
        else {
            
            if ( terrain.get(x).isWarps() ) {
                mainchar.setroom(terrain.get(x).getWarppoint());
                target = terrain.get(x).getWarppoint();
                mainchar.setcenterx(terrain.get(x).getWarpx());
                mainchar.sety(terrain.get(x).getWarpy());
                b = true;
            }
            
            
        }
        
        if ( b ) {
            
        
            panel1.setroom(target);
            online = false;
            target.onscreen(true);
            mainchar.setmomentx(0);
            mainchar.setmomenty(0);
        }
        
        
    }
    
    
    
    
    
    
}
