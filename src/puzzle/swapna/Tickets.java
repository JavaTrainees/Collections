
import java.util.*;

class Tickets
{
public static void main(String args[])
{
int counter=0;
HashMap<String,Integer> hm =new HashMap<String,Integer>();
hm.put("A",1);
hm.put("B",4);
hm.put("C",3);
do{
for(String m : hm.keySet())
{
int val = 0;
if(hm.get(m) !=0){
val= hm.get(m)-1;
}
hm.put(m,val);
System.out.println(hm);
if(val != 0)
counter++;
}
}while(hm.get("B")>0);
System.out.println(counter);
}
}

