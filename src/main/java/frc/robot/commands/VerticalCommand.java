package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.VerticalElevator;

public class VerticalCommand extends CommandBase
{
    VerticalElevator vertical;
    double power;
   public VerticalCommand(VerticalElevator elevator, double speed)
   {
        vertical = elevator;
        power = speed;
        addRequirements(vertical);
   } 
   @Override
   public void execute()
   {
        vertical.VerticalMove(power);
   }
}
