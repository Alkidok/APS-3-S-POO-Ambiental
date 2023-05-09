import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Insira o pH do solo:");
            String ph = scanner.nextLine();

            System.out.println("Insira o teor de fósforo no solo (em mg/dm³):");
            String fosforo = scanner.nextLine();

            System.out.println("Insira o teor de potássio no solo (em cmolc/dm³):");
            String potassio = scanner.nextLine();

            System.out.println("Insira o teor de cálcio no solo (em cmolc/dm³):");
            String calcio = scanner.nextLine();

            System.out.println("Insira o teor de magnésio no solo (em cmolc/dm³):");
            String magnesio = scanner.nextLine();

            System.out.println("Insira o teor de enxofre no solo (em mg/dm³):");
            String enxofre = scanner.nextLine();

            System.out.println("Insira o teor de alumínio no solo (em cmolc/dm³):");
            String aluminio = scanner.nextLine();

            System.out.println("Insira o teor de matéria orgânica no solo (em %):");
            String materiaOrganica = scanner.nextLine();

            AnaliseDoSolo analiseSolo = new AnaliseDoSolo();
            analiseSolo.setPh(ph);
            analiseSolo.setFosforo(fosforo);
            analiseSolo.setPotassio(potassio);
            analiseSolo.setCalcio(calcio);
            analiseSolo.setMagnesio(magnesio);
            analiseSolo.setEnxofre(enxofre);
            analiseSolo.setAluminio(aluminio);
            analiseSolo.setMateriaOrganica(materiaOrganica);

            String resultado = analiseSolo.analisarSolo();

            System.out.println(resultado);
        }
    }
}