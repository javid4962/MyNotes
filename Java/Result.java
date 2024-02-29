import java.util.Scanner;
class Result{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter size of the array: ");
      int n = sc.nextInt();
      int marks[] = new int[n];
      // Storing marks of the student
      System.out.println("Enter marks of the Students: ");
      for(int i = 0; i < marks.length; i++){
        marks[i] = sc.nextInt();
      }
      // Printing marks of the student
      System.out.println("Marks of students: ");
      for(int i = 0; i < marks.length; i++){
        System.out.println(marks[i]);
      }
    }
  }