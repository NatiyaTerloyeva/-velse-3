import java.util.List;

public class Main {
    public static void main(String[] args) {
        Raflebæger raflebæger =  new Raflebæger(3);


        int resultat = raflebæger.ryst();
        System.out.println("Resultat af rystning: " + resultat);

        List<Integer>terningOjne=raflebæger.se();
        System.out.println("Terning øjne: " + terningOjne);
    }
}