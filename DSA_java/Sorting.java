public class Sorting{
  static int minIndex = -1;

  public static void main(String[] args){
    int nums[] = {5,6,2,3,1,8,4};
    int size = nums.length;

    System.out.println("Before Sorting ");
    for(int num : nums){
      System.out.print(num+" ");
    }
    System.out.println("\n");

    System.out.print("During Sorting ");

    // BubbleSort(nums, size);
    // SelectionSort(nums, size);
    // InsertionSort(nums, size);
    // QuickSort(nums, 0, size-1);
    MergeSort(nums, 0, size-1);

    System.out.println();
    System.out.println("\nAfter Sorting ");
    for(int num : nums){
      System.out.print(num + " ");
    }
  }

// Bubble Sorting 

  public static void BubbleSort(int[] nums, int size){
    int temp = 0;
    for(int i = 0; i< size; i++){
      for(int j = 0; j < size-i-1; j++){
        if(nums[j] > nums[j+1]){
          temp = nums[j];
          nums[j] = nums[j+1];
          nums[j+1] = temp;
        }
        System.out.println();
        for(int num : nums){
          System.out.print(num + " ");
        }
      }
    }
  }

// Selection Sorting

  public static void SelectionSort(int[] nums, int size){
    // int minIndex = -1;
    int temp = 0;

    for(int i = 0; i < size-1; i++){
      minIndex = i;

      for(int j = i+1; j < size; j++){
        if(nums[minIndex] > nums[j]){
          minIndex = j;
        }
       
      }
      temp = nums[minIndex];
      nums[minIndex] = nums[i];
      nums[i] = temp;      
      
      System.out.println();
      for(int num : nums){
        System.out.print(num+ " ");
      }
    }    
  }
  
// Insertion Sorting

  public static void InsertionSort(int[] nums, int size){
    
    for(int i = 1; i < size; i++){
      int key = nums[i];
      int j = i-1;

      while(j >= 0 && key < nums[j]){
        nums[j+1]= nums[j];
        j = j -1;

      }
      nums[j+1]=key;
      System.out.println();
      for(int num : nums){
        System.out.print(num + " ");
      }
    }
  }

// Quick Sorting
  
  public static void QuickSort(int[] nums, int low, int high){
    if(low < high){
      int pi = Partition(nums, low, high);

      QuickSort(nums, low, pi - 1);
      QuickSort(nums, pi + 1, high);
    }
  }
  
  public static int Partition(int[] nums, int low, int high){
    int i = low -1;
    int pivot = nums[high];

    for(int j = low; j < high; j++){
      if(nums[j] < pivot){
        i++;
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
      }
    }
    int temp = nums[i+1];
    nums[i+1] = nums[high];
    nums[high] = temp;

    return i+1;
  }

  // MergeSort
  public static void MergeSort(int[] nums, int l, int r){
    if(l < r){
      int mid = (l + r) / 2;

      MergeSort(nums, l, mid);
      MergeSort(nums, mid+1, r);
      
      Merge(nums, l, mid, r);
    }
  }
  public static void Merge(int[] nums, int l, int mid, int r){
    int n1 = mid - l +1;
    int n2 = r - mid;

    int lArr[] = new int[n1];
    int rArr[] = new int[n2];

    for(int x = 0; x < n1; x++){
      lArr[x] = nums[l+x];
    }
    for(int x = 0; x < n2; x++){
      rArr[x] = nums[mid + 1 + x];
    }

    int i = 0; 
    int j = 0; 
    int k = l;

    while(i < n1 && j < n2){

      if(lArr[i] <= rArr[j]){
        nums[k] = lArr[i];
        i++;
      }
      else{
        nums[k] = rArr[j];
        j++;
      }
      k++;
    }
    while(i < n1){
      nums[k] = lArr[i];
      i++;
      k++;
    }
    while(j < n2){
      nums[k] = rArr[j];
      j++;
      k++;
    }
  }

}
