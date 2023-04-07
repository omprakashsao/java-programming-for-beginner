class Calc {
    public int add(int a , int b){
         int result = a + b;
         return result;
          }

    public int add(int a , int b, int c){
         int result = a + b + c;
         return result;
         }
    
    public double add(double a, double b){
            double result = a + b;
            return result;
             }
    }

public class Prg3Overloading {
    
    

     public static void main(String args[]){
      Calc obj = new Calc();

       int result =obj.add(3,4);
        System.out.println(result);

        int r1 = obj.add(3,5,8);
        System.out.println(r1);

        double r2 = obj.add(3.4 , 9.6);
        System.out.println(r2);


       

      
}
}