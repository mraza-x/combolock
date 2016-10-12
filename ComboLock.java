import java.util.*;

/**
  Mohammed Raza
  CSC 236 - Lab2 #1 (class1)
*/

public class ComboLock
{
	int x1;
	int y1;
	int z1;

	int x2;
	int y2;
	int z2;

	int top;
	int size = 39;
	int current;
	boolean status;

public ComboLock(int size, int com1, int com2, int com3, int att1, int att2, int att3)
{
	if (size > 39 || size < 0)
		System.out.println("Error Lock Positions(0 to 39 only)");

	top = size;
}

public void setCombo(int x11, int y11, int z11, int x22, int y22, int z22)
{
	x1 = x11;
	y1 = y11;
	z1 = z11;

	x2 = x22;
	y2 = y22;
	z2 = z22;
}

public void turn(int size, int x1, int y1, int z1, int x2, int y2, int z2)
{
	for(int i=0;i<=size;i++)
	{
		System.out.print(" "+i);
		current = i;
	}

	for(int j=0; j<=x2;j++)
	{
		System.out.print(" "+j);
		current = j;
	}

	System.out.println(" ");

	for(int k=x2-1; k>=0;k--)
	{
		System.out.print(" "+k);
		current = k;
	}

	System.out.println(" ");

	for(int l=size; l>=y2; l--)
	{
		System.out.print(" "+l);
		current = l;
	}

	System.out.println(" ");

	for(int m=y2-1; m<=z2; m++)
	{
		System.out.print(" "+m);
		current = m;
	}

	System.out.println(" ");

}

public int getCurrent()
{
	return current;
}

public boolean status(int x1,int y1,int z1,int x2,int y2,int z2)
{
	if (x1 == x2 && y1 == y2 && z1 == z2)
		status = true;
	else
		status = false;

	return status;
}

public void close()
{
	x2 = 0;
	y2= 0 ;
	z2 = 0;
}


}



