//Importing team specific pedropathing files
package org.firstinspires.ftc.teamcode.pedroPathing;
/*
import com.pedropathing.geometry.BezierLine;
import com.pedropathing.geometry.Pose;
import com.pedropathing.paths.PathChain;

 */
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.firstinspires.ftc.teamcode.pedroPathing.setUp.PedroBase;

//Importing general pedropathing files.


@Autonomous(name="Test Intergrations", group="Robot")
public class TestPedroIntergration extends PedroBase {
/*
    //Declaring any paths to be used (Each time robot needs to move add a path)
    private PathChain path1;

    //List of robot positions that will make up paths. These could be an enum file?
    private final Pose startPose = poseDeg(33.631, 7.68, 90);
    private final Pose endPose = poseDeg(20.846, 120.126, 270);

    //Allows for the parent class to get the starting position of the robot.
    @Override
    public Pose getStartPose() {

        return startPose;

    }
    //Allows for the parent class to get the starting state of the robot.
    @Override
    public PathState getInitialState() {

        return PathState.DRIVE_STARTPOS_SHOOT_POS;

    }

    //Takes the positions and makes paths to follow
    public void buildPaths() {
        path1 = follower.pathBuilder()
                .addPath(new BezierLine(startPose, endPose))
                .setLinearHeadingInterpolation(startPose.getHeading(), endPose.getHeading())
                .build();

    }


    //Updates the state of the robots, allows to switch between drive, shooting, intaking, ect.
    public void statePathUpdate() {
        switch(pathState) {
            case DRIVE_STARTPOS_SHOOT_POS:
                follower.followPath(path1);
                setPathState(PathState.WAIT_FOR_PATH);
                break;
            case WAIT_FOR_PATH:
                if (!follower.isBusy()) {
                    setPathState(PathState.NEXT_STATE);
                }
                break;
            case NEXT_STATE:
                break;
        }
    }

 */
public void statePathUpdate() {}

    @Override
    public void init() {

    }

    @Override
    public void loop() {

    }
}
