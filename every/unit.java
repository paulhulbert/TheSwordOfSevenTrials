/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package every;

import java.awt.Graphics;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import weapons.*;
import javax.swing.ImageIcon;

/**
 *
 * @author Dad
 */
public class unit {
    
    //   stats
    protected int life;
    protected int def;
    protected int speed;
    
    protected int lastweapused = 1;
    
    
    protected int jumpvar = 20;
    
    protected String statement;
    protected String name;
    protected ArrayList<String> statements;
    protected int statenum;
    
    
    protected int currentplat;
    
    protected AI ai;
    
    public ArrayList<weapon> weapons;
    
    protected int rex;
    protected int rey;
    protected room reroom;
    protected int relife;
    
    
    protected room current;
    
    protected trigger on_dead_trigger;
    protected boolean has_trigger = false;
    
    protected trigger on_chat_trigger[];
    protected boolean has_on_chat_trigger = false;
    
    protected int on_chat_trigger_counter = 0;
    
    
    protected ArrayList<chattrigger> chattriggers;
    protected int chattriggercounter = 0;
    
    //  figure
//    private boolean[] paintable;
//    private Color[] pic;
//    private int width; // sideways
//    private int length;  // down
    figure fig;
    
    protected figure fig2;
    
    //  spot
    protected int x;  //first point
    protected int y;
    protected int dir;
    
    //  extra
    protected int momentx;
    protected int momenty;
    protected String mainweapon;
    protected String dropdead;
    
    protected String weapon2;
    
    protected boolean dead;
    
    protected boolean falling;
    
    
//    private weapon weapon1;
//    private weapon weapon2;
    
    
    // commands
    protected boolean left;
    protected boolean right;
    
    
    public unit( int life, int def, int speed, String Weapon, int x, int y, AI ai, ArrayList<weapon> weapons, room currentroom, int width, int length )
    {
        statement = "";
        statements = new ArrayList<String>();
        statenum = 0;
        name = "";
        dropdead = "blank";
        this.life = life;
        this.def = def;
        this.speed = speed;
        mainweapon = Weapon;
        this.x = x;
        this.y = y;
        
        dir = 1;
        left = false;
        right = false;
        momentx = 0;
        momenty = 0;
        
        currentplat = 0;
        
        falling = false;
        
        weapon2 = null;
        
        boolean[] paintable = new boolean[width * length];
        Color[] picture = new Color[width * length];
        
        for ( int c = 0; c < width * length; c++ )
        {
            paintable[c] = false;
            picture[c] = null;
        }
        
        fig = new figure( x, y, dir, paintable, picture, width, length );
        
        fig.setperson(this);
        
        this.ai = ai;
        
        
        
        this.weapons = weapons;
        
        rex = x;
        rey = y;
        
        current = currentroom;
        reroom = current;
        relife = life;
        
        
        ai.setperson(this);
        
        
        chattriggers = new ArrayList<>();
        
        fig2 = null;
    }
    
    public void setspeed( int s )
    {
        speed = s;
    }
    
    public int getspeed()
    {
        return speed;
    }
    
    public void setrex( int x )
    {
        rex = x;
        
    }
    
    public void setrey( int y )
    {
        rey = y;
        
    }
    
    
    public void resettaldo()
    {
        
        dead = false;
        getfig().unred();
        
    }
    
    public void settrigger( trigger trig )
    {
        on_dead_trigger = trig;
        has_trigger = true;
    }
    
    public void stopondeadtrigger()
    {
        has_trigger = false;
    }
    
    public void set_on_chat_trigger( trigger trig[] )
    {
        on_chat_trigger = trig;
        has_on_chat_trigger = true;
    }
    
    public void setdir( int dir )
    {
        fig.setdir(dir);
        this.dir = dir;
    }
    
//    public int getcurrentplat()
//    {
//        return current.getpersonon(this);
//    }
    public int getcurrentplat()
    {
        return currentplat;
    }
    
    
    
    public boolean getisfalling()
    {
        if ( momenty != 0 ) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public int getmomenty()
    {
        return momenty;
    }
    
    public int getmomentx()
    {
        return momentx;
    }

    public String getMainweapon() {
        return mainweapon;
    }

    public void setMainweapon(String weap) {
        mainweapon = weap;
    }

    public String getWeapon2() {
        return weapon2;
    }

    public void setWeapon2(String weapon2) {
        this.weapon2 = weapon2;
    }
    
    public void setmomentx( int i )
    {
        momentx = i;
    }
    
    public void setmomenty( int i )
    {
        momenty = i;
    }
    
    public void setlife( int life )
    {
        this.life = life;
    }
    
    public int getlife()
    {
        return life;
    }
    
    public room getroom()
    {
        return current;
    }

    public String getStatement() {
        return statement;
    }
    
    public String getstatements( int index )
    {
        if ( has_on_chat_trigger ) {
            if ( on_chat_trigger_counter >= on_chat_trigger.length ) {
                return statements.get(index);
            }
            if ( index == 0 && on_chat_trigger[on_chat_trigger_counter].gettrigger() ) {
                on_chat_trigger[on_chat_trigger_counter + 1].switchtrigger();
                on_chat_trigger_counter += 2;
            }
        }
        
        
        if ( chattriggers.size() > 0 ) {
            for ( int c = chattriggercounter; c < chattriggers.size(); c++ ) {
                if ( chattriggers.get(c).t.gettrigger( constants.getpanel() ) && !chattriggers.get(c).activated ) {
                    chattriggers.get(c).setnewchat(this);
                    chattriggercounter = c;
                }
            }
        }
        
        
        return statements.get(index);
    }
    
    public void addchattrigger( chattrigger c )
    {
        chattriggers.add(c);
    }
    
    public void clearchattriggers()
    {
        chattriggers.clear();
    }

    public void setStatement(String statement) {
        this.statement = statement + " blank";
        statements.add(statement + " blank");
        statenum++;
    }
    
    public int getstatenum()
    {
        return statenum;
    }
    
    public void clearstatements()
    {
        statements.clear();
        statenum = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void dropper()
    {
        
        if ( has_trigger ) {
            if ( on_dead_trigger.gettrigger() ) {
                on_dead_trigger.settrigger(false);
            }
            else {
                on_dead_trigger.settrigger(true);
            }
        }
        
        if ( dropdead.equals("blank") ) {
            return;
        }
        if ( dropdead.equals("sword")) {
            weapons.add(new sword( x, y + fig.getlength() / 2 - 20, 0, momentx, momenty, this ));
            
        }
        if ( dropdead.equals("handsword")) {
            weapons.add(new sword_1( x, y + fig.getlength() / 2 - 20, 0, momentx, momenty, this ));
            
        }
        if ( dropdead.equals("heart")) {
            weapons.add(new heart( x, y + fig.getlength() / 2 - 20, 0, momentx, momenty ));
            
        }
        if ( dropdead.equals("hammer")) {
            weapons.add(new hammer( x, y + fig.getlength() / 2 - 20, 0, momentx, momenty, this ));
            
        }
        if ( dropdead.equals("spear")) {
            weapons.add(new spear( x, y + fig.getlength() / 2 - 20, 0, momentx, momenty, this ));
            
        }
        if ( dropdead.equals("bow")) {
            weapons.add(new bow( x, y + fig.getlength() / 2 - 20, 0, momentx, momenty, this ));
            weapons.add(new arrow( x, y + fig.getlength() / 2 - 20, 0, momentx, momenty ));
            
            
        }
        if ( dropdead.equals("fireball")) {
            weapons.add(new fireball( x, y + fig.getlength() / 2 - 20, 0, momentx, momenty ));
            
        }
        if ( dropdead.equals("fireballup")) {
            weapons.add(new firevil.fireballup( x, y + fig.getlength() / 2 - 20, 0, momentx, momenty ));
            
        }
        if ( dropdead.equals("fireballdown")) {
            weapons.add(new firevil.fireballdown( x, y + fig.getlength() / 2 - 20, 0, momentx, momenty ));
            
        }
        if ( dropdead.equals("gobclaws_bag")) {
            weapons.add(new gobclaws_bag( x, y + fig.getlength() / 2 - 20, 0, momentx, momenty, this ));
            
        }
        if ( dropdead.equals("gobclaws_taldo")) {
            weapons.add(new gobclaws_taldo( x, y + fig.getlength() / 2 - 20, 0, momentx, momenty, this ));
            
        }
        if ( dropdead.equals("dnag")) { 
            weapons.add(new dnagup( x, y + fig.getlength() / 2 - 20, 0, momentx, momenty, this ));
            weapons.add(new dnagdown( x, y + fig.getlength() / 2 - 20, 1, momentx, momenty, this ));
            
        }
//        JOptionPane.showMessageDialog(null, );
        
    }
    
    public void setdropdead( String s ) {
        dropdead = s;
    }
    
    
    public void chat()
    {
        unit targ = current.chatter();
        
        if ( targ == null ) {
            return;
        }
        
        if ( targ.getdead() ) {
            return;
        }
        
        if ( targ.getStatement().equals("")) {
            return;
        }
        
        current.talkperson( targ );
        
        
        
    }
    
    
    public void respawn()
    {
        current = reroom;
        x = rex;
        y = rey;
        life = relife;
        dead = false;
        
        momentx = 0;
        momenty = 0;
        getfig().unred();
    }
    
    public AI getai()
    {
        return ai;
    }
    
    public void setai( AI ai )
    {
        this.ai = ai;
        
        ai.setperson(this);
    }
    
    public int getx()
    {
        return x;
        
    }
    
    public int gety()
    {
        return y;
    }
    
    public void setx( int x )
    {
        this.x = x;
    }
    
    public void sety( int y )
    {
        this.y = y;
    }
    
    public void goleft()
    {
        
        left = true;
    }
    
    public void goright()
    {
        right = true;
    }
    
    
    public void stopleft()
    {
        left = false;
    }
    
    
    public void stopright()
    {
        right = false;
    }
    
    private int distance( int x1, int y1, int x2, int y2 )
    {
        
        return ( int ) Math.sqrt( ( x1 - x2 ) * ( x1 - x2 ) + ( y1 - y2 ) * ( y1 - y2 ));
        
        
    }
    
    public int getcenterx()
    {
        if ( dir == 1 ) {
            return x - fig.getwidth() / 2;
            
        }
        else {
            return x + fig.getwidth() / 2;
        }
    }
    
    public int getcentery()
    {
        return y + fig.getlength() / 2;
    }
    
    public void setcenterx( int x )
    {
        if ( dir == 1 ) {
            this.x = x - fig.getwidth() / 2 + 24;
        }
        else {
            this.x = x + fig.getwidth() / 2 - 24;
        }
    }
    
    public int getdir()
    {
        return dir;
    }
    
    public int getreload1()
    {
        if ( mainweapon.equals("sword") || mainweapon.equals("handsword") || mainweapon.equals("zz_lightning") || mainweapon.equals("sost") ) {
            return 7;
        }
        if ( mainweapon.equals("hammer") ) {
            return 8;
        }
        if ( mainweapon.equals("superhammer") ) {
            return 18;
        }
        if ( mainweapon.equals("spear") || mainweapon.equals("junglemonkeylizardvine") || mainweapon.equals("heavygobspear") ) {
            return 12;
        }
        if ( mainweapon.equals("bow") || mainweapon.equals("squidguy_acid") || mainweapon.equals("electricball")  || mainweapon.equals("electricspear") || mainweapon.equals("flame") || mainweapon.equals("greenfireball") ) {
            return 25;
        }
        if ( mainweapon.equals("fireballsideways") || mainweapon.equals("weakelectricspear") || mainweapon.equals("greenspikeball") ) {
            return 25;
        }
        if ( mainweapon.equals("fireball") ) {
            return 2;
        }
        if ( mainweapon.equals("fireballup") ) {
            return 22;
        }
        if ( mainweapon.equals("fireballdown") ) {
            return 22;
        }
        if ( mainweapon.equals("gobclaws_bag") || mainweapon.equals("gobclaws_taldo") ) {
            return 5;
        }
        if ( mainweapon.equals("dnag") ) {
            return 12;
        }
        if ( mainweapon.equals("pointattackblue") ) {
            return 1;
        }
        if ( mainweapon.equals("pointattackred") ) {
            return 1;
        }
        if ( mainweapon.equals("pointattackgreen") ) {
            return 1;
        }
        
        
        return 0;
    }
    
    public int getreload2()
    {
        if ( weapon2.equals("sword") || mainweapon.equals("handsword") ) {
            return 7;
        }
        if ( weapon2.equals("hammer") ) {
            return 8;
        }
        if ( weapon2.equals("spear") ) {
            return 12;
        }
        if ( weapon2.equals("bow") ) {
            return 25;
        }
        if ( weapon2.equals("bomb") ) {
            return 50;
        }
        if ( weapon2.equals("Tiln") ) {
            return 10;
        }
        if ( weapon2.equals("fireball") ) {
            return 2;
        }
        if ( weapon2.equals("fireballup") ) {
            return 22;
        }
        if ( weapon2.equals("fireballdown") ) {
            return 22;
        }
        if ( weapon2.equals("gobclaws_bag") || weapon2.equals("gobclaws_taldo") ) {
            return 4;
        }
        if ( weapon2.equals("dnag") ) {
            return 12;
        }
        if ( weapon2.equals("pointattackblue") ) {
            return 1;
        }
        if ( weapon2.equals("pointattackred") ) {
            return 1;
        }
        if ( weapon2.equals("pointattackgreen") ) {
            return 1;
        }
        
        return 0;
    }
    
    
    public boolean inrange( unit target )
    {
        boolean b = false;
        if ( mainweapon.equals("sword") || mainweapon.equals("handsword") || mainweapon.equals("gobclaws_bag") || mainweapon.equals("gobclaws_taldo") || mainweapon.equals("sost")  ) {
            if ( distance( this.getx(), 0, target.getx(), 0 ) < 15 ) {
                if ( distance( 0, this.gety(), 0, target.gety() ) < 100 ) {
                    b = true;
                }
            }
            
            if ( this.getx() > target.getx() ) {
                if ( dir == 2 ) {
                    b = false;
                }
            }
            else {
                if ( dir == 1 ) {
                    b = false;
                }
            }
            
        }
        
        if ( mainweapon.equals("hammer") || mainweapon.equals("superhammer") ) {
            if ( distance( this.getx(), 0, target.getx(), 0 ) < 10 ) {
                if ( distance( 0, this.gety(), 0, target.gety() ) < 100 ) {
                    b = true;
                }
            }
            
            if ( this.getx() > target.getx() ) {
                if ( dir == 2 ) {
                    b = false;
                }
            }
            else {
                if ( dir == 1 ) {
                    b = false;
                }
            }
            
        }
        
        if ( mainweapon.equals("spear") || mainweapon.equals("junglemonkeylizardvine") || mainweapon.equals("dnag") || mainweapon.equals("heavygobspear") ) {
            if ( distance( this.getx(), 0, target.getx(), 0 ) < 25 ) {
                if ( distance( 0, this.gety(), 0, target.gety() ) < 100 ) {
                    b = true;
                }
            }
            
            if ( this.getx() > target.getx() ) {
                if ( dir == 2 ) {
                    b = false;
                }
            }
            else {
                if ( dir == 1 ) {
                    b = false;
                }
            }
            
        }
        
        if ( mainweapon.equals("spear") ) {
            if ( distance( this.getx(), 0, target.getx(), 0 ) < 20 ) {
                if ( distance( 0, this.gety(), 0, target.gety() ) < 50 ) {
                    b = true;
                }
            }
            
            if ( this.getx() > target.getx() ) {
                if ( dir == 2 ) {
                    b = false;
                }
            }
            else {
                if ( dir == 1 ) {
                    b = false;
                }
            }
            
        }
        
        if ( mainweapon.equals("bow") || mainweapon.equals("squidguy_acid") || mainweapon.equals("electricspear") || mainweapon.equals("weakelectricspear") || mainweapon.equals("flame")  ) {
            if ( distance( this.getx(), 0, target.getx(), 0 ) < 200 ) {
                if ( distance( 0, this.gety(), 0, target.gety() ) < 100 ) {
                    b = true;
                }
            }
            
            if ( this.getx() > target.getx() ) {
                if ( dir == 2 ) {
                    b = false;
                }
            }
            else {
                if ( dir == 1 ) {
                    b = false;
                }
            }
            
        }
        
        
        
        if ( mainweapon.equals("fireball") || mainweapon.equals("zz_lightning") ) {
            if ( distance( this.getx(), 0, target.getx(), 0 ) < 120 ) {
                if ( distance( 0, this.gety(), 0, target.gety() ) < 100 ) {
                    b = true;
                }
            }
            
            if ( this.getx() > target.getx() ) {
                if ( dir == 2 ) {
                    b = false;
                }
            }
            else {
                if ( dir == 1 ) {
                    b = false;
                }
            }
            
        }
        
        if ( mainweapon.equals("fireballsideways") ) {
            if ( distance( this.getx(), 0, target.getx(), 0 ) < 1200 ) {
                if ( distance( 0, this.gety(), 0, target.gety() ) < 100 ) {
                    b = true;
                }
            }
            
            if ( this.getx() > target.getx() ) {
                if ( dir == 2 ) {
                    b = false;
                }
            }
            else {
                if ( dir == 1 ) {
                    b = false;
                }
            }
            
        }
        if ( mainweapon.equals("greenspikeball") ) {
            b = true;
            
        }
        
        
        if ( mainweapon.equals("electricball") || mainweapon.equals("greenfireball") ) {
            if ( distance( this.getx(), 0, target.getx(), 0 ) < 300 ) {
                if ( distance( 0, this.gety(), 0, target.gety() ) < 300 ) {
                    b = true;
                }
            }
            
            if ( this.getx() > target.getx() ) {
                if ( dir == 2 ) {
                    b = false;
                }
            }
            else {
                if ( dir == 1 ) {
                    b = false;
                }
            }
            
        }
        
        
        
        return b;
        
    }
    
    
    
    
    public void attack()
    {
        if ( !ai.canattack() ) {
            return;
        }
        lastweapused = 1;
        int temp;
        int temp_opposite;
        if ( dir == 1 ) {
            temp = -1;
            temp_opposite = 1;
        }
        else {
            temp = 1;
            temp_opposite = -1;
        }
        if ( mainweapon.equals("sword")) {
            weapons.add(new sword( x, y, temp, momentx, momenty, this ));
            
            
        }
        if ( mainweapon.equals("sost")) {
            weapons.add(new sost( x, y, temp, momentx, momenty, this ));
            
            
        }
        if ( mainweapon.equals("handsword")) {
            weapons.add(new sword_1( x, y, temp, momentx, momenty, this ));
            
        }
        if ( mainweapon.equals("hammer")) {
            weapons.add(new hammer( x, y, temp, momentx, momenty, this ));
            
        }
        if ( mainweapon.equals("superhammer")) {
            weapons.add(new superhammer( x, y, temp, momentx, momenty, this ));
            
        }
        if ( mainweapon.equals("spear")) {
            weapons.add(new spear( x, y, temp, momentx, momenty, this ));
            
        }
        if ( mainweapon.equals("heavygobspear")) {
            weapons.add(new heavygobspear( x, y, temp, momentx, momenty, this ));
            
        }
        if ( mainweapon.equals("electricspear")) {
            weapons.add(new speardun.electricspear( x, y, temp, momentx, momenty ));
            
        }
        if ( mainweapon.equals("weakelectricspear")) {
            weapons.add(new gobdun.weakelectricspear( x, y, temp, momentx, momenty ));
            
        }
        if ( mainweapon.equals("flame")) {
            weapons.add(new firedun.flame( x, y, temp, momentx, momenty ));
            
        }
        if ( mainweapon.equals("bow") && momenty == 0 ) {
            weapons.add(new bow( x, y, temp, momentx, momenty, this ));
            weapons.add(new arrow( x, y, temp, momentx, momenty ));
            
        }
        if ( mainweapon.equals("fireball")) {
            weapons.add(new fireball( x, y, temp, momentx, momenty ));
            
        }
        if ( mainweapon.equals("fireballsideways")) {
            weapons.add(new weapons.fireballsideways( x, y, temp, momentx, momenty ));
            
        }
        if ( mainweapon.equals("greenspikeball")) {
            weapons.add(new weapons.greenspikeball( x, 500, -1, 0, 0 ));
            
        }
        if ( mainweapon.equals("fireballup")) {
            weapons.add(new firevil.fireballup( getcenterx(), y, temp, momentx, momenty ));
            
        }
        if ( mainweapon.equals("fireballdown")) {
            weapons.add(new firevil.fireballdown( x, y, temp, momentx, momenty ));
            
        }
        if ( mainweapon.equals("gobclaws_bag")) {
            weapons.add(new gobclaws_bag( x, y, temp, momentx, momenty, this ));
            
        }
        if ( mainweapon.equals("gobclaws_taldo")) {
            weapons.add(new gobclaws_taldo( x, y, temp, momentx, momenty, this ));
            
        }
        if ( mainweapon.equals("dnag")) {
            weapons.add(new dnagup( x, y, temp, momentx, momenty, this ));
            weapons.add(new dnagdown( x, y, temp_opposite, momentx, momenty, this ));
            
        }
        if ( mainweapon.equals("zz_lightning")) {
            weapons.add(new zz_lightning( x, y, temp, momentx, momenty ));
            
            
        }
        if ( mainweapon.equals("squidguy_acid")) {
            weapons.add(new squidguy_acid( x, y, temp, momentx, momenty ));
            
            
        }
        if ( mainweapon.equals("junglemonkeylizardvine")) {
            weapons.add(new junglemonkeylizardvine( x, y - 23, temp, momentx, momenty, this ));
            
        }
        
    }
    
    public void attack2()
    {
        if ( !ai.canattack() ) {
            return;
        }
        lastweapused = 2;
        int temp;
        int temp_opposite;
        if ( dir == 1 ) {
            temp = -1;
            temp_opposite = 1;
        }
        else {
            temp = 1;
            temp_opposite = -1;
        }
        if ( weapon2.equals("sword")) {
            weapons.add(new sword( x, y, temp, momentx, momenty, this ));
        }
        if ( weapon2.equals("handsword")) {
            weapons.add(new sword_1( x, y, temp, momentx, momenty, this ));
        }
        if ( weapon2.equals("hammer")) {
            weapons.add(new hammer( x, y, temp, momentx, momenty, this ));
        }
        if ( weapon2.equals("spear")) {
            weapons.add(new spear( x, y, temp, momentx, momenty, this ));
        }
        if ( weapon2.equals("bow") && momentx == 0 && momenty == 0 ) {
            weapons.add(new bow( x, y, temp, momentx, momenty, this ));
            weapons.add(new arrow( x, y, temp, momentx, momenty ));
        }
        if ( weapon2.equals("fireball")) {
            weapons.add(new fireball( x, y, temp, momentx, momenty ));
        }
        if ( weapon2.equals("fireballup")) {
            weapons.add(new firevil.fireballup( x, y, temp, momentx, momenty ));
        }
        if ( weapon2.equals("fireballdown")) {
            weapons.add(new firevil.fireballdown( x, y, temp, momentx, momenty ));
        }
        if ( weapon2.equals("dnag")) {
            weapons.add(new dnagup( x, y, temp, momentx, momenty, this ));
            weapons.add(new dnagdown( x, y, temp_opposite, momentx, momenty, this ));
            
        }
        if ( weapon2.equals("bomb")) {
            current.addneutral( new weapons.bomb( current, x, y + fig.getlength() ) );
        }
        if ( weapon2.equals("Tiln")) {
            if ( !current.usedtiln ) {
                current.addtiln( new builders.transtiln( current.getweap3(), current, x + temp * 20, y + fig.getlength(), dir, temp ) );
                current.usedtiln = true;
            } else {
                current.removetiln();
                current.usedtiln = false;
            }
        }
        
    }
    
    
    
    
    public figure getfig()
    {
        return fig;
    }
    
    public void setfig( figure f )
    {
        fig = f;
    }
    
    public void setpixel( int x, int y , Color col )
    {
        
        fig.setpixel( x, y, col );
        
        
    }

    public figure getFig2() {
        return fig2;
    }

    public void setFig2(figure fig2) {
        this.fig2 = fig2;
    }
    
    
    public void switchfig()
    {
        figure ftemp = fig;
        
        fig = fig2;
        fig2 = ftemp;
        fig.setdir(fig2.getdir());
        fig.setx(fig2.getx());
        fig.sety(fig2.gety() + fig2.getlength() - fig.getlength());
        rey += fig2.getlength() - fig.getlength();
        
        this.sety(y + fig2.getlength() - fig.getlength());
    }
    
    
    
    
    
    public void hit( weapon weap )
    {
        
        if ( weap.getatt() > 0 ) {
            getfig().redit();
        }
        
        life -= (weap.getatt() - def);
        weap.hitit();
        weap.onhittrigger();
        if ( life > 100 ) {
            life = 100;
        }
    }
    
    public void setweapons( ArrayList<weapon> weapons ) 
    {
        this.weapons = weapons;
    }
    
    
    public boolean getdead()
    {
        return dead;
    }
    
    public void setroom( room cur )
    {
        this.current = cur;
    }
    
    
    public double speedupvar()
    {
        return 1;
    }
    
    public double speedvar()
    {
        return 1;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
    
    
    public double momentxvar()
    {
        return 1;
    }
    
    
    public void step( Graphics g )
    {
        if ( dead ) {
            return;
        }
        
        if ( life <= 0 ) {
            dead = true;
            dropper();
            return;
        }
        
        
        if ( momentx > 80 && !name.equals("bomb") ) {
            momentx = 80;
        }
        
//        x += momentx / current.getmomentxvar() * current.getspeedvar() * momentxvar();
//        y += momenty / 10;
        
        mover( g );
        
        if ( left && !right )
        {
//            x -= speed * current.getspeedvar() * speedvar();
            if ( momentx >= -78 ) {
                momentx -= 2 * current.getspeedupvar() * speedupvar();
            }
            fig.setdir(1);
            dir = 1;
        }
        if ( right && !left )
        {
//            x += speed * current.getspeedvar() * speedvar();
            if ( momentx <= 78 ) {
                momentx += 2 * current.getspeedupvar() * speedupvar();
            }
            fig.setdir(2);
            dir = 2;
        }
        if ( ( !right && !left ) || ( right && left ) )
        {
            if ( momentx > 0 ) {
                momentx -= 2;
            }
            if ( momentx < 0 ) {
                momentx += 2;
            }
        }
        
        fig.paintit(g);
        currentplat = current.getpersonon( this );
        
        
        
        faller();
        
        
        currentplat = current.getpersonon( this );
        
        
        if ( currentplat != -1 ) {
            if ( current.getterrainat(currentplat).getstep() ) {
                followplat();
            }
        }
        
        
        if ( lastweapused == 1 ) {
            ai.setreload(getreload1());
        } else {
            ai.setreload(getreload2());
        }
        
        
        
        ai.step( g );
        
        fig.setx(x);
        fig.sety(y);
        
        
        
        paintextra(g);
        
    }
    
    public void debugging()
    {
        
    }
    
    
    public void mover( Graphics g )
    {
//        x -= speed * current.getspeedvar() * speedvar();
//        x += momentx / current.getmomentxvar() * current.getspeedvar() * momentxvar();
        
        int amount;
        
        amount = (int) (momentx / current.getmomentxvar() * current.getspeedvar() * momentxvar()) / 2;
        
        if ( right && !left ) {
            amount += speed * current.getspeedvar() * speedvar() * 2;
        }
        if ( left && !right ) {
            amount -= speed * current.getspeedvar() * speedvar() * 2;
        }
        
        
        
        if ( amount > 0 ) {
            for ( int c = 0; c < amount + 3; c++ ) {
                for ( int d = 0; d < current.getterrain().size(); d++ ) {
                    if ( current.getterrainat(d).ishardblock ) {
                        if ( inline_with_platform( d ) ) {
                            if ( this.getcenterx() + fig.getwidth() / 2 + 1 > current.getterrainat(d).getx1() && this.getcenterx() + fig.getwidth() / 2 + 1 < current.getterrainat(d).getx2() ) {
                                this.ai.hithard();
                                return;
                            }
                        }
                    }
                }
                x++;
            }
            
        }
        
        
        if ( amount < 0 ) {
            
            for ( int c = 0; c > amount - 3; c-- ) {
                for ( int d = 0; d < current.getterrain().size(); d++ ) {
                    if ( current.getterrainat(d).ishardblock ) {
                        if ( inline_with_platform( d ) ) {
                            if ( this.getcenterx() - fig.getwidth() / 2 - 1 < current.getterrainat(d).getx2() && this.getcenterx() - fig.getwidth() / 2 + 1 > current.getterrainat(d).getx1() ) {
                                this.ai.hithard();
                                return;
                            }
                        }
                    }
                }
                x--;
            }
            
        }
        
        
        
        
    }
    
    public boolean inline_with_platform( int index )
    {
        platform platform1 = current.getterrainat(index);
        
        if ( y < platform1.gety() + platform1.getlength() && y + fig.getlength() > platform1.gety() ) {
            return true;
        }
        
        
        return false;
    }
    
    public boolean inline_with_platform_x( int index )
    {
        platform platform1 = current.getterrainat(index);
        
        if ( getcenterx() - fig.getwidth() / 2 < platform1.getx2() && getcenterx() + fig.getwidth() / 2 > platform1.getx1() ) {
            return true;
        }
        
        
        return false;
    }
    
    public void setjumpvar( int y )
    {
        jumpvar = y;
    }
    
    public int getjumpvar()
    {
        return jumpvar;
    }
    
    public void jump()
    {
        if ( momenty == 0 && currentplat != -1 ) {
            momenty -= jumpvar;
        } else {
            y--;
        }
    }
    
    public void shaker()
    {
        if ( momenty == 0 && currentplat != -1 ) {
            momenty = -10;
        }
    }
    
    
    public void followplat()
    {
        
        int xx = current.getterrainat(currentplat).getstepx();
        int yy = current.getterrainat(currentplat).getstepy();
        
        x += xx;
        y += yy;
        
        
    }
    
    
    
    
    
    
    public void faller()
    {
        
        
        if ( currentplat == -1 && momenty >= 0 ) {
            
            
            
            for ( int c = 0; c < momenty; c++ ) {
                y += 1;
                if ( current.getpersonon(this) != -1 ) {
                    momenty = 0;
                    currentplat = current.getpersonon(this);
                    break;
                }
            }
            if ( currentplat == -1 ) {
                momenty += 3;
            }
        }
        
        
//        if ( momenty < 0 ) {
//           
//            
//            
//            for ( int c = 0; c > momenty; c-- ) {
//                
//                
//            }
//            momenty += 3;
//        }
        
        if ( momenty < 0 ) {
            
            for ( int c = 0; c > momenty; c-- ) {
                for ( int d = 0; d < current.getterrain().size(); d++ ) {
                    if ( current.getterrainat(d).ishardblock ) {
                        if ( inline_with_platform_x( d ) ) {
                            if ( y > current.getterrainat(d).gety() + current.getterrainat(d).getlength() ) {
                                if ( y - 1 == current.getterrainat(d).gety() + current.getterrainat(d).getlength() ) {
                                    momenty = 0;
                                    return;
                                }
                            }
                        }
                    }
                }
                y--;
            }
            momenty += 3;
        }
        
    }
    
    
    
    
    
    
    public void paintit( Graphics g )
    {
        
        fig.paintit(g);
//        painter.paint(g, fig);
        
    }
    
    
    public int getleftx()
    {
        int q;
        
        if ( dir == 1 ) {
            q = x - fig.getwidth();
        }
        else {
            q = x;
        }
        
        return q;
    }
    
    public int getrightx()
    {
        int q;
        
        if ( dir == 2 ) {
            q = x + fig.getwidth();
        }
        else {
            q = x;
        }
        
        return q;
    }
    
    
    public void paintextra( Graphics g )
    {
        
    }
    
    
    public void changeai()
    {
        
    }
    
    public void resetai()
    {
        
    }
    
    
    
    
    
    
    
}
