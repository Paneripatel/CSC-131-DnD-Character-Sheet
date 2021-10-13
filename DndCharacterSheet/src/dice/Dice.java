package dice;

import java.util.Random;

public class Dice {

    private int grandTotal;

    public Dice() {

        this.grandTotal = 0;
    }


    public void DiceRoll(int d4, int d6, int d8, int d10, int d12, int d20) {

        D4(d4);
        D6(d6);
        D8(d8);
        D10(d10);
        D12(d12);
        D20(d20);

        TotalRoll();
    }

    public void D4(int i) {

        int total = 0;
        Random random = new Random();


        for (int j = 0; j < i; j++) {
            total = total + random.nextInt(4) + 1;
        }

        System.out.println(total);
        this.grandTotal = this.grandTotal + total;

    }


    public void D6(int i) {

        int total = 0;
        Random random = new Random();


        for (int j = 0; j < i; j++) {
            total = total + random.nextInt(6) + 1;
        }

        System.out.println(total);
        this.grandTotal = this.grandTotal + total;

    }


    public void D8(int i) {

        int total = 0;
        Random random = new Random();


        for (int j = 0; j < i; j++) {
            total = total + random.nextInt(8) + 1;
        }

        System.out.println(total);
        this.grandTotal = this.grandTotal + total;

    }


    public void D10(int i) {

        int total = 0;
        Random random = new Random();


        for (int j = 0; j < i; j++) {
            total = total + random.nextInt(10) + 1;
        }

        System.out.println(total);
        this.grandTotal = this.grandTotal + total;

    }

    public void D12(int i) {

        int total = 0;
        Random random = new Random();


        for (int j = 0; j < i; j++) {
            total = total + random.nextInt(12) + 1;
        }

        System.out.println(total);
        this.grandTotal = this.grandTotal + total;

    }


    public void D20(int i) {

        int total = 0;
        Random random = new Random();


        for (int j = 0; j < i; j++) {
            total = total + random.nextInt(20) + 1;
        }

        System.out.println(total);
        this.grandTotal = this.grandTotal + total;

    }

    public void TotalRoll() {

        System.out.println(this.grandTotal);
    }

}