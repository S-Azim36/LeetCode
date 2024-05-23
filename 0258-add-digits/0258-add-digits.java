class Solution {
    public int addDigits(int num) {
        String len=String.valueOf(num);
        while(len.length()>1){
            int val1,val2;
            val1=num%10;
            val2=num/10;
            num=val1+val2;
            len=String.valueOf(num);
            if(len.length()<1)
            {
                break;
            }
            
        }
        return num;
       
    }
}