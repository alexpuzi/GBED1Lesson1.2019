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
        long a = System.currentTimeMillis(); // проверка
        System.out.println(a);
    }

    public float[] calculateMetod(float[] arrHM4) {
        for (int i = 0; i < arrHM4.length; i++)

            arrHM4[i] = (float) (arrHM4[i] * Math.sin(0.2f + arrHM4[i] / 5) * Math.cos(0.2f + arrHM4[i] / 5) * Math.cos(0.4f + arrHM4[i] / 2));

        return arrHM4;
    }

    public void run() {
        System.arraycopy(arrHM4, 0, arrHM4_1, 0, hAlf);
    }

}
