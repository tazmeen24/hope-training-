import java.util.concurrent.BlockingQueue;

public class LogWriter implements Runnable {

    private final BlockingQueue<String> queue;
    private volatile boolean running = true;

    public LogWriter(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    public void stop() {
        running = false;
    }

    @Override
    public void run() {
        while (running) {
            try {
                String message = queue.take(); // blocks until a message is available
                System.out.println(message);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
        // Drain any remaining messages before exit
        queue.forEach(System.out::println);
    }
}
