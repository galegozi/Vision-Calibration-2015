package org.usfirst.frc.team2585.robot;
import edu.wpi.first.wpilibj.tables.ITable;
import edu.wpi.first.wpilibj.tables.ITableListener;
import edu.wpi.first.wpilibj.networktables.NetworkTable;

public class VisionCalib implements ITableListener{
	private NetworkTable nt;
	private double xCoord;
	private double yCoord;
	private double distance;
	//private ITableListener table;
	/**
	 * 
	 */
	public VisionCalib() {
		setNt(NetworkTable.getTable("SmartDashboard"));
		nt.addTableListener(this);
	}
	public void valueChanged(ITable itable, String key, Object obj, boolean isNew)
	{
		setNums();
	}
	public void setNums()
	{
		/*nt.putNumber("COG_X", 0.0);
		nt.putNumber("COG_Y", 0.0);
		nt.putNumber("TL_TARGET_DISTANCE", 0.0);*/
	}
	public double getDistance() {return distance;}
	public double getX() {return xCoord;}
	public double getY() {return yCoord;}
	public NetworkTable getNt() {
		return nt;
	}
	public void setNt(NetworkTable nt) {
		this.nt = nt;
	}
	@Override
	public String toString()
	{
		String s="";
		s+="xCoord = "+xCoord;
		s+="\n"+"yCoord = "+yCoord;
		s+="\n"+"Distance = "+distance;
		return s;
	}
}