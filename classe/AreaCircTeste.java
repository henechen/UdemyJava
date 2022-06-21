package classe;

public class AreaCircTeste {

  public static void main(String[] args)
  {
      AreaCirc a1 = new AreaCirc(5.6);
      System.out.println(a1.area());

      AreaCirc a2 = new AreaCirc(10);
//      a2.pi = 10;
      AreaCirc.pi = 3.1415;
      System.out.println(a2.area());

      AreaCirc a3 = new AreaCirc(5);
//      a3.pi = 5;
      System.out.println(a3.area());

      AreaCirc.pi = 3.1415;

  }
}
