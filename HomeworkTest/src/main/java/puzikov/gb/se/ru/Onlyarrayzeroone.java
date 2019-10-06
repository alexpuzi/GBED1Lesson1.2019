package puzikov.gb.se.ru;

public class Onlyarrayzeroone {
    public static void main(String[] args) {
        int[] number = {0,1,1,0,0,0,1,0,1,1,0};
        for(int i = 0; i < number.length; i++){
            if(number[i]==1){
                number[i]=0;
            }
            else if (number[i]==0){
                number[i]=1;
            }
            System.out.print(number[i]);
        }
    }
}
