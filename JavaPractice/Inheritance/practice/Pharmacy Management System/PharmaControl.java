public class PharmaControl {
    Pharmaceutical items[] = new Pharmaceutical[20];
    public static int itemsCount = 0;

    public void addToInventory(Pharmaceutical item) {
        items[itemsCount++] = item;
        System.out.println("item added to the inventory");
    }

    public void removeFromInventory(String name) {
        System.out.println("Removing of '" + name + "' from the inventory in process...");
        int found = 0; // 0 false , 1 true
     for (int i = 0; i < itemsCount; i++) {
         if (items[i].getMedName().equals(name)) {
             for (int j = i ; j < itemsCount-1; j++) {
                 items[j] = items[j+1];
             }
             --itemsCount;
             System.out.println("item removed from the inventory");
             return;
         }
     }

        System.out.println("item not found");


    }

    public void searchInventory(String name) {
        System.out.println("Searching for " + name);
        for (int i = 0; i <itemsCount; i++) {
            if (items[i].getMedName() == name) {
                System.out.println("Item found in inventory");
                System.out.println("----------------");
                System.out.println("Details:");
                items[i].displaySpecs();
                System.out.println("----------------");
                return;
            }
        }
        System.out.println("item not found");
    }

    public void issueMedicine(){
    }

    public void restockMedicine(){}
    public void generateReport(){
        System.out.println("---------------------");
        System.out.println("Report");
        System.out.println("---------------------");

        for (int i = 0; i < itemsCount ; i++) {
            items[i].displaySpecs();
            System.out.println("---------------------");
        }
    }

    public void generateReportOnlyNames(){
        for (int i = 0; i < itemsCount ; i++) {
            System.out.printf("%d:%s\n", i,items[i].getMedName());
        }
    }

}
