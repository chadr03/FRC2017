/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around. CR
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

  //Joystick Ports
  public static int driveJoystickPort = 0;
  public static int liftJoystickPort = 1;

  //CAN Ports
  public static int leftMasterPort = 4;
  public static int leftSlavePort = 1;
  public static int rightMasterPort = 6;
  public static int rightSlavePort = 3;
  public static int liftMasterPort = 7;
  public static int liftSlavePort = 2;
  public static int cargoMotorPort = 5;

  //PWM Ports
  public static int left1Port = 2; //2
  public static int left2Port = 3; //3
  public static int right1Port = 0; //0
  public static int right2Port = 1; //1
  public static int climbLeftPort = 4; //4 needs +1
  public static int climbRightPort = 7; //7 needs +1
  public static int bottomIntakeMotorPort = 5; //5 +1 sucks
  public static int topIntakeMotorPort = 6; //6 -1 sucks

  //PCM Ports
  public static int intakeLeftUp = 0;
  public static int intakeLeftDown = 1;
  public static int intakeRightUp = 2;
  public static int intakeRightDown = 3;
  public static int gearBoxLeftUp = 4;
  public static int gearBoxLeftDown = 5;
  public static int gearBoxRightUp = 6;
  public static int gearBoxRightDown = 7;

}
