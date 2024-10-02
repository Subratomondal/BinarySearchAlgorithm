public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr= {-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        System.out.println(orderAgnosticBS(arr,22));
    }
    static int orderAgnosticBS(int[] arr, int target){
        int start= 0;
        int end = arr.length-1;

        boolean isAscending = arr[start]< arr[end];

        while(start<=end){
            int mid = start+(end-start)/2;
            if(target==arr[mid]){
                return mid;
            }
            if(isAscending){
                if(target>arr[mid]){
                    start= mid+1;
                }
                else {
                    end = end-1;
                }
                
            }
            else{
                if(target<arr[mid]){
                    start= mid+1;
                }
                else{
                    end = end-1;
                }
                
            }
        }
        return -1;
    
    }
}
