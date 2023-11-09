/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package json_practice_project;
import org.json.simple.JSONObject;
/**
 *
 * @author Lenovo
 */
public class JSON_Practice_Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code appliimport org.json.simple.JSONObject;    
 
JSONObject obj=new JSONObject();    
  obj.put("name","Yashashree");    
  obj.put("age",new Integer(22));    
  obj.put("salary",new Double(300000));    
   System.out.print(obj);    
}
    }
    
