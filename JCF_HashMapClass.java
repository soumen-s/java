// Program to implementation of HASHMAP CLASS under Map interface

/*
    HashMap provides the basic implementation of the Map interface. This Map implementations 
    provides constant-time performance for the basic operations (get and put). HashMap stores 
    the data in (Key, Value) pairs, and we can access them by the keys. If we try to insert
    the duplicate key in HashMap, it will replace the element of the corresponding key. 
    
    HashMap allows to store the 'null' keys as well, but there should be only one null key
    object and there can be any number of null values. 
*/
import java.util.Map;
import java.util.HashMap;

public class JCF_HashMapClass
{
	public static void main(String[] args) 
	{
		Map<Integer,String> hm = new HashMap<>();
		// HashMap<Integer,String> hm = new HashMap<>(); // or
		
		hm.put(1,"One");
		hm.put(2,"Two");
		hm.put(3,"Three");
		hm.put(4,"Four");
		hm.put(5,"Five");
		hm.put(null,"nullkey"); // HashMap also allows 'null' key
		
		hm.putIfAbsent(3,"THREE");  // if absent then put
		System.out.println(hm);
		
		hm.put(3,"THREE");  // in that case it'll be overwritten
		System.out.println(hm);
		
		for(Map.Entry<Integer,String> e : hm.entrySet()) // to itterate b/w all the 
		{                                                // entries or 'to print the entries'
		    System.out.print(e+" ");
		}
		System.out.println();
		
		for(Integer k : hm.keySet())  // to get/itterate only all the KEYS
		{
		    System.out.print(k+" ");   
		}
		System.out.println();
		
		for(String v : hm.values())
		{
		    System.out.print(v+" ");  // to get/itterate only all the VALUES
		}
		System.out.println();
		
		System.out.println(hm.containsKey(2));  // contains that key or not
		System.out.println(hm.containsValue("Four"));  // contains that value or not
		
	}
}