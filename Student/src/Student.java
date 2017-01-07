
public class Student {
	String name,address;
	int numCourses;
	String[] courses = new String[30];
	int[] grades = new int[30];
	
	public Student(String name, String address){
		this.name = name;
		this.address = address;
		this.numCourses = 0;
		}
	public String getName(){
		return this.name;
	}
	
	public String getAddress(){
		return this.address;
	}
	
	public void setAddress(String address){
		this.address = address;
	}
	
	public String toString(){
		return name + "(" + address + ")";
	}
	
	public void addCourseGrade(String course, int grade){
		if(numCourses <= 30){
			courses[numCourses] = course;
			grades[numCourses] = grade;
			numCourses++;
		}
		else{
			System.out.println("You can not take more than 30 courses simultaneously");
		}
	}
	
	public void printGrades(){
		System.out.println(name);
		for(int i=0;i<numCourses;i++){
			System.out.println(courses[i] + " : " + grades[i]);
		}
		System.out.println();
	}
	
	public double getAverageGrade(){
		int sum = 0;
		for(int i=0; i < numCourses; i++){
			sum += grades[i];
		}
		
		return (double)sum/numCourses;
		
	}
	
}
