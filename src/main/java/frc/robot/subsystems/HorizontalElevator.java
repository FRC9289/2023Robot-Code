// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class HorizontalElevator extends SubsystemBase {
  private CANSparkMax rightHorizontal = new CANSparkMax(5,MotorType.kBrushless );
  private CANSparkMax leftHorizontal = new CANSparkMax(6,MotorType.kBrushless );
  /** Creates a new Elevator. */
  public HorizontalElevator() 
  {
    rightHorizontal.restoreFactoryDefaults();
    leftHorizontal.restoreFactoryDefaults();

    leftHorizontal.setSmartCurrentLimit(20);
    rightHorizontal.setSmartCurrentLimit(20);

    rightHorizontal.burnFlash();
    leftHorizontal.burnFlash();
  }

  public void HorizontalMove(double speed)
  {
    leftHorizontal.set(speed - 0.01);
    rightHorizontal.set(speed - 0.01);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
