import java.util.Scanner;

public class Prg14TypesaOfLoop {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
       

        //for loop
        // for(int i=0;i<n;i++){
        //     System.out.println("*");
        // }
        
        //while loop
        // int i = 0;
        // while(i<n){
        //     System.out.println("*");
        //     i++;
        // }
          
        //do while
        int i=0;
        do{
            System.out.println("*"); //sometimes i am confuse why it is print in a single column
            i++;                       //because we use println if i use print then it is print a single row
        }while(i<n);


    }
    
}
