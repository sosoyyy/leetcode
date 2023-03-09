package com.yjc.recursion;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author yjc
 * @date 2023/3/9 15:18
 */
public class C0801 {

    private int[] mem = new int[1000000];

    public int waysToStep(int n) {
        // 楼梯问题
        if (n == 1){
            return 1;
        }else if(n == 2){
            return 2;
        }else if(n == 3){
            return 4;
        }
        if(mem[n] > 0){
            return mem[n];
        }
        int res = waysToStep(n-1)%1000000007 + waysToStep(n-2)%1000000007 +   waysToStep(n-3)%1000000007;
        mem[n] = res;

        // 记忆化递归
        return res;
    }
}
