public class _01backpack {
    public int backpack(int[] w, int[] v, int vol){
        int ans = 0;
        int[] dp = new int[vol+1];
        for(int d:dp)d=0;
        for(int i=0;i<w.length;i++){
            for(int j=vol;j>=w[i];j--){
                dp[j]=Math.max(dp[j],dp[j-w[i]]+v[i]);
            }
        }
        for(int j=0;j<=vol;j++)ans = Math.max(ans,dp[j]);
        return ans;
    }
}
