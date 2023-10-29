/**
 * 
 */
package Question1;

class box<t extends emloyee>{
	private t obj;

	public t getObj() {
		return obj;
	}

	public void setObj(t obj) {
		this.obj = obj;
	}
	public double getsal() {
		return obj.pay();
	}
}
public class tester {

	/*
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		box<salaried> b1=new box<>();
		
		b1.setObj(new salaried());
		
		
		b1.getObj().accept();
		System.out.println(b1.getObj().pay()); 
		
		box<emloyee> b2=new box<>();
		b2.setObj(new comm());
		b2.getObj().accept();
		b2.getObj().display();
		

	}

}
