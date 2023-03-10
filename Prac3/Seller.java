

public class Seller
{
    void modify(Telephone telephone)
    {
        String model = telephone.getModel();
        model.replace('o', 'a');
        if (model.charAt(0) == 'n' | model.charAt(0) == 'N')
        {
            telephone.setModel(model);
        }
        else
        {
            telephone.setModel(model.toLowerCase());
        }
    }

}
