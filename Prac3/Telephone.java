

public abstract class Telephone
{
    private String type;
    private String model;
    private int number;

    public  Telephone(){};
    public Telephone(String type, String model, int number )
    {
        this.type = type;
        this.model = model;
        this.number = number;
    }
    public String getType() { return type; }
    public String getModel() { return model; }
    public int getNumber() { return number; }
    public void setType(String type){this.type = type;}
    public  void setModel(String model){this.model = model;}
    public void  setNumber(int number){this.number = number;}

    abstract void display();

}


