package com.yjc.recursion;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yjc
 * @date 2023/3/9 22:59
 */
public class C0802 {
}
class Solution {
    static List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> pathWithObstacles(int[][] obstacleGrid) {
        result.clear();
        if (obstacleGrid[0][0] == 1) return result;
        dfs(obstacleGrid, obstacleGrid.length-1, obstacleGrid[0].length-1);
        return result;
    }

    public boolean dfs(int[][] obstacleGrid, int i, int j) {
        if (i==0 && j==0) {
            add(i, j);
            return true;
        }

        if (obstacleGrid[i][j] > 0) return false;
        obstacleGrid[i][j] = 2;
        if (i>0 && dfs(obstacleGrid, i-1, j)) {
            add(i, j);
            return true;
        }
        if (j>0 && dfs(obstacleGrid, i, j-1)) {
            add(i, j);
            return true;
        }

        return false;
    }

    public void add(int i, int j){
        List<Integer> list = new ArrayList<>();
        list.add(i);
        list.add(j);
        result.add(list);
    }



}

