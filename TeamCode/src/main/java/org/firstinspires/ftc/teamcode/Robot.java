package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.robotSystems.DriveSubsystem;
import org.firstinspires.ftc.teamcode.robotSystems.ImuSubsystem;
import org.firstinspires.ftc.teamcode.robotSystems.IntakeSubsystem;
import org.firstinspires.ftc.teamcode.robotSystems.LEDSubsystem;
import org.firstinspires.ftc.teamcode.robotSystems.RobotHardware;
import org.firstinspires.ftc.teamcode.robotSystems.ShooterSubsystem;
import org.firstinspires.ftc.teamcode.robotSystems.VisionSubsystem;

/*
 * This class is the “hub” that wires everything together for an OpMode.
 * It holds one instance of RobotHardware and creates all subsystems using it.
 */


public class Robot {
    public RobotHardware hardware;
    public VisionSubsystem vision;
    public DriveSubsystem driveTrain;
    public LEDSubsystem LED;
    public ImuSubsystem imu;
    public ShooterSubsystem shooter;
    public IntakeSubsystem intake;



    public void initRobot(HardwareMap hwMap){
        //Creates and initializes the shared hardware for the robot
        hardware = new RobotHardware();
        hardware.init(hwMap);

        //Initializes the individual subsystems for the robot
        imu = new ImuSubsystem(hardware);
        //vision = new VisionSubsystem(hardware); //Reset Config file with limeight
        driveTrain = new DriveSubsystem(hardware, vision, imu);
        shooter = new ShooterSubsystem(hardware);


        //intake = new IntakeSubsystem(hardware);
        //LED = new LEDSubsystem(hardware);

    }
}
