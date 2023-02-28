package multithreading;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

class TimerCode extends TimerTask {
    public void run() {
        System.out.println("Hello!");
    }
}
public class Main2 {
    /**
     * for just one time
     * @param args
     */
/*    public static void main(String[] args) {
        Timer timer = new Timer();
        TimerTask task = new TimerCode();

        LocalDateTime timeToExecute = LocalDateTime.now().plusSeconds(2);
        Date execTime = Date.from(timeToExecute.atZone(ZoneId.systemDefault()).toInstant());
        timer.schedule(task, execTime);
    }*/
    /**
     * repeating
     */
    public static void main(String[] args) {
        Timer timer = new Timer();
        TimerTask task = new TimerCode();
        TimerTask task2 = new TimerCode();
        timer.schedule(task2, 0, 2000);

        timer.schedule(task, 2000, 3000);
        /**
         * to stop one task :
         */

        //task.cancel();
        /**
         * to stop all tasks
         */
        timer.cancel();
    }
}
/**
 * cancelling timer if an exception occurs
 */
class TimerCode2 extends TimerTask {
    public void run() {
        try {
            throw new IllegalArgumentException();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            this.cancel();
        }
    }
}