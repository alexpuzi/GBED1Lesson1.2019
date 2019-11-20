package JavaCore.GB.Lesson1.part_1;


public class JavaCoreL1<T extends Number> {
    int i;
    private final int i2;
    private final int i3;
    private final int i4;
    private T[] nums;

    public JavaCoreL1(int i2, int i3, int i4, T[] nums) {
        this.i2 = i2;
        this.i3 = i3;
        this.i4 = i4;
        this.nums = nums;
    }


    public JavaCoreL1(int i, int i2, int i3, int i4) {

        this.i = i;
        this.i2 = i2;
        this.i3 = i3;
        this.i4 = i4;
    }

    public T[] workWithArrayElements() throws NullPointerException{

        for (i = 0; i<nums.length; i++){
            nums[i] = nums[i+1];
            nums[i+1] = nums[i];

        }return nums;
    }
}
