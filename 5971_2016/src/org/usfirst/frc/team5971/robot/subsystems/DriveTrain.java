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
	
	public VictorSP leftFront = new VictorSP(RobotMap.DRIVE_MOTOR_LEFT_FRONT);
	public VictorSP rightFront = new VictorSP(RobotMap.DRIVE_MOTOR_RIGHT_FRONT);	
	public VictorSP leftRear = new VictorSP(RobotMap.DRIVE_MOTOR_LEFT_REAR);
	public VictorSP rightRear = new VictorSP(RobotMap.DRIVE_MOTOR_RIGHT_REAR);
	
	// Proper declaration see constructor in RobotDrive before modifying
	public RobotDrive drive = new RobotDrive(leftFront, leftRear, rightFront, rightRear);

	public DriveTrain(){
		super();
	}
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}