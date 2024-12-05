public class movePeicesToMakeString {
    public static boolean canChange(String start, String target){
        if(start.equals(target)) return true;
        int wl=0, wr=0;
        for(int i=0; i<start.length(); i++){
            char c = start.charAt(i), g = target.charAt(i);
            if(c == 'R'){
                if(wl > 0){
                    return false;
                }
                wr++;
            }
            if(g == 'L'){
                if(wr > 0){
                    return false;
                }
                wl++;
            }
            if(g == 'R'){
                if(wr == 0){
                    return false;
                }
                wr--;
            }
            if(c == 'L'){
                if(wl == 0){
                    return false;
                }
                wl--;
            }
        }
        return wl == 0 && wr == 0;
    }

    public static void main(String[] args) {
        String start1 = "_L__R__R_", target1 = "L______RR";
        System.out.println(canChange(start1, target1));

        String start2 = "R_L_", target2 = "__LR";
        System.out.println(canChange(start2, target2));

        String start3 = "_R", target = "R_";
        System.out.println(canChange(start3, target));
    }
}
