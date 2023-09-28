public class TreeMap {
    public static void main(String[] args) {
        // TreeMapClass<String,Integer> treeMap=new TreeMapClass<String,Integer>();

        java.util.TreeMap<Integer,String> treeMap = new java.util.TreeMap<>();
        treeMap.put(101,"Rainning");
        treeMap.put(104,"Climbing");
        treeMap.put(103,"Lifting");
        treeMap.put(106,"Searching");
        treeMap.put(105,"Enoying");
        System.out.println(treeMap);

    }
}