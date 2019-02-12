import java.util.*;


public class MapStore

{

	public static void main(String[] args) 
	{
		
		HashMap<Integer,Object>rc=new HashMap<Integer,Object>();
		
		
		
		
		List<RationCard> al=new ArrayList<RationCard>();
		al.add(new RationCard("a",27));
		al.add(new RationCard("aa",1));
		rc.put(100, new RationCard("A",30,"Adayar, Chennai",al));
		al=new ArrayList<RationCard>();
		
		
		al.add(new RationCard("b",36));
		al.add(new RationCard("bb",5));
		rc.put(101, new RationCard("B",40,"Vadapalani, Chennai",al));
		al=new ArrayList<RationCard>();
		
		al.add(new RationCard("a",27));
		al.add(new RationCard("aa",1));
		rc.put(102, new RationCard("A",30,"Adayar, Chennai",al));
		al=new ArrayList<RationCard>();
		
		al.add(new RationCard("c",21));
		al.add(new RationCard("cc",0));
		rc.put(103, new RationCard("C",25,"Guindy, Chennai",al));
		al=new ArrayList<RationCard>();
		
		
		
		List<Object> listq = new ArrayList<Object>(rc.values());
		
		System.out.println(listq.size());
		
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
			
			 System.out.println();	
			
		}
		
		
		Set valueSet = new HashSet(rc.values());
        System.out.println("Set of unique values");
        System.out.println(valueSet);
        System.out.println();		
		
			
		List<Map.Entry<Integer, Object>> list = 
	               new LinkedList<Map.Entry<Integer, Object>>(); 
		
		list.addAll(s1);
		
		System.out.println("Printing the list");
		for(int i=0;i<list.size();i++)
		{
			
			System.out.println(list.get(i).getValue().toString());
			System.out.println(" ");
		}
		
		
				//sorting based on Name
				Collections.sort(list,new Comparator<Map.Entry<Integer, Object>>()
				{
					public int compare(Map.Entry<Integer, Object>IntegerEntry1,
							Map.Entry<Integer, Object>IntegerEntry2)
					{
						return ((RationCard)IntegerEntry1.getValue()).getName()
	                            .compareTo(((RationCard)IntegerEntry2.getValue()).getName());
					}
				});
				System.out.println("Sorting Based on Name");
				for(int i=0;i<list.size();i++)
				{
					System.out.println(list.get(i).getValue().toString());
				    System.out.println(" ");
				}
				
				//sorting based on Age
				Collections.sort(list,new Comparator<Map.Entry<Integer, Object>>()
				{
					public int compare(Map.Entry<Integer, Object>IntegerEntry1,
							Map.Entry<Integer, Object>IntegerEntry2)
					{
						return ((RationCard)IntegerEntry1.getValue()).getAge()
	                            .compareTo(((RationCard)IntegerEntry2.getValue()).getAge());
					}
				});	
				
				System.out.println("Sorting Based on Age");
				for(int i=0;i<list.size();i++)
				{
					System.out.println(list.get(i).getValue().toString());
				    System.out.println(" ");
				}

	}

}
