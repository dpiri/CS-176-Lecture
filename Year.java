//Year Class:

	public class Year {

		int year; 

		public Year(int y) { 

			this.year=y;

		}

		public boolean isLeapYear(){ //function to check given year is leap year or not.

		boolean n=false; if((year % 400 == 0)|| (( year % 4 == 0 ) &&(year % 100 != 0))){
		n=true;

		}

		else{

		n=false;

		}

		return n;

	    }

	}

