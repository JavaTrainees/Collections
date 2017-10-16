import java.util.*;  
public class Set
{
	public static void main(String args[])
	{
		HashSet<String> hs = new HashSet<String>();
		HashSet<String> hs1 = new HashSet<String>();
		hs.add("SWAPNA");
		hs.add("KEERTHI");
		hs.add("SUPRAJA");
		hs.add("");

		hs1.add("VIJAY");
		hs1.add("SAGAR");
		hs1.add("VASANTHA");
		hs1.add("SWAPNA");
		//hs.addAll(hs1);
		hs.retainAll(hs1);
			Iterator itr4=hs.iterator();
		while(itr4.hasNext())
		{
			System.out.println(itr4.next());
		}
	
	Iterator itr=hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
			lhs.add("SWAPNA");
		lhs.add("KEERTHI");
		lhs.add("SUPRAJA");
		lhs.add("");
		lhs.add("ABCD");
			Iterator itr1=lhs.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		Boolean value = lhs.contains("ABCD");
		System.out.println(value);
		
		lhs.remove("");
			Iterator itr2=lhs.iterator();
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}
		
	}
}




	
	