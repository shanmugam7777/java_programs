class Throws{
    void div() throws Exception
    {
        int a=20;
        int b=0;
        System.out.println(a/b);

    }
}
class ExException{
    public static void main(String args[]){
        Throws th=new Throws();
        //Scanner sc=new Scanner(System.in);
        try{
            int x[]={1,2,3,4};
            System.out.println(x[5]);
                   
            th.div();
        }
        
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("just print this");
        }
        
    }
}