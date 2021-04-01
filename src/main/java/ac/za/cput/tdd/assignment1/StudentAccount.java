/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.tdd.assignment1;

/**
 *
 * @author Damone 219093717
 */
public class StudentAccount {
 
     String x;
    int y;
    
     public StudentAccount() {
    }
    
    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "StudentAccount{" + "x=" + x + ", y=" + y + '}';
    }
    
  
    
    
}
