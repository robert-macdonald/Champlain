package sem2.chap6;

public class Exercise2 {
    private String description;
    private int value;

    public Exercise2(String desc, int val){
        description = desc;
        value = val;
    }
    Exercise2(Exercise2 c){
        description = c.description;
        value = c.value;
    }
}