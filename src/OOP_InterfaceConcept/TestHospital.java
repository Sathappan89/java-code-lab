package OOP_InterfaceConcept;

public class TestHospital {

	public static void main(String[] args) {
		FortisHospital fh = new FortisHospital();
		fh.dentalService();
		fh.entService();
		fh.physioServices();
		fh.orthoServices();
		
		fh.oncologyService();
		fh.pediaService();
		
		fh.opticalServices();
		fh.radioServices();
		fh.cardioServices();
		
		fh.emergencyServices();
		
		fh.medicalTraining();
		fh.oncologyService();
		
		//Java will not allow to create interface object creation - Because interface will have only method body(i.e abstract)
		//Example : USMedical us=new USMedical();
		
		/*Top Casting*/
		/*Child class object can be referred by parent interface reference variable : Yes*/
		/* Selenium 
		 * WebDriver a = new ChromeDriver();
		 * */
		
		System.out.println("----Top/Up Casting----");
		System.out.println();

		
		USMedical us=new FortisHospital();
		us.dentalService();
		us.emergencyServices();
		us.entService();
		us.physioServices();
		us.orthoServices();
		//us.oncologyService(); - Reference type check will fail
		//us.medicalTraining(); - Individual method of FortisHospital will be failed by reference type check
		
		
		/*DownCasting*/
		//We can even create parent of object creation : NOT Applicable
		
		UKMedical uk=new FortisHospital();
		uk.oncologyService();
		uk.pediaService();
		uk.emergencyServices();

	}

}