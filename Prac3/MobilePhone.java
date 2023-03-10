

public class MobilePhone extends Telephone {
    private String owner;

    public MobilePhone(String type, String model, int number, String owner)
    {
        super(type, model, number);
        this.owner = owner;
    }

    public String getOwner()
    {
        return owner;
    }

    @Override
    public void display()
    {
        System.out.printf(super.getType() + " phone " + super.getModel() + " number " + super.getNumber() + " with owner " + this.getOwner() + "\n");
    }


}
