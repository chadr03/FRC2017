/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;



import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/**
 * Add your docs here.  This is for a test to see if I can pull and old version......
 */
public class GearSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  Spark bottomIntakeMotor = new Spark(RobotMap.bottomIntakeMotorPort);
  Spark topIntakeMotor = new Spark(RobotMap.topIntakeMotorPort);
  SpeedControllerGroup intakeMotors = new SpeedControllerGroup(bottomIntakeMotor, topIntakeMotor);

  DoubleSolenoid intakeLeft = new DoubleSolenoid(RobotMap.intakeLeftUp, RobotMap.intakeLeftDown);
  DoubleSolenoid intakeRight = new DoubleSolenoid(RobotMap.intakeRightUp, RobotMap.intakeRightDown);

  DoubleSolenoid gearBoxLeft = new DoubleSolenoid(RobotMap.gearBoxLeftUp, RobotMap.gearBoxLeftDown);
  DoubleSolenoid gearBoxRight = new DoubleSolenoid(RobotMap.gearBoxRightUp, RobotMap.gearBoxRightDown);
  
  public GearSubsystem() {
		bottomIntakeMotor.setInverted(true);
  }
  

  public void setCargoIntakeSpeed(double speed) {
    intakeMotors.set(speed);
  }

  public void intakeUp(){
    intakeLeft.set(DoubleSolenoid.Value.kForward);
    intakeRight.set(DoubleSolenoid.Value.kForward);
  }

  public void intakeDown(){
    intakeLeft.set(DoubleSolenoid.Value.kReverse);
    intakeRight.set(DoubleSolenoid.Value.kReverse);
  }

  public void gearBoxUp(){
    gearBoxLeft.set(DoubleSolenoid.Value.kForward);
    gearBoxRight.set(DoubleSolenoid.Value.kForward);
  }

  public void gearBoxDown(){
    gearBoxLeft.set(DoubleSolenoid.Value.kReverse);
    gearBoxRight.set(DoubleSolenoid.Value.kReverse);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
