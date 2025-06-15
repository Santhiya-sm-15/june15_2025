# june15_2025
The problems that I solved today

You are given an integer num. You will apply the following steps to num two separate times:

Pick a digit x (0 <= x <= 9).
Pick another digit y (0 <= y <= 9). Note y can be equal to x.
Replace all the occurrences of x in the decimal representation of num by y.
Let a and b be the two results from applying the operation to num independently.

Return the max difference between a and b.

Note that neither a nor b may have any leading zeros, and must not be 0.

Code:
class Solution {
    public int maxDiff(int num) {
        String s=String.valueOf(num);
        long max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        for(int i=0;i<=9;i++)
        {
            for(int j=0;j<=9;j++)
            {
                if(i==j || (s.charAt(0)-'0'==i && j==0)) continue;
                String x=s.replaceAll(String.valueOf(i),String.valueOf(j));
                long n=Long.parseLong(x);
                if(n==0) continue;
                max=Math.max(max,n);
                min=Math.min(min,n);
            }
        }
        return (int)(max-min);
    }
}
