public class iterativeBinarySearch {
    public static boolean binarySearchIterative(int[] array, int x) {
        int left = 0; // start of the array
        int right = array.length - 1; // end of the array

        // loop through while left and right are in the correct positions
        while (left <= right) {
            // pick the mid point
            int mid = (left + right) / 2;
            // if mid number is what we are looking for then return true
            if (array[mid] == x) {
                return true;
            } else if (x < array[mid]) {
                // if our number is less than midpoint
                // right of the array will move to mid - 1
                right = mid - 1;

            } else {
                // search the right side
                // left of the array moves to mid + 1
                left = mid + 1;
            }
        }
        // if number was not found
        return false;
    }


    public static void main(String[] args) {

        int[] arrayTest = new int[]{1,2,3,4,5,6,8,9,10};

        // find 2 should return true
        boolean result = binarySearchIterative(arrayTest, 2);

        System.out.println(result);
    }
}
