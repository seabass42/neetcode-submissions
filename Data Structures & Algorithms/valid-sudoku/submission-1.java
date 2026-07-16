class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board[0].length; i++){
            Set<Character> nums = new HashSet<>();
            // Rows
            for (int j = 0; j < board.length; j++){
                //Check this 3x3 square side quest
                if (i % 3 == 0 && j % 3 == 0){
                    Set<Character> box = new HashSet<>();
                    for (int k = i; k < i + 3; k++){
                        for (int l = j; l < j + 3; l++){
                            char currBox = board[k][l];
                            if (box.contains(currBox)) return false;
                            if (currBox != '.'){
                                box.add(currBox);
                            }
                        }
                    }
                }

                Character curr = board[i][j];
                if (nums.contains(curr)) return false;
                if (curr != '.'){
                    nums.add(curr);
                }
            }
        }
        //Columns 
            for (int i = 0; i < board.length; i++){
                Set<Character> col = new HashSet<>();
                for (int j = 0; j < board[0].length; j++){
                    char curr = board[j][i];
                    if (col.contains(curr)) return false;
                    if (curr != '.'){
                        col.add(curr);
                    }
                }
            }
        return true; 
    }
}



