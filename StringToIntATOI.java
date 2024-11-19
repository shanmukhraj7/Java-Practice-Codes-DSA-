public class StringToIntATOI {
    public static int myAtoi(String s) {
        int INT_MAX = 2147483647, INT_MIN = -2147483648;
        int i = 0, n = s.length(), sign = 1, res = 0;
        while(i < n && s.charAt(i) == ' ') i++;
        if(i<n && (s.charAt(i) == '-' || s.charAt(i) == '+')){
            sign = s.charAt(i) == '-' ? -1 : 1;
            i++;
        }
        while(i<n && Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i) - '0';
            if(res > (INT_MAX - digit)/10){
                return sign == 1 ? INT_MAX : INT_MIN;
            }
            res = res*10+digit;
            i++;
        }
        return sign * res;
    }

    public static void main(String[] args) {
        String s1 = "1337c0d3";
        System.out.println(myAtoi(s1));

        String s2 = "0-1";
        System.out.println(myAtoi(s2));
    }
}
