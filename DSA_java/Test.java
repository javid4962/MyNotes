import javax.swing.JOptionPane;

public class Test{
  public static void main(String[] args) {
    Greet gt1 = new  Greet();
    System.out.println(gt1.a);
    // gt1.greeting();
    JOptionPane.showMessageDialog(null, "Hello all !!!", "Greeter", JOptionPane.INFORMATION_MESSAGE);

    System.out.println("Hello to everyone iam Test.java file");
  }
}
class Greet{
  int a = 3;
  public void greeting(){
    System.out.println("Hello this is a greeting class and getting method");
  }
}
