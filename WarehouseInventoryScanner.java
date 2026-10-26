public class WarehouseInventoryScanner {
    

    public static int restockShelf(int currentCount, int restockAmount) {
       
        while (restockAmount < 0) {
            System.out.println("Invalid amount! Restock amount cannot be negative.");
            return currentCount; 
        }
        int newTotal = currentCount + restockAmount;
        System.out.println("Successfully restocked. New count: " + newTotal);
        return newTotal;
    }

    public static void main(String[] args) {
       
        int[][] warehouse = {
            { 15, 25, -1 },
            { 5,  40, 30 },
            { -1, 10, 50 }
        };

      
        boolean running = true;
        int choice = 2; 
        do {
            System.out.println("\n=== WAREHOUSE INVENTORY SYSTEM ===");
            System.out.println("1. Calculate Total Inventory (Skipping Damaged Shelves)");
            System.out.println("2. Find First Critically Low Shelf (< 10 items)");
            System.out.println("3. Simulate Restock");
            System.out.println("4. Exit");
            
         
            int totalInventory = 0;
            for (int i = 0; i < warehouse.length; i++) {
                for (int j = 0; j < warehouse[i].length; j++) {
                    if (warehouse[i][j] == -1) {
                        continue; // Skip damaged shelf
                    }
                    totalInventory += warehouse[i][j];
                }
            }
            System.out.println("-> Total valid inventory count: " + totalInventory);

           )
            boolean foundLow = false;
            for (int i = 0; i < warehouse.length; i++) {
                for (int j = 0; j < warehouse[i].length; j++) {
                    if (warehouse[i][j] != -1 && warehouse[i][j] < 10) {
                        System.out.println("-> Critically low shelf found at position [" + i + "][" + j + "] with count: " + warehouse[i][j]);
                        foundLow = true;
                        break; 
                    }
                }
                if (foundLow) {
                    break; 
                }
            }

           
            System.out.println("-> Testing restock function on shelf with 5 items:");
            warehouse[1][0] = restockShelf(warehouse[1][0], 25);

            running = false; 
        } while (running);
        
        System.out.println("Exited Warehouse Inventory System.");
    }
}
