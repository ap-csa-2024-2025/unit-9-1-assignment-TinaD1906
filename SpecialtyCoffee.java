public class SpecialtyCoffee extends Coffee
{
    private String flavor;
    public SpecialtyCoffee(String size, boolean isSkinny,int shots, String type, String flavor)
    {
        super(size,isSkinny, shots, type);
        this.flavor = flavor;
    }
    public SpecialtyCoffee()
    {
        super();
        flavor = "vanilla"
    }
    public SpecialtyCoffee(String size, String type, String flavor)
    {
        super(size,false, 1, type); 
        this.flavor = flavor;

    }

}