package OOP_InterfaceConcept;
public class FortisHospital extends Hospital implements USMedical,UKMedical,IndianMedical{
	
	static final int min_fee=100;
	
/*The type FortisHospital must implement the inherited abstract method*/	
	
	//US
	@Override
	public void dentalService() {
		System.out.println("FH---------dentalServices");
	}
	@Override
	public void entService() {
		System.out.println("FH---------entServices");
	}
	@Override
	public void physioServices() {
		System.out.println("FH---------physioServices");
	}
	
	@Override
	public void orthoServices() {
		System.out.println("FH---------orthoServices");
	}
	@Override
	public int test(int i,int j) {
		return 100;
		
	}
	
	//UK
	@Override
	public void oncologyService() {
		System.out.println("FH---------OncologyService");
	}
	@Override
	public void pediaService() {
		System.out.println("FH---------PediaService");
	}
	
	//IndianMedical
	@Override
	public void radioServices() {
		System.out.println("FH---------radioServices");
	}
	@Override
	public void opticalServices() {
		System.out.println("FH---------opticalServices");
	}	
	@Override
	public void cardioServices() {
		System.out.println("FH---------cardioServices");
	}
	
	//common method from all the interface
	@Override
	public void emergencyServices() {
		System.out.println("FH---------emergencyServices");
	}
	
	//Individual:
	
	public void medicalTraining() {
		System.out.println("FH-----medicalTraining");
	}
	
	public void optServices() {
		System.out.println("FH-----optServices");
	}
	
	
	public void covidVaccination() {
		System.out.println("WHO---Covid Vaccinations");
	}
	
//	//Method Hiding
//	public static void billing() {
//		System.out.println("USM--Billing");
//	}
	
	@Override
	public void medicalPolicy() {
		System.out.println("FH-----medical policy");
	}
	
}