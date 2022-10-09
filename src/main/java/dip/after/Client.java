package dip.after;

public class Client {
    public static void main(String[] args) {
        System.out.println("***A demo without DIP.***");

        // Using Oracle now
        Database database = new OracleDatabase();
        UserInterface userInterface = new UserInterface(database);
        userInterface.saveEmployeeId("E001");

        // Using MySQL now
        database = new MySQLDatabase();
        userInterface = new UserInterface(database);
        userInterface.saveEmployeeId("E002");
    }
}
