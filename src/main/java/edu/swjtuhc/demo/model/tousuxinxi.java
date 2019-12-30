package edu.swjtuhc.demo.model;

public class tousuxinxi {
int orders;
String dormitory;
String item;
String note;
public int getOrders() {
	return orders;
}
public void setOrder(int orders) {
	this.orders = orders;
}
public String getDormitory() {
	return dormitory;
}
public void setDormitory(String dormitory) {
	this.dormitory = dormitory;
}
public String getItem() {
	return item;
}
public void setItem(String item) {
	this.item = item;
}
public String getNote() {
	return note;
}
public void setNote(String note) {
	this.note = note;
}
@Override
public String toString() {
	return "tousuxinxi [orders=" + orders + ", dormitory=" + dormitory + ", item=" + item + ", note=" + note + "]";
}
}
