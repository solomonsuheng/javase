package IntroducitonToJavaProgramming.Chapter_24;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Suheng on 6/7/15.
 */
public class ExecutorDemo {
    public static void main(String[] args) {
        //Create a fixed thread pool with maximun three theads
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        //Submit runnable taask to the executor
        executorService.execute(new PrintChar('a', 100));
        executorService.execute(new PrintChar('b', 100));
        executorService.execute(new PrintNum(100));

        executorService.shutdown();
    }
}
