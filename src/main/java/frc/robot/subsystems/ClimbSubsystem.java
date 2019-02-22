/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;


import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.ClimbCommand;


/**
 * Add your docs here.
 */
public class ClimbSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.


  Spark climbLeftMotor = new Spark(RobotMap.climbLeftPort);
  Spark climbRightMotor = new Spark(RobotMap.climbRightPort);
  SpeedControllerGroup climbMotors = new SpeedControllerGroup(climbLeftMotor, climbRightMotor);
  




  public ClimbSubsystem() {
		climbRightMotor.setInverted(true);
	
  }

  public void manualClimb(double speed) {
    climbMotors.set(speed);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new ClimbCommand());
    
  }
}
