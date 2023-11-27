public class ApplePieRecipe {
    public void printIngredients() {// ingredients alle defined and printed using the Ingredientclass
        //todo extra: ingredienten in een arraylist zetten en laten printen
        //done:  print "ingrediënten" as a heading above the list of ingredients
        //define ingredients
        var roomboter = new Ingredient(200, "gram", "ongezouten roomboter");
        var basterdSuiker = new Ingredient(200, "gram", "witte basterdsuiker");
        var bakmeel = new Ingredient(400, "gram", "zelfrijzend bakmeel");
        var ei = new Ingredient(1, "stuks", "ei");
        var vanillesuiker = new Ingredient(8, "gram", "vanillesuiker");
        var zout = new Ingredient(1, "snuf", "zout");
        var appels = new Ingredient(1.5, "kilo", "zoetzure appels");
        var suiker = new Ingredient(75, "gram", "kristalsuiker");
        var kaneel = new Ingredient(3, "theelepel", "kaneel");
        var paneermeel = new Ingredient(15, "gram", "paneermeel");

        //print ingredients
        System.out.println("Ingrediënten");
        System.out.print(roomboter.getAmount() + " " + roomboter.getUnit() + " " + roomboter.getName() + "\n");
        System.out.print(basterdSuiker.getAmount() + " " + basterdSuiker.getUnit() + " " + basterdSuiker.getName() + "\n");
        System.out.print(bakmeel.getAmount() + " " + bakmeel.getUnit() + " " + bakmeel.getName() + "\n");
        System.out.print(ei.getAmount() + " " + ei.getUnit() + " " + ei.getName() + "\n");
        System.out.print(vanillesuiker.getAmount() + " " + vanillesuiker.getUnit() + " " + vanillesuiker.getName() + "\n");
        System.out.print(zout.getAmount() + " " + zout.getUnit() + " " + zout.getName() + "\n");
        System.out.print(appels.getAmount() + " " + appels.getUnit() + " " + appels.getName() + "\n");
        System.out.print(suiker.getAmount() + " " + suiker.getUnit() + " " + suiker.getName() + "\n");
        System.out.print(kaneel.getAmount() + " " + kaneel.getUnit() + " " + kaneel.getName() + "\n");
        System.out.println(paneermeel.getAmount() + " " + paneermeel.getUnit() + " " + paneermeel.getName() + "\n");
    }

    //done: bonus assignment 1: collect all steps in one printmethod
    public void printRecipe() {
        System.out.println("~~ Recept voor overheerlijke appeltaart ~~");
        preheatOven();
        beatEgg();
        createDough();
        makeFilling();
        prepareCakePan();
        formCrust();
        fillCake();
        cutDecoration();
        decorateCake();
        bakeCake();
    }

    public void preheatOven() {
        System.out.print("Verwarm de oven van te voren op 170 graden Celsius (boven en onderwarmte)\n");
    }

    public void beatEgg() {
        System.out.print("Klop het ei los en verdeel deze in twee delen. De ene helft is voor het deeg, het andere deel is voor het bestrijken van de appeltaart.\n");
    }

    public void createDough() {
        System.out.print("Meng de boter, bastard suiker, zelfrijzend bakmeel, een helft van het ei, vanille suiker en een snufje zout tot een stevig deeg en verdeel deze in 3 gelijke delen.\n");
    }

    public void makeFilling() {
        System.out.print("Schil nu de appels en snij deze in plakjes. Vermeng in een kopje de suiker en kaneel.\n");
    }

    public void prepareCakePan() {
        System.out.print("Vet de springvorm in en bestrooi deze met bloem\n");
    }

    public void formCrust() {
        System.out.print("Gebruik een deel van het deeg om de bodem van de vorm te bedekken. Gebruik een deel van het deeg om de rand van de springvorm te bekleden. Strooi het paneermeel op de bodem van de beklede vorm. De paneermeel neemt het vocht van de appels op.\n");
    }

    public void fillCake() {
        System.out.print("Doe de heft van de appels in de vorm en strooi hier 1/3 van het kaneel-suiker mengsel overheen. Meng de ander helft van de appels met het overgebleven kaneel-suiker mengsel en leg deze in de vorm.\n");
    }

    public void cutDecoration() {
        System.out.print("Rol het laatste deel van de deeg uit tot een dunne lap en snij stroken van ongeveer 1 cm breed.\n");
    }

    public void decorateCake() {
        System.out.print("Leg de stroken kruislings op de appeltaart. Met wat extra deegstroken werk je de rand rondom af. Gebruik het overgebleven ei om de bovenkant van het deeg te bestrijken\n");
    }

    public void bakeCake() {
        System.out.print("Zet de taart iets onder het midden van de oven. Bak de taart in 60 minuten op 170 graden Celsius (boven en onderwarmte) gaar en goudbruin.\n");
    }

}
