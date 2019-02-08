import java.util.*;
public class RationCard 
{
	private String name;
	private Integer age;
	private String address;
	
	List al=new ArrayList();
	
	public RationCard(String name, int age, String address,List al)
	{
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.al=al;
		
			
	}
	
	public List getAl() {
		System.out.print(al);
		return al;
	}

	
	  public void setAl(List al) 
	  { 
		  this.al = al; 
	  }
	 

	public void printList()
	{
		System.out.print(al);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString()
	{
		return name +"  "+ age +"  " +address;
				
	}
}
