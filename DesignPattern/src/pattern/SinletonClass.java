package pattern;



final class Singleton
{
	
	// Eager Initialisation
	
	
//	private static Singleton instance = new Singleton();
//
//	private Singleton() {
//
//	}
//
//	public static Singleton getInstance() {
//		return instance;
//
//	}
	
	
	
	
	// Lazy Initialisation
	
	
//		private static Singleton instance ;
//
//		private Singleton() {
//
//		}
//
//		public static Singleton getInstance() {
//			
//			if(instance==null)
//			{
//				instance=new Singleton();
//			}
//			return instance;
//		}
//		
	
	
	
	
	// Thread Safe Initialisation (Synchronized block)
	
//		private static Singleton instance = new Singleton();
//
//		private Singleton() {
//
//		}
//
//		public static  synchronized Singleton getInstance() {
//			
//			if(instance== null)
//				instance=new Singleton();
//			return instance;
//
//		}
	
	
	// Thread Safe Initialisation (Synchronized block)
	
		private static Singleton instance = new Singleton();

		private Singleton() {

		}

		public static Singleton getInstance() {
			
			if(instance== null)
			{
				synchronized(Singleton.class)
				{
					instance =new Singleton();
				}
				
			}
				
			return instance;
		}
		
		
	
}



public class SinletonClass {
	
	

	public static void main(String[] args)
	{
		
		Singleton obj1=Singleton.getInstance();
		Singleton obj2=Singleton.getInstance();
		System.out.println("ref1 "+obj1);
		System.out.println("ref2 "+obj2);
		
		
		
	}
	
	
}
