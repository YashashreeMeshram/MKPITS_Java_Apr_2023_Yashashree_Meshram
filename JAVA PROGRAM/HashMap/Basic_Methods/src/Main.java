import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap hashMap=new HashMap();
        hashMap.put("Yashashree",1);
        hashMap.put("Mayuri",2);
        hashMap.put("Pallavi",3);
        hashMap.put("Pratiksha",4);
        //print the values
        System.out.println(hashMap);
        //print the set
        System.out.println(hashMap.entrySet());
        //print only keys
        System.out.println(hashMap.keySet());
        //print only values
        System.out.println(hashMap.values());
        HashMap hashMap1=new HashMap();
        hashMap1.putAll(hashMap);

        System.out.println(hashMap1);
        hashMap1.getOrDefault(1,"abc3");
        System.out.println(hashMap1);
    }
}