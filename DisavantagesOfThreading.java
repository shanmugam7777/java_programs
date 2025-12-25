class Printing implements Runnable{
    public void run(){
        String name=Thread.currentThread().getName();
        System.out.println(name+" Printing start here");
        for (int i=1;i<=5;i++){
            System.out.println(name+" is printing");
        }
        try{
            Thread.sleep(1500);
        }
        catch(Exception e){
            System.out.println(" something occures");
        }
        System.out.println(name+" printing completed");
    }
}
class DisavantagesOfThreading{
    public static void main(String args[]){
        Printing p=new Printing();
        Thread t1=new Thread(p);
        Thread t2=new Thread(p);
        t1.setName("Shannu");
        t2.setName("Tulasi");
        t1.start();
        t2.start();

    }
}