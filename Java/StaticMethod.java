public class StaticMethod {
    public static void main(String[] args){
        System.out.println("Hello all");
        StaticMethod sm = new StaticMethod();
        sm.second();
    }
    public void second(){
        System.out.println("Hello from second method");
    }
}
