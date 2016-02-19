package org.usfirst.frc.team5971.robot.subsystems;

import org.usfirst.frc.team5971.robot.Robot;
import org.usfirst.frc.team5971.robot.RobotMap;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

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

	public double joystickThrottle;
	
	public DriveTrain(){
		super();
	}
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public double modifyThrottle() {
        //255 is the max number on the throttle
        double modifiedThrottle = 0.40 * (-1 * Robot.oi.getJoystickDrive().getAxis(Joystick.AxisType.kThrottle)) + 0.60;
        if (modifiedThrottle != this.joystickThrottle) {
            SmartDashboard.putNumber("Throttle: ", modifiedThrottle);
        }
        setMaxOutput(modifiedThrottle);
        return modifiedThrottle;
    }
	private void setMaxOutput(double modifiedThrottle) {
		// TODO Auto-generated method stub
		
	}
}