//���
//awt, swing, andorid ���
//android ��� > (�̺�Ʈ) ���� ��� (�ڵ� ����)

//Ŭ���� �ȿ� Ŭ������ ���ִ� ����
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
   
   //���� : outclass �ڿ��� ����� �� �ִ�
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
      System.out.println("Person2�� eat�Լ� ������");
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
      System.out.println("public �ڿ� : " + outobj.pdata);
      
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
      //Person2 ����ϴ� Man ���̵� ��ü�� ���� ��밡��
      //�͸�Ÿ��
      Person2 p3 = new Person2() {         
         @Override
         void eat() {
            System.out.println("�͸� Ÿ������ ����");            
         }
      };
      p3.eat();
      
      ////////////////////////////////////////////////////////////
      
      //�̸��� ���� Ŭ����, �� �ϳ��� ��ü���� ���� ���
      InnerTest inner = new InnerTest();
      inner.method(new Eattable() {         
         @Override
         public void eat() {
            System.out.println("��ȸ�� �ڿ�");            
         }
      });         
   }
}