/**
 * 
 */
package org.usfirst.frc.team5971.robot.commands.DriveTrain;

import java.util.List;

import org.usfirst.frc.team5971.robot.Robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


/**
 * @author Thomas Wimprine
 * Lots of help from Spartronics 4915
 *
 */
public class ArcadeDrive extends Command {
	
	public Joystick joystickDrive;
	private double joysitckX;
	private double joystickY;
	
	public ArcadeDrive() {
		requires(Robot.driveTrain);
	}


	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		
	}


	@Override
	protected void execute() {
		// This is what runs when we control the robot
		this.joystickDrive = Robot.oi.getJoystickDrive();
		this.joysitckX = this.joystickDrive.getAxis(Joystick.AxisType.kX);
		this.joystickY = this.joystickDrive.getAxis(Joystick.AxisType.kY);
		
		Robot.driveTrain.joystickThrottle = Robot.driveTrain.modifyThrottle();
		
	}


	@Override
	protected void end() {
		// TODO Auto-generated method stub
		Robot.driveTrain.drive.stopMotor();
		
	}


	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		end();
		
	}


	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
}
