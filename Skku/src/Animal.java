abstract class Mammal extends Animal{
	abstract String bark();
	abstract String getFood();
}

abstract class Reptile extends Animal{
	abstract String getFood();
}

final class Cat extends Mammal{
	String name;
	float weight;
	String nameSlave;
	public Cat(String name,float weight,String nameSlave) {
		this.name=name;
		this.weight=weight;
		this.nameSlave=nameSlave;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name=name;
	}
	float getWeight() {
		return weight;
	}
	void setWeight(float weight) {
		this.weight=weight;
	}
	String getNameSlave() {
		return nameSlave;
	}
	void setNameSlave(String nameSlave) {
		this.nameSlave=nameSlave;
	}
	String bark() {
		System.out.println("Meow");
		return "Meow";
	}
	String getFood() {
		System.out.println("Fish");
		return "Fish";
	}
}

final class Dog extends Mammal{
	String name;
	float weight;
	String nameMaster;
	public Dog(String name,float weight,String nameMaster) {
		this.name=name;
		this.weight=weight;
		this.nameMaster=nameMaster;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name=name;
	}
	float getWeight() {
		return weight;
	}
	void setWeight(float weight) {
		this.weight=weight;
	}
	String getNameMaster() {
		return nameMaster;
	}
	void setNameMaster(String nameMaster) {
		this.nameMaster=nameMaster;
	}
	String bark() {
		System.out.println("Bowbow");
		return "Bowbow";
	}
	String getFood() {
		System.out.println("Apple");
		return "Apple";
	}
}

final class Crocodlile extends Reptile{
	String name;
	float weight;
	public Crocodlile(String name, float weight) {
		this.name=name;
		this.weight=weight;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name=name;
	}
	float getWeight() {
		return weight;
	}
	void setWeight(float weight) {
		this.weight=weight;
	}
	String getFood() {
		System.out.println("Meat");
		return "Meat";
	}
}
public class Animal {
 public static void main(String[]args) {
	
 }
}
