class Ingredient
{
    //todo how2 create getter and setter, zie H5.6 voor uitleg
  //variabelen
    private double amount;
    private String unit;
    private String name;

    public Ingredient()//empty constructor
    {}
    public Ingredient(double amount, String unit, String name)//constructor with all 3 parameters
    {
        this.amount = amount;
        this.unit = unit;
        this.name = name;
    }
//amount of ingredient getter and setter
    public double getAmount()
    {
        return amount;
    }

    public double setAmount(double amount)
    {
        return this.amount = amount;
    }

    //unit of ingredient getter and setter
    public String getUnit()
    {
        return unit;
    }

    public String setUnit(String unit)
    {
        return this.unit = unit;
    }

    //name of ingredient getter and setter
    public String getName()
    {
        return name;
    }

    public String setName(String name)
    {
        return this.name = name;
    }

}
