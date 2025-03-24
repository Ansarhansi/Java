public class Runner {
    public static void main(String[] args) {
        // MathOperations
        MathOperations mathOps = new MathOperations();
        System.out.println("MathOperations:");
        System.out.println("Addition: " + mathOps.add(10, 20));
        System.out.println("Subtraction: " + mathOps.subtract(25.5, 15.2));

        // StringManipulator
        StringManipulator strManip = new StringManipulator();
        System.out.println("\nStringManipulator:");
        System.out.println("Concatenate: " + strManip.concatenate("Hello", " World"));
        String[] words = {"Java", "is", "fun"};
        strManip.printArray(words);

        // ArrayUtilities
        ArrayUtilities arrUtils = new ArrayUtilities();
        System.out.println("\nArrayUtilities:");
        int[] nums = {1, 3, 5, 7};
        System.out.println("Max: " + arrUtils.findMax(nums));
        arrUtils.printArray(nums);

        // Geometry
        Geometry geo = new Geometry();
        System.out.println("\nGeometry:");
        System.out.println("Area of Circle: " + geo.calculateArea(5.0));
        System.out.println("Area of Rectangle: " + geo.calculateArea(4.0, 6.0));

        // TemperatureConverter
        TemperatureConverter tempConv = new TemperatureConverter();
        System.out.println("\nTemperatureConverter:");
        System.out.println("To Celsius: " + tempConv.toCelsius(98.6));
        System.out.println("To Kelvin: " + tempConv.toKelvin(25.0));

        // FileHandler
        FileHandler fileHandler = new FileHandler();
        System.out.println("\nFileHandler:");
        fileHandler.writeToFile("example.txt", "Hello, File!");

        // CurrencyConverter
        CurrencyConverter currConv = new CurrencyConverter();
        System.out.println("\nCurrencyConverter:");
        System.out.println("Converted Amount: " + currConv.convert(100.0, "USD", "INR"));

        // PhysicsCalculator
        PhysicsCalculator physicsCalc = new PhysicsCalculator();
        System.out.println("\nPhysicsCalculator:");
        System.out.println("Force: " + physicsCalc.calculateForce(10.0, 9.8));

        // ShoppingCart
        ShoppingCart cart = new ShoppingCart();
        System.out.println("\nShoppingCart:");
        cart.addItem("Laptop", 1);

        // FinanceManager
        FinanceManager financeMgr = new FinanceManager();
        System.out.println("\nFinanceManager:");
        System.out.println("EMI: " + financeMgr.calculateEMI(500000, 0.07, 10));

        // GameScore
        GameScore gameScore = new GameScore();
        System.out.println("\nGameScore:");
        gameScore.updateScore("Player1", 100);

        // PasswordManager
        PasswordManager pwdMgr = new PasswordManager();
        System.out.println("\nPasswordManager:");
        System.out.println("Password Valid: " + pwdMgr.validatePassword("Strong@123"));

        // DateUtils
        DateUtils dateUtils = new DateUtils();
        System.out.println("\nDateUtils:");
        System.out.println("Formatted Date: " + dateUtils.formatDate(10, 3, 2025));

        // RecipeBook
        RecipeBook recipeBook = new RecipeBook();
        System.out.println("\nRecipeBook:");
        recipeBook.addRecipe("Pasta", new String[]{"Pasta", "Tomato Sauce", "Cheese"});

        // WeatherAnalyzer
        WeatherAnalyzer weatherAnalyzer = new WeatherAnalyzer();
        System.out.println("\nWeatherAnalyzer:");
        weatherAnalyzer.displayWeather("Bengaluru", 29.5, "Sunny");

        // CarShowroom
        CarShowroom carShowroom = new CarShowroom();
        System.out.println("\nCarShowroom:");
        carShowroom.showCar("Tesla Model X", 120000);

        // HealthMetrics
        HealthMetrics healthMetrics = new HealthMetrics();
        System.out.println("\nHealthMetrics:");
        System.out.println("BMI: " + healthMetrics.calculateBMI(75.0, 1.75));

        // ShapeDrawer
        ShapeDrawer shapeDrawer = new ShapeDrawer();
        System.out.println("\nShapeDrawer:");
        shapeDrawer.drawShape("Circle", "Red");

        // TimeConverter
        TimeConverter timeConv = new TimeConverter();
        System.out.println("\nTimeConverter:");
        System.out.println("Hours to Minutes: " + timeConv.toMinutes(3));

        // NetworkUtils
        NetworkUtils networkUtils = new NetworkUtils();
        System.out.println("\nNetworkUtils:");
        networkUtils.ping("192.168.1.1");
    }
}
