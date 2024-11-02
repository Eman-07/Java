public class Antibiotic extends Pharmaceutical implements Classifiable{
    private String spectrum = "Broad";


    public Antibiotic(String name,String manufacturer,String expiryDate,int qty,String spectrum) {
        super(name,manufacturer,expiryDate,qty);
        this.spectrum = spectrum;
    }


    public String getSpectrum() {
        return spectrum;
    }

    public void setSpectrum(String spectrum) {
        this.spectrum = spectrum;
    }

    @Override
    public void displaySpecs() {
        System.out.println("Medicine Name : " + getMedName()+"\nManufacturer : " + getManufacturer() +"\nExpiry Date : " + getExpiryDate()+"\nSpectrum : " + spectrum+"\nStock : " + getInStock()+"\nQuantity : " + getQty());
    }

    @Override
    public void addMedicine(Pharmaceutical obj) {

    }

    @Override
    public void removeMedicine(String var) {

    }

    @Override
    public Pharmaceutical searchMedicine(String var) {
        return null;
    }
}
