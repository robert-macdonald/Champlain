package sem2.finalProject;

public class LinkedList {

    public class Node {

        int freq;
        String name;
        Node next;

        public Node(String name, Node next) {
            this.freq = 1;
            this.name = name;
            this.next = next;
        }

        public Node(String value) {
            this.freq = 1;
            this.name = value;
            next = null;
        }
    }

    private Node first;
    private int size;

    public LinkedList(){
        first = null;
        size = 0;
    }
    public LinkedList(String name){
        first = new Node(name);
        size = 1;
    }

    public void add(String name) {
        if (!find(name)) {
            Node node = new Node(name);
            if (first != null) {
                Node pointer = first;
                while (pointer.next != null) {
                    pointer = pointer.next;
                }
                pointer.next = node;
                size++;
            } else {
                first = node;
                size++;
            }
        } else {
            Node pointer = first;
            while (!(pointer.name.equals(name))){
                pointer = pointer.next;
            }
            pointer.freq += 1;
        }
    }

    public boolean find(String n){
        boolean result = false;
        for (Node i = first; i != null; i = i.next){
            if (i.name.equals(n)){
                result = true;
                break;
            }
        }
        return result;
    }
    public boolean find(Node n){
        boolean result = false;
        for (Node i = first; i != null; i = i.next){
            if (i.equals(n)){
                result = true;
                break;
            }
        }
        return result;
    }

    public void sort(){
        if (first == null)
            return;
        Node grand = null;
        Node parent = first;
        while (parent.next != null){
            if (parent.next.freq > parent.freq){
                Node temp = parent.next;
                parent.next = temp.next;
                temp.next = parent;
                if (grand != null)
                    grand.next = temp;
                grand = null;
                parent = first;
            }
            parent = parent.next;
            if (grand == null)
                grand = first;
            else
                grand = grand.next;
        }
    }

    public Node get(int index){
        Node node = first;
        if (index >= 0 && index < size) {
            int currentIndex = 0;
            for (Node p = first; p.next != null; p = p.next) {
                if (currentIndex == index) {
                    node = p;
                } else {
                    currentIndex++;
                }
            }
        } else {
            throw new IndexOutOfBoundsException("Index out of bounds!");
        }
        return node;
    }

    public int getSize(){
        return size;
    }

    @Override
    public String toString(){
        StringBuilder output = new StringBuilder();
        Node pointer = first;
        while (pointer != null){
            output.append(pointer.name + ", ");
            pointer = pointer.next;
        }
        return output.toString();
    }

}
