package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Grabber;
import frc.robot.subsystems.GrabberWheels;

public class GrabberWheelsCommand extends CommandBase
{
    GrabberWheels grabberWheels;
    double power;
   public GrabberWheelsCommand(GrabberWheels wheels, double speed)
   {
        this.grabberWheels = wheels;
        power = speed;
        addRequirements(grabberWheels);
   } 
   @Override
   public void execute()
   {
        grabberWheels.rolling(power);
   }
}
