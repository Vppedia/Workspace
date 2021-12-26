package pattern;

abstract class Vehicle
{
	
	int wheel;
	
	public abstract int getWheel();

	@Override
	public String toString() {
		return "Vehicle [wheel=" + wheel + "]";
	}
	
	
	
}

class Car extends Vehicle
{
	int wheel;
	
	Car(int wheel)
	{
		this.wheel=wheel;
	}

	@Override
	public int getWheel() {
		
		return this.wheel;
	}
	
	@Override
	public String toString() {
		return "Vehicle [wheel=" + wheel + "]";
	}
	
}


class Bike extends Vehicle
{
	int wheel;
	
	Bike(int wheel)
	{
		this.wheel=wheel;
	}

	@Override
	public int getWheel() {
		
		return this.wheel;
	}
	
	@Override
	public String toString() {
		return "Vehicle [wheel=" + wheel + "]";
	}
	
	
}


class VehicleFactory
	{
		
		public static Vehicle getVehicleInstance(String name,int wheel)
		{
			if(name=="Car")
			{
				return new Car(wheel);
			}
			else if(name=="Bike")
			{
				return new Bike(wheel);
			}
			
			return null;
			
			
		}
		
	}


public class FactoryDesignPattern {
	
	public static void main(String [] args)
	{
		Vehicle car = VehicleFactory.getVehicleInstance("Car", 4);
		
		Vehicle bike = VehicleFactory.getVehicleInstance("Bike", 2);
		
		System.out.println(car);
		System.out.println(bike);
		
	}
	
	
	

}
