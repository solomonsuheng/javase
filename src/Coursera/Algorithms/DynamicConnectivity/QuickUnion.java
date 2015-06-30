package Coursera.Algorithms.DynamicConnectivity;

/**
 * Created by Suheng on 6/29/15.
 */
public class QuickUnion {
    private int[] id;

    public QuickUnion(int N) {
        this.id = new int[N];
        for (int i = 0; i < N; i++) {
            this.id[i] = i;
        }
    }

    private int root(int i) {
        while (i != this.id[i]) {
            i = this.id[i];
        }

        return i;
    }

    public boolean connected(int p, int q) {
        return this.root(p) == this.root(q);
    }

    public void union(int p, int q) {
        int pid = this.root(p);
        int qid = this.root(q);
        this.id[pid] = qid;
    }

    public static void main(String[] args) {
        QuickUnion quickUnion = new QuickUnion(10);

        quickUnion.union(0, 5);
        quickUnion.union(5, 6);
        quickUnion.union(6, 1);
        quickUnion.union(1, 2);
        quickUnion.union(7, 2);

        quickUnion.union(3, 8);
        quickUnion.union(3, 4);
        quickUnion.union(4, 9);

        System.out.println("is 3 connected with 8 ? " + quickUnion.connected(3, 8));
        System.out.println("is 1 connected with 7 ? " + quickUnion.connected(1, 7));
        System.out.println("is 2 connected with 8 ? " + quickUnion.connected(2, 8));
        System.out.println("is 0 connected with 7 ? " + quickUnion.connected(0, 7));
        System.out.println("is 9 connected with 8 ? " + quickUnion.connected(8, 8));

    }
}
