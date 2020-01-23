package Day3Assignment;

import java.util.HashSet;

public class ElectionMap {

	public static void main(String[] args) {
		HashSet<Election>election =new HashSet<Election>(); 
			election.add(new Election(1,"abc","11","jaipur","hawa mahal","13"));
			election.add(new Election(3,"abb","12","ajmer","aana sagar","11"));
			election.add(new Election(4,"aab","8","udaipur","fatehsagar","12"));
			election.add(new Election(2,"aab","8","udaipur","fatehsagar","12"));
			election.add(new Election(5,"adb","8","udaipur","fatehsagar","12"));
              System.out.println(election);
              for (Election d: election)
              {
            	  System.out.println(d);
              }
	}

}