/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.tdd.assignment1;

/**
 * 
 * @author Mahad Hassan 
 * student number  219122822
 */
public class Magazine 
{
    
    
   private String name1;
   private String  name2;
  
public Magazine() {
        
        
       }

    public String getName1() {
        return name1;
    }

    public String getName2() {
        return name2;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }
    

    @Override
    public String toString() {
        return "Magazine{" + "name1=" + name1 + ", name2=" + name2 + '}';
    }

    
    
    
   
   

    
}
