public class BinarySearch {
    public static void main(String[] args) {
        int[] arr= {-11,-1,1,2,3,4,32};
        System.out.println(binarySearch(arr, 32));
    }

    static int binarySearch(int[] arr, int target){
        int start= 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start+(end-start)/2;
            if(target>arr[mid]){
                start= mid+1;
            }
            else if(target<arr[mid]){
                end = end-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
