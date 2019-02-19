

public class BubbleSort {

	public static void main(String[] args) {
		BubbleSort obj = new BubbleSort();
        int array1[] = {15,16,12,25,19,64,33,24};
        obj.bubble(array1);
        System.out.println("The Sorted array is");
        obj.printArray(array1);
		

	}
	
	 void bubble(int arr[])
	    {
	        int n = arr.length;
	        for (int i = 0; i < n-1; i++)
	            for (int j = 0; j < n-i-1; j++)
	                if (arr[j] > arr[j+1])
	                {
	                    int temp = arr[j];
	                    arr[j] = arr[j+1];
	                    arr[j+1] = temp;
	                }
	    }
	 
	 
	 void printArray(int arr[])
	    {
	        int n = arr.length;
	        for (int i=0; i<n; ++i)
	            System.out.print(arr[i] + " ");
	        System.out.println();
	    }
	 
}
