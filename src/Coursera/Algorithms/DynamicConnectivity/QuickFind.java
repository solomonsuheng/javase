package Coursera.Algorithms.DynamicConnectivity;

/**
 * Created by Suheng on 6/29/15.
 */
public class QuickFind {
    private int[] id;

    public QuickFind(int N) {
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
        QuickFind quickFind = new QuickFind(10);

        quickFind.union(0, 5);
        quickFind.union(5, 6);
        quickFind.union(6, 1);
        quickFind.union(1, 2);
        quickFind.union(7, 2);

        quickFind.union(3, 8);
        quickFind.union(3, 4);
        quickFind.union(4, 9);

        System.out.println("is 3 connected with 8 ? " + quickFind.connected(3, 8));
        System.out.println("is 1 connected with 7 ? " + quickFind.connected(1, 7));
        System.out.println("is 2 connected with 8 ? " + quickFind.connected(2, 8));
        System.out.println("is 0 connected with 7 ? " + quickFind.connected(0, 7));
        System.out.println("is 9 connected with 8 ? " + quickFind.connected(8, 8));


        QuickFind maze = new QuickFind(16);

        maze.union(0, 1);
        maze.union(1, 5);
        maze.union(5, 6);
        maze.union(6, 7);
        maze.union(6, 7);
        maze.union(11, 7);
        maze.union(11, 15);


        System.out.println("Maze can go ?" + maze.connected(0, 15));
    }
}
