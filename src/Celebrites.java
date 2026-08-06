import java.util.*;

public class Celebrites {

    public static List<String> name;
    public static List<List<Integer>> acquaintance;
    
    public static List<Integer> candidates;
    public static List<Integer> celebrities;

    public static void initPersonnes() {
        name = new ArrayList<>();
        acquaintance = new ArrayList<>();

        name.add("Albert");
        acquaintance.add(Arrays.asList(1, 4, 5));

        name.add("Bénédicte");
        acquaintance.add(Arrays.asList(2, 4, 5));

        name.add("Christophe");
        acquaintance.add(Arrays.asList(1, 3, 4, 5));

        name.add("Delphine");
        acquaintance.add(Arrays.asList(0, 1, 4, 5, 7));

        name.add("Edouard");
        acquaintance.add(Arrays.asList(5));

        name.add("Françoise");
        acquaintance.add(Arrays.asList(4));

        name.add("Gaston");
        acquaintance.add(Arrays.asList(1, 2, 4, 5, 7));

        name.add("Heloise");
        acquaintance.add(Arrays.asList(1, 3, 4, 5, 6));

    }

    public static void main(String[] args) {
        initPersonnes();
    }
    }

