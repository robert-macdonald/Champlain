package sem2.finalProject;

public class BirdWatchers {

    public static void main(String args[]) {
        LinkedList list = new LinkedList();

        list.add("Robin");
        list.add("Grackle");
        list.add("Robin");
        list.add("Starling");
        list.add("Chickadee");
        list.add("Starling");
        list.add("Robin");

        System.out.println(list.toString());
        System.out.println("");
        list.sort();
        System.out.println(list.toString());
    }

}
