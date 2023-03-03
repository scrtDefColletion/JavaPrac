
abstract class Telephone
{
    private String type;
    private String model;
    private int number;

    public Telephone(String type, String model, int number )
    {
        this.type = type;
        this.model = model;
        this.number = number;
    }
    public String getType() { return type; }
    public String getModel() { return model; }
    public int getNumber() { return number; }

    abstract void display();

}

class LandlinePhone extends Telephone
{
    private String location;
    public LandlinePhone(String type, String model, int number, String location)
    {
        super(type, model, number);
        this.location = location;
    }
    public String getLocation() { return location;}
    public void display()
    {
        System.out.printf(super.getType() + " phone " + super.getModel() + " number " + super.getNumber() + " located in " + this.getLocation() + "\n");
    }
}

class MobilePhone extends Telephone
{
    private String owner;
    public MobilePhone(String type, String model, int number, String owner)
    {
        super(type, model, number);
        this.owner = owner;
    }
    public String getOwner(){return owner;}
    public void display()
    {
        System.out.printf(super.getType() + " phone " + super.getModel() + " number " + super.getNumber() + " with owner " + this.getOwner() + "\n");
    }
}


