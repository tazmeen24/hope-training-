import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ThreadSafeLogger {

    private static final ThreadSafeLogger INSTANCE = new ThreadSafeLogger();

    private final BlockingQueue<String> queue = new LinkedBlockingQueue<>();
    private final DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    private final LogWriter logWriter;

    private ThreadSafeLogger() {
        logWriter = new LogWriter(queue);
        Thread writerThread = new Thread(logWriter, "LogWriter");
        writerThread.setDaemon(true);
        writerThread.start();
    }

    public static ThreadSafeLogger getInstance() {
        return INSTANCE;
    }

    public void log(LogLevel level, String message) {
        String entry = String.format("[%s] [%-5s] [%s] %s",
            LocalDateTime.now().format(fmt),
            level,
            Thread.currentThread().getName(),
            message);
        queue.offer(entry);
    }

    public void debug(String msg) { log(LogLevel.DEBUG, msg); }
    public void info(String msg)  { log(LogLevel.INFO,  msg); }
    public void warn(String msg)  { log(LogLevel.WARN,  msg); }
    public void error(String msg) { log(LogLevel.ERROR, msg); }
}
