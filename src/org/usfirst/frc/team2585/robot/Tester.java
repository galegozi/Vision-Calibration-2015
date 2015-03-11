/**
 * 
 */
package org.usfirst.frc.team2585.robot;
import edu.wpi.first.wpilibj.networktables.NetworkTable;
import edu.wpi.first.wpilibj.tables.TableKeyNotDefinedException;

/**
 * @author Gal
 *
 */
public class Tester {

	/**
	 * 
	 */
	public Tester() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		NetworkTable server = NetworkTable.getTable("SmartDashboard");
		try
		{
				System.out.println(server.getNumber("COG_X", 0.0));
		}
		catch (TableKeyNotDefinedException ex)
		{
		}

	}

}
