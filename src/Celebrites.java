import java.util.*;

public class Celebrites {
    /**
     * Classe permettant de rechercher les célébrités d'un groupe de personnes.
     * Une personne est représentée par son indice dans la liste des noms.
     */

    public static List<String> name;
    /**
     * Liste contenant les noms des personnes.
     * L'indice d'une personne correspond à son identifiant dans les listes d'acquaintance.
     */
    public static List<List<Integer>> acquaintance;
    /**
     * Liste des relations d'acquaintance entre les personnes.
     * acquaintance.get(i) contient la liste des indices des personnes connues par la personne i.
     */

    public static List<Integer> candidates;
    public static List<Integer> celebrity;


    public static void initPersonnes() {
        /**
         * Initialise les personnes du groupe ainsi que leurs relations d'acquaintance.
         * Chaque personne reçoit un indice utilisé dans les autres listes.
         */
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
        /**
         * Recherche les personnes connues par tous les membres du groupe.
         *
         * @return une liste contenant les indices des personnes candidates au titre de célébrité
         */
        List<Integer> candidates = new ArrayList<>();

        for (int i = 0; i < name.size(); i++) {
            boolean iscandidates = true;

            // Une personne candidate n'est retenue que si elle connaît tous les autres candidats.
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
        /**
         * Recherche les vraies célébrités parmi les candidats.
         * Une célébrité doit connaître toutes les autres personnes candidates.
         *
         * @param candidates liste des indices des personnes candidates
         * @return une liste contenant les indices des célébrités
         */
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
        System.out.println("liste des célébrités participants a la fêtes :");
        for (Integer c : celebrity){
            System.out.println(name.get(c));
        }
        }
    }










