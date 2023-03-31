import java.util.*;

public class ReverseInt {
    public static void main (String [] args)
    {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = sc.nextInt();
        String number = Integer.toString(num);
        ArrayList<Character> arr = new ArrayList<>();

        //int number2 = number.length();
       // System.out.println(number2);
      // char [] arr = new char[number.length()];
      
      if(number.contains("-"))
      {
        arr.add('-');
        for(int i = number.length()-1; i>=0; i--)
        {
            arr.add(number.charAt(i));     
        }
        int rem = arr.size()-1;
        arr.remove(rem);
        System.out.println(arr);
      }
      else
      {
        for(int i = number.length()-1; i>=0; i--)
        { 
            arr.add(number.charAt(i));
            //arr[i] = number.charAt(i);
           // i++;
        }
      
        System.out.println(arr);
      }


      
        
       
       // System.out.println();

        /*for(int k = 0; k<arr.length; k++)
        {
            System.out.println(arr[k]);

        }       */





    }
}
