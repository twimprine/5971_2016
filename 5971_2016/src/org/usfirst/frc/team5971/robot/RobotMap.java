package org.usfirst.frc.team5971.robot;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.VictorSP;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public interface RobotMap {

	
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
	// DRIVE MOTORS
	public static final int DRIVE_MOTOR_LEFT_FRONT = 0;
	public static final int DRIVE_MOTOR_LEFT_REAR = 2;
	public static final int DRIVE_MOTOR_RIGHT_FRONT = 1;
	public static final int DRIVE_MOTOR_RIGHT_REAR = 3;
	
	// CAN Create Motor Controlers for driveTrain
	public static VictorSP leftFrontMotor;
	public static VictorSP leftRearMotor;
	public static VictorSP rightFrontMotor;
	public static VictorSP rightRearMotor;
	
	// BALL MANIPULATION MOTORS
	public static final int GRIPPER_MOTOR_RIGHT = 4;
	public static final int GRIPPER_MOTOR_LEFT = 5;
	public static final int THROW_MOTOR_RIGHT = 6;
	public static final int THROW_MOTOR_LEFT = 7;
	
	// SENSORS
	
	// Digital Inputs
	public static final int BOULDER_LIMIT_SWITCH_PORT = 0;
	
	// Analog Inputs
	public static final int BOULDER_LED_SENSOR_PORT = 0;
	
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
		
		
	}

	
}
