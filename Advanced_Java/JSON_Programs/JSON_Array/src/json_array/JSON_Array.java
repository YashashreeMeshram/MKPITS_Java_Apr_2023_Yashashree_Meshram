/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package json_array;
import org.json.simple.JSONArray;  

/**
 *
 * @author Lenovo
 */
public class JSON_Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
  JSONArray arr = new JSONArray();  
  arr.add("Shreya");    
  arr.add(new Integer(22));    
  arr.add(new Double(500000));   
  System.out.print(arr);  
}}    
    
    

