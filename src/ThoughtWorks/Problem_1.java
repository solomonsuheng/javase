package ThoughtWorks;

import javax.swing.*;

/**
 * Created by Suheng on 6/13/15.
 */
public class Problem_1 {
    public static void main(String[] args) {
        String rowStr = JOptionPane.showInputDialog(null, "请输入行");
        int row = Integer.parseInt(rowStr);
        String colStr = JOptionPane.showInputDialog(null, "请输入列");
        int col = Integer.parseInt(colStr);

        System.out.println(row + " " + col);

        //matrix
        int[][] martrix = new int[row][col];

        int[] mine1 = new int[2];
        int[] mine2 = new int[2];

        mine1[0] = (int) (Math.random() * col);
        mine1[1] = (int) (Math.random() * row);

        mine2[0] = (int) (Math.random() * col);
        mine2[1] = (int) (Math.random() * row);

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (mine1[0] == i && mine1[1] == j) {
                    //是一个雷，则上下左右都进行++
                    plusAllDirection(martrix, row, col, i, j);
                } else if (mine2[0] == i && mine2[1] == j) {
                    //是一个雷，则上下左右都进行++
                    plusAllDirection(martrix, row, col, i, j);
                } else {
                    //do nothing
                }
            }
        }

        //print the matrix
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(martrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void plusAllDirection(int[][] martix, int row, int col, int mineI, int mineJ) {
        System.out.println(mineI);
        System.out.println(mineJ);


        if ((mineI + 1) < row) {
            martix[mineI][++mineJ]++;
        }

    }

}