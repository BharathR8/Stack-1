//Time Complexity: O(n)
//Space Complexity: O(n)

import java.util.*;

class Solution {
    public int[] nextGreaterElements(int[] nums) {
          if(nums == null || nums.length == 0) {
              return new int[]{};
          }

          Stack<Integer> s = new Stack<>();
          int n = nums.length;
          int[] result = new int[n];
          Arrays.fill(result, -1);
          for(int i = 0; i < 2 * n; i++) {
              while(!s.isEmpty() && nums[i  %  n] > nums[s.peek()]) {
                  int popped = s.pop();
                  result[popped] = nums[i % n];
              }

              s.push(i % n);
          } 

          return result;
    }
}