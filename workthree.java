
//java program to declare using if else
class workthree{
    public static void main(String[]args){
        int a=1900;
        //money earned are calculated in dollars
        if(a<=500){
            System.out.println("you are prohibited ");
        }
        else if(a <=1000){
            System.out.print("you are not prohibited");
        }
        else if(a>=5000){
            System.out.println("you are no longer prohibited");
        }
        else
        System.out.println("invalid");
    }
}