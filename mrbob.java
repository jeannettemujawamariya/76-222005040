

// Java program to display simple interest
class mrbob{
    public static double interest(int p,double r,int t){
        return p*r*t;
    }
    public static void main(String[]args){
        int principle=1000000;
        double rate=0.05;
        int time=5;
        double result=interest(principle,rate,time);
        System.out.println(result);
    }
}