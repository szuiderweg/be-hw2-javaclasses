public class Main
{
    public static void main(String[] args)
    {
        var taart = new ApplePieRecipe();

        taart.printIngredients();//print ingredients
        //print recept
        taart.preheatOven();
        taart.beatEgg();
        taart.createDough();
        taart.makeFilling();
        taart.prepareCakePan();
        taart.formCrust();
        taart.fillCake();
        taart.cutDecoration();
        taart.decorateCake();
        taart.bakeCake();
        //todo bonus assignment 1
        //todo bonus assignment 2
    }
}