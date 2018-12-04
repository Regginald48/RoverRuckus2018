package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DistanceSensor;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;



@TeleOp (name = "DistanceSensor")

public class DistanceSensorTest extends LinearOpMode {


    public DistanceSensor distanceSensor;

    public void runOpMode(){
        distanceSensor = hardwareMap.get(DistanceSensor.class,"distanceSensor");

        waitForStart();
        while(opModeIsActive()){
            telemetry.addData("deviceName",distanceSensor.getDeviceName() );
            telemetry.addData("range", String.format("%.01f mm", distanceSensor.getDistance(DistanceUnit.MM)));
            telemetry.addData("range", String.format("%.01f cm", distanceSensor.getDistance(DistanceUnit.CM)));
            telemetry.addData("range", String.format("%.01f m", distanceSensor.getDistance(DistanceUnit.METER)));
            telemetry.addData("range", String.format("%.01f in", distanceSensor.getDistance(DistanceUnit.INCH)));
            telemetry.update();


       }
    }

}
