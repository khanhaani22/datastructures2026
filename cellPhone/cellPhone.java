public class cellPhone
{
    private String manufact;
    private int model;
    private double retailPrice;

    public cellPhone()
    {
        manufact = "";
        model = 0;
        retailPrice = 0.0;
    }

    public cellPhone(String manufact, int model, double retailPrice)
    {
        this.manufact = manufact;
        this.model = model;
        this.retailPrice = retailPrice;
    }

    public void setManufact(String manufact)
    { this.manufact = manufact;}

    public void setModel(int model)
    { this.model = model;}

    public void setRetailPrice(double retailPrice)
    { this.retailPrice = retailPrice;}

    public String toString()
    {
        String message = "### CELL PHONE DETAILS ### \nManufacturer: " + manufact + "\nModel #: " + model + "\nRetail Price: $" + retailPrice;
        return message;
    }
}