// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Grabber extends SubsystemBase {
  private CANSparkMax grabber = new CANSparkMax(10, MotorType.kBrushless);
//   private CANSparkMax leftWheel = new CANSparkMax(13, MotorType.kBrushless);
//   private CANSparkMax rightWheel = new CANSparkMax(14, MotorType.kBrushless);
  /** Creates a new Elevator. */
  public Grabber() 
  {
    grabber.restoreFactoryDefaults();
    // leftWheel.restoreFactoryDefaults();
    // rightWheel.restoreFactoryDefaults();

    grabber.setSmartCurrentLimit(60);
    // leftWheel.setSmartCurrentLimit(20);
    // rightWheel.setSmartCurrentLimit(20);

    grabber.burnFlash();
    // rightWheel.burnFlash();
    // leftWheel.burnFlash();
  }
  public void grabberMove(double speed)
  {
    grabber.set(speed);
  }
  
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
