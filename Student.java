
public class Student {

		Student(String name) {
		
	    //Instant Values
		
		this.name = name;
			
		this.quizNumber = 0;
			
		this.quizScore = 0;

		}
		
		//Constructors
		public String getName() {
			
		return name;
			
		}
			
		public void addQuiz(int score) {
			
		this.quizScore +=score;
		
		quizNumber++;
		
		}
		
		
		public int getTotalScore() {
			
		return quizScore;
		
		}
		
		public double getAverageScore() {
			
		return (double)quizScore / quizNumber;
		
		}
		
		//Private values for the "student" class only
		private String name;
		
		private int quizScore;
		
		private int quizNumber;

		}


