package Coursera.Algorithms.DynamicConnectivity;

/**
 * Created by Suheng on 6/29/15.
 */
public class WeightedQuickUnion {
    private int[] id;
    private int[] sz;

    public WeightedQuickUnion(int N) {
        this.id = new int[N];
        this.sz = new int[N];
        for (int i = 0; i < N; i++) {
            this.id[i] = i;
            this.sz[i] = 1;
        }
    }

    private int root(int i) {
        while (this.id[i] != i) {
            this.id[i] = this.id[id[i]];
            i = this.id[i];
        }

        return i;
    }

    public boolean connected(int p, int q) {
        return this.root(p) == this.root(q);
    }

    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);
        if (i == j) {
            return;
        }
        if (sz[i] < sz[j]) {
            this.id[i] = j;
            this.sz[j] += this.sz[i];
        } else {
            this.id[j] = i;
            this.sz[i] += this.sz[j];
        }
    }

    public static void main(String[] args) {

    }
}
