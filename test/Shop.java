package test;

public class Shop {
	
private String name;
private int phone, tv, com, sum;

public void setName (String name) {
	this.name = name;
}
public String getName () {
	return this.name;
}
public void setPhone (int phone) {
	this.phone = phone;
}
public int getPhone () {
	return this.phone;
}
public void setTv (int tv) {
	this.tv = tv;
}
public int getTv () {
	return this.tv;
}
public void setCom (int com) {
	this.com = com;
}
public int getCom () {
	return this.com;
}
public void sum () {
	this.sum = this.phone + this.tv + this.com;
}
public void printStates() {
System.out.println(name +"�Բ��� �����Ͻ� �ݾ��� �� " + sum +"���� �Դϴ�.");
}

}
