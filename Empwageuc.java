
public class Empwageuc {

	public static final int is_Part_Time = 1;
	public static final int is_Full_Time = 2;
	public static final int no_of_Working_Days = 20;
	public static final int wagePerhr = 20;
	public static final int max_Hrs = 100;
	
	public static int calcEmpWageForCompany(String company, int empRate, int numOfDays, int maxHrs){
		
			System.out.println("Welcome to EmpWage");
			int totalEmpWage = 0;
			int wagePerhr = 20;
			int empHrs = 0;
			int totalEmpHrs = 0;
			int totalWorkingDays = 0;
				totalWorkingDays++;
	
			while(totalEmpHrs <= maxHrs && totalWorkingDays < numOfDays){
			int check = (int) Math.floor(Math.random()*10)%3;
			
			switch(check){
			case(is_Part_Time):
				empHrs = 4;
				break;
			case(is_Full_Time):
				empHrs = 8;
				break;
			default :
				empHrs = 0;
			}
				totalEmpHrs += empHrs;
				System.out.println("Day: "+totalWorkingDays + " Emp Hrs: " + empHrs);
			}
				totalEmpWage = totalEmpHrs * wagePerhr;
			System.out.println("Total EmpWage forcompany : "+company+" is "+totalEmpWage);
					return totalEmpWage;
	}
	public static void main(String args[]){
		calcEmpWageForCompany("Ultra Engineers", 20, 20, 10);
		calcEmpWageForCompany("Wipro", 20, 20, 10);
		calcEmpWageForCompany("Reliance", 10, 20, 20);
		
	}
	
	}
