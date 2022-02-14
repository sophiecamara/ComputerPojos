package paramconst;

public class Starter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Creating POJOs or Beans
	   Computer c1= new Computer();
	   Computer c2 = new Computer();
		Computer c3 = new Computer();
		
		//Assigning or setting the properties
       c1.setCname("Acer");
		c1.setCyear(2015);
		c1.setCcost(500);
		
		  		
		c2.setCname("Dell");
		c2.setCyear(2018);
		c2.setCcost(800);
			
		c3.setCname("HP");
		c3.setCyear(2019);
		c3.setCcost(1100);
		
		
		//Displaying or getting the properties
				System.out.println(c1.getCname());
				System.out.println(c1.getCyear());
				System.out.println(c1.getCcost());
				System.out.println();
				
		      	System.out.println(c2.getCname());
				System.out.println(c2.getCyear());
				System.out.println(c2.getCcost());
				System.out.println();
				
				System.out.println(c3.getCname());
		        System.out.println(c3.getCyear());
		        System.out.println(c3.getCcost());

			    Computer.totalComputer();
		     
	}  
		      
			}
	
			
	
	


