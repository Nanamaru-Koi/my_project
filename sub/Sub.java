package sub;

public class Sub{
	
	private String name;
	private int age;
	
	public Sub(String name, int age){
		System.out.println("Subクラスのコンストラクタが呼び出されました。");
		System.out.println("Sub Class's Construct has been called");
		
		this.name = name;	//nameをセット
		this.age = age;
	}
	public void test(){
		System.out.println("test");
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	public void setAge( int age ){
		this.age = age;
	}
}
