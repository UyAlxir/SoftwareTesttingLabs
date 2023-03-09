public class Solve {
    public long getMax(int x){
        long res = 1;
        long[] answers = {1,1,2,4};
        if(x<answers.length)
            res = answers[x-1];
        else {
            long cnt = x/3;
            long rem = x%3;
            res = (long) Math.pow(3.0,(double) cnt);
            if(rem == 1){
                res = res/3*4;
            } else if(rem == 2){
                res *= 2;
            }
        }
        return res;
    }
}
