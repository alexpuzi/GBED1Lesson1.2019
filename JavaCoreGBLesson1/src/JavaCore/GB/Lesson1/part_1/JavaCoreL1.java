package JavaCore.GB.Lesson1.part_1;


public class JavaCoreL1<T extends Number> {
   private T[] nums;


    public JavaCoreL1(T i, T i1, T i2, T i3, T i4) {
    }
    public void setNums(T[] nums) {
        this.nums = nums;
    }
    public T[] workWithArrayElements(){
        int i;
        for (i = 0; i<nums.length; i++){
            nums[i] = nums[i+1];
            nums[i+1] = nums[i];

        }return nums;
    }
}
