
package Assignment4;

import java.util.ListIterator;
import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;

public class LinkList
{
    public static void main(final String[] args) {
        final List<String> list = new LinkedList<String>();
        list.add("lakshu");
        list.add("Riya");
        list.add("ananya");
        list.add("prashant");
        list.add("ashu");
        list.add("Abhishek ");
        list.add("jhanvi ");
        list.add("devanshu ");
        list.add("sagar");
        System.out.println("   Iterator demo ");
        final Iterator<String> itr = list.listIterator();
        while (itr.hasNext()) {
            final String name = itr.next();
            System.out.println("Hi " + name);
        }
        System.out.println("   List Iterator demo   ");
        final ListIterator<String> lstItr = list.listIterator();
        while (lstItr.hasNext()) {
            final String name2 = lstItr.next();
            System.out.println("Hey " + name2);
        }
        final Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            final String name2 = iterator.next();
            System.out.println("Hello " + name2);
        }
        System.out.println("   Linked List Demo   ");
        System.out.println(list);
    }
}
