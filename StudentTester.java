
public class StudentTester {

		public static void main(String[] args) {

		Student student = new Student("Daniel");
		
		
		student.addQuiz(69);
		
		student.addQuiz(57);
		
		student.addQuiz(98);
		
		student.addQuiz(93);
		
		student.addQuiz(81);

		System.out.println("Student name is: "+student.getName());
		
		System.out.println("The total quiz score is: "+student.getTotalScore());
		
		System.out.println("The average quiz score is: "+student.getAverageScore());
		
		}



	}


