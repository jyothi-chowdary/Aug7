    
import java.util.Scanner;
class  PalindromeInputPractice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter  number:");
        int a=sc.nextInt();
         int rev=0;
         int original=a;
         for(int i=a;i>0;){
                            int rem=i%10;
                            rev=rev*10+rem;
                             i=i/10;
         }
        
         System.out.println("reverse number:"+rev);
         if(original==rev){
                        System.out.println("palindrome");
                        }
         else{
                    System.out.println("Not palindrome");
             
                 }
        
        sc.close();
    }
}