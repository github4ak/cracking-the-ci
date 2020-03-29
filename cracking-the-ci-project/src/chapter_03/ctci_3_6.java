package chapter_03;

import java.util.LinkedList;

/*
 * Learnings include abstract class, diff class types, good question
 */

public class ctci_3_6 {

}

abstract class Animal{ //It can't be initialized
	String name;
	int order;
	Animal(String s){
		this.name = s;
	}
	
	void setOrder(int o) {
		order = 0;
	}
	
	int getOrder() {
		return order;
	}
	
	public boolean isOlderThan(Animal a) {
		return this.order < a.getOrder();
	}
}

class AnimalQueue {
	LinkedList<Dog> dogs = new LinkedList<>();
	LinkedList<Cat> cats = new LinkedList<>();
	private int order = 0;
	
	public void enqueue(Animal a) {
		a.setOrder(order);
		order++;
		if(a instanceof Dog) {
			dogs.addLast((Dog) a);
		}
		else if(a instanceof Cat) {
			cats.addLast((Cat) a);
		}
	}
	
	public Animal dequeueAny() {
		if(dogs.size() == 0) {
			return dequeueCat();
		} else if(cats.size() == 0) {
			return dequeueDog();
		}
		
		Dog lastDog = dogs.peek();
		Cat lastCat = cats.peek();
		
		if(lastDog.isOlderThan(lastCat)) {
			return dequeueDog();
		} else {
			return dequeueCat();
		}
	}
	
	public Animal dequeueCat() {
		return cats.pop();
	}
	
	public Animal dequeueDog() {
		return dogs.pop();
	}
}

class Dog extends Animal{
	Dog(String s){
		super(s);
	}
}

class Cat extends Animal{
	Cat(String s) {
		super(s);
	}
}