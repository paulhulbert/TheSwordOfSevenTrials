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
public class tc1 extends room {  // tc1 is the right side of the thief's camp
    
    private int[] xs;
    private int[] ys;
    
    private int[] xs2;
    private int[] ys2;
    
    private int[] xs3;
    private int[] ys3;
    
    private int[] xs4;
    private int[] ys4;
    
    public tc1( jpanel1 panel, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom )
    {
        super( panel, constants.sky, constants.field, platforms, bags, maincharacter, leftroom, rightroom, middleroom );
        
        
        xs = new int[3];
        ys = new int[3];
        
        xs[0] = 270;
        xs[1] = 320;
        xs[2] = 370;
        
        ys[0] = 500;
        ys[1] = 350;
        ys[2] = 500;
        
        xs2 = new int[3];
        ys2 = new int[3];
        
        xs2[0] = 470;
        xs2[1] = 520;
        xs2[2] = 570;
        
        ys2[0] = 500;
        ys2[1] = 350;
        ys2[2] = 500;
        
        xs3 = new int[3];
        ys3 = new int[3];
        
        xs3[0] = 500;
        xs3[1] = 520;
        xs3[2] = 540;
        
        ys3[0] = 500;
        ys3[1] = 420;
        ys3[2] = 500;
        
        xs4 = new int[3];
        ys4 = new int[3];
        
        xs4[0] = 300;
        xs4[1] = 320;
        xs4[2] = 340;
        
        ys4[0] = 500;
        ys4[1] = 420;
        ys4[2] = 500;
        
        
        unit goblin = new every.bag_1(new noai(), weap2, this, 300, 500 - 74);
        
        AI gobai = new basicai();
        gobai.setperson(goblin);
        gobai.settarget(maincharacter);
        goblin.setai(gobai);
        
        this.addbag(goblin);
        
        
    }
    
    
    @Override
    public void paintextra( Graphics g )
    {
        g.setColor(Color.GRAY);
        
        g.fillPolygon(xs, ys, 3);
        
        
        
        g.fillPolygon(xs2, ys2, 3);
        
        g.setColor(Color.BLACK);
        
        g.fillPolygon(xs3, ys3, 3);
        
        g.fillPolygon(xs4, ys4, 3);
        
    }
    
    
}
