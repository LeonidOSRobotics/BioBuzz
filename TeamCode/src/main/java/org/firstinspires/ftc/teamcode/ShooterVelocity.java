package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "Velocity Test", group = "TeleOp")
public class ShooterVelocity extends LinearOpMode {
    Robot robot = new Robot();
    int vel = 3000;
    boolean alreadyPressed = false;

    @Override
    public void runOpMode() throws InterruptedException {
        robot.initRobot(hardwareMap);
        waitForStart();
        while (opModeIsActive()) {

            if(gamepad1.dpad_up && !alreadyPressed){
                vel += 100;
                alreadyPressed = true;
            }else if(gamepad1.dpad_down && !alreadyPressed){
                vel-=100;
                alreadyPressed = true;
            }else if (!gamepad1.dpad_up && !gamepad1.dpad_down){
                alreadyPressed = false;
            }

            robot.shooter.setVelocity(vel);
            telemetry.addData("RPM: ", vel);
            telemetry.addData("Ticks Per Second:", (vel * 28.0) / 60);
            telemetry.addData("Button Pressed: ", alreadyPressed);
            telemetry.addData("Up To Speed: ", robot.shooter.isUpToSpeed(vel));
            telemetry.update();

        }
    }
}
