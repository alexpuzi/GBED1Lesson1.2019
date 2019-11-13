package JavaCore.GB.Lesson1.part_1;


public class JavaCoreL1<T extends Number> {
   private T[] nums;

    public JavaCoreL1(T[] nums) {
        this.nums = nums;
    }

    public JavaCoreL1(int i, int i1, int i2, int i3, int i4) {

    }

    public T[] workWithArrayElements(){
        int i;
        for (i = 0; i<nums.length; i++){
            nums[i] = nums[i+1];
            nums[i+1] = nums[i];

        }return nums;
    }
}
