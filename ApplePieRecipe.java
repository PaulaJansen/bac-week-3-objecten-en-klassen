public class ApplePieRecipe {

    public ApplePieRecipe() {
    }

    Ingredient ingredient1 = new Ingredient("ongezouten roomboter", 200, "gram");
    Ingredient ingredient2 = new Ingredient("witte basterdsuiker", 200, "gram");
    Ingredient ingredient3 = new Ingredient("zelfrijzend bakmeel", 400, "gram");
    Ingredient ingredient4 = new Ingredient("ei", 1, "stuk(s)");
    Ingredient ingredient5 = new Ingredient("vanillesuiker", 8, "gram");
    Ingredient ingredient6 = new Ingredient("zout", 1, "snuf");
    Ingredient ingredient7 = new Ingredient("zoetzure appels", 1.5, "kilo");
    Ingredient ingredient8 = new Ingredient("kristalsuiker", 75, "gram");
    Ingredient ingredient9 = new Ingredient("kaneel", 3, "theelepels");
    Ingredient ingredient10 = new Ingredient("paneermeel", 15, "gram");


    public void printIngredients() {
        System.out.println("Ingrediënten:");
        System.out.println(ingredient1.getAmount() + " " + ingredient1.getUnit() + " " + ingredient1.getName());
        System.out.println(ingredient2.getAmount() + " " + ingredient2.getUnit() + " " + ingredient2.getName());
        System.out.println(ingredient3.getAmount() + " " + ingredient3.getUnit() + " " + ingredient3.getName());
        System.out.println(ingredient4.getAmount() + " " + ingredient4.getUnit() + " " + ingredient4.getName());
        System.out.println(ingredient5.getAmount() + " " + ingredient5.getUnit() + " " + ingredient5.getName());
        System.out.println(ingredient6.getAmount() + " " + ingredient6.getUnit() + " " + ingredient6.getName());
        System.out.println(ingredient7.getAmount() + " " + ingredient7.getUnit() + " " + ingredient7.getName());
        System.out.println(ingredient8.getAmount() + " " + ingredient8.getUnit() + " " + ingredient8.getName());
        System.out.println(ingredient9.getAmount() + " " + ingredient9.getUnit() + " " + ingredient9.getName());
        System.out.println(ingredient10.getAmount() + " " + ingredient10.getUnit() + " " + ingredient10.getName());
    }

    public void printSteps() {
        System.out.println("Stappen:");
        System.out.println("1. Verwarm de oven van te voren op 170 graden Celsius (boven en onderwarmte).");
        System.out.println("2. Klop het ei los en verdeel deze in twee delen. De ene helft is voor het deeg, het andere deel is voor het bestrijken van de appeltaart.)");
        System.out.println("3. Meng de boter, basterdsuiker, zelfrijzend bakmeel, een helft van het ei, vanillesuiker en een snufje zout tot een stevig deeg en verdeel deze in 3 gelijke delen.");
        System.out.println("4. Schil nu de appels en snij deze in plakjes. Vermeng in een kopje de suiker en kaneel.");
        System.out.println("5. Vet de springvorm in en bestrooi deze met bloem.");
        System.out.println("6. Doe de helft van de appels in de vorm en strooi hier 1/3 van het kaneelsuiker mengsel overheen. Meng de ander helft van de appels met het overgebleven kaneelsuiker mengsel en leg deze in de vorm.");
        System.out.println("7. Rol het laatste deel van de deeg uit tot een dunne lap en snijd stroken van ongeveer 1 cm breed.");
        System.out.println("8. Leg de stroken kruislings op de appeltaart. Met wat extra deegstroken werk je de rand rondom af. Gebruik het overgebleven ei om de bovenkant van het deeg te bestrijken.");
        System.out.println("9. Zet de taart iets onder het midden van de oven. Bak de taart in 60 minuten op 170 graden Celsius (boven en onderwarmte) gaar en goudbruin.");
    }

    public void preheat() {
        System.out.println("1. Verwarm de oven van te voren op 170 graden Celsius (boven en onderwarmte).");
    }

    public void devideEggs() {
        System.out.println("2. Klop het ei los en verdeel deze in twee delen. De ene helft is voor het deeg, het andere deel is voor het bestrijken van de appeltaart.");
    }

    public void makeDough() {
        System.out.println("3. Meng de boter, basterdsuiker, zelfrijzend bakmeel, een helft van het ei, vanillesuiker en een snufje zout tot een stevig deeg en verdeel deze in 3 gelijke delen.");
    }

    public void makeApples() {
        System.out.println("4. Schil nu de appels en snij deze in plakjes. Vermeng in een kopje de suiker en kaneel.");
    }

    public void butterPan() {
        System.out.println("5. Vet de springvorm in en bestrooi deze met bloem.");
    }

    public void applesInPan() {
        System.out.println("6. Doe de helft van de appels in de vorm en strooi hier 1/3 van het kaneelsuiker mengsel overheen. Meng de ander helft van de appels met het overgebleven kaneelsuiker mengsel en leg deze in de vorm.");
    }

    public void cutDough() {
        System.out.println("7. Rol het laatste deel van de deeg uit tot een dunne lap en snijd stroken van ongeveer 1 cm breed.");
    }

    public void decorate() {
        System.out.println("8. Leg de stroken kruislings op de appeltaart. Met wat extra deegstroken werk je de rand rondom af. Gebruik het overgebleven ei om de bovenkant van het deeg te bestrijken.");
    }

    public void bake() {
        System.out.println("9. Zet de taart iets onder het midden van de oven. Bak de taart in 60 minuten op 170 graden Celsius (boven en onderwarmte) gaar en goudbruin.");
    }

}


