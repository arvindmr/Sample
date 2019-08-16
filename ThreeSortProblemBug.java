public class ThreeSortProblemBug {

    public static void main(String[] args) {
        int arr[] = new int[]{ 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        sort(arr);
        for(int index=0; index<arr.length ; index++){
            System.out.print(arr[index]);
        }
    }

    public static void swap(int[] arr, int index, int newIndex){
        int temp = arr[index];
        arr[index] = arr[newIndex];
        arr[newIndex] = temp;
    }

    public static void sort(int arr[]) {
        int size = arr.length;
        int start = 0;
        int end = size - 1;
        int current =0;

        while(current <= end) {
            switch (arr[current]) {
                case 0:
                    swap(arr,start,current);
                    start++;
                    break;
                case 1:
                    current++;
                    break;
                case 2:
                    swap(arr,end,current);
                    end--;
                    break;
            }
        }
    }
}
