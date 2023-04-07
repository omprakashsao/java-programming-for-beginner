class Om {
    public void show(int n){
        System.out.println("int  "+n);
    }

    public void show(byte n){
        System.out.println("byte  "+n);
    }

    public void show(short n){
        System.out.println("short  "+n);
    }

    // public void show(char n){
    //     System.out.println("char  "+n);
    // }

}
public class AutoPromotionOverloading {
   
    
    public static void main(String args[]){
    Om obj = new Om();
    
    obj.show(2);//in java default value is int for integers value
    
    byte n = 2;
    obj.show(n);// show byte or any data type if we set or intialize by that data type

    obj.show('A');// show 65 if char method is not exist according to automatic promotion in overloading
    }

    //automatic promotion in overloading
    //the priority sequence is byte-->short=char-->int-->long-->float-->double
    
}
