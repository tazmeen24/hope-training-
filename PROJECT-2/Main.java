import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        ThreadSafeLogger logger = ThreadSafeLogger.getInstance();

        List<Thread> threads = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            final int id = i;
            Thread t = new Thread(() -> {
                logger.debug("Starting task " + id);
                logger.info("Processing item " + id);
                if (id % 2 == 0) logger.warn("Slow response on task " + id);
                if (id == 5)     logger.error("Task " + id + " failed!");
                logger.info("Task " + id + " done");
            }, "Worker-" + i);
            threads.add(t);
        }

        threads.forEach(Thread::start);
        threads.forEach(t -> {
            try { t.join(); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
        });

        Thread.sleep(200);
        System.out.println("--- All tasks complete ---");
    }
}
