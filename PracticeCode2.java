package Launch;

public class PracticeCode2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PracticeCode pc1=new PracticeCode();
		try {
			pc1.method1("DDT","Sheet1",0,1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pc1.methodProp("p","username","URL","password","browser");
		try {
			pc1.method2("DDT", "Sheet2", 1, 2, "p", "URL", "WWW.Hanagam.COM");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
