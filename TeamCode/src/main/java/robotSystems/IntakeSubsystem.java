package robotSystems;


public class IntakeSubsystem {
    RobotHardware hardware;

    public IntakeSubsystem(RobotHardware hardware) { this.hardware = hardware;}
    public void powerOn(){
        hardware.getIntake().setPower(.94);
    }
    public void powerOff(){
        hardware.getIntake().setPower(0);
    }
    public void reverse(){
        hardware.getIntake().setPower(-1);
    }

}

