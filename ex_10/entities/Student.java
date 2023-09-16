package entities;

public class Student {
	private String name;
	private double firstSemester;
	private double secondSemester;
	private double average;
	
	public Student(String name, double firstSemester, double secondSemester) {
		this.name = name;
		this.firstSemester = firstSemester;
		this.secondSemester = secondSemester;
		calculateAverage(firstSemester, secondSemester);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getFirstSemester() {
		return firstSemester;
	}

	public void setFirstSemester(double firstSemester) {
		this.firstSemester = firstSemester;
	}

	public double getSecondSemester() {
		return secondSemester;
	}

	public void setSecondSemester(double secondSemester) {
		this.secondSemester = secondSemester;
	}
	
	public double getAverage() {
		return average;
	}

	public void calculateAverage(double firstSemester, double secondSemester) {
		this.average = (firstSemester + secondSemester) / 2;
	}
}
