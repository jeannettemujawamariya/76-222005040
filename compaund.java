
//java programm to find Compaund interest with method 
class compaund{
    public double display(int p,double r,int t,int n){
        return p*(Math.pow((1+r/1200),n*t));
    }
}
class main{
    public static void main(String[]args){
        compaund a=new compaund();
        double output=a.display(500000,18,3,12);
        System.out.println("output is :"+output);
    }
}