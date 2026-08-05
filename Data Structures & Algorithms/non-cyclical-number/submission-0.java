class Solution {
    public static int add(int n){
     int sum=0;
      while(n>0){
       
        int digit=n%10;
        sum+=Math.pow(digit,2);
        n=n/10;
    }
    return sum;
    }
    public boolean isHappy(int n) {
        int i=n;
        int j=n;
        do{
            i=add(i);
            j=add(add(j));
        }while(i!=j);
        return i==1;
    }
}
