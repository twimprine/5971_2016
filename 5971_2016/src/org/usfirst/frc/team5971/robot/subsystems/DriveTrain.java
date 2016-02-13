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
	
	public VictorSP leftFront = new VictorSP(RobotMap.leftFront);
	public VictorSP rightFront = new VictorSP(RobotMap.rightFront);	
	public VictorSP leftRear = new VictorSP(RobotMap.leftRear);
	public VictorSP rightRear = new VictorSP(RobotMap.rightRear);
	public RobotDrive drive = new RobotDrive (final int rearLeftMotor, final int frontLeftMotor, int frontRightMotor, int rearRightMotor);

	public DriveTrain(){
		super();
	}
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

