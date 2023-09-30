class richestperson {
    public static void main(String[] args) {
        int accounts[][]={{1,5},{7,3},{3,5}};
        System.out.println(maximumWealth(accounts));
    }
    static int maximumWealth(int[][] accounts) {
        int max= Integer.MIN_VALUE;
        int sum;
        for(int i=0;i<accounts.length;i++)
        {
            sum=0;
            for(int j=0; j< accounts[i].length;j++)
            {
                sum+=accounts[i][j];
            }
            if(sum>max)
            {
                max=sum;
            }
        }
        return max;
    }
}