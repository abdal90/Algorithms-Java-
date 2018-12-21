public class recursiveBinarySearch {

    public static boolean binarySearchRecursive(int[] array, int x, int left, int right) {
        // if number on the left is bigger than right 13, 9 . Should be an error
         if (left > right){
            return false;
        }

        // pick the mid point
        int mid = (left + right) / 2;
            // if mid number is what we are looking for then return true
         if (array[mid] == x){
             return true;
         }else if (x < array[mid]){
             // if our number is less than midpoint
             // right of the array will move to mid - 1
             return binarySearchRecursive(array, x, left, mid-1);
         }else {
             // search the right side
             // left of the array moves to mid + 1
             return binarySearchRecursive(array, x, mid + 1, right);
         }
    }

    public static boolean binarySearchRecursive(int[] array, int x) {
        return binarySearchRecursive(array, x, 0, array.length -1);
    }

    public static void main(String[] args) {

    }

}
