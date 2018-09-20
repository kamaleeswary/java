import java.util.*;

public class SortedSet {
    //public static void main(String[] args) {
    public TreeSet<String> sort(HashSet<String> hash){
        TreeSet<String> set=new TreeSet<>(hash);
//        set.add("Harry");
//        set.add("Olive");
//        set.add("Alice");
//        set.add("Bluto ");
//        set.add("Eugene");
        System.out.println("Before Sorting");
        System.out.println(set);
        System.out.println("After sorting");
       // TreeSet <String> tree=new TreeSet<>(set);
        //Collections.sort(set);
        System.out.println(set);
        return set;
    }
}

