package org.usfirst.frc.team5971.robot;

//import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.VictorSP;

//import org.usfirst.frc.team5971.robot.subsystems.DriveTrain;

import edu.wpi.first.wpilibj.*;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
	
	//ROBOT DRIVE
	public static RobotDrive driveMap;
	
	// CAN Create Motor Controlers for driveTrain
	public static VictorSP leftFrontMotor; //0
	public static VictorSP leftRearMotor;  //2
	public static VictorSP rightFrontMotor; //1
	public static VictorSP rightRearMotor; //3

	public static int DRIVE_MOTOR_RIGHT_FRONT = 1;
	public static int DRIVE_MOTOR_LEFT_FRONT = 0;
	public static int DRIVE_MOTOR_LEFT_REAR = 2;
	public static int DRIVE_MOTOR_RIGHT_REAR = 3;
	
	// BALL MANIPULATION MOTORS
	public static int GRIPPER_MOTOR_RIGHT = 4;
	public static int GRIPPER_MOTOR_LEFT = 5;
	public static int THROW_MOTOR_RIGHT = 6;
	public static int THROW_MOTOR_LEFT = 7;
	
	// SENSORS
	
	// Digital Inputs
	public static int BOULDER_LIMIT_SWITCH_PORT = 0;
	
	// Analog Inputs
	public static int BOULDER_LED_SENSOR_PORT = 0;
	
	// Create Devices
	
	// Create Boulder Sensor
//	public static DigitalInput boulderSwitch;
	
	
	public static void init() {
		// Initialize modules
		leftFrontMotor = new VictorSP(DRIVE_MOTOR_LEFT_FRONT);
		
		rightFrontMotor = new VictorSP(DRIVE_MOTOR_RIGHT_FRONT);
		
		leftRearMotor = new VictorSP(DRIVE_MOTOR_LEFT_REAR);
		
		rightRearMotor = new VictorSP(DRIVE_MOTOR_RIGHT_REAR);
		
		driveMap = new RobotDrive(leftFrontMotor, leftRearMotor, rightFrontMotor, rightRearMotor);
		
		driveMap.setSafetyEnabled(true);
		driveMap.setExpiration(0.1);
		driveMap.setSensitivity(0.5);
		driveMap.setMaxOutput(1.0);
		driveMap.setInvertedMotor(RobotDrive.MotorType.kRearLeft, true);
		driveMap.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);
		
	}

	
}
