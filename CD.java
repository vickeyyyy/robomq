public class CD extends Mediaitem{

private String artist;
private String genre;
public void GettingDetails() {
    System.out.println("THis is the overridden methodfrom Item");
}
public void DisplayDetails() {
    System.out.println("THis is the overridden method from Item");
}
public void videoQuality() {
    System.out.println("this will show the videoo quality of mediaItEM");
}
public void cDQuality() {
    System.out.println("this will show the CD quality of mediaItEM");
}
public static void main(String[] args) {
    // TODO Auto-generated method stub

    CD cd=new CD();
    cd.cDQuality();
    cd.videoQuality();
}

} 