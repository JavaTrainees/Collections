import java.util.*;

public class map
{
	public static void main(String args[])
	{
	HashMap<Integer,String> hm = new HashMap<Integer,String>();
	hm.put(1,"SWAPNA");
	hm.put(2,"SAI");
	hm.put(3,"SUPRAJA");
	for(Map.Entry m:hm.entrySet())
{
	System.out.println(m.getKey() +" " + m.getValue());
		
	}
		
	hm.remove(1);
		for(Map.Entry m:hm.entrySet())
{
	System.out.println(m.getKey() +" " + m.getValue());
		
	}
		Boolean value  = hm.containsKey(2);
	System.out.println(value);
	
	TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
	tm.put(7,"SWAPNA");
	tm.put(8,"SAI");
	tm.put(6,"SUPRAJA"	);
for(Map.Entry m:tm.entrySet())
{
	System.out.println(m.getKey() +" " + m.getValue());
		
	}
}
}
	