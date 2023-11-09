/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package json_string;
import org.json.simple.JSONObject;  
import org.json.simple.JSONValue;  

/**
 *
 * @author Lenovo
 */
public class JSON_String {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s="{\"name\":\"Shreya\",\"salary\":500000.0,\"age\":22}";  
    Object obj=JSONValue.parse(s);  
    JSONObject jsonObject = (JSONObject) obj;  
  
    String name = (String) jsonObject.get("name");  
    double salary = (Double) jsonObject.get("salary");  
    long age = (Long) jsonObject.get("age");  
    System.out.println(name+" "+salary+" "+age);  
}  
}  
        // TODO code application logic here
    }
    
}
