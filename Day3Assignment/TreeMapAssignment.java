package Day3Assignment;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapAssignment {

	public static void main(String[] args) {
		TreeMap<String, BookAuthorDetails> Tm=new TreeMap<String, BookAuthorDetails>();
		Tm.put("science",new BookAuthorDetails(1,"arun","jaipur"));
		Tm.put("english",new BookAuthorDetails(3,"mahur","mumbai"));
		Tm.put("python",new BookAuthorDetails(2,"atri","agra"));
		Tm.put("maths",new BookAuthorDetails(2,"abhi","jaisalmer"));
		Tm.put("angrezi",new BookAuthorDetails(4,"adir","jodhpur"));
		Tm.put("hindi",new BookAuthorDetails(4,"adir","jodhpur"));
		
		Collection<BookAuthorDetails> values=Tm.values();
		System.out.println("\n print values of tree map \n" + values );
		
		Set<String>keys=Tm.keySet();
		System.out.println("\n print keys of tree map \n" + keys );
		
		//1st solution..
		Iterator<String> iterator=Tm.keySet().iterator(); 
		while(iterator.hasNext()) 
		{ String key=iterator.next();
		System.out.println("\n key: "+key + ", value :: "+Tm.get(key));

	    }

		

	}

}