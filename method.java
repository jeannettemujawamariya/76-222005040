
//java programm to use method in calculation of two number
class student{
    public static int addnumbers(int num1,int num2){
        return num1 + num2;
    }
    public static void main(String[]args){
        int number1=5;
        int number2=7;
        int result=addnumbers(number1,number2);
        System.out.println("the sum of "+number1 +"and"+ number2 + "is"+ result);
    }
}