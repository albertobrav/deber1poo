import java.util.Random;
import java.util.Scanner;

public class ProgramaEducativo {
    private int aciertos;
    private int intentos;
    private int nivelDificultad;
    private int tipoProblema;
    private Random random;

    public ProgramaEducativo() {
        random = new Random();
        aciertos = 0;
        intentos = 0;
    }
        public void iniciarConfiguracion() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Elige el nivel de dificultad (1, 2, ...): ");
        nivelDificultad = scanner.nextInt();
        System.out.print("Elige el tipo de problema aritmético (1: Suma, 2: Resta, 3: Multiplicación, 4: División, 5: Aleatorio): ");
        tipoProblema = scanner.nextInt();
    }

            public int[] obtenerOperandos() {
        int max = (int) Math.pow(10, nivelDificultad) - 1;
        int min = (int) Math.pow(10, nivelDificultad - 1);
        int num1 = random.nextInt((max - min) + 1) + min;
        int num2 = random.nextInt((max - min) + 1) + min;
        return new int[]{num1, num2};
    }

}
