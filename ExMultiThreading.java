class CharPrinting extends Thread{
    public void run(){
        for (int i=65;i<75;i++)
        {
            System.out.println((char)i);
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
class NumPrinting extends Thread{
    public void run(){
        for (int i=1;i<11;i++){
            System.out.println(i);
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
class ExMultiThreading{
    public static void main(String args[]){
        CharPrinting cp=new CharPrinting();
        NumPrinting np=new NumPrinting();
        cp.start();
        np.start();
    }
}