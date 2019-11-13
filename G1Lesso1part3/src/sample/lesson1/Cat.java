package sample.lesson1;

public class Cat {
    private String run;
    private String jump;
    int speed;
    int strange;

    public Cat(int speed, int strange){
        this.speed = speed;
        this.strange = strange;
    }

    public Cat(String run, String jump) {
        this.run = run;
        this.jump = jump;
    }
    public void setJump(){
        System.out.println(jump);
    }
    public void setRun(){
        System.out.println(run);
    }

}
