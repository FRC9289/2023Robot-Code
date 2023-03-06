package frc.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Chassis;
 

public class AutoDrive extends CommandBase {

    Chassis _chassis;
    double startTime;

    Timer timer;

    public AutoDrive(Chassis chassis) {
        _chassis = chassis;

        addRequirements(_chassis);

        timer = new Timer();
    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {
        timer.reset();
        timer.start();
    }

    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
        // if(timer.hasElapsed(3)){
        //      _chassis.Drive(0.0, -0.01);
        // } else if(timer.hasElapsed(2)) {
        //     _chassis.Drive(0.0, 0.3);
        // } else if(timer.hasElapsed(1)) {
        //     _chassis.Drive(0.0, -0.2);
        // }
        _chassis.Drive(0.0, 1);
       System.out.println("Testing.");
    }

    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
        _chassis.Drive(0, 0);
        System.out.println("interrupted");
    }

    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
        return timer.hasElapsed(0.75);
    }

}
