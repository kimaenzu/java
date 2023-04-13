package AqrilTwlv;

import java.util.Scanner;

public class Operator2 {
   public static void main(String[] args) {
      String stop;
      Scanner sc = new Scanner(System.in);
      int k,s = 0;
      
      do {
         System.out.print("k : ");
         try {
            k = sc.nextInt();
         } catch (Exception e){
            System.out.println("잘못된 입력입니다. 다시 입력해 주세요");

            k=0;
   //         continue;
               
         }
                  
         System.out.print("s : ");
         try {
            s = sc.nextInt();
         } catch (Exception e){
            System.out.println("잘못된 입력입니다. 다시 입력해 주세요");
            s=0;
            //continue;
         }
         
         System.out.print("op : ");
         switch(sc.next()) {
         
         case "+" : System.out.println("k+s : "+(k+s));break;
         case "-" : System.out.println("k-s : "+(k-s));break;
         case "*" : System.out.println("k*s : "+(k*s));break;
         case "/" : System.out.println("k/s : "+(k/s));break;
         default: System.out.println("잘못된 입력입니다. 다시 입력해 주세요.");break;
         }
   
         
         System.out.println();
         System.out.println("계속 하시겠습니까? (Y/N)");
         stop = sc.next();
         if (stop.equals("Y") || stop.equals("y")) continue;
         else if (stop.equals("N") || stop.equals("n")) break;
         else System.out.println(" 잘못된 입력입니다.");
      } while(true);
   }
   

}
