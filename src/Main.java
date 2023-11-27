public class Main
{
    public static void main(String[] args)
    {
        var taart = new ApplePieRecipe();
        taart.printIngredients();//print ingredients
        //print recept
        taart.printRecipe();

        //done bonus assignment 1, see ApplePieRecipe.java
        //done bonus assignment 2: pumpkin soup recipe, see PumpkinSoupRecipe.java
        System.out.println("Vooruit dan, nog iets lekkers!");
        var soep = new PumpkinSoupRecipe();
        soep.printIngredients();
        soep.printRecipe();
    }
}