class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        
        List<Integer> listofnumbers = new ArrayList<>();
        while(left <= right) {
            if(checkSelftDivided(left))
            {
                listofnumbers.add(left);
            } 
            left++;
        }

        return listofnumbers;
    }

    static boolean checkSelftDivided(int i) {
        int n = i;
        while(n > 0) {
            if (n%10 == 0) 
            {
                return false;
            }
            if(i % (n%10) != 0) 
            {
                return false;
            }
            n /= 10;
        }
        return true;
    }
}