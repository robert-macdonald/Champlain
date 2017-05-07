package sem2.theory;

public class Question3 {

    public static void main(String args[]) throws Exception{

        int[] arr = {1,2,3,4,5,6,7,8,9};
        int num = 4;
        boolean found = false;

        try {

            for (int i = 0; i < arr.length; i++){
                if (num == arr[i]){
                    found = true;
                }
            }

            if (!found){
                throw new Exception("Element not Found");
            } else {
                System.out.println("Found it!");
            }
        }
        catch(Exception e) {
            System.out.print(e.getMessage());
        }
    }
}
