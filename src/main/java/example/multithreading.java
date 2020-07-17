package example;

public class multithreading {

    public static void main( String[] args ) {

        Thread t1 = new Thread(new Runnable() {
            public void run() {

                for(int i =0; i<100 ; i++){

                    System.out.println(Thread.currentThread().getName() + " " + i);
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {

                for(int i =0; i < 100 ; i++){

                    System.out.println(Thread.currentThread().getName() + " " + i);
                }
            }
        });

        t1.setPriority(10);
        t2.setPriority(1);
        t1.setName("T1");
        t2.setName("T2");
        t1.start();
        t2.start();


    }

}
