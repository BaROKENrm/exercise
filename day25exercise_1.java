package day25;

import java.util.*;
//给定一个无重复元素的有序整数数组 nums 。
//        返回 恰好覆盖数组中所有数字 的 最小有序 区间范围列表。也就是说，nums 的每个元素都恰好被某个区间范围所覆盖，并且不存在属于某个范围但不属于 nums 的数字 x 。

public class day25exercise_1 {

    public  List<String> summaryRanges(int[] nums) {
        List<String> summary = new ArrayList<>();
        for (int i, j = 0; j < nums.length; ++j){
            i = j;
            // try to extend the range [nums[i], nums[j]]
            while (j + 1 < nums.length && nums[j + 1] == nums[j] + 1)
                {++j;}
            // put the range into the list
            if (i == j){
                summary.add(nums[i] + "");}
            else{
                summary.add(nums[i] + "->" + nums[j]);}
        }
        return summary;
    }
}



