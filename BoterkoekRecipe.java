public class BoterkoekRecipe {

    public BoterkoekRecipe(){
    }

    Ingredient ingredient1 = new Ingredient("bloem",375, "gram");
    Ingredient ingredient2 = new Ingredient("roomboter", 340, "gram");
    Ingredient ingredient3 = new Ingredient("witte basterdsuiker", 270, "gram");
    Ingredient ingredient4 = new Ingredient("zout", 0.25, "theelepel");
    Ingredient ingredient5 = new Ingredient("citroenrasp", 0.5, "citroen");
    Ingredient ingredient6 = new Ingredient("vanillemerg", 0.5, "stokje");
    Ingredient ingredient7 = new Ingredient("ei", 1, "stuk(s)");

    public void printIngredientsBoterkoek(){
        System.out.println("Ingrediënten:");
        System.out.println(ingredient1.getAmount() + " " + ingredient1.getUnit() + " " + ingredient1.getName());
        System.out.println(ingredient2.getAmount() + " " + ingredient2.getUnit() + " " + ingredient2.getName());
        System.out.println(ingredient3.getAmount() + " " + ingredient3.getUnit() + " " + ingredient3.getName());
        System.out.println(ingredient4.getAmount() + " " + ingredient4.getUnit() + " " + ingredient4.getName());
        System.out.println(ingredient5.getAmount() + " " + ingredient5.getUnit() + " " + ingredient5.getName());
        System.out.println(ingredient6.getAmount() + " " + ingredient6.getUnit() + " " + ingredient6.getName());
        System.out.println(ingredient7.getAmount() + " " + ingredient7.getUnit() + " " + ingredient7.getName());
    }

    public void printStepsBoterkoek(){
        System.out.println("Stappen:");
        System.out.println("1. Verwarm de oven voor op 170 graden.");
        System.out.println("2. Vet een vierkante vorm van 20 centimeter in met boter en bekleed de zijkanten met bakpapier.");
        System.out.println("3. Doe alle ingrediënten, behalve het ei, in een kom en meng deze tot een samenhangend deeg.");
        System.out.println("4. Doe het deeg in de vorm en druk het plat met natte handen of de bolle kant van een lepel.");
        System.out.println("5. Klop het ei los en bestrijk de bovenkant van het deeg ermee. Kerf er met een vork een ruitjesmotief in.");
        System.out.println("6. Bak de boterkoek in 30 tot 40 minuten tot de bovenkant mooi bruin is.");
        System.out.println("7. Druk nadat de boterkoek 10 minuten uit de oven is de zijkanten voorzichtig naar beneden met de boller kant van een lepel, zodat de koek overal even hoog is. Laat de boterkoek minimaal 6 uur afkoelen.");
    }


}
