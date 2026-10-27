package org.firstinspires.ftc.teamcode.robotSystems;



public class ShooterSubsystem {
    RobotHardware hardware;

    public ShooterSubsystem(RobotHardware hardware) {
        this.hardware = hardware;
    }


    public void setVelocity(double velocity) {
        // Converting the RPM velocity to ticks per second
        velocity = (velocity * 28.0) / 60;
        hardware.getNectarShooter().setVelocity(velocity);// Go to RobotHardware REVERSE if it spins the wrong way

    }

    public boolean isUpToSpeed(double target) {
        double threshold = 25; //Allows for the motor to be up to 50 rpm lower than needed
        target = ((target - threshold) * 28) / 60;
        boolean NectarMotor = hardware.getNectarShooter().getVelocity() > target;
        return NectarMotor;
    }

    public void powerShooter(double val) {
        hardware.getNectarShooter().setPower(val); // Go to RobotHardware REVERSE if it spins the wrong way

    }

    public void powerOff() {
        hardware.getNectarShooter().setPower(0);

    }

    public void pollenGateOpen() {
        hardware.getPollenGate().setPosition(1);
    }

    public void pollenGateClose() {
        hardware.getPollenGate().setPosition(.75);
    }


    public void flowerUp() {
        hardware.getFlowerLeft().setPosition(1);
        hardware.getFlowerRight().setPosition(1);
    }

    public void flowerDown() {
        hardware.getFlowerLeft().setPosition(0);
        hardware.getFlowerRight().setPosition(0);
    }

    public void setLeft(double pos) {
        hardware.getFlowerLeft().setPosition(pos);
    }


public void setRight(double pos) {
    hardware.getFlowerRight().setPosition(pos);
}
}










