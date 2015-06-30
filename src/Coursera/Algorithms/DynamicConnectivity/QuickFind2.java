package Coursera.Algorithms.DynamicConnectivity;

/**
 * Created by Suheng on 6/29/15.
 */
public class QuickFind2 {
    int[] id;

    public QuickFind2(int N) {
        this.id = new int[N];
        for (int i = 0; i < N; i++) {
            this.id[i] = i;
        }
    }


    public boolean connected(int p, int q) {
        return this.id[p] == this.id[q];
    }

    public void union(int p, int q) {
        int pid = this.id[p];
        int qid = this.id[q];

        if (pid == qid) {
            return;
        }
        for (int i = 0; i < this.id.length; i++) {
            if (this.id[i] == pid) {
                this.id[i] = qid;
            }
        }
    }

    public static void main(String[] args) {
        QuickFind2 quickFind = new QuickFind2(10);

        quickFind.union(1, 2);
        quickFind.union(2, 7);
        quickFind.union(1, 5);
        quickFind.union(1, 3);
        quickFind.union(0, 1);
        quickFind.union(3, 9);

        for (int i = 0; i < quickFind.id.length; i++) {
            System.out.print(quickFind.id[i] + " ");
        }


    }
}
