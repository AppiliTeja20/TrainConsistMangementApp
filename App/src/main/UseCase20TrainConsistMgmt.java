public class UseCase20TrainConsistMgmt {

    public static boolean searchBogie(String[] arr, String key) {

        if (arr.length == 0) {
            throw new IllegalStateException("No bogies available for search");
        }

        for (String id : arr) {
            if (id.equals(key)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        String[] bogieIds = {};
        String searchId = "BG101";

        try {
            boolean found = searchBogie(bogieIds, searchId);

            if (found) {
                System.out.println("Bogie Found");
            } else {
                System.out.println("Bogie Not Found");
            }

        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Execution completed");
    }
}