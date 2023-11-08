public class Visa{//java pragram for interface and implementation
    public void Give(){
        System.out.println("Give me the result");
    }
}
public class Nationality extends Visa{
    public void get(){
        System.out.println(" You can fly");
    }
}
interface E{
     void print();
}
class Me extends Age implements E{
    void print(){
        System.out.println(" she is  tuenty five years old"); 
    
  }
}
  class Question1{
 public static void main(String[] args){
    Visa d=new Visa();
    d.Give();
    d.get();
    d.print();
    d.Hi();
 }
  }