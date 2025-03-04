//import java.util.*;
//
//class Solution {
//
//    public static void main(String args[]){
//        int[] arr = new int[5];
//         numIdenticalPairs();
//    }
//
//    private static void numIdenticalPairs() {
//    }
//
//    int[] ans = new int[2];
//        int count = 0;
//
//        HashMap<Integer, Integer> getNums = new HashMap<>();
//
//        for(int i=0;i<nums.length;i++){
//
//            if(getNums.containsKey(nums[i])){
//                getNums.put(nums[i], getNums.get(nums[i]) + 1 );
//                ans[count] = nums[i];
//                count++;
//            }
//            else{
//                getNums.put(nums[i], 1);
//            }
//        }
//            return ans;
//    }
//}