package day58;
//leetcode 978 最长湍流子数组
public class day58exercise_1 {
    public int maxTurbulenceSize(int[] arr) {
        int len = arr.length;
        int left = 0;
        int right = 0;
        int ret = 1;
        while (right < len - 1) {
            if (left == right) {
                if (arr[left] == arr[left + 1]) {
                    left++;
                }
                right++;
            } else {
                if (arr[right - 1] < arr[right] && arr[right] > arr[right + 1]) {
                    right++;
                } else if (arr[right - 1] > arr[right] && arr[right] < arr[right + 1]) {
                    right++;
                } else {
                    left = right;
                }
            }
            ret = Math.max(ret, right - left + 1);
        }
        return ret;
    }
}
