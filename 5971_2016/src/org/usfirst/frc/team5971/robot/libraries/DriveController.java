/**
 * 
 */
package org.usfirst.frc.team5971.robot.libraries;

/**
 * @author Thomas Wimprine & Gerrard KDKDKDKDKD
 *
 */

import edu.wpi.first.wpilibj.MotorSafety;
import edu.wpi.first.wpilibj.MotorSafetyHelper;

public abstract class DriveController implements MotorSafety{

	/**
	 * Manages the watchdog timer for this (@link DriveController) the watchdog
	 * timer automatically disables the motors if they are not being updated.
	 */
	
	protected MotorSafetyHelper safetyHelper;
	
	public DriveController() {
		safetyHelper = new MotorSafetyHelper(this);
		safetyHelper.setSafetyEnabled(true);
	}
	
	public abstract void drive(double leftSpeed, double rightSpeed);
	
	public final void setExpiration(double expirationTime) {
		safetyHelper.setExpiration(expirationTime);
	}
	
	public final double getExpiration() {
		return safetyHelper.getExpiration();
	}
	
	public final boolean isAlive() {
		return safetyHelper.isAlive();
	}
	
	public abstract void stopMotor();
	
	public final void setSafetyEnabled(boolean enabled) {
		safetyHelper.setSafetyEnabled(enabled);
	}
	
	public final boolean isSafetyEnabled() {
		return safetyHelper.isSafetyEnabled();
	}
	
	public String getDescription() {
		return getClass().getName();
	}

}
