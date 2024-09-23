# Java-Polymorphism-and-Inheritance
 <br/>
 <br/>
 
 
 ## Part 1: Exploring the HR System
 
 1. In this exercise, we'll create the Human Resources Management System mentioned in the theory section
 2. Create the following class


![](https://i.imgur.com/XBucIlB.png)


Implement the methods: 

 
 ```java
    public int timeToRetirement(){
       // time to retirement = min(60 - age, 40 - yearsWorked)
    }

    public int vacationTimeLeft(){
        // vacation time left = (daysWorked/360)*(30 - vacationDaysTaken)
    }

    public int calculateBonus(){
        // bonus = 2.2*salary
    }
 ```
 
3. Now, create a sales rep class that *inherits* the original employee class
    * The arrow used means inheritance in class diagrams


![](https://i.imgur.com/z0nz3Db.png)


 ```java
    public int calculateComission(){
       // comission = 0.1 * salesMade
    }
  ```


4. Create a Java Class for sales manager:

![](https://i.imgur.com/oh1Keck.png)

 ```java
    public void calculateComission(){
       // 0.03 * all sales made by team
    }
 ```

6. Run the main method and verify that your implementation works.
