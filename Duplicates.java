import java.util.*;
public class Duplicates {
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array: ");
        int size = sc.nextInt();
        int [] arr = new int[size];
        ArrayList<Integer> list = new ArrayList<>();
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
    
        Arrays.sort(arr);
        System.out.println();

        for(int k = 0; k<arr.length; k++)// checking whether all elements are added inside my array
        { 
            list.add(arr[k]);

        }
        //System.out.println(list);
        for(int m = 0; m<list.size()-1; m++)
        {
            
            if( list.get(m) == list.get(m+1))
            {
                list.remove(m+1);
                System.out.println(list);
            }
            else
            {
                System.out.println("Output: " + list);
                System.out.println("The list aboves does not have any duplicates.");

                
            }


            
            

            

        }
        
        


    }
}
