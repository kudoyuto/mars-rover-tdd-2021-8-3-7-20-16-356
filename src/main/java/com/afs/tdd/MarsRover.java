package com.afs.tdd;

public class MarsRover {
    private RoverStatus roverStatus;
    public MarsRover(RoverStatus roverStatus){
        this.roverStatus = roverStatus;
    }

    public void executeCommand(String command) {
        if(command.equals("M")){
            move();
        }
    }

    private void move() {
        roverStatus = new RoverStatus(roverStatus.getLocationX(), roverStatus.getLocationY()+1, roverStatus.getDirection());
    }

    public RoverStatus getRoverStatus() {
        return roverStatus;
    }
}
