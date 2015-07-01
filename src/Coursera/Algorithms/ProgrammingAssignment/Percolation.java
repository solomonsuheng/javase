package Coursera.Algorithms.ProgrammingAssignment;

/**
 * Created by Suheng on 7/1/15.
 */
public class Percolation {

    private WeightedQuickUnionUF weightedQuickUnionUF;

    public Percolation(int N) {
        this.weightedQuickUnionUF = new WeightedQuickUnionUF(N + 1);
    }

    public void open(int i, int j) {
        this.weightedQuickUnionUF.union(i, j);
    }

    public boolean isOpen(int i, int j) {
        return this.weightedQuickUnionUF.connected(i, j);
    }

    public boolean isFull(int i, int j) {
        return false;
    }

    public boolean percolates() {
        return true;
    }


}
