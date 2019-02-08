import java.util.*;


public class MapStore

{

	public static void main(String[] args) 
	{
		HashMap<Integer,Object>rc=new HashMap<Integer,Object>();
		
		List al=new ArrayList();
		al.add("a");
		
		
		rc.put(100, new RationCard("A",30,"Chennai",al));
		rc.put(101, new RationCard("B",40,"Chennai",al));
		rc.put(102, new RationCard("A",30,"Chennai",al));
		rc.put(103, new RationCard("C",25,"Chennai",al));
		
		
		Set s1=rc.entrySet();
		
		Iterator itr=s1.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry m1=(Map.Entry)itr.next();
	    	System.out.println(m1.getKey()+" "
			+((RationCard) m1.getValue()).getName()
			+" "+((RationCard) m1.getValue()).getAge()
			+" "+((RationCard) m1.getValue()).getAddress()
			+" "+(((RationCard) m1.getValue()).getAl())); 
		}
			
		List<Map.Entry<Integer, Object>> list = 
	               new LinkedList<Map.Entry<Integer, Object>>(); 
		
		list.addAll(s1);
		
		Collections.sort(list,new Comparator<Map.Entry<Integer, Object>>()
				{
					public int compare(Map.Entry<Integer, Object>IntegerEntry1,
							Map.Entry<Integer, Object>IntegerEntry2)
					{
						return ((RationCard)IntegerEntry1.getValue()).getName()
	                            .compareTo(((RationCard)IntegerEntry2.getValue()).getName());
					}
				});
			
			
				
				for(int i=0;i<list.size();i++)
					System.out.println(list.get(i).getValue().toString());
			
				Collections.sort(list,new Comparator<Map.Entry<Integer, Object>>()
				{
					public int compare(Map.Entry<Integer, Object>IntegerEntry1,
							Map.Entry<Integer, Object>IntegerEntry2)
					{
						return ((RationCard)IntegerEntry1.getValue()).getAge()
	                            .compareTo(((RationCard)IntegerEntry2.getValue()).getAge());
					}
				});	
				
				for(int i=0;i<list.size();i++)
					System.out.println(list.get(i).getValue().toString());

	}

}
