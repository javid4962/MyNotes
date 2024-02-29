class Teacher{
    String name;
    String subject;
    int salary;
    void currentTopic(){
        System.out.println("Iam learning : "+subject);
    }
    Teacher (String name, String subject, int salary){
        this.name = name;
        this.subject = subject;
        this.salary = salary;
    }
}

public class TeacherApp {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Deep","java",25000);
        Teacher t2 = new Teacher("Harry","Full Stack Webdev",50000);
        System.out.println(t1.name);
        System.out.println(t1.subject);
        System.out.println(t1.salary);
        System.out.println(t2.name);
        System.out.println(t2.subject);
        System.out.println(t2.salary);
    }    
}
