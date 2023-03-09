package com.yjc.array;

/**
 * @author yjc
 * @date 2023/3/9 13:49
 */
public class L2379 {



}

class Solution {
    public int minimumRecolors(String blocks, int k) {
        // 左右指针维持一个宽度为k的窗口，统计最大的B字母数
        int left = 0;
        char[] elements = blocks.toCharArray();
        int blackNum = 0;
        int ans = 0;
        for (int right = 0;right < elements.length;right++){
            if(elements[right] == 'B'){
                blackNum++;
            }
            if(right >= k){
                if (elements[left] == 'B'){
                    blackNum--;
                }
                left++;
            }
            ans = Math.max(blackNum,ans);
        }
        return k - ans ;
    }

}

