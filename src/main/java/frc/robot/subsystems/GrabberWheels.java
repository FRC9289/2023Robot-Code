// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class GrabberWheels extends SubsystemBase {
  private CANSparkMax leftWheel = new CANSparkMax(13, MotorType.kBrushless);
  private CANSparkMax rightWheel = new CANSparkMax(14, MotorType.kBrushless);
  /** Creates a new Elevator. */
  public GrabberWheels() 
  {
    leftWheel.restoreFactoryDefaults();
    rightWheel.restoreFactoryDefaults();

    leftWheel.setSmartCurrentLimit(20);
    rightWheel.setSmartCurrentLimit(20);

    rightWheel.burnFlash();
    leftWheel.burnFlash();
  }
  public void rolling(double speed)
  {
    rightWheel.set(speed);
    leftWheel.set(speed);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}