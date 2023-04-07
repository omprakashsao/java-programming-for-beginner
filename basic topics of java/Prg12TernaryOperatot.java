public class Prg12TernaryOperatot {
public static void main (String args[]){
    int a=50;
    int b=40;
    int c = 30;

    //ternary operator is used to solve if-else operation .We can say that it is acronym of the if-else
    // syntax --> (condition)?true : false;

    String result = (a<b)?"a is less" : "b is less";
    String result1 = (a>b)?"a is less" : "b is less";
    System.out.println(result);
    System.out.println(result1);

//we solve the problem of greater no.,in given 3 numbers 

 String result2 =(a>b)?((a>c)?"a is greter than b and c":"c is greter than a and b"):((b>c)?"b is greter than a and b": "c is greter than a and b");

 System.out.println(result2);
    
}
}
