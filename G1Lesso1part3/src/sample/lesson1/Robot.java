package sample.lesson1;

public class Robot {
    private String jump;
    private String run;
    private int speed;
    private int strange;
    Robot(int speed, int strange){
        this.speed = speed;
        this.strange = strange;
    }

    public Robot(String jump, String run){
        this.jump = jump;
        this.run = run;
    }
    void setJump(){
        System.out.println(jump);
    }
    void setRun(){
        System.out.println(run);
    }
}
