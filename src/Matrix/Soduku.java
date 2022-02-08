// Own devised algorithm
// Link : https://leetcode.com/problems/valid-sudoku/
package Matrix;

public class Soduku {
    public boolean isValidSudoku(char[][] board) {
        int val = 32;
        for(int i = 0 ; i < 9 ; i++){
            for(int j = 0 ; j < 9 ; j++){
                if(board[i][j] == '.'){
                    board[i][j] = (char)val;
                    if(val == 47)
                        val = 58;
                    else
                        val++;
                }
            }
        }
        for(int i = 0 ; i < 9 ; i++){
            List<Character> check = new ArrayList<>();
            for(int j = 0 ; j < 9 ; j++){
                if(!check.contains(board[i][j]))
                    check.add(board[i][j]);
                else
                    return false;
            }
        }

        for(int i = 0 ; i < 9 ; i++){
            List<Character> check = new ArrayList<>();
            for(int j = 0 ; j < 9 ; j++){
                if(!check.contains(board[j][i]))
                    check.add(board[j][i]);
                else
                    return false;
            }
        }
        List<Character> check = new ArrayList<>();
        for(int i = 0 ; i < 3 ; i++){

            for(int j = 0 ; j < 3 ; j++){
                if(!check.contains(board[i][j]))
                    check.add(board[i][j]);
                else
                    return false;
            }
        }
        check.clear();
        for(int i = 3 ; i < 6 ; i++){
            for(int j = 0 ; j < 3 ; j++){
                if(!check.contains(board[i][j]))
                    check.add(board[i][j]);
                else
                    return false;
            }
        }
        check.clear();
        for(int i = 6 ; i < 9 ; i++){

            for(int j = 0 ; j < 3 ; j++){
                if(!check.contains(board[i][j]))
                    check.add(board[i][j]);
                else
                    return false;
            }
        }
        check.clear();
        for(int i = 0 ; i < 3 ; i++){

            for(int j = 3 ; j < 6 ; j++){
                if(!check.contains(board[i][j]))
                    check.add(board[i][j]);
                else
                    return false;
            }
        }
        check.clear();
        for(int i = 3 ; i < 6 ; i++){

            for(int j = 3 ; j < 6 ; j++){
                if(!check.contains(board[i][j]))
                    check.add(board[i][j]);
                else
                    return false;
            }
        }
        check.clear();
        for(int i = 6 ; i < 9 ; i++){

            for(int j = 3 ; j < 6 ; j++){
                if(!check.contains(board[i][j]))
                    check.add(board[i][j]);
                else
                    return false;
            }
        }
        check.clear();

        for(int i = 0 ; i < 3 ; i++){

            for(int j = 6 ; j < 9 ; j++){
                if(!check.contains(board[i][j]))
                    check.add(board[i][j]);
                else
                    return false;
            }
        }
        check.clear();
        for(int i = 3 ; i < 6 ; i++){

            for(int j = 6 ; j < 9 ; j++){
                if(!check.contains(board[i][j]))
                    check.add(board[i][j]);
                else
                    return false;
            }
        }
        check.clear();
        for(int i = 6 ; i < 9 ; i++){

            for(int j = 6 ; j < 9 ; j++){
                if(!check.contains(board[i][j]))
                    check.add(board[i][j]);
                else
                    return false;
            }
        }
        return true;
    }
}
