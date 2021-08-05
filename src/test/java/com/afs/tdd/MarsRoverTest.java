package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverTest {
    @Test
    //roverStatus: 0 0N and command: M
    void should_return_location_x_0_location_y_1_direction_N_when_execute_command_given_location_x_0_location_y_0_and_M() {
        //given
        MarsRover marsRover = new MarsRover(new RoverStatus(0,0,"N"));
        RoverStatus expectedRoverStatus = new RoverStatus(0,1,"N");
        //when
        marsRover.executeCommand("M");
        //then
        assertEquals(expectedRoverStatus.getLocationY(),marsRover.getRoverStatus().getLocationY());
    }
    @Test
    void should_return_location_x_0_location_y_0_direction_W_when_execute_command_given_location_x_0_location_y_0_and_L() {
        //given
        MarsRover marsRover = new MarsRover(new RoverStatus(0,0,"N"));
        RoverStatus expectedRoverStatus = new RoverStatus(0,0,"W");
        //when
        marsRover.executeCommand("L");
        //then
        assertEquals(expectedRoverStatus.getDirection(),marsRover.getRoverStatus().getDirection());
    }
    @Test
    void should_return_location_x_0_location_y_0_direction_E_when_execute_command_given_location_x_0_location_y_0_and_R(){
        //given
        MarsRover marsRover = new MarsRover(new RoverStatus(0,0,"N"));
        RoverStatus expectedRoverStatus = new RoverStatus(0,0,"E");
        //when
        marsRover.executeCommand("R");
        //then
        assertEquals(expectedRoverStatus.getDirection(),marsRover.getRoverStatus().getDirection());
        }
    @Test
    void should_return_location_x_0_location_y_negative_1_direction_S_when_execute_command_given_location_x_0_location_y_0_and_M(){
        //given
        MarsRover marsRover = new MarsRover(new RoverStatus(0,0,"S"));
        RoverStatus expectedRoverStatus = new RoverStatus(0,-1,"S");
        //when
        marsRover.executeCommand("M");
        //then
        assertEquals(expectedRoverStatus.getLocationY(),marsRover.getRoverStatus().getLocationY());
    }
    @Test
    void should_return_location_x_0_location_y_0_direction_E_when_execute_command_given_location_x_0_location_y_0_and_L(){
        //given
        MarsRover marsRover = new MarsRover(new RoverStatus(0,0,"S"));
        RoverStatus expectedRoverStatus = new RoverStatus(0,0,"E");
        //when
        marsRover.executeCommand("L");
        //then
        assertEquals(expectedRoverStatus.getDirection(),marsRover.getRoverStatus().getDirection());
    }
}
