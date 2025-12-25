import java.util.TreeSet;
class Car1 implements java.lang.Comparable<Car1>
{
	int cost;
	Car1(int cost){
		this.cost=cost;
	}
	@Override
	public String toString() {
		return "Car [cost=" +cost +"]";
		
	}
	@Override
	public int compareTo(Car1 c) {
		return this.cost-c.cost;
	}
}

public class Comparable {

	public static void main(String[] args) {
		Car1 c1=new Car1(300);
		Car1 c2=new Car1(100);
		Car1 c3=new Car1(200);
		TreeSet<Car1> ts=new TreeSet<Car1>();
		ts.add(c1);
		ts.add(c2);
		ts.add(c3);
		for(Car1 i:ts) {
			System.out.println(i);
		}
	}

}