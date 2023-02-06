package Java;
import java.util.*;
public class Equals {
	public static void main(String[] args) {
	int rollno;
	String name;
	int age;
	public Equals(int rollno, String name, int age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

//import java.util.*;
//class Gfg{
	//public static void main(String[] args) {
	ArrayList<Equals> al = new ArrayList<>();
	al.add(new Equals(1,"xxs",21));
	al.add(new Equals(2,"hfh",32));
	Comparator<Equals> cmp = Comparator.comparing(Equals::getName);
	Collections.sort(al,cmp);
	System.out.println("Sorting by name:");
	for(Equals st:al) {
		System.out.println(st.rollno+" "+st.name+" "+st.age);
	}
}
}
