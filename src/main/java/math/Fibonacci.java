package math;

public class Fibonacci {
  public int fibTopDown(int n) {
    return fibTopDown(n, new int[n+1]);
  }
  
  private int fibTopDown(int n, int[] memo) {
    // Base cases
    if(n == 0)
      return 0;
    if(n == 1)
      return 1;
    
    if(memo[n] != 0) {
      // System.out.println("Using cached result for: " + n);
      return memo[n];
    }
    
    memo[n] = fibTopDown(n-1, memo) + fibTopDown(n-2, memo);
    return memo[n];
  }
  
  public int fibBottomUp(int n) {
    // Base cases
    if(n == 0)
      return 0;
    if(n == 1)
      return 1;
    
    int[] dp = new int[n+1];
    dp[0] = 0;
    dp[1] = 1;
    
    for(int i = 2; i <= n; i++)
      dp[i] = dp[i-1] + dp[i-2];
    
    return dp[n];
  }
}
