/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.tdd.assignment1;

/**
 *
 * @author Jody Heideman 219307725
 */
public class arraySearch {
    
    private int max , min , newMin , sum;
    private String name;

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getNewMin() {
        return newMin;
    }

    public void setNewMin(int newMin) {
        this.newMin = newMin;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "arraySearch{" + "max=" + max + ", min=" + min + ", newMin=" + newMin + ", sum=" + sum + ", name=" + name + '}';
    }
    
    /**
     * findMax() will loop through the array and find the largest value
     * @param array
     * @return 
     */
     public int findMax(int array[]){
    
    max = array[0];
    
    for(int i = 0; i < array.length; i++){
        
        if(max < array[i]){
            
            max = array[i];
            
        }
        
    }
    
   return max;
}
     
     /**
      * findMin() will loop through the array and find the smallest value
      * @param array
      * @return 
      */
     
     public int findMin(int array[]){
    
    min = array[0];
    
    for(int i = 0; i < array.length; i++){
        
        if(min > array[i]){
            
            min = array[i];
            
        }

         }
    return min;
}
     
     /**
      * findName() will loop through the array and find a specific name
      * @param array
      * @return 
      */
     
     public String findName(String array[]){
    
    for(int i = 0; i < array.length; i++){
        
       if("Jody".equals(array[i])){
           
           name = array[i];
       }

}

    return name;  

}
     
      /**
      * sumArray() adds all elements in array 
      * @param array
      * @return 
      */
     public int sumArray(int array[]){
         
         sum = 0;
         for(int i = 0; i < array.length; i++){
             
             sum = sum + array[i];
             
         }
         
         return sum;
     }

    
}
