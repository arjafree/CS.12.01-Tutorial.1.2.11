public class DiverseArray {
    static int arraySum(int[] arr){
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum+=arr[i];
        }
        return sum;
    }

    static int[] rowSums(int[][] arr){
        int[] array;
        array = new int[arr.length];
        for(int i = 0; i<arr.length; i++){
            array[i] = arraySum(arr[i]);
        }
        return array;
    }
    static boolean isDiverse(int [][] arr){
        int[] sumArray = rowSums(arr);
        for(int i = 0; i<sumArray.length; i++){
            for(int j = i+1; j<sumArray.length; j++){
                if(sumArray[i] == sumArray[j]){
                    return false;
                }
            }
        }
        return true;
    }
}
