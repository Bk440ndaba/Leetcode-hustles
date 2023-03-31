import java.util.*;
public class Duplicates {
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array: ");
        int size = sc.nextInt();
        int [] arr = new int[size];
        int i = 0;

        int counter = 1;
        while(counter<=size)
        {
            System.out.println("Enter number " + counter);
            int num = sc.nextInt();
            counter++;
            arr[i] = num;
            i++;
            

        }

        /*for(int k = 0; k<arr.length; k++) checking whether all elements are added inside my array
        { 
            System.out.println(arr[k]);

        }

        for (int j : arr) {
            //System.out.println(j);     Added added succefully
        }       */   

        


    }
}
