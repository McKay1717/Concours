/**
 * 
 */
package org.mckay1717.concours;

import java.util.Random;

/**
 * @author nicolas
 *
 */
public class Main {

	protected static Random rand = new Random();
	public static int gagnant = rand.nextInt(10);
	public static int gagnant1 = rand.nextInt(10);
	public static int gagnant2 = rand.nextInt(10);
	public static int gagnant3 = rand.nextInt(10);
	public static int gagnant4 = rand.nextInt(10);
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = 10;

		if(gagnant < max && gagnant > 0)
		{

			System.out.println("Gagnant 1 =" + gagnant);
		}

		if(gagnant1 < max && gagnant1 > 0)
		{
			System.out.println("Gagnant 2 =" + gagnant1);
		}
		if(gagnant2 < max && gagnant2 > 0)
		{

			System.out.println("Gagnant 3 =" + gagnant2);
		}
		if(gagnant3 < max && gagnant3 > 0)
		{

			System.out.println("Gagnant 4 =" + gagnant3);
		}
		if(gagnant4 < max && gagnant4 > 0)
		{

			System.out.println("Gagnant 5 =" + gagnant4);
		}



	}

}
