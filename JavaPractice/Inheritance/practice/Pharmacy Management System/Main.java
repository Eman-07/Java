public class Main {
    public static void main(String[] args) {
    Antibiotic amoxicilin = new Antibiotic("Amoxcilin", "ABC Pharma","2024-12-01",10,"Broad");
    Analgesic ibuprofen = new Analgesic("Ibuprofen" ,"XYZ Pharma" , "2024-05-15", 5 , "Broad");
    Antibiotic ciprofioxacin = new Antibiotic("Ciprofioxan","456 Pharma", "2024-10-10",15,"Broad");
    Analgesic paracetamol = new Analgesic("Paracetamol" , "Gsk Pharma" , "2024-05-15", 25 , "General" );
    Antibiotic erythromycin = new Antibiotic("Erythromycin" , "777 Pharma" , "2025-03-05", 20 , "Narrow" );


    //adding medicines to inventory
        PharmaControl p = new PharmaControl();
        p.addToInventory(amoxicilin);
        p.addToInventory(ibuprofen);
        p.addToInventory(ciprofioxacin);
        p.addToInventory(erythromycin);
        p.addToInventory(paracetamol);

        //searching
//        p.searchInventory("Amoxcilin");
//        p.generateReport();

//        p.removeFromInventory("Amoxcilin");
//        p.removeFromInventory("Amoxcilin");
//        p.removeFromInventory("Ibuprofen");
//        p.removeFromInventory("Ibuprofen");

        p.generateReportOnlyNames();

        p.searchInventory("Ibuprofen");
        p.searchInventory("Ronaldo");


    }
}
