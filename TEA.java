public class TEA{
	public static void main(String[] args){
	
	Example ex = new Example("ahsan");
	TestE t = new TestE("ahsan",ex);
	
	String name1 = ex.getName();
	ex.setName("afzal");

	Example e = t.getExample();
	t.setExample(ex);
	
	System.out.println(t.getExample()+ex.getName());
}
}