class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                char ch = board[i][j];
                if(ch != '.'){
                    if(!seen.add("row" + board[i][j] + i)) return false;
                    if(!seen.add("col" + board[i][j] + j)) return false;
                    if(!seen.add("box" + board[i][j] + (i / 3) * 3 + (j / 3))) return false;
                }
            }
        }
        return true;
    }
}

// Time Complexity :- BigO(1)
// Space Complexity :- BigO(n*3)

// Date :- 2021-09-01