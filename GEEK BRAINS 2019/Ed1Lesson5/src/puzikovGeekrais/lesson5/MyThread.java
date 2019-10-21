package puzikovGeekrais.lesson5;

import java.lang.Math;

public class MyThread extends Thread {
    static final int sIze = 10000000;
    static final int hAlf = sIze / 2;
    float[] arrHM1 = new float[sIze];
    float[] arrHM2 = new float[hAlf];
    float[] arrHM3 = new float[hAlf];

    public void runFirst() {


        for (int i = 0; i < sIze; i++) {
            arrHM1[i] = (float) (arrHM1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        System.out.println(arrHM1[i]);
        }
        long a = System.currentTimeMillis();
        System.out.println(a);
    }

    @Override
    public void run() {
        System.arraycopy(arrHM1, hAlf, arrHM2, 0, hAlf);
        System.arraycopy(arrHM1, hAlf, arrHM3, 0, hAlf);
        int i;
        for (i = 0; i < hAlf;i++){
            arrHM2[i] = (float) (arrHM2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            System.out.println(arrHM2[i]);
        }
        long a = System.currentTimeMillis();
        System.out.println(a);
        System.arraycopy(arrHM2, 0, arrHM1, hAlf, hAlf);
    }
}


