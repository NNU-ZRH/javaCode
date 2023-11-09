/**
 * @author zrh
 * @version 1.0.0
 * @title Solution
 * @description <TODO description class purpose>
 * @create 2023/11/1 14:42
 **/
public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param n int整型
     * @return int整型
     */
    public int cutRope (int n) {
        // write code here
        if (n==2)return 2;
        if (n==3)return 3;
        int res = Integer.MIN_VALUE;
        for (int i = 2; i < n; i++) {
            if (i==2||i==3){
                res = Math.max(res,i*cutRope(n-i));
            }
        }
        return res;
    }
}