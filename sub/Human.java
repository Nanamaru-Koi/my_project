package sub;

public class Human{
	
	private String name;
	private int age;
	private int strength;
	final private int MAX_STRENGTH = 100;
	
	public Human(String name, int age ){
		this.name = name;
		this.age = age;
		this.strength = MAX_STRENGTH;
		System.out.println("----ok----");
	}
	
	public String getName(){ return name; }
	public int getAge(){ return age; }
	public void setName(String name){ this.name = name; }
	public void setAge(int age ){ this.age = age; }
}