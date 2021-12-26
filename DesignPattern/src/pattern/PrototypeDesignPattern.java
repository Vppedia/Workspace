package pattern;
import java.util.ArrayList;
import java.util.List;

class Vehicle1 implements Cloneable
{

	public List<String> vehicleList;
	
	public Vehicle1()
	{
		this.vehicleList=new ArrayList<String>();
	}
	
	public Vehicle1(List<String> vehicleList)
	{
		this.vehicleList=vehicleList;
	}
	
	public void insertData()
	{
		vehicleList.add("A");
		vehicleList.add("B");
		vehicleList.add("C");
		vehicleList.add("D");
		vehicleList.add("E");
	}
	
	public List<String> getVehicleList()
	{
		
		return this.vehicleList;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
         
        List<String> temp=new ArrayList<String>();
        
        for(String s:this.getVehicleList())
        {
        	temp.add(s);
        }
		
		return new Vehicle1(temp);
	}
	
	


}

public class PrototypeDesignPattern {

	public static void main(String[] args) throws CloneNotSupportedException
	{
		Vehicle1 a = new Vehicle1();
		a.insertData();

		Vehicle1 b = (Vehicle1) a.clone();
		List<String> list = b.getVehicleList();
		list.add("vivek");

		System.out.println(a.getVehicleList());
		System.out.println(b.getVehicleList());

	}

}
