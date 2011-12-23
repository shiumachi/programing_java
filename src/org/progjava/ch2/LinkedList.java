package org.progjava.ch2;

public class LinkedList {
	private Object field;
	private LinkedList next;

	public LinkedList() {
		this(null, null);
	}

	public LinkedList(Object field, LinkedList next) {
		super();
		this.setField(field);
		this.setNext(next);
	}

	public static void main(String[] args) {
		Vehicle car = new Vehicle(20.0, 5.0, "kate", 3);
		Vehicle car2 = new Vehicle(30.0, 6.0, "brian", 4);
		LinkedList link = new LinkedList(car, null);
		link.setNext(new LinkedList(car2, null));
		Vehicle car3 = (Vehicle) link.getField();
		System.out.printf("%s\n", car3);
		System.out.printf("%s\n", link);
	}

	public String toString() {
		return toString(this);
	}

	public String toString(LinkedList llist) {
		if (llist.getNext() == null) {
			return field.toString();
		}
		return field.toString() + "\n" + next.toString();
	}

	public void setField(Object field) {
		this.field = field;
	}

	public Object getField() {
		return field;
	}

	public void setNext(LinkedList next) {
		this.next = next;
	}

	public LinkedList getNext() {
		return next;
	}

}
