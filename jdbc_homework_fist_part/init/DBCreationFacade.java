package jdbc_homework_fist_part.init;

public class DBCreationFacade {
    private final DBInitializer dbInitializer;
    private final CountryCreator countryCreator;
    private final CityCreator cityCreator;

    public DBCreationFacade() {
        this.dbInitializer = new DBInitializer();
        this.countryCreator = new CountryCreator();
        this.cityCreator = new CityCreator();
    }

    public void createAndInsertDb(boolean create) {
        if (create) {
            dbInitializer.createDb();
            countryCreator.countryInitialization();
            cityCreator.cityInitialization();
        }
    }
}
