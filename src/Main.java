import exception.YoungerAgeException;

public class Main {
    public static void main(String[] args) {
        int age=16;
       try {
           if(age<18){
               throw  new YoungerAgeException("not eligible to vote");
           }
       }catch (Exception e){
           e.printStackTrace();
       }
        System.out.println("hello shashi");
    }
}
