import java.util.Scanner;
public class Prg19Pattern {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        // int n=10;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==0|| (i==0 && j<(n-1)/2)||(i==n-1 && j<(n-1)/2 || j==(n-1)/2 && i>0 && i<n-1)){
                System.out.print("*");}
      
                else{
                    System.out.print(" ");
                }
    
            }
            System.out.println();
        }
    
    }
}
    

