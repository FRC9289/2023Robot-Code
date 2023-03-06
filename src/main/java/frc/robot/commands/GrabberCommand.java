package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Grabber;

public class GrabberCommand extends CommandBase
{
    Grabber grabber;
    double power;
   public GrabberCommand(Grabber grabber, double speed)
   {
        this.grabber = grabber;
        power = speed;
        addRequirements(grabber);
   } 
   @Override
   public void execute()
   {
        grabber.grabberMove(power);
   }
}
