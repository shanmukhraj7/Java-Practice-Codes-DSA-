public class lastMomentBeforeAllAntsFallOutOfPlank {
    public static int getLastMoment(int n, int[] left, int[] right) {
        int res = 0;
        for(int l : left) res = Math.max(res, l);
        for(int r : right) res =  Math.max(res, n-r);
        return res;
    }

    public static void main(String[] args) {
        int n1 = 4;
        int[] left1 = {4,3}, right1 = {0,1};
        System.out.println(getLastMoment(n1, left1, right1));

        int n2 = 7;
        int[] left2 = {}, right2 = {0,1,2,3,4,5,6,7};
        System.out.println(getLastMoment(n2, left2, right2));

        int n3 = 7;
        int[] left3 = {0,1,2,3,4,5,6,7}, right3 = {};
        System.out.println(getLastMoment(n3, left3, right3));
        
    }
}
