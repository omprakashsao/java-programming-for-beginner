public class Prg9LogicalOperator {
public static void main(String args[]){
    int a=10;
    int b = 10;
    int c = 20;
    System.out.println(a==b && a<b);
    System.out.println(a<=b && c>a);

    System.out.println(a==b || b==c);
    System.out.println(a<=b || a>= b || c>b);
    System.out.println(a>b || b>c || c==a);
    System.out.println(a!=b);
    System.out.println(a!=c);

}
    
}
