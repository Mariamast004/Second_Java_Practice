import java.util.LinkedList;
record  Place(String name, int distance){}
public class LinkedListChallenge {

    public static void main(String[] args) {
        LinkedList<Place> placesToVisit = new LinkedList<Place>();

        Place adelaide = new Place(  "Adelaide",    1374);
        addPlace(placesToVisit, adelaide);
        System.out.println(placesToVisit);



    }
    private  static  void addPlace(LinkedList<Place> list, Place place){
        if (list.contains(place)){
            System.out.println("Found duplicate: " + place);
            return;


        }
        list.add(place);
    }

}
