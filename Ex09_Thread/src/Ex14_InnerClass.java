//사용
//awt, swing, andorid 사용
//android 사용 > (이벤트) 제어 사용 (코드 패턴)

//클래스 안에 클래스가 들어가있는 형태
//Inner class, Outer class
/*
class Outerclass{
   class Inner class{
      
   }
}
*/

class OuterClass{
   public int pdata = 100;
   private int data = 30;
   
   //장점 : outclass 자원을 사용할 수 있다
   class InnerClass{
      void msg(){
         System.out.println("Outer data : " + data);
      }
   }
}

////////////////////////////////////////////////////////////

abstract class Person2{
   abstract void eat();
}

class Man extends Person2{
   @Override
   void eat(){
      System.out.println("Person2의 eat함수 재정의");
   }
}

////////////////////////////////////////////////////////////

interface Eattable{
   void eat();   
}

class InnerTest{
   public void method(Eattable e){
      e.eat();
   }
}


public class Ex14_InnerClass {

   public static void main(String[] args) {

      OuterClass outobj = new OuterClass();
      System.out.println("public 자원 : " + outobj.pdata);
      
      OuterClass.InnerClass innerobj = outobj.new InnerClass();
      innerobj.msg();
      
      /*   
       Man m = new Man();
      Person2 p2 = m;
      p2.eat();
      */
      
      /*
      Person2 p2 = new Man();
      p2.eat();
      */
      
      //JAVA
      //Person2 상속하는 Man 없이도 객체를 만들어서 사용가능
      //익명타입
      Person2 p3 = new Person2() {         
         @Override
         void eat() {
            System.out.println("익명 타입으로 구현");            
         }
      };
      p3.eat();
      
      ////////////////////////////////////////////////////////////
      
      //이름이 없는 클래스, 단 하나의 객체만을 생성 사용
      InnerTest inner = new InnerTest();
      inner.method(new Eattable() {         
         @Override
         public void eat() {
            System.out.println("일회성 자원");            
         }
      });         
   }
}