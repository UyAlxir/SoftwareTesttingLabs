public class Myclass {
    public boolean check(int x){
        int[] moneys={1,1,1,5,5,10,20,50};
        int total = 0;
        for(int i=0;i< moneys.length;i++){
            total+=moneys[i];
        }
        boolean[] dp = new boolean[total+1];
        for(int i=0;i< dp.length;i++){
            dp[i]=false;
        }
        dp[0]=true;
        for(int i=0;i< moneys.length;i++){
            int cur = moneys[i];
            for(int j=total;j-cur>=0;j--){
                if(dp[j-cur])dp[j]=true;
            }
        }
        boolean res = dp[x];
        return res;
    }
}
