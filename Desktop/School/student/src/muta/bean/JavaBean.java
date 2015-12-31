package muta.bean;
/**
 * @author help
 *封装一条信息的所有属性
 */
public class JavaBean {
	private int id;
	private String name;
	private String college;
	private String grade;
	private String room;
	private String sex;
	private int age;
	private String stay;
	private String roomnumber;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college=college;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade=grade;
	}
	public String getRoom() {
		return room;
	}
	public void setRoom(String room) {
		this.room=room;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getStay() {
		return stay;
	}
	public void setStay(String stay) {
		this.stay=stay;
	}
	public String getRoomnumber() {
		return roomnumber;
	}
	public void setRoomnumber(String roomnumber) {
		this.roomnumber=roomnumber;
	}
}