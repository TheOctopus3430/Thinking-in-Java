package com.zy.chapter8;

class Insect {
    private MyPrint  i =  new MyPrint("父类成员属性") ;
    protected int j;
    Insect() {
        System.out.println("父类构造函数");

    }
    private  static  MyPrint  x1 =  new  MyPrint("父类静态变量");
      static{
          System.out.println("父类静态代码块");

      }
}

public class Beetle extends Insect {

    public Beetle() {
        System.out.println("子类构造函数");
    }
    private MyPrint k = new MyPrint("子类成员变量");
    static{
        System.out.println("子类静态代码块");

    }
    private static MyPrint x2 = new MyPrint("子类静态成员变量");
    public static void main(String[] args) {
        Beetle b = new Beetle();
    }
}
class   MyPrint{
    MyPrint(String value){
        System.out.println(value);
    }
}
