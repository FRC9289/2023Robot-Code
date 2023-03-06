package frc.robot.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.HorizontalElevator;

public class HorizontalDefaultCommand extends CommandBase {

    HorizontalElevator _horizontal;
    Joystick _joystick;

    public HorizontalDefaultCommand(HorizontalElevator horizontal, Joystick _controller) {
        _horizontal = horizontal;
        _joystick = _controller;

        addRequirements(_horizontal);
    }

    @Override
    public void execute() {
        _horizontal.HorizontalMove((_joystick.getY())*0.075);
    }

}