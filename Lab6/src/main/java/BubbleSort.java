public class BubbleSort {
    public int[] sort(int[] list,int len){
        for(int i=0;i<=len-2;i++){
            boolean not_found = true;
            for(int j=1;j<=len-1-i;j++){
                if(list[j-1]>=list[j]){
                    int temp = list[j-1];
                    list[j-1] = list[j];
                    list[j] = temp;
                    not_found = false;
                }
            }
            if(not_found==true){
                break;
            }
        }
        return list;
    }
}
