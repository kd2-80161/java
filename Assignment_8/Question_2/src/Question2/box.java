package Question2;

public class box<t>{
	private t obj;
	public box(t obj) {
		super();
		this.obj=obj;
	}
	public box() {
		super();
	}
	public t getObj() {
		return obj;
	}
	public void setObj(t obj) {
		this.obj = obj;
	}
	public static void printdisplaybox(box<? extends displayable> b) {
		b.getObj().display();
	}
	public static void printAnyBox(box<?> b) {
		System.out.println(b.getObj().toString());
	}
	


public static void main(String[] args) {
		box<person1> e=new box<>();
		e.setObj(new person1());
		e.getObj().accept();
		e.getObj().display();
		printAnyBox(e);
		
		box<date> d=new box<>();
		d.setObj(new date());
		d.getObj().accept();
		d.getObj().display();
		printdisplaybox(d);
		printAnyBox(d);
		 
		box<String> s= new box<>();
		s.setObj("Ujjwal");
		//printdisplaybox(s);

}
}
