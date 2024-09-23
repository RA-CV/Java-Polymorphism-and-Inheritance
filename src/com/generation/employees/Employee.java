package com.generation.employees;

public class Employee {
	private String firstName;
	private String lastName;
	private int registration;
	private int age;
	private int daysWorked;
	private int vacationDaysTaken;
	private double salary;
	private int yearsWorked;
	
	
	   public Employee(String firstName, String lastName, int registration, int age, int daysWorked, int vacationDaysTaken,
			double salary, int yearsWorked) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.registration = registration;
		this.age = age;
		this.daysWorked = daysWorked;
		this.vacationDaysTaken = vacationDaysTaken;
		this.salary = salary;
		this.yearsWorked = yearsWorked;
	}//Constructor

	public String getFirstName() {
		return firstName;
	}//getFirstName

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}//setFirstName

	public String getLastName() {
		return lastName;
	}//getLastName

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}//setLastName

	public int getRegistration() {
		return registration;
	}

	public void setRegistration(int registration) {
		this.registration = registration;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
	if (age>=18) {
		this.age = age;
	}else{
		System.out.println("You are not allowed to work yet");
	}
	}

	public int getDaysWorked() {
		return daysWorked;
	}

	public void setDaysWorked(int daysWorked) {
		this.daysWorked = daysWorked;
	}

	public int getVacationDaysTaken() {
		return vacationDaysTaken;
	}

	public void setVacationDaysTaken(int vacationDaysTaken) {
		if(vacationDaysTaken > 0) {
		this.vacationDaysTaken = vacationDaysTaken;
		}else {
			System.out.println("Do you even have a life? Please, take some vacations!!");
		}//ifelse
	}//setVacationDaysTaken

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if (salary > 0) {
		this.salary = salary;
		}else {
			System.out.println("Not even working here");
		}//ifelse
	}//setSalary

	public int getYearsWorked() {
		return yearsWorked;
	}

	public void setYearsWorked(int yearsWorked) {
		this.yearsWorked = yearsWorked;
	}

	public int timeToRetirement(){
		   int timeUntilRetirement=Math.min(60 - age, 40 - yearsWorked);
		      // time to retirement = min(60 - age, 40 - yearsWorked)
			 if ((age >= 60) && (yearsWorked >= 40)) {
	    		 System.out.println("Dobby is free!!!");
	          } else { 
	        	  System.out.println("Continue working my slave!!!");
	          }//ifelse
			 return timeUntilRetirement;
		   }// time to retirement = min(60 - age, 40 - yearsWorked)

		   public int vacationTimeLeft(){
		       // vacation time left = (daysWorked/360)*(30 - vacationDaysTaken)
			   int totalVacationDays = 30;
		        double vacationAccrued = (daysWorked / 360.0) * totalVacationDays;
		        int vacationTimeLeft = (int) (vacationAccrued - vacationDaysTaken);

		        return Math.max(vacationTimeLeft, 0);
		   }// vacation time left = (daysWorked/360)*(30 - vacationDaysTaken)

		   public int calculateBonus(){
		       // bonus = 2.2*salary
			   return (int) (2.2 * salary);
		   }

		@Override
		public String toString() {
			return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", registration=" + registration
					+ ", age=" + age + ", daysWorked=" + daysWorked + ", vacationDaysTaken=" + vacationDaysTaken
					+ ", salary=" + salary + ", yearsWorked=" + yearsWorked + "]";
		}//toString
		   
		   
}//classEmplooyee
