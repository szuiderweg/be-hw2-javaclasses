public class PumpkinSoupRecipe {
        public void printIngredients() {// ingredients are all defined and printed using the Ingredientclass
            //done: abandoned idea of creating list, takes too much time and is out of scope of assignment
            //done:  print "ingrediënten" as a heading above the list of ingredients
            var bouillon = new Ingredient(1.5, " ", "groentebouillonblokje");
            var water = new Ingredient(1, "liter", "water");
            var pompoen = new Ingredient(800, "gram", "pompoen, geschild en in blokjes ");
            var ui = new Ingredient(1, " ", "ui");
            var olijfolie = new Ingredient(1, "eetlepel", "olijfolie");
            var soepballen = new Ingredient(300, "gram", "soepballetjes");
            var cremeFraiche = new Ingredient(125, "gram", "crème fraîche");
            var peterselie = new Ingredient(15, "gram", "peterselie");
            var chili = new Ingredient(1, "snuf", "chilipoeder");
            var peperZout = new Ingredient(1, "snuf", "peper en zout");

            //print ingredients
            System.out.println("Ingrediënten");
            System.out.print(bouillon.getAmount() + " " + bouillon.getUnit() + " " + bouillon.getName() + "\n");
            System.out.print(water.getAmount() + " " + water.getUnit() + " " + water.getName() + "\n");
            System.out.print(pompoen.getAmount() + " " + pompoen.getUnit() + " " + pompoen.getName() + "\n");
            System.out.print(ui.getAmount() + " " + ui.getUnit() + " " + ui.getName() + "\n");
            System.out.print(olijfolie.getAmount() + " " + olijfolie.getUnit() + " " + olijfolie.getName() + "\n");
            System.out.print(soepballen.getAmount() + " " + soepballen.getUnit() + " " + soepballen.getName() + "\n");
            System.out.print(cremeFraiche.getAmount() + " " + cremeFraiche.getUnit() + " " + cremeFraiche.getName() + "\n");
            System.out.print(peterselie.getAmount() + " " + peterselie.getUnit() + " " + peterselie.getName() + "\n");
            System.out.print(chili.getAmount() + " " + chili.getUnit() + " " + chili.getName() + "\n");
            System.out.print(peperZout.getAmount() + " " + peperZout.getUnit() + " " + peperZout.getName() + "\n");
        }

        //done: bonus assignment 1: collect all steps in one printmethod
        public void printRecipe() {
            System.out.println("~~ Recept voor pompoensoep (4 personen) ~~");
            chopOnion();
            fryVegs();
            boilSoup();
            pureeSoup();
            addBalls();
            addSeasoning();
            chopParsley();
            finalTouch();
            System.out.println("~~~~");
        }

        public void chopOnion() {
            System.out.print("Snipper de uien.\n");
        }

        public void fryVegs() {
            System.out.print("Fruit de uien en pompoen in een soeppan met de olijfolie. \n");
        }

        public void boilSoup() {
            System.out.print("Voeg het water en het bouillonblokje toe en laat ca. 10 minuten zachtjes koken.\n");
        }

        public void pureeSoup() {
            System.out.print("Pureer de soep met een staafmixer.\n");
        }

        public void addBalls() {
            System.out.print("Doe de soepballetjes bij de soep en kook ze in 5 minuten gaar.\n");
        }

        public void addSeasoning(){
            System.out.print("breng op smaak met de chilipoeder, peper en zout.\n");
        }

        public void chopParsley() {
            System.out.print("Snij de peterselie fijn\n");
        }

        public void finalTouch() {
            System.out.print("Verdeel de soep over de borden en garneer met peterselie en een klodder crème fraîche. \n");
            System.out.println("Smakelijk eten!");
        }

    }

