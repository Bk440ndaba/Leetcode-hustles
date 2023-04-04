import java.util.*;
public class Duplicates {
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array: ");
        int size = sc.nextInt();
        int [] arr = new int[size];
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
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

        for(int k = 0; k<arr.length; k++)// checking whether all elements are added inside my arrayList
        { 
            list.add(arr[k]);     // added all elements

        }
        //System.out.println(list);

        for(int m = 0; m<list.size()-1; m++)
        {
            if(list.get(m).equals(list.get(m+1)))
            {
                list2.add(list.get(m+1));
            }
    

        }

        if(list2.isEmpty())
        {
            System.out.println("output " + list);
        
            System.out.println("The list aboves does not have any duplicates.");

        }
        else
        {
            System.out.println("Output " + list2);
            System.out.println("The duplicates found.");

            

        }



         
    /*     if( list.get(m) == list.get(m+1))
        {
            list.remove(m+1);  // Keeps on adding elements even if they dont meet the condition
            //list2.add(list.get(m));
            

            //System.out.println(list);
        }
        else
        {
            System.out.println("Output: " + list);
           
            
        }  */

        
        
        


    }
}
