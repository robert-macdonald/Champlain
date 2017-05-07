package sem2.theory;

public class LinkedList {
    public static void main(String args[]){
        Linked<String> list = new Linked<>();

        list.add("hello");
        list.add("world");
        list.add("!");

        System.out.println(list.toString());

    }
}
