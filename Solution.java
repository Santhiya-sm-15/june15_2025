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