package multithreading;

class ThreadUtil {
    static Thread createThreadInNewState() {
        return new Thread();
    }
}

class Main3 {
    public static void main(String[] args) {
        Thread thread = ThreadUtil.createThreadInNewState();
        System.out.println(thread.getState());
    }
}
class ThreadUtil2 {
    static void printNameOfTerminatedThread(Thread[] threads) {
        for (Thread thread : threads
             ) {
            if (thread.getState().equals(Thread.State.TERMINATED)) {
                System.out.println(thread.getName());
            }
        }
    }
}