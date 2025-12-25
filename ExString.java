class String{
    public static void main(String args[]){
        String s=new String("Shannu");
        System.out.println(s);
        StringBuffer sb=new StringBuffer("Tiger");       //String buffer object is mutable
        System.out.println(sb);
        sb.append("Dog");
        System.out.println("sb");      //it is a Synchronized and Thread safty
        /*String Builder class
        it is also mutable(changeable),no method is Synchronized
        Thread safty is not there at time one or more thread will execute
        Performance wise recommeded to use the String builder class  */
    }
}