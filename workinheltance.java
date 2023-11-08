 class studentage{//java programm to calculate the age of student inheltance
    public static void main(String args[]) {
        A myobj=new A();
        myobj.show();
        myobj.display();
        myobj.calculate();
        myobj.add();
        myobj.interfacetest();
        
    }
}

class D{
    int a=18;
    int b=25;
    
    public void add(){
        int result=a+b;
        System.out.println(result);

    }
}
class C extends D{
    public static void display(){
        System.out.println("the student number are");
    }
}
class B extends C{
    public static void calculate(){
        int c=15;
        int d=35;
        int result=d-c;
        System.out.println(result);
    }
}

    interface E {
   void interfacetest();
} 

class A extends B implements E{
    public  void show() {
        System.out.println(a+b);
        
    }
    
    public void interfacetest(){
    
    System.out.println("this is how student are likely to be");
}
}
