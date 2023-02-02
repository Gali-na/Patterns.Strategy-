import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SortStrategy sortStrategy = new InsertionSort();
        int [] arry = new int[]{1,3,10,5,16,18,5};
        System.out.println(Arrays.toString(arry));
        System.out.println("**************************");
        MyArry myArry = new MyArry();
        myArry.setArry(arry);
        myArry.setSortStrategy(sortStrategy);
        myArry.sort();
        System.out.println(Arrays.toString( myArry.getArry()));

        System.out.println("Hello world!");
    }
}