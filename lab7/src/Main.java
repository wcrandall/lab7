import java.io.IOException;

public class Main {
    // prompts
    private final static String WORKED = "the functions worked";
    private final static String NOTWORKED = "the functions didn't work";
    private final static int NUMBEROFTESTS = 3;
    public static void main(String args[]) throws IOException {
        //VERIFICATION
//       boolean didItWork =  Verification.verifyAll();
//
//       if(didItWork)
//       {
//           System.out.println(WORKED);
//       }
//       else
//       {
//           System.out.println(NOTWORKED);
//       }

        //TESTING
        for (int i = 0; i < NUMBEROFTESTS; i ++)
        {
            RunFullExpirament.runFullExperiment("WholeBook" + i + ".txt");
        }
    }
}
