import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int [] myIntArray = new int[10];
        myIntArray[0] = 45;
        myIntArray[1] = 1;
        myIntArray[5] = 50;

        double[] mydoubleArray = new double[10];
        mydoubleArray[2] = 3.5;
        System.out.println(mydoubleArray[2]);
        System.out.println(myIntArray[5]);

        int[] firstTen = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("first = " + firstTen[0]);
        int arrayLength = firstTen.length;
        System.out.println("length of array = " + arrayLength);
        System.out.println("last = " + firstTen[arrayLength - 1]);


        int[] newArray;
        newArray = new int[]{5,4,3,2,1};
        for (int i = 0; i < newArray.length; i++ ){
            System.out.println(newArray[i] + "");
        }
        for (int element : newArray){
            System.out.println(element + "");
        }
        System.out.println();

        System.out.println(Arrays.toString(newArray));
    }

}