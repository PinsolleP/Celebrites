import java.util.*;

public class Celebrites {

    public static List<String> name;
    public static List<List<Integer>> acquaintance;

    public static List<Integer> candidates;
    public static List<Integer> celebrity;


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

    public static List<Integer> searchCandidates() {
        List<Integer> candidates = new ArrayList<>();

        for (int i = 0; i < name.size(); i++) {
            boolean iscandidates = true;

            for (int j = 0; j < acquaintance.size(); j++) {
                if (j != i && !acquaintance.get(j).contains(i)) {
                    iscandidates = false;
                    break;
                }
            }
            if (iscandidates) {
                candidates.add(i);
            }
        }
        return candidates;
    }

    public static List<Integer> searchCelebrities(List<Integer> candidates) {
        celebrity = new ArrayList<>();

        for (Integer candidate : candidates) {
            boolean knowAllCelebrity = true;

            for (Integer other : candidates) {
                if (!candidate.equals(other) && !acquaintance.get(candidate).contains(other)) {
                    knowAllCelebrity = false;
                    break;
                }
            }
            if (knowAllCelebrity) {
                celebrity.add(candidate);
                }
            }
        return celebrity;
    }

    public static void main (String[]args){
        initPersonnes();
        candidates = searchCandidates();
        celebrity = searchCelebrities(candidates);
        System.out.println(celebrity);
        }
    }










