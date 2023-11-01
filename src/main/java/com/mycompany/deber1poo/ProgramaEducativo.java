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
}
