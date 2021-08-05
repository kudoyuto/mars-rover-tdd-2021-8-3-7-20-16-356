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
}
