
package Assignment4;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSet
{
    public static void main(final String[] args) {
        final SortedSet set = new TreeSet();
        set.add(" Ghaziabad");
        set.add(" Noida");
        set.add(" Delhi");
        set.add(" Chandigarh");
        set.add(" Panipat");
        set.add(" panchkula");
        set.add(" Nanital");
        set.add(" Mumbai");
        set.add(" Pune");
        for (final Object sort : set) {
            System.out.println(sort);
        }
    }
}
