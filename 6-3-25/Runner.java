public class Runner {
    public static void main(String[] args) {
        
        CricketTeams.addTeam("Mumbai Indians");
        CricketTeams.addTeam("Chennai Super Kings");
        CricketTeams.addTeam("Royal Challengers Bangalore");
        CricketTeams.addTeam("Delhi Capitals");

        System.out.println("Cricket Teams:");
        CricketTeams.displayTeams();

      
        ClothesBrandNames.addBrand("Nike");
        ClothesBrandNames.addBrand("Adidas");
        ClothesBrandNames.addBrand("Puma");
        ClothesBrandNames.addBrand("Levis");

        System.out.println("\nClothes Brands:");
        ClothesBrandNames.displayBrands();

      
        CollegeNames.addCollege("MIT");
        CollegeNames.addCollege("Harvard");
        CollegeNames.addCollege("Stanford");
        CollegeNames.addCollege("IIT Delhi");

        System.out.println("\nColleges:");
        CollegeNames.displayColleges();
    }
}
