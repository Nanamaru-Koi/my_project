package sub;

public class Sub{
	
	private String name;
	
	public Sub(String name){
		System.out.println("Subクラスのコンストラクタが呼び出されました。");
		System.out.println("Sub Class's Construct has been called");
		
		this.name = name;	//nameをセット
	}
	public void test(){
		System.out.println("test");
	}
	
	public String getName(){
		return name;
	}
	
	public void test2(){
		System.out.println("test2");
	}
	public void test3(){
		System.out.println("test3testtest");
	}
}
