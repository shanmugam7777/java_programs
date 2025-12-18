class Plane{
    void takeOff(){
        System.out .println("Plane  is taking off");
    }
    void fly(){
        System.out.println("plane is flying");
    }
    void land(){
        System.out.println("plane is landing");
    }
}
class Cargo extends Plane{
    void takeoff(){
        System.out.println("cargoplane is taking off");
    }
    void carrycargo(){
        System.out.println("it is cargo plane");
    }
}
class Fighter extends Plane{
    void carryFighter(){
        System.out.println("it is a fighter plane");
    }
    void fly(){
        System.out.println("fighters are fly very fast");
    }
}
class Indigo extends Plane{
    void land(){
        System.out.println("indigo planes lands fast");
    }
    void carryIndigo(){
        System.out.println("it is a costly");
    }
}
class Airport{
    void permit(Plane ref){
        ref.takeOff();
        ref.fly();
        ref.land();
    }
}
class ExPoly{
    public static void main(String args[]){
        Indigo in=new Indigo();
        Fighter fi=new Fighter();
        Cargo ca=new Cargo();
        Airport a= new Airport();
        a.permit(ca);
        a.permit(in);
        a.permit(fi);
    }
}