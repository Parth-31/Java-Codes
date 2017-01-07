
public class TestStudent {

	public static void main(String[] args) {
		Student s1 = new Student("Kai","International Hub");
		System.out.println(s1);
		s1.setAddress("Highlander's Building");
		System.out.println(s1);
		System.out.println(s1.getName());
		System.out.println(s1.getAddress());
		
		s1.addCourseGrade("CompArch", 95);
		s1.addCourseGrade("Algorithms", 90);
		s1.addCourseGrade("info retrieval", 100);
		s1.printGrades();
		System.out.printf("The average grade of %s is : %.2f",s1.getName(),s1.getAverageGrade());

	}

}
