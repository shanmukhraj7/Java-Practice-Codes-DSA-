public class wordSearch {
    public static boolean exist(char[][] board, String word) {
        int r = board.length;
        if(r == 0) return false;
        int c = board[0].length;
        for(int i=0; i<r; ++i)
            for(int j=0; j<c; ++j)
                if(board[i][j] == word.charAt(0) && search(board,i,j,word,0)) return true;
        return false;
    }

    private static boolean search(char[][] board, int i, int j, String word, int idx){
        if(idx == word.length()-1) return true;
        board[i][j] -= 65;
        if(i>0 && board[i-1][j] == word.charAt(idx+1) && search(board,i-1,j,word,idx+1)) return true;
        if(j>0 && board[i][j-1] == word.charAt(idx+1) && search(board,i,j-1,word,idx+1)) return true;
        if(i<board.length-1 && board[i+1][j] == word.charAt(idx+1) && search(board,i+1,j,word,idx+1)) return true;
        if(j<board[0].length-1 && board[i][j+1] == word.charAt(idx+1) && search(board,i,j+1,word,idx+1)) return true;
        board[i][j] += 65;
        return false;
    }

    public static void main(String[] args) {
        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word1 = "ABCCED";
        System.out.println(exist(board, word1));
        String word2 = "SEE";
        System.out.println(exist(board, word2));
        String word3 = "ABCB";
        System.out.println(exist(board, word3));
    }
}
