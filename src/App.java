import java.util.List;

public class App {
    public static void main(String[] args){

        List<String> list1 = new Frutas(new String[]{"Morango", "Uva", "Acerola", "Manga"}).frutas;

        List<String> list2 = new Frutas(new String[]{"Pera", "Caju", "Morango", "Kiwi", "Manga"}).frutas;

        for (int i = 0; i < list1.size(); i++) {
            if (list2.contains(list1.get(i))) {
                System.out.println(list1.get(i));
            }
        }

    }
}
