public class RotatedBS {
    public static void main(String[] args) {
        int[] nums = {5,6,7,8,9,1,2,3};
        System.out.println(RBS(nums, 4, 0, nums.length - 1));
    }

    static int RBS(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        // if target found at the mid
        if (target == arr[mid]) {
            return mid;
        }

        // if the start and mid array is sorted and target lies between start and mid
        if (arr[start] <= arr[mid]) {
            if (target >= arr[start] && target <= arr[mid]) {
                return RBS(arr, target, start, mid - 1);
            } else {
                return RBS(arr, target, mid + 1, end);
            }
        };

        // if the start and mid array is not sorted and target lies b/w mid and end

        if(target >= arr[mid] && target <= arr[end]){
            return RBS(arr, target, mid + 1, end);
        }
        // if the start and mid array is not sorted and target lies b/w start and mid
        return RBS(arr, target, start, mid - 1);
    }
}
