import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class GenerateRandom {   
  
    public static int[] removeTheElement(int[] arr, int index)
    {
        if (arr == null || index < 0
            || index >= arr.length) {
           System.out.println("All gifts are assigned: Please exit the game ");
            return arr;
        }

       int[] anotherArray = new int[arr.length - 1];

       for (int i = 0, k = 0; i < arr.length; i++) {

            if (i == index) {
                continue;
            }

           anotherArray[k++] = arr[i];
        }
        return anotherArray;
    }

   public static void main( String args[] ) {
       ArrayList<String> str = new ArrayList<String>();
     Scanner sc = new Scanner(System.in);
      Random rand = new Random();
      int upperbound = 28;
      int int_random1,int_random2;
     
      int giveGift[] = new int[28];
      int takeGift[] = new int[28];
      String[] result = new String[28];

      for (int i = 0; i < 28; i++) {  
giveGift[i]=i+1;
}

 for (int i = 0; i < 28; i++) {  
takeGift[i]=i+1;
}
 
      while(true){

          System.out.println("\nReady to play game of Secret Santa:\n ");
          System.out.println("1.For playing ");
          System.out.println("2.To see Santa List ");
          System.out.println("3.To exit \n");
   
           int choice = sc.nextInt();
      
        switch (choice) {
            case 1:  
                     if(upperbound == 0){
                         System.out.println("\nAll members are assigned with their Santa. Please exit!!!\n");
                         break;
                     }
                     int_random1 = rand.nextInt(upperbound);
                     int_random2 = rand.nextInt(upperbound);
                     if(int_random1 < giveGift.length && int_random2 < takeGift.length){
                          if(giveGift[int_random1] != takeGift[int_random2]){
                              str.add(giveGift[int_random1]+" will give gift to "+takeGift[int_random2]);
                              System.out.println("\nPerson "+giveGift[int_random1]+" will give gift to Person "+takeGift[int_random2]);
                              System.out.println("-------------------------------------");
                              giveGift = removeTheElement(giveGift, int_random1);
                              takeGift = removeTheElement(takeGift, int_random2);
                              upperbound--;
                             
                          }else{
                              System.out.println("\n ***Why Person " + giveGift[int_random1] + " You want to give gift to yourself!! Please try again***\n " );
                            
                          }
                        
                     }else{
                         System.out.println("\n ***Someone wants more than 1 GIFT, PLAY AGAIN!!!***\n " );
                              
                     }
                    
                    break;
                    
            case 2:  System.out.println("\n So here is the Secret Santa's List \n *********************************************************\n ");
                     for(String s:str){
                         System.out.println(s+"\n");
                     }
                     break;
            case 3:  System.out.println("\n Thank you for playing!!! Merry Christmas");
                      System.exit(0);
                }
      }
       
     }
      
      }
     
    