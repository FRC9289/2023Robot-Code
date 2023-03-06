// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class GrabberArm extends SubsystemBase {
  private CANSparkMax raiseMotor = new CANSparkMax(11, MotorType.kBrushless);

  /** Creates a new Elevator. */
  public GrabberArm() 
  {
    raiseMotor.restoreFactoryDefaults();

    raiseMotor.setSmartCurrentLimit(20);

    raiseMotor.burnFlash();
  }
  public void rotate(double speed)
  {
    raiseMotor.set(speed);
  }
  
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
