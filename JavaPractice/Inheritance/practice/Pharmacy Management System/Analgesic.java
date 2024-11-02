public class Analgesic extends Pharmaceutical implements Classifiable{
    private String painType = "headAche";


    public Analgesic(String name,String manufacturer,String expiryDate,int qty,String painType) {
        super(name,manufacturer,expiryDate,qty);
        this.painType = painType;
    }


    @Override
    public void displaySpecs() {
        System.out.println("Medicine Name : " + getMedName()+"\nManufacturer : " + getManufacturer() +"\nExpiry Date : " + getExpiryDate()+"\nPain Type : " + painType+"\nStock : " + getInStock()+"\nQuantity : " + getQty());
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
