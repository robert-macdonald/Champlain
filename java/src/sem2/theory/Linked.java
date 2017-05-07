package sem2.theory;

public class Linked<T> {

    private class Node {

        T value;
        Node child;

        public Node(T value, Node child) {
            this.value = value;
            this.child = child;
        }

        public Node(T value) {
            this.value = value;
            child = null;
        }
    }

    private Node first;
    private int size;

    public Linked(T value) {
        first = new Node(value);
        size = 1;
    }
    public Linked(){
        first = null;
        size = 0;
    }

    public void addFirst(T value) {
        Node node = new Node(value);
        if (first != null) {
            node.child = first;
            first = node;
        } else {
            first = node;
        }
        size++;
    }

    public void add(T value) {
        Node node = new Node(value);
        if(first != null) {
            Node pointer = first;
            while (pointer.child != null){
                pointer = pointer.child;
            }
            pointer.child = node;
            size++;
        } else {
            first = node;
            size++;
        }
    }

    public void addAfter(Node origin, T value) {
        if (find(origin)) {
            origin.child = new Node(value, origin.child);
            size++;
        } else {
            throw new NullPointerException("Entered node does not exist");
        }
    }

    public void addBefore(Node origin, T value) {
        if (find(origin)) {
            size++;
        } else {
            throw new NullPointerException("Entered node does not exist");
        }
    }

    public void removeFirst() {
        if (first != null) {
            if (first.child != null) {
                first = first.child;
            } else {
                first = null;
            }
            size--;
        } else {
            throw new NullPointerException("List is empty");
        }
    }

    public void removeLast(){
        if (first != null) {
            Node pointer = first;
            while (pointer.child.child != null){
                pointer = pointer.child;
            }
            pointer.child = null;
            size--;
        } else {
            throw new NullPointerException("List is empty!");
        }
    }

    public void removeIndex(int index){
        if (index < size && index >= 0) {
            if (index == 0){
                first = first.child;
                size--;
            } else {
                Node pointer = first;
                int counter = 0;
                while (pointer.child != null){
                    if ((counter - index) == -1){
                        pointer.child = pointer.child.child;
                        break;
                    } else {
                        pointer = pointer.child;
                        counter++;
                    }
                }
            }
        } else {
            throw new IndexOutOfBoundsException("Index out of bounds!");
        }
    }

    public void clear(){
        first = null;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public T searchList(T element){
        T message = (T)"Not found!";
        for (Node i = first; i != null; i = i.child){
            if (i.value.equals(element)){
                message = (T)("Found: " + i.value);
                break;
            }
        }
        return message;
    }

    public boolean find(Node n){
        boolean result = false;
        for (Node i = first; i != null; i = i.child){
            if (i.equals(n)){
                result = true;
                break;
            }
        }
        return result;
    }

    public Node getNode(int index) {
        Node element = first;
        int currentIndex = 0;
        if (index > this.getSize() || index < 0) {
            throw new IndexOutOfBoundsException("Index out of bounds.");
        } else {
            while (element.child != null) {
                if (currentIndex != index) {
                    element = element.child;
                    currentIndex++;
                } else {
                    return element;
                }
            }
        }
        return null;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString(){
        StringBuilder output = new StringBuilder();
        Node head = first;
        while (head != null){
             output.append(head.value + ", ");
             head = head.child;
        }
        return output.toString();
    }
}