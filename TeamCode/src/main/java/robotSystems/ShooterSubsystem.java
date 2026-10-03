package robotSystems;



public class ShooterSubsystem {
    RobotHardware hardware;

    public ShooterSubsystem(RobotHardware hardware) {
        this.hardware = hardware;
    }

    public void setVelocity(double velocity){
        // Converting the RPM velocity to ticks per second
        velocity = (velocity * 28) / 60;
        hardware.getNectarShooter().setVelocity(-1 * velocity);
    }

    public boolean isUpToSpeed(double target) {
        double threshold = 50; //Allows for the motor to be up to 50 rpm lower than needed
        target = ((target - threshold) * 28) / 60;
        boolean NectarMotor = hardware.getNectarShooter().getVelocity() > target;
        return NectarMotor;
    }

    public void powerShooter(double val){
        hardware.getNectarShooter().setPower(-val);
    }

    public void powerOff(){
        hardware.getNectarShooter().setPower(0);

    }

    }





