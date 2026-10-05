package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "Drive", group = "TeleOp")
public class DriveTeleOp extends LinearOpMode {
    Robot robot = new Robot();

    @Override
    public void runOpMode() throws InterruptedException {
        robot.initRobot(hardwareMap);
        waitForStart();
        while (opModeIsActive()) {


            //Driving Code
            double rotate = gamepad1.left_trigger - gamepad1.right_trigger;
            robot.driveTrain.fieldOrientedDrive(-gamepad1.left_stick_y, gamepad1.left_stick_x, -rotate);

            //Resetting the robot's orientation
           // if(gamepad1.start){
              //  robot.imu.resetYaw();
           // }


            if(gamepad1.a){
                robot.shooter.setVelocity(.0005);
            }else if(gamepad1.b){
                robot.shooter.setVelocity(0);
            }




        }
    }
}
