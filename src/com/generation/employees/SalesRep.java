package com.generation.employees;
public class SalesRep extends Employee{
	private double salesMade;
	public SalesRep(String firstName, String lastName, int registration, int age, int daysWorked, int vacationDaysTaken,
			double salary, int yearsWorked) {
		super(firstName, lastName, registration, age, daysWorked, vacationDaysTaken, salary, yearsWorked);
		// TODO Auto-generated constructor stub
		this.salesMade = 0;
	}//Constructor

	// SalesRep class inherits the original employee class
    

    public double getSalesMade() {
        return salesMade;
    }

    public void setSalesMade(double salesMade) {
        this.salesMade = salesMade;
    }

	   public double calculateComission(){
		      // comission = 0.1 * salesMade
		   return (int) (0.1 * salesMade);
	   }

	@Override
	public String toString() {
		return "SalesRep [salesMade=" + salesMade + ", getSalesMade()=" + getSalesMade() + ", calculateComission()="
				+ calculateComission() + ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName()
				+ ", getRegistration()=" + getRegistration() + ", getAge()=" + getAge() + ", getDaysWorked()="
				+ getDaysWorked() + ", getVacationDaysTaken()=" + getVacationDaysTaken() + ", getSalary()="
				+ getSalary() + ", getYearsWorked()=" + getYearsWorked() + ", timeToRetirement()=" + timeToRetirement()
				+ ", vacationTimeLeft()=" + vacationTimeLeft() + ", calculateBonus()=" + calculateBonus()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	   
}//class SalesRep
