public class Prg11NestedIfElse {
    public static void main(String args[]){
        
        //if inside if is called nested if 
        int age = 45;
        if(age >17 && age < 61){
            System.out.println("you are adult");
            if(age ==35){
                System.out.println("you are mid at 30's");
            }
            else{
                System.out.println("you are adult");
            }
        }
        else if(age>=61){
            System.out.println("you are old man");
        }
        else{
            System.out.println("you are kid");
        }
        
    }
    
}
