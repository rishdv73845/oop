class Computer {
	private String cpu;
	private String memory;
	private String hdd;
	private String color;
	private int power;

	public Computer(String cpu, String memory, String hdd, String color, int power) {
		this.cpu = cpu;
		this.memory = memory;
		this.hdd = hdd;
		this.color = color;
		this.power = power;
	}
	public void turnOn() {
		System.out.println("Turning on the computer.");
	}
	public void printInfo() {
		System.out.println("The spec of the computer");
		System.out.println(" CPU: " + cpu);
		System.out.println(" Memory: " + memory);
		System.out.println(" HDD: " + hdd);
		System.out.println(" Color: " + color);
		System.out.println(" Power: " + power + "W");
	}
}
class Monitor {
	private int monitorSize;
	private String color;
	private int power;

	public Monitor(int monitorSize, String color, int power) {
		this.monitorSize = monitorSize;
		this.color = color;
		this.power = power;
	}
	public void turnOn() {
		System.out.println("Turning on the monitor.");
	}
	public void printInfo() {
		System.out.println("The spec of the monitor");
		System.out.println(" Size: " + monitorSize + " inch");
		System.out.println(" Color: " + color);
		System.out.println(" Power: " + power + "W");
	}
}
public class Homework5 {
	public static void main(String[] args) {
		Computer computer = new Computer("Core i7", "16GB", "2TB", "White", 500);
		Monitor monitor = new Monitor(24, "Black", 45);

		computer.turnOn();
		monitor.turnOn();
		computer.printInfo();
		monitor.printInfo();
	}
}

