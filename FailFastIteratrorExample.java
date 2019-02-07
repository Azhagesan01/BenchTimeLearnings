package methodExamples;

import java.util.*;
public class FailFastIteratrorExample {

	public static void main(String[] args)
	{
      ArrayList<Integer> list = new ArrayList<Integer>();
        
      list.add(1452);
      list.add(6854);
      list.add(8741);
      list.add(6542);
      list.add(3845);
        
      Iterator<Integer> it = list.iterator();
        
        while (it.hasNext())
        {
            Integer integer = (Integer) it.next();
            
            list.add(8457); //Throw Exception
        }

	}

}
