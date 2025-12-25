class Demo1 extends Thread {
    public void run(){
        for (int i=1;i<6;i++){
            System.out.println("User thread is running");
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println("something occured");
            }
        }

    }
}
class Demo2 extends Thread{
    public void run(){
        for (int i=1;i<=10;i++){
            System.out.println(i);

        }
        try{
            Thread.sleep(1000);

        }
        catch(Exception e){
            System.out.println("Something else");
        }
    }
}
class TypeOfThreads{
    public static void main(String args[]){
        System.out.println("main started here");
        Demo1 d1=new Demo1();
        Demo2 d2=new Demo2();
        d2.setDaemon(true);
        d1.start();
        d2.start();
        System.out.println("main stopped here");
    }
}