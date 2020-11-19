
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char c =  'n';
		Scanner e = new Scanner(System.in);
		do {
			
			//Function call for taking input
		System.out.println(userInput());
		//Taking input from user for repeating the process
		System.out.println("Want to go again Y or N?");
		c = e.next().charAt(0);
		
		if (c == 'N' || c == 'n')
		{
			System.out.println("Thank you. Have a nice day");
			System.exit(0);
		}
		
		else if(!(c == 'Y' || c == 'y'))
		{
			System.out.println("I said Y or N.");
			c = e.next().charAt(0);
		}
		}
		while(c == 'Y' || c == 'y');

	}
	
	public static String userInput()
	{
		
		int a;
			
		//Taking input from user for starting the process
			Scanner s= new Scanner(System.in);
			System.out.println("How many dice would you like to roll 1 - 3");
			a=s.nextInt();
		
		if (a < 4)
		{
			switch(a)
			{
				
			case 1:
				//Function call to generate random number
				int die = randomNum(5,1);
				
				
				switch(die)
				{
				case 1:
					//Function call to print the respective die
					dieNumOne();
					break;
				case 2:
					//Function call to print the respective die
					dieNumTwo();
					break;
				case 3:
					//Function call to print the respective die
					dieNumThree();
					break;
				case 4:
					//Function call to print the respective die
					dieNumFour();
					break;
				case 5:
					//Function call to print the respective die
					dieNumFive();
					break;
				}
				
				return "Value of die = " + die;
				
			case 2:
				//Function call to generate random number
				int die1 = randomNum(5,1);
				
				switch(die1)
				{
				case 1:
					//Function call to print the respective die
					dieNumOne();
					break;
				case 2:
					//Function call to print the respective die
					dieNumTwo();
					break;
				case 3:
					//Function call to print the respective die
					dieNumThree();
					break;
				case 4:
					//Function call to print the respective die
					dieNumFour();
					break;
				case 5:
					//Function call to print the respective die
					dieNumFive();
					break;
				}
				
				//Function call to generate random number
				int die2 = randomNum(5,1);
				switch(die2)
				{
				case 1:
					//Function call to print the respective die
					dieNumOne();
					break;
				case 2:
					//Function call to print the respective die
					dieNumTwo();
					break;
				case 3:
					//Function call to print the respective die
					dieNumThree();
					break;
				case 4:
					//Function call to print the respective die
					dieNumFour();
					break;
				case 5:
					//Function call to print the respective die
					dieNumFive();
					break;
				}
				
				return "Value of die 1 = " + die1 + '\n' +"Value of die 2 = " + die2;
				
			case 3:
				//Function call to generate random number
				int die1a = randomNum(5,1);
				switch(die1a)
				{
				case 1:
					//Function call to print the respective die
					dieNumOne();
					break;
				case 2:
					//Function call to print the respective die
					dieNumTwo();
					break;
				case 3:
					//Function call to print the respective die
					dieNumThree();
					break;
				case 4:
					//Function call to print the respective die
					dieNumFour();
					break;
				case 5:
					//Function call to print the respective die
					dieNumFive();
					break;
				}
				//Function call to generate random number
				int die2a = randomNum(5,1);
				switch(die2a)
				{
				case 1:
					//Function call to print the respective die
					dieNumOne();
					break;
				case 2:
					//Function call to print the respective die
					dieNumTwo();
					break;
				case 3:
					//Function call to print the respective die
					dieNumThree();
					break;
				case 4:
					//Function call to print the respective die
					dieNumFour();
					break;
				case 5:
					//Function call to print the respective die
					dieNumFive();
					break;
				}
				
				//Function call to generate random number
				int die3a = randomNum(5,1);
				switch(die3a)
				{
				case 1:
					//Function call to print the respective die
					dieNumOne();
					break;
				case 2:
					//Function call to print the respective die
					dieNumTwo();
					break;
				case 3:
					//Function call to print the respective die
					dieNumThree();
					break;
				case 4:
					//Function call to print the respective die
					dieNumFour();
					break;
				case 5:
					//Function call to print the respective die
					dieNumFive();
					break;
				}
				
				return "Value of die 1 = " + die1a + '\n' +"Value of die 2 = " + die2a + '\n' + "Value of die 3 = " + die3a;
			}
		}
		
		else if(a > 4)
		{
			return "Please select from 1 - 3";
		}
		
		return "Make selection";
		
	}
	
	public static void dieNumOne()
	{
		System.out.println("* * * * *");
    	System.out.println("*       *");
    	System.out.println("*   #   *");
    	System.out.println("*       *");
    	System.out.println("* * * * *");
	}
	
	public static void dieNumTwo()
	{
		System.out.println("* * * * *");
    	System.out.println("*    #  *");
    	System.out.println("*       *");
    	System.out.println("*  #    *");
    	System.out.println("* * * * *");
	}
	
	public static void dieNumThree()
	{
		System.out.println("* * * * *");
    	System.out.println("*    #  *");
    	System.out.println("*   #   *");
    	System.out.println("*  #    *");
    	System.out.println("* * * * *");
	}
	
	public static void dieNumFour()
	{
		System.out.println("* * * * *");
    	System.out.println("* #   # *");
    	System.out.println("*       *");
    	System.out.println("* #   # *");
    	System.out.println("* * * * *");
	}
	
	public static void dieNumFive()
	{
		System.out.println("* * * * *");
    	System.out.println("* #   # *");
    	System.out.println("*   #   *");
    	System.out.println("* #   # *");
    	System.out.println("* * * * *");
	}

	public static int randomNum(int max, int min)
	{
		return (int) ((Math.random() * (max - min)) + min);

	}

}
