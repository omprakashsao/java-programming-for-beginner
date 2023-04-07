
public class Prg1InstanceVariable {
    int a;
    String name = "Shiv Baba";

    public static void main(String args[]){

        //for creating an object 
        //1. declare the variable
        //2. create object

        
        int num = 9;// primitive variable
        Prg1InstanceVariable obj1 = new Prg1InstanceVariable();//reference vareable.(it is store in an stack)
        Prg1InstanceVariable obj2 = new Prg1InstanceVariable();
        // the object is store the instance variable value in heap(type of memory)

        obj2.name = "Om Prakash";

        System.out.println(obj1.a);
        System.out.println(obj1.name);

        System.out.println(obj2.a);
        System.out.println(obj2.name);
        




    }
    
}
