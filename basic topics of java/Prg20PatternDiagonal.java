import java.util.Scanner;
public class Prg20PatternDiagonal {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        // int n=10;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                System.out.print("*");}
      
                else{
                    System.out.print(" ");
                }
    
            }
            System.out.println();
        }
    
    }
}

