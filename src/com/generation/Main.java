package com.generation;
import com.generation.employees.Employee;
import com.generation.employees.SalesManager;
import com.generation.employees.SalesRep;

public class Main {
    public static void main(String[] args) {
	// write your code here
    	 // Crear empleados
        Employee employee1 = new Employee("Carlos", "Gonzalez", 1030, 31, 200, 0, 50000, 5);
        Employee employee2 = new Employee("Ian", "Smith", 1020, 28, 150, 2, 48000, 3);
        
        // Crear representantes de ventas
        SalesRep salesRep1 = new SalesRep("Elise", "Johnson", 1050, 26, 100, 1, 40000, 2);
        SalesRep salesRep2 = new SalesRep("Michael", "Brown", 1060, 30, 120, 2, 42000, 3);

        // Crear gerente de ventas
        SalesManager salesManager = new SalesManager("Santiago", "Rodriguez", 1020, 33, 250, 3, 60000, 7);
        
        // Agregar representantes al equipo del gerente de ventas
        salesManager.addTeamMember(salesRep1);
        salesManager.addTeamMember(salesRep2);

        // Mostrar información sobre empleados
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(salesRep1);
        System.out.println(salesRep2);
        System.out.println(salesManager);

        try {
        // Calcular y mostrar la comisión total del gerente de ventas
        System.out.println("Total Sales: " + salesManager.calculateTotalSales());
        System.out.println("Total Commission: " + salesManager.calculateComission());

    } catch (Exception e) {
        System.out.println("An unexpected error occurred: " + e.getMessage());
    }
  		}
    }//class Main
