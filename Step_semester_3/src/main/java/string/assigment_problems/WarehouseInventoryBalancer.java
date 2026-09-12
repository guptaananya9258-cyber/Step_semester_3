package string.assigment_problems;

public class WarehouseInventoryBalancer {

    static void analyzeInventory(int[] sectionA, int[] sectionB) {

        int sumA = 0;
        int sumB = 0;

        int highest = sectionA[0];
        String section = "A";
        int index = 0;

        for (int i = 0; i < sectionA.length; i++) {
            sumA += sectionA[i];

            if (sectionA[i] > highest) {
                highest = sectionA[i];
                section = "A";
                index = i;
            }
        }

        for (int i = 0; i < sectionB.length; i++) {
            sumB += sectionB[i];

            if (sectionB[i] > highest) {
                highest = sectionB[i];
                section = "B";
                index = i;
            }
        }

        System.out.println("Section A Total: " + sumA);
        System.out.println("Section B Total: " + sumB);

        if (sumA == sumB) {
            System.out.println("Status: Balanced");
        } else {
            System.out.println("Status: Not Balanced");
        }

        System.out.println("Highest Quantity: " + highest);
        System.out.println("Section " + section + " Item " + (index + 1));
    }

    static void main() {

        int[] sectionA = {20, 15, 30};
        int[] sectionB = {25, 10, 30};

        analyzeInventory(sectionA, sectionB);
    }
}