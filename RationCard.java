import java.util.*;

public class RationCard {
	

	private String name;
	private Integer age;
	private String address;
	

	List<RationCard> al = new ArrayList<RationCard>();

	public RationCard(String name, int age, String address, List<RationCard> al) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.al = al;
	}

	public RationCard(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		
	}

	public List<RationCard> getAl() {
		return al;
	}

	public void setAl(List<RationCard> al) {
		this.al = al;
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
	
	public int hashCode()
	{
		int hashcode = 0;
		hashcode = age*17;
		hashcode += name.hashCode();
		return hashcode;
	}
	
	public boolean equals(Object obj)
	{
        if (obj instanceof RationCard) {
            RationCard rc = (RationCard) obj;
            return (rc.name.equals(this.name) && rc.age == this.age && rc.address==this.address);
        } else {
            return false;
        }
    }

	@Override
	public String toString() {
		return "RationCard [name=" + name + ", age=" + age + ", address=" + address + ", al=" + al + "]";
	}
	
	
	
}
