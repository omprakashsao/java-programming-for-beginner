import java.util.Scanner;
public class Prg17PatternA {
public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    // int n=10;
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(i==0||j==0||j==n-1||i==( n-1)/2){
            System.out.print("*");}
  
            else{
                System.out.print(" ");
            }

        }
        System.out.println();
    }

}
    
}

