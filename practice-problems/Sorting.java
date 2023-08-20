public class Sorting {
    public static void main(String[] args) {
        int arr[] = {15,4,12,1,1};
        
        QuickSort(arr, 0, arr.length-1);

        printArray(arr);

    }

    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void BubbleSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

    public static void SelectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length-i-1;
            int maxIndex = GetMaxIndex(arr, 0, last);
            int temp = arr[maxIndex];
            arr[maxIndex]=arr[last];
            arr[last]=temp;
        }
    }

    public static int GetMaxIndex(int[] arr, int start, int end){
        int max = start;
        for (int i = start; i <= end; i++) {
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }

    public static void InsertionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j > 0; j--) {
                if(arr[j] < arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                } else {
                    break;
                }
            }
        }
    } 

    public static int Partition(int[] arr, int pivot, int start, int end){
        int i = start-1;

        for (int j = start; j < end; j++) {
            if(arr[j]<=pivot){
                i++;
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i]=pivot;
        arr[end]=temp;

        
        return i;
    }


    public static void QuickSort(int[] arr, int start, int end){
        if(start>=end){
            return;
        }
        int pivot = arr[end];
        int pivotIndex = Partition(arr, pivot, start, end);
        QuickSort(arr, start, pivotIndex-1);
        QuickSort(arr, pivotIndex+1, end);
    }
}
