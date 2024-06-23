import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args)
   {
    List<Integer> obj = new ArrayList<Integer>();
    obj.add(1);
    obj.add(2);
    System.out.println(obj);

    List<Integer> obj1 = new ArrayList<Integer>();
    obj1.addAll(obj);
    System.out.println(obj1);

    List<Integer> obj3 = new ArrayList<Integer>(obj1);
    System.out.println(obj3);
   }
}
