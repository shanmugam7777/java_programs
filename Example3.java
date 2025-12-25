class AvgThread extends Thread {
    public void run() {
        int total = 0;
        for (int i = 1; i <= 10; i++) {
            total += i;
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Something occurred");
            }
        }
        System.out.println("Avg: " + total / 10);
    }
}

class SquThread extends Thread {
    public void run() {
        int a[] = {1, 2, 3, 4, 5};
        for (int i : a) {
            System.out.println("Square of " + i + ": " + (i * i));
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Something else");
            }
        }
    }
}

class Example3 {
    public static void main(String args[]) {
        AvgThread t1 = new AvgThread();
        SquThread t2 = new SquThread();

        t1.start();
        t2.start();
    }
}