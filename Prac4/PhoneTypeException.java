

import javax.swing.*;

public class PhoneTypeException extends Exception
{
    private String name;
    public PhoneTypeException() {}
    public PhoneTypeException(String name)
    {
        this.name = name;
    }

}
