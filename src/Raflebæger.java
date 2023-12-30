import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Raflebæger {
    private int antalTerninger;
    private List<Integer>terningOjne;


    //konstruktør

    public Raflebæger(int antalTerninger) {
        this.antalTerninger = antalTerninger;
        this.terningOjne = new ArrayList<>();
    }

    //metode

    public int ryst() {
        Random random = new Random();
        int samletAntalOjne =0;
        terningOjne.clear();

        for (int i=0; i< antalTerninger; i++) {
            int terningkast = random.nextInt(6)+1;

            // Добавление результата к сумме и в список
            samletAntalOjne += terningkast;
            terningOjne.add(terningkast);

        }

        return samletAntalOjne;

    }


    public List<Integer>se(){
        return new ArrayList<>(terningOjne);

    }
}
