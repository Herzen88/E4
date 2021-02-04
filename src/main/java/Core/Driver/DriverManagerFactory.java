package Core.Driver;

public class DriverManagerFactory {

    public static DriverManager getManager(DriverTypes type) {
        DriverManager driverManager;

        switch (type) {
            case CHROME:
                driverManager = new ChromeDriverManager();
                break;
            default:
                System.out.println("Default driver");
                driverManager = new ChromeDriverManager();
                break;
        }
        return driverManager;
    }
}
