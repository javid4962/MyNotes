import java.util.LinkedList;

public class Linked_list{
  public static void main(String[] args)
    {
      LinkedList<Integer> list = new LinkedList<>();
      int[] arr = {1,2,3,4,5,6,7,8,9,0};
        for(int item : arr){
          list.add(item);
        }
        System.out.println(list);
        int element = 3;
        int ans = -1;
        for (int i = 0; i < list.size(); i++) {
  
            int llElement = list.get(i);
  
            if (llElement == element) {
              list.remove(i);
            }
        }
        System.out.println(list);
    }
}
