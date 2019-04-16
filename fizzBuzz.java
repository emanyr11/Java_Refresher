import javax.swing.plaf.synth.SynthToolTipUI;

public class fizzBuzz {

    public static void main(String args[]) {
        for (float i = 1; i <= 100; i++) {
            float check3 = i / 3;
            float check5 = i / 5;
            if ((i % 5 == 0) && (check3 % 1 == 0)) {
                System.out.println("FizzBuzz");
            } else if (check3 % 1 == 0) {
                System.out.println("Fizz");
            } else if (check5 % 1 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }

        }
    }

}