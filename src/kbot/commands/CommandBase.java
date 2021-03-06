package kbot.commands;

import edu.wpi.first.wpilibj.command.Command;
import kbot.robot.OI;
import kbot.subsystems.*;

/**
 * The base for all commands. All atomic commands should subclass CommandBase.
 * CommandBase stores creates and stores each control system. To access a
 * subsystem elsewhere in your code in your code use CommandBase.exampleSubsystem
 */
public abstract class CommandBase extends Command 
{

    public static OI oi;
    
    // Create a single static instance of all of your subsystems
    public static DriveTrain driveTrain = new DriveTrain();
    public static Pistons pistons = new Pistons();
    public static Shooter shooter = new Shooter();
    
    public static void init() 
    {
        // This MUST be here. If it isn't, it may cause NULL pointers
        oi = new OI();

        // Show what command your subsystem is running on the SmartDashboard
        //SmartDashboard.putData(exampleSubsystem);
    }

    public CommandBase(String name) 
    {
        super(name);
    }

    public CommandBase() 
    {
        super();
    }
}
