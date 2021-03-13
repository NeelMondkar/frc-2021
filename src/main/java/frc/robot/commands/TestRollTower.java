// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.Robot;
import frc.robot.subsystems.shooter.Hopper;

public class TestRollTower extends CommandBase {
  /** Creates a new TestRollTower. */
  public TestRollTower() {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(Hopper.tower);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    double triggerVal = Robot.joystick.getRawAxis(Constants.TRIGGER_AXIS);
    
    if(triggerVal > 0.1) {
      Hopper.tower.setIn();
    }
    
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    Hopper.tower.setZero();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
