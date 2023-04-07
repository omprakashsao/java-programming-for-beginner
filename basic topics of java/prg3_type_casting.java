class prg3_type_casting{
    public static void main(String args[]){

    //type casting is a techniqe to change data type and also size from one to another
    //for e.g. int --> double
    // chote size ko bade mai dalna implicit
    // bade size ko chote mai dalna explicit

    //implicit type casting
    int num1 = 10;
    double num2;
    num2 = num1;
    System.out.println(num2);

    //explicit typecasting
    double num3 = 30.45;
    int num4;
    num4 = (int)num3;
    System.out.println(num4);


    }
}