import org.junit.Test;

import java.util.HashSet;
import java.util.TreeSet;

import static org.junit.Assert.*;

public class SortedSetTest {

    @Test
    public void sort() {
        HashSet<String> set=new HashSet<>();
        set.add("Harry");
        set.add("Olive");
        set.add("Alice");
        set.add("Bluto ");
        set.add("Eugene");
        SortedSet sortset=new SortedSet();
        TreeSet<String> tree=new TreeSet<>(set);
        //sortset.sort(set);
        assertEquals(tree,sortset.sort(set));
    }
}