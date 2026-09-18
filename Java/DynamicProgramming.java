package Java;

public class DynamicProgramming {
    public static void main(String[] args){
        int[] dp = new int[5];

        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= 4; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        System.out.println(dp[4]);
    }
}
