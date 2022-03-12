
package Assignment4;

import java.util.HashMap;

public class HashSet
{
    public static void main(final String[] args) {
        final HashMap<Integer, String> city = new HashMap<Integer, String>();
        city.put(101, "Delhi");
        city.put(102, "Hyderabad");
        city.put(103, "Kolkata");
        city.put(104, "Mumbai");
        city.put(105, "Pune");
        city.put(106, "Banglore");
        city.put(107, "Punjab");
        city.put(108, "Chandigarh");
        city.put(109, "Gurugram");
        city.put(110, "Panipat");
        System.out.println(city);
        System.out.println("***Get City***");
        System.out.println(city.get(110));
        System.out.println("***Get City By City name***");
        System.out.println(city.containsValue("Banglore"));
        city.remove(103);
    }
}
