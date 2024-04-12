public class JavaVar {
// datatypes
//class level vars
    
    public static void main (String[] args) throws Exception {
        // datatype varName [=value];
        int games = 3;
        double allowance = 40.50;
        long battlepass; //We define battlepass

        battlepass = 15; //We assign a value to battlepass
//Print out our var values along with a string that explains our values
        System.out.println("Number of games i own = " + games);
        System.out.println("My monthly allowance = $" + allowance);
        System.out.println("Cos of a single battlepass = $" + battlepass);
        
        double amountOfBp = (int) allowance/battlepass; // calculating the amount of battlepasses possible (int)

        System.out.println(" How many battlepasses can I but in a week = " + amountOfBp); // Value printed
        double cost = battlepass*amountOfBp; // Calculating exact cost of battlepass (double)
        System.out.println(" How much do they cost? = $" + cost); // Value printed
    }
}

