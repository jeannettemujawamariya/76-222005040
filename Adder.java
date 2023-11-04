
///java program to show object

class adder{
    public int add(int num1, int num2){
        return num1+num2;
    }
}
class Main{
    public static void main(String[]args){
        adder Myadder=new adder();
        int result=Myadder.add(5,3);
        System.out.println("answer is:"+result);
    }
}