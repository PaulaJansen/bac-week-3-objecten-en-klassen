public class Main {
    public static void main(String[] args) {

        System.out.println("Ingrediënten:");
        ApplePieRecipe printIngredients = new ApplePieRecipe();
        printIngredients.printIngredients();

        System.out.println("Stappen:");

        ApplePieRecipe step1 = new ApplePieRecipe();
        step1.preheat();
        ApplePieRecipe step2 = new ApplePieRecipe();
        step2.devideEggs();
        ApplePieRecipe step3 = new ApplePieRecipe();
        step3.makeDough();
        ApplePieRecipe step4 = new ApplePieRecipe();
        step4.makeApples();
        ApplePieRecipe step5 = new ApplePieRecipe();
        step5.butterPan();
        ApplePieRecipe step6 = new ApplePieRecipe();
        step6.applesInPan();
        ApplePieRecipe step7 = new ApplePieRecipe();
        step7.cutDough();
        ApplePieRecipe step8 = new ApplePieRecipe();
        step8.decorate();
        ApplePieRecipe step9 = new ApplePieRecipe();
        step9.bake();

//        Of
        ApplePieRecipe printSteps = new ApplePieRecipe();
        printSteps.printSteps();

    }
}
