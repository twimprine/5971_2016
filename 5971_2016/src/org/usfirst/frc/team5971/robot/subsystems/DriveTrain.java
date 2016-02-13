package org.usfirst.frc.team5971.robot.subsystems;

import org.usfirst.frc.team5971.robot.RobotMap;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	public VictorSP leftMotorA = new VictorSP(RobotMap.leftMotorA);
	public VictorSP rightMotorA = new VictorSP(RobotMap.rightMotorA);	
	public VictorSP leftMotorB = new VictorSP(RobotMap.leftMotorB);
	public VictorSP rightMotorB = new VictorSP(RobotMap.rightMotorB);
	public RobotDrive drive = new RobotDrive(leftMotorA, rightMotorA);

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

