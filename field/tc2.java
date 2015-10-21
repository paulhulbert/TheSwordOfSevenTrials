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
public class tc2 extends room {
    
    private int[] xs;
    private int[] ys;
    
    private int[] xs2;
    private int[] ys2;
    
    private int[] xs3;
    private int[] ys3;
    
    private int[] xs4;
    private int[] ys4;
    
    private int[] xs5;
    private int[] ys5;
    
    platform state1;
    
    public tc2( jpanel1 panel, ArrayList<platform> platforms, ArrayList<unit> bags, unit maincharacter, room leftroom, room rightroom, room middleroom )
    {
        super( panel, constants.sky, constants.field, platforms, bags, maincharacter, leftroom, rightroom, middleroom );
        
        
        xs = new int[3];
        ys = new int[3];
        
        xs[0] = 240;
        xs[1] = 290;
        xs[2] = 340;
        
        ys[0] = 500;
        ys[1] = 350;
        ys[2] = 500;
        
        xs2 = new int[3];
        ys2 = new int[3];
        
        xs2[0] = 770;
        xs2[1] = 820;
        xs2[2] = 870;
        
        ys2[0] = 500;
        ys2[1] = 350;
        ys2[2] = 500;
        
        xs3 = new int[3];
        ys3 = new int[3];
        
        xs3[0] = 800;
        xs3[1] = 820;
        xs3[2] = 840;
        
        ys3[0] = 500;
        ys3[1] = 420;
        ys3[2] = 500;
        
        xs4 = new int[3];
        ys4 = new int[3];
        
        xs4[0] = 270;
        xs4[1] = 290;
        xs4[2] = 310;
        
        ys4[0] = 500;
        ys4[1] = 420;
        ys4[2] = 500;
        
        
        xs5 = new int[4];
        ys5 = new int[4];
        
        xs5[0] = 440;
        xs5[1] = 460;
        xs5[2] = 670;
        xs5[3] = 690;
        
        ys5[0] = 500;
        ys5[1] = 350;
        ys5[2] = 350;
        ys5[3] = 500;
        
        
        state1 = new platform( 540, 420, 50, 80, Color.BLACK, false, this.getweap3() );
        state1.setWarppoint(middleroom);
        state1.setWarps(true);
        state1.setWarpx(560);
        state1.setWarpy(500 - constants.taldoheight());
        state1.setSolid(false);
        this.addplatform(state1);
        
        
        
        unit goblin = new every.bag_1(new noai(), weap2, this, 500, 500 - 74);
        
        AI gobai = new basicai();
        gobai.setperson(goblin);
        gobai.settarget(maincharacter);
        goblin.setai(gobai);
        
        this.addbag(goblin);
        
        
    }
    
    
    @Override
    public void setwarproom( room r )
    {
        state1.setWarppoint(r);
    }
    
    
    @Override
    public void paintextra( Graphics g )
    {
        g.setColor(Color.GRAY);
        
        g.fillPolygon(xs, ys, 3);
        
        g.fillPolygon(xs5, ys5, 4);
        
        g.fillPolygon(xs2, ys2, 3);
        
        g.setColor(Color.BLACK);
        
        g.fillPolygon(xs3, ys3, 3);
        
        g.fillPolygon(xs4, ys4, 3);
        
    }
    
    
}
