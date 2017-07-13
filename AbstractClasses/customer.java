package abstractClasses;

public abstract class customer 
{
protected String customername;
protected String customerEmail;

abstract public void display();
abstract public String getName();
abstract public String getEmail();
abstract public void calcCost(double cost);
}
