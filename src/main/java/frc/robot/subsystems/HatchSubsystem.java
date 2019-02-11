/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
public class HatchSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  Solenoid hatchPushSolenoid =new Solenoid(RobotMap.hatchPushPort);
  DoubleSolenoid arrowSolenoid = new DoubleSolenoid(RobotMap.arrowUpPort, RobotMap.arrowDownPort);

  public void hatchPushOut() {
    hatchPushSolenoid.set(true);
  }

  public void hatchPushIn() {
    hatchPushSolenoid.set(false);
  }

  public void arrowUp(){
    arrowSolenoid.set(DoubleSolenoid.Value.kForward);
  }

  public void arrowDown(){
    arrowSolenoid.set(DoubleSolenoid.Value.kReverse);
  }
  
  public void arrowHold(){
    arrowSolenoid.set(DoubleSolenoid.Value.kOff);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
