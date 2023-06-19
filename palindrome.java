class Solution {
    public boolean isPalindrome(int x) {
            int rem=0;
            int total=0,y=x;
        while(x!=0)
        {
           rem=x%10;
            total=total*10+rem;
            x=x/10;
        }
        if(total==y&&total>=0)
        {
            return true;
        }
        else
        {
            return false;
        }

        
    }
}