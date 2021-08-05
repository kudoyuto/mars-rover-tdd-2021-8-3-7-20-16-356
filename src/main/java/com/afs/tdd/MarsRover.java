package com.afs.tdd;

public class MarsRover {
    private RoverStatus roverStatus;
    public MarsRover(RoverStatus roverStatus){
        this.roverStatus = roverStatus;
    }

    public void executeCommand(String command) {
        if("M".equals(command)){
            move();
        } else if("L".equals(command)){
            turnLeft();
        } else if("R".equals(command)) {
        turnRight();
    }

}

    private void turnRight() {
        final String direction = roverStatus.getDirection();
        if( direction.equals("N")){
            String newDirection = "E";
            roverStatus = new RoverStatus(roverStatus.getLocationX(), getRoverStatus().getLocationY(), newDirection);
        }
    }
    private void turnLeft() {
        final String direction = roverStatus.getDirection();
        if( direction.equals("N")){
           String newDirection = "W";
           roverStatus = new RoverStatus(roverStatus.getLocationX(), getRoverStatus().getLocationY(), newDirection);
        }


    }

    private void move() {
        roverStatus = new RoverStatus(roverStatus.getLocationX(), roverStatus.getLocationY()+1, roverStatus.getDirection());

    }

    public RoverStatus getRoverStatus() {
        return roverStatus;
    }
}
