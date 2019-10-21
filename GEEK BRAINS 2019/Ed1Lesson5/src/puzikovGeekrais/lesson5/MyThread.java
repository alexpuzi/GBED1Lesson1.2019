package puzikovGeekrais.lesson5;

public class MyThread extends Thread {
    static final int sIze = 10000000;
    static final int hAlf = sIze / 2;
    float[] arrHM4;
    float[] arrHM4_1;
    float[] arrHM4_2;

    public MyThread() {
        arrHM4 = new float[sIze];
    }

    public void myThread() {
        for (int i = 0; i < sIze; i++) {
            arrHM4[i] = 1;
//            System.out.println(arrHM4[i]);//проверка вывод единицы

            //
        }

    }long a = System.currentTimeMillis();

    public float[] calculateMetod(float[] arrHM4) {
        for (int i = 0; i < arrHM4.length; i++)

            arrHM4[i] = (float) (arrHM4[i] * Math.sin(0.2f + arrHM4[i] / 5) * Math.cos(0.2f + arrHM4[i] / 5) * Math.cos(0.4f + arrHM4[i] / 2));

        return arrHM4;
    }

    public void run1() {
        float[] arrHM4_1 = new float[sIze];
        System.arraycopy(arrHM4, 0, arrHM4_1, 0, hAlf);
        System.arraycopy(arrHM4,hAlf,arrHM4_2,0,hAlf);
        new Thread(){
            @Override
            public void run() {
                super.run();
                float[] a1 = calculateMetod(arrHM4_1);
                System.arraycopy(a1,0,arrHM4_1,0,a1.length);
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                super.run();
                float[] a2 = calculateMetod(arrHM4_2);
                System.arraycopy(a2,0,arrHM4_2,0,a2.length);
            }
        }.start();
        System.arraycopy(arrHM4_1,0,arrHM4,0,hAlf);
        System.arraycopy(arrHM4_2,0,arrHM4,hAlf,hAlf);
        System.out.println("Tow threads ends with:"+(System.currentTimeMillis()-a));
            }


}
