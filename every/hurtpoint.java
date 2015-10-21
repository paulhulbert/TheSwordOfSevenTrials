/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package every;

/**
 *
 * @author Dad
 */
public class hurtpoint {
    
    int x;
    int y;
    int attack;
    
    private unit user;
    
    public hurtpoint( int x, int y, int attack, unit person )
    {
        this.attack = attack;
        this.x = x;
        this.y = y;
        user = person;
    }
    
    public unit getperson()
    {
        return user;
    }
    
    public int getx()
    {
        return x;
    }
    
    public int gety()
    {
        return y;
    }
    
    public int getattack()
    {
        return attack;
    }
    
}
