class Solution {
    public int[] plusOne(int[] digits) {
        int flag = 0;
        int i= digits.length-1;
        for(;digits[i]==9;){
            flag = 1;
            System.out.print("here1");
            if(i>=0) digits[i] = 0;
            if (i<=0) break;
            i--;
            if(digits[i]!=9) {
                flag=2;
                break;
            }
        }
        
        if(flag==1 && i==0){
            System.out.print("here4");
            int[] res = new int[digits.length+1];
            res[0]=1;
            for(int j=0,k=0;j<res.length-1;j++,k++){
                res[j+1]=digits[k];
                System.out.print("here2");  
            }
            return res;
        }
        if(flag==2){
            digits[i]=digits[i]+1;
            return digits;
        }
        System.out.print("here3");

        digits[digits.length - 1] = digits[digits.length - 1] + 1;
        return digits;
    }
}