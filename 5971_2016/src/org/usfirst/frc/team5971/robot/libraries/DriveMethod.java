/**
 * 
 */
package org.usfirst.frc.team5971.robot.libraries;

/**
 * @author Thomas Wimprine & Gerard Nelson
 * @see SlideDrive
 * @see DriveController
 */
public abstract class DriveMethod {
	
	protected DriveController controller;
	
	public DriveMethod(DriveController controller) {
		this.controller = controller;
	}

	public void stop() {
		controller.stopMotor();
	}
}
