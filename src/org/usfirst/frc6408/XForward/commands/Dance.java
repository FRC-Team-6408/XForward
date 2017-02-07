package org.usfirst.frc6408.XForward.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class Dance extends CommandGroup {

    public Dance() {	//dances the robot
    	System.out.println("dance start");
    	addSequential(new DriveForward(0.5, 0.25, 0));		//moves forward
    	addSequential(new DriveForward(0.5, -0.3, 0.25));	//back curve
    	addSequential(new DriveForward(0.5, 0.25, 0));		//forward
    	addSequential(new DriveForward(0.5, -0.3, -0.25));	//-back curve
    	
    	addSequential(new DriveForward(0.5, 0.25, 0));		//forward
    	addSequential(new DriveForward(0.5, -0.3, -0.25));	//-back curve
    	addSequential(new DriveForward(0.5, 0.25, 0));		//forward
    	addSequential(new DriveForward(0.5, -0.3, 0.25));	//back curve
        
    }
}
