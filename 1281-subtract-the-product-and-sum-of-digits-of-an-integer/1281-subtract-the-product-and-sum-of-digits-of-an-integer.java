class Solution {
    public int subtractProductAndSum(int n) {
        int Product = 1;
        int Sum = 0;
        int Result = 0;
        int digit = 0;
        while(n != 0){
            digit = n % 10;
            Product = Product * digit;
            Sum = Sum + digit;
            Result = Product - Sum;
            n = n / 10;
        }
        return Result;
    }
}