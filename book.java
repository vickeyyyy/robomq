public class book extends WrittenItem { 
	public void GettingDetails() { 
		System.out.println("THis is the overridden methodfrom WriitenItem"); } 
	public void DisplayDetails() { 
		System.out.println("THis is the overridden method from WrittenItem"); }
	public static void main(String[] args) { // TODO Auto-generated method stub

book bk=new book();
bk.DisplayDetails();
bk.GettingDetails();

} } 
