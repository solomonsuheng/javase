package Coursera.Algorithms.ProgrammingAssignment;

/**
 * Created by Suheng on 7/1/15.
 */
public class T {


    /***
     * aoisjd
     * @return Here we go
     * @throws asd
     */

    public static int read() {
        return 1;
    }

    public static void main(String[] args) {
        WeightedQuickUnionUF weightedQuickUnion = new WeightedQuickUnionUF(10);

        weightedQuickUnion.union(0, 5);
        weightedQuickUnion.union(5, 6);
        weightedQuickUnion.union(6, 1);
        weightedQuickUnion.union(2, 7);
        weightedQuickUnion.union(7, 8);
        weightedQuickUnion.union(8, 9);
        weightedQuickUnion.union(9, 4);
        weightedQuickUnion.union(4, 3);

        System.out.println(weightedQuickUnion.connected(0, 6));
    }

}
