import java.util.ArrayList;
import java.util.Collection;

public class Test
{
   public static void main(String[] args)
   {
    
	Collection<String> obj = new ArrayList();
	obj.add("banana");
	obj.add("apple");
	obj.add("pineapple");
	
	System.out.println(obj);
	obj.remove("apple");
	
	System.out.println(obj);
	obj.forEach(v-> System.out.print(v));
	
	}
   
}