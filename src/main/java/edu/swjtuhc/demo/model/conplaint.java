package edu.swjtuhc.demo.model;

public class conplaint {
String name;
String dormitory;
String phone;
String note;
String item;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDormitory() {
	return dormitory;
}
public void setDormitory(String dormitory) {
	this.dormitory = dormitory;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getNote() {
	return note;
}
public void setNote(String note) {
	this.note = note;
}
public String getItem() {
	return item;
}
public void setItem(String item) {
	this.item = item;
}
@Override
public String toString() {
	return "conplaint [name=" + name + ", dormitory=" + dormitory + ", phone=" + phone + ", note=" + note + ", item="
			+ item + "]";
}
}