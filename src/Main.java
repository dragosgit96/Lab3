import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static int rundetNote(int note) {
        if (note > 38)
            if (note % 5 != 0) {
                int x = note;
                while (x % 5 != 0)
                    x ++;
                if (x - note < 3)
                    return x;
            }
        return note;
    }

    public static ArrayList<Integer> nichtausreichendeNoten(ArrayList<Integer> noten) {
        ArrayList<Integer> naNoten = new ArrayList<>();
        for (int n: noten)
            if (n < 40)
                naNoten.add(n);
        return naNoten;
    }

    public static float durchschnitt(ArrayList<Integer> noten) {
        float sum = 0;
        for (int n: noten)
            sum += n;
        return sum / noten.size();
    }

    public static ArrayList<Integer> abgerundeteNoten(ArrayList<Integer> noten) {
        ArrayList<Integer> rundeNoten = new ArrayList<>();
        for (int n: noten)
            rundeNoten.add(rundetNote(n));
        return rundeNoten;
    }

    public static int maximaleNoten(ArrayList<Integer> noten) {
        int max = noten.get(0);
        for (int n: abgerundeteNoten(noten))
            if (n > max)
                max = n;
        return max;
    }

    public static void printNoten(ArrayList<Integer> noten) {
        for (int n: noten)
            System.out.print(n + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Integer> noten = new ArrayList<>(Arrays.asList(56,87,23,93,40,72,49,94,17,38,68));
        printNoten(nichtausreichendeNoten(noten));
        System.out.println(durchschnitt(noten));
        printNoten(abgerundeteNoten(noten));
        System.out.println(maximaleNoten(noten));
    }
}