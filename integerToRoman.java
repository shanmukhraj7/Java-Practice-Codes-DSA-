public class integerToRoman {
    public static String intToRoman(int num) {
        int[] val = {1000,900,500,400,100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<val.length && num>0; i++){
            while(num >= val[i]){
                sb.append(symbols[i]);
                num-=val[i];
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int num1 = 58;
        System.out.println(intToRoman(num1));

        int num2 = 1994;
        System.out.println(intToRoman(num2));

        int num3 = 3749;
        System.out.println(intToRoman(num3));
    }
}
