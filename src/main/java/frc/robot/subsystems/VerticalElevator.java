// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class VerticalElevator extends SubsystemBase {
  private CANSparkMax leftVertical = new CANSparkMax(7, MotorType.kBrushless);
  private CANSparkMax rightVertical = new CANSparkMax(8,MotorType.kBrushless );
  // private CANSparkMax grabber = new CANSparkMax(9, MotorType.kBrushless);
  // private CANSparkMax leftWheel = new CANSparkMax(13, MotorType.kBrushless);
  // private CANSparkMax rightWheel = new CANSparkMax(14, MotorType.kBrushless);
  /** Creates a new Elevator. */
  public VerticalElevator() 
  {
    leftVertical.restoreFactoryDefaults();
    rightVertical.restoreFactoryDefaults();

    // leftVertical.setInverted(true);
    // rightHorizontal.setInverted(true);

    leftVertical.burnFlash();
    rightVertical.burnFlash();
  }

  public void VerticalMove(double speed)
  {
    leftVertical.set(-speed);
    rightVertical.set(-speed);
  }

  // public void HorizontalMove(double speed)
  // {
  //   leftHorizontal.set(-(speed/10));
  //   rightHorizontal.set(-(speed/10));
  // }

  // public void wheel(double speed)
  // {
  //   leftWheel.set(speed);
  //   rightWheel.set(speed);
  // }

  // public void grabber(double speed)
  // {
  //   grabber.set(speed);
  // }

  // public void freeGraber()
  // {
  //   grabber.set(-0.25);
  // }
  
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
