import java.util.ArrayList;
import java.util.List;

public class Frutas {
    List<String> frutas = new ArrayList<>();

    public Frutas(String[] frutas) {
        for (int i = 0; i < frutas.length; i++) {
            this.frutas.add(frutas[i]);
        }
    }
}
