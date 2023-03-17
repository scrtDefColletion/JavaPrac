

public class Telephone
{
    private String model;
    private String serialNumber;
    private String color;
    private boolean type;

    public  Telephone(String serialNumber, String color, String model, String type ) throws PhoneTypeException
    {
                if(type.equals("mobile")||type.equals("Mobile"))
                    this.type = true;
                else if(type.equals("landline")||type.equals("Landline"))
                    this.type = false;
                else
                    throw new PhoneTypeException();

                this.model = model;
                this.serialNumber = serialNumber;
                this.color = color;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setType(boolean type) {
        this.type = type;
    }

    @Override
    public String toString() {
        String type;
        if(this.type = true)
            type = "mobile";
        else
            type = "landline";

        return this.serialNumber + " is "+ color + " " + this.model+ " "+ type  + " phone ";
    }
}

