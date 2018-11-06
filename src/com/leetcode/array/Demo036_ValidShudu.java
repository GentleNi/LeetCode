package com.leetcode.array;

/**
 * @Author GentleNi
 * @Date 2018-10-08 19:20
 * https://blog.csdn.net/qq_36326947/article/details/80266062
 **/

public class Demo036_ValidShudu {
    public static void main(String[] args) {
        char[][] shudu  = 
            {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
            };

        if (isValidSudoku(shudu)) {
            System.out.println("Your input is a valid shudu");
        } else {
            System.out.println("Your input is not a valid shudu");
        }
    }

    public static boolean isValidSudoku(char[][] board) {
        boolean[][] row = new boolean[9][9];
        boolean[][] columns = new boolean[9][9];
        boolean[][] box = new boolean[9][9];

        for (int i = 0;i < 9;i++)
            for (int j = 0;j < 9;j++) {
                if (board[i][j] != '.') {
                    int num = board[i][j] - '0' -1;
                    int index = i/3 * 3 + j/3;
                    //check
                    if (row[i][num] || columns[j][num] || box[index][num])
                        return false;
                    row[i][num] = columns[j][num] = box[index][num] =true;
                }
            }
        return true;
    }
}
