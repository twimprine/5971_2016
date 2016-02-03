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
	
	public VictorSP leftMotor = new VictorSP(RobotMap.leftMotor);
	public VictorSP rightMotor = new VictorSP(RobotMap.rightMotor);
	public RobotDrive drive = new RobotDrive(leftMotor, rightMotor);

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

