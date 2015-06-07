package IntroducitonToJavaProgramming.Chapter_24;

import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Suheng on 6/7/15.
 */
public class MyOwnProducerConsumer {
    private static Buffer buffer = new Buffer();

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(new Producer());
        executorService.execute(new Monitor());
        executorService.execute(new Consumer());


        executorService.shutdown();
    }

    //用来检测队列中的数据
    public static class Monitor implements Runnable {

        @Override
        public void run() {
            try {
                while (true) {
                    Thread.sleep(1000);
                    if (buffer.getList().size() != 0) {
                        System.out.println(buffer.getList());
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static class Producer implements Runnable {

        @Override
        public void run() {
            int i = 1;
            try {
                while (true) {
                    System.out.println("刚刚写入了数据:" + i + ".");
                    buffer.write(i++);
                    Thread.sleep((int) (Math.random() * 1000));
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static class Consumer implements Runnable {

        @Override
        public void run() {
            try {
                while (true) {
                    System.out.println("\t\t\t读取数据: " + buffer.read());
                    Thread.sleep((int) (Math.random() * 10000));
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static class Buffer {
        private static int CAPACITY = 10;
        private LinkedList<Integer> queue = new LinkedList<Integer>();

        private static Lock lock = new ReentrantLock();

        private static Condition notEmpyt = lock.newCondition();
        private static Condition notFull = lock.newCondition();


        public LinkedList<Integer> getList() {
            return this.queue;
        }

        public void write(int value) {
            lock.lock();
            try {
                while (queue.size() == CAPACITY) {
                    System.out.println("队列满了不能写入");
                    notFull.await();
                }
                queue.offer(value);
                notEmpyt.signal();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }

        public int read() {
            int value = -1;
            lock.lock();
            try {
                while (queue.isEmpty()) {
                    System.out.println("队列为空不能读取");
                    notEmpyt.await();

                }

                value = queue.remove();
                notFull.signal();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                return value;
            }

        }
    }
}
