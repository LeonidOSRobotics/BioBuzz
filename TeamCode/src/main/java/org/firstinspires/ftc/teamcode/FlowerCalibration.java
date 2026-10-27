package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "Velocity Test", group = "TeleOp")
public class FlowerCalibration extends LinearOpMode {
    Robot robot = new Robot();
    double leftPos = 0;
    double rightPos = 0;
    boolean alreadyPressedLeft = false;
    boolean alreadyPressedRight = false;



    @Override
    public void runOpMode() throws InterruptedException {
        robot.initRobot(hardwareMap);
        waitForStart();
        while (opModeIsActive()) {

            if(gamepad2.left_bumper && !alreadyPressedLeft){
                leftPos += .1;
                alreadyPressedLeft = true;
            }else if(gamepad2.right_bumper && !alreadyPressedLeft){
                rightPos-= .1;
                alreadyPressedLeft = true;
            }else if (!gamepad2.left_bumper && !gamepad1.right_bumper){
                alreadyPressedLeft = false;
            }
            if(gamepad2.left_bumper && !alreadyPressedRight){
                leftPos += .1;
                alreadyPressedRight = true;
            }else if(gamepad2.right_bumper && !alreadyPressedRight){
                rightPos-= .1;
                alreadyPressedRight = true;
            }else if (!gamepad2.left_bumper && !gamepad1.right_bumper){
                alreadyPressedRight = false;
            }

            robot.shooter.setLeft(leftPos);
            robot.shooter.setRight(rightPos);
            telemetry.addData("Left Pos:",leftPos);
            telemetry.addData("Right Pos:",rightPos);
            telemetry.addData("Button Pressed: ", alreadyPressedLeft + "Right" + alreadyPressedRight);
            telemetry.update();

        }
    }
}