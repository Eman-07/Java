abstract class Pharmaceutical {
    private String medName;
    private String manufacturer;
    private String expiryDate;
    private int qty = 0;
    Stock inStock = Stock.IN_Stock;

    public Pharmaceutical(String medName, String manufacturer, String expiryDate, int qty) {
        setMedName(medName);
        setManufacturer(manufacturer);
        setExpiryDate(expiryDate);
        setQty(qty);
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        if (qty >= 0)
        this.qty = qty;
    }

    public String getMedName() {
        return medName;
    }

    public void setMedName(String medName) {
        if (medName != null)
            this.medName = medName;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        if (expiryDate != null)
        this.expiryDate = expiryDate;
    }

    public Stock getInStock() {
        return inStock;
    }

    public void setInStock(Stock inStock) {
        this.inStock = inStock;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        if (manufacturer != null)
        this.manufacturer = manufacturer;
    }


    public boolean isEquivalent(String manufacturer, String expiryDate){
        return true;
    }

    abstract public void displaySpecs();
}
