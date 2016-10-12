import java.util.*;

/**
  Mohammed Raza
  CSC 236 - Lab2 #1 (main)
*/

public class ComboLockDemo
{

	public static void main(String [] args)
	{

		Scanner keyboard = new Scanner(System.in);

		int com1 = 0;
		int com2 = 0;
		int com3 = 0;

		int att1 = 0;
		int att2 = 0;
		int att3 = 0;

		int size = 39;

		System.out.println(":::Combination Lock:::\nPlease enter 3 numbers (lock combination): ");
		com1 = keyboard.nextInt();
		com2 = keyboard.nextInt();
		com3 = keyboard.nextInt();

		System.out.println("Please enter numbers to attempt to open the lock: ");
		att1 = keyboard.nextInt();
		att2 = keyboard.nextInt();
		att3 = keyboard.nextInt();

		ComboLock lock = new ComboLock(size,com1,com2,com3,att1,att2,att3);

		System.out.println(" ");

		lock.turn(size,com1,com2,com3,att1,att2,att3);

		if (lock.status(com1,com2,com3,att1,att2,att3) == true)
			System.out.println("\nLock is open");
		else
			System.out.println("\nLock is closed");

	}

}
