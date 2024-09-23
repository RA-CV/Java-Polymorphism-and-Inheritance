package com.generation.employees;
import java.util.HashMap;
public class SalesManager extends SalesRep{
	 private HashMap<Integer, SalesRep> salesTeam;
	 private double totalComission;
	 
	 public SalesManager(String firstName, String lastName, int registration, int age, int daysWorked,
			int vacationDaysTaken, double salary, int yearsWorked) {
		super(firstName, lastName, registration, age, daysWorked, vacationDaysTaken, salary, yearsWorked);
		// TODO Auto-generated constructor stub
		salesTeam = new HashMap<>();
		this.totalComission = 0;
	}//Constructor

	    
	    // Method to add a SalesRep to the team
	    public void addTeamMember(SalesRep member) {
	    	 salesTeam.put(member.getRegistration(), member);
	    }
	    

	    public HashMap<Integer, SalesRep> getSalesTeam() {
	        return salesTeam;
	    }

	    public double calculateTotalSales() {
	        double totalSales = 0;
	        for (SalesRep member : salesTeam.values()) {
	            totalSales += member.getSalesMade();
	        }
	        return totalSales;
	    }// Calculate total sales made by the team
	//sales rep class that inherits	SalesRep 
	
	//double salesMade
	//calculateCmmision()
	   public double calculateComission(){
		      // 0.03 * all sales made by team
		   double totalSales = calculateTotalSales();
	        return totalComission = 0.03 * totalSales;
	    }
	   
	   public double getTotalCommission() {
	        return totalComission; // Método para obtener la comisión total
	    }


	@Override
	public String toString() {
		return "SalesManager [salesTeam=" + salesTeam + ", getSalesTeam()=" + getSalesTeam()
				+ ", calculateTotalSales()=" + calculateTotalSales() + ", getTotalCommission()=" + getTotalCommission()
				+ ", getSalesMade()=" + getSalesMade() + ", calculateComission()=" + calculateComission()
				+ ", toString()=" + super.toString() + ", getFirstName()=" + getFirstName() + ", getLastName()="
				+ getLastName() + ", getRegistration()=" + getRegistration() + ", getAge()=" + getAge()
				+ ", getDaysWorked()=" + getDaysWorked() + ", getVacationDaysTaken()=" + getVacationDaysTaken()
				+ ", getSalary()=" + getSalary() + ", getYearsWorked()=" + getYearsWorked() + ", timeToRetirement()="
				+ timeToRetirement() + ", vacationTimeLeft()=" + vacationTimeLeft() + ", calculateBonus()="
				+ calculateBonus() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}



}
