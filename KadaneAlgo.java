public class KadaneAlgo {
    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        int result = maxSum(arr);
        int[] indexResult = reIndex(arr);
        System.out.println(result);
        System.out.println(indexResult[0]);
        System.out.println(indexResult[1]);

    }

    static int maxSum(int[] arr){
        int max = Integer. MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            max = Math.max(max, sum);
            if(sum < 0){
                sum = 0;
            }
        }
        return max;
    }

    static int[] reIndex(int[] arr){
        int max = Integer. MIN_VALUE;
        int sum = 0;
        int arrStart = -1;
        int arrEnd = -1;
        int start = 0;
        for(int i = 0; i < arr.length; i++){
            //if(sum == 0) start = i;
            sum += arr[i];
            if(sum > max){
                max = sum;
                arrStart = start;
                arrEnd = i;
            }
            if(sum < 0){
                sum = 0;
                start = i+1;
            }
        }
        return new int[]{arrStart, arrEnd};
    }
}