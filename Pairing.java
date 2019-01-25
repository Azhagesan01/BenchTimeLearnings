package Access;
import javafx.util.Pair; 

public class Pairing{
	public static Pair<Integer, String> getTwo() 
    { 
        return new Pair<Integer, String>(10, "Java"); 
    } 
  
    
    public static void main(String[] args) 
    { 
        Pair<Integer, String> p = getTwo(); 
        System.out.println(p.getKey() + " " + p.getValue()); 
    } 
	
}
