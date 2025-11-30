package OOP_InterfaceConcept;

public interface USMedical extends WHO{

	// abstract method :
	// no method body, only method declaration
	// only method prototype
	// can not create the object of the Interface

	public void dentalService();

	public void entService();

	public void physioServices();

	public void emergencyServices();

	public int test(int i,int j);

	public void orthoServices();
	
	//after JDK 1.8, two major changes:
	
	
	//1. static method with method body: but not abstract:
	//can not be override
	public static void billing() {
		System.out.println("USM--Billing");
	}
	
	//2. default method with body: not a static:: but not abstract:
	//can be overriden
	default void medicalPolicy() {
		System.out.println("USM-----medical policy");
	}
}