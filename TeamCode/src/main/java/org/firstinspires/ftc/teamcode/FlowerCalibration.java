package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "Velocity Test", group = "TeleOp")
public class FlowerCalibration extends LinearOpMode {
    Robot robot = new Robot();
    int vel = 3150;
    boolean alreadyPressed = false;

    @Override
    public void runOpMode() throws InterruptedException {
        robot.initRobot(hardwareMap);
        waitForStart();
        while (opModeIsActive()) {

            if(gamepad2.left_bumper && !alreadyPressed){
                vel += 50;
                alreadyPressed = true;
            }else if(gamepad2.right_bumper && !alreadyPressed){
                vel-=50;
                alreadyPressed = true;
            }else if (!gamepad2.left_bumper && !gamepad1.right_bumper){
                alreadyPressed = false;
            }

            robot.shooter.setVelocity(vel);
            telemetry.addData("RPM: ", vel);
            telemetry.addData("Button Pressed: ", alreadyPressed);
            telemetry.update();

        }
    }
}