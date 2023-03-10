

public class LandlinePhone extends Telephone
{
    private String location;

    public LandlinePhone(String type, String model, int number, String location)
    {
        super(type, model, number);
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void display()
    {
        System.out.printf(super.getType() + " phone " + super.getModel() + " number " + super.getNumber() + " located in " + this.getLocation() + "\n");

    }
}
