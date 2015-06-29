package Coursera.Algorithms.DynamicConnectivity;

import java.util.Scanner;

/**
 * Created by Suheng on 6/29/15.
 */
public class UF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        UF uf = new UF(N);
        while (sc.hasNext()) {
            int p = sc.nextInt();
            int q = sc.nextInt();
            if (!uf.connected(p, q)) {
                // no connected
                uf.connected(p, q);
                System.out.println(p + " and " + q + " connected");
            }
        }
    }

    private int[] id;

    public UF(int N) {
        this.id = new int[N];
        for (int i = 0; i < N; i++) {
            this.id[i] = i;
        }

    }


    public void union(int p, int q) {
        int pid = this.id[p];
        int qid = this.id[q];

        for (int i = 0; i < this.id.length; i++) {
            if (this.id[i] == pid) {
                this.id[i] = qid;
            }
        }
    }

    public boolean connected(int p, int q) {
        return this.id[p] == this.id[q];
    }

}
