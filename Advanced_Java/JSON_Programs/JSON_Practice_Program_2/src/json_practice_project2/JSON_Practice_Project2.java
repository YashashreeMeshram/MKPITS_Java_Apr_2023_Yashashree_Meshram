/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package json_practice_project2;
import java.util.HashMap;  
import java.util.Map;  
import org.json.simple.JSONValue;

/**
 *
 * @author Lenovo
 */
public class JSON_Practice_Project2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
  
  Map obj=new HashMap();    
  obj.put("name","Yashashree");    
  obj.put("age",new Integer(22));    
  obj.put("salary",new Double(800000));   
  String jsonText = JSONValue.toJSONString(obj);  
  System.out.print(jsonText);  
}}    
        // TODO code application logic here
    }
    
}
