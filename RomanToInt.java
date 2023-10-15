public class RomanToInt{
    public static int romanToInt(String s) {
        int n = s.length();
        int nums[] = new int[n];
        char arr[] = s.toCharArray();
        for(int i = 0; i < n; i++) {
            switch(arr[i]){
                case 'I':
                    nums[i] = 1;
                    break;
                case 'V':
                    nums[i] = 5;
                    break;
                case 'X':
                    nums[i] = 10;
                    break;
                case 'L':
                    nums[i] = 50;
                    break;
                case 'C':
                    nums[i] = 100;
                    break;
                case 'D':
                    nums[i] = 500;
                    break;
                case 'M':
                    nums[i] = 1000;
                    break;
            }
        }
        int sum = 0;
        for(int i = 0;  i < n - 1; i++) {
            if(nums[i] >= nums[i+1]){
                sum += nums[i];
            }
            else {
                sum -= nums[i];
            }
        }
        sum += nums[n-1];
        return sum;
    }
    public static void main(String args[]){
        String s = "IIIIX";
        int res = romanToInt(s);
        System.out.println(res);
    }
}