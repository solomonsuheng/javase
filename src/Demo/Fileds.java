package Demo;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Suheng on 6/13/15.
 */
public class Fileds {
    private char[][] matrix;

    enum UserType {
        h() {
            public boolean returnTrue() {
                return true;
            }
        },
        E() {
            public boolean returnFalse() {
                return false;
            }
        }
    }

    public Fileds() {

    }

    public char[][] outputMatrix(int row, int col) throws CustomException {
        if (row <= 0 && col <= 0) {
            throw new CustomException("Error Input");
        }

        char[][] returnNewMatrix = new char[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                returnNewMatrix[i][j] = '0';
            }
        }

        return returnNewMatrix;
    }

    public Fileds(char[][] matrix) {
        this.matrix = matrix;
    }

    public boolean check(int i, int j) {
        return matrix[i][j] == '*';
    }


    //初始化矩阵
    public boolean checkInput(String[] userInput) {
        int inputLength = -1;
        inputLength = userInput[0].length();
        for (int i = 1; i < userInput.length; i++) {
            if (userInput[i].length() != inputLength) {
                return false;
            }
        }
        return true;
    }

    public int[] plusAllDirectionBy1(int i, int i1) {
        int[] reusltPlusBy1 = {1, 1, 1, 1, 1, 1, 1, 1};

        return reusltPlusBy1;
    }

    public char[][] setMine(char[][] matrix, int x, int y) {
        char[][] matrix_with_mine = matrix;
        matrix_with_mine[x][y] = '*';
        return matrix_with_mine;

    }


    public boolean checkIf(String str) throws IllegalAccessException, InstantiationException {
//        Map<String, Class> handle = new HashMap<String, Class>();
//        handle.put("h", Fileds.class);
//
//        Fileds f = (Fileds) handle.get("h").newInstance();
//
//        f.returnTrue();

        Map<String, IFcuntion> map = new HashMap<String, IFcuntion>();
        map.put("h", new ReturnTrue());

//        if (str.equals("h")) {
//            return true;
//        } else {
//            return false;
//        }
        return map.get("h").call();
    }

    public boolean returnTrue() {
        return true;
    }

    public boolean returnFalse() {
        return false;
    }


}
