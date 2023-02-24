public class Moral
{
    public static void main(String[] args)
    {
        decideSwerve(Generator.getScenario(),Generator.getGroup(),Generator.getGroup());

        double [] numTotalArray = testAlgorithm(100);


        for (int i = 0; i < numTotalArray.length; i++)
        {
            System.out.println(Generator.getMemberName((char) (i + Generator.MAN)) +  ": " + numTotalArray[i] + "%");
        }
         System.out.println("The character who was killed the most is: " + killedMost(numTotalArray));
         System.out.println ("The character who was killed the least is: " + killedLeast(numTotalArray));

    }


    public static boolean decideSwerve(int scenario, String currentLane, String otherLane){


        int ones = scenario % 10;
        int tens = (int)(scenario / 10);


        int currentcounter = 0;
        int othercounter = 0;

        //I attempting to save more lives
        int lengthCurrent = currentLane.length();
        int lengthOther = otherLane.length();
        if (currentLane.equals("o"))
            currentcounter+=1;
        if (lengthCurrent > lengthOther)
            currentcounter+=1;
        else if (lengthCurrent < lengthOther)
            othercounter+=1;

        // I attempting to save more female
        if (currentLane.equals("b") || currentLane.equals("d") || currentLane.equals("f") ||currentLane.equals("h")
                || currentLane.equals("j") ||currentLane.equals("l") ||currentLane.equals("n"))
            currentcounter+=1;


        //I am attempting to uphold the law
        if ((currentLane != "q" && otherLane == "q"))
            currentcounter+=1;
        if (scenario == 10)
            currentcounter+=1;
        else if (scenario == 20)
            othercounter+=1;

        // I am attempting to avoid intervention
        if (currentLane == otherLane && scenario == 0)
            othercounter+=1;


        if (othercounter<currentcounter)
            return true;
        else
            return false;


    }

    public static double[] testAlgorithm(int numScenarios) {

        double[] numTotal = new double[20];
        double[] numdead = new double[20];
        double[] percentdead = new double[20];


        for (int i = 0; i < numScenarios; i++) {
            int scenario = Generator.getScenario();
            String currentLane = Generator.getGroup();
            String otherLane = Generator.getGroup();


            for (int j = 0; j < otherLane.length(); j++) {
                numTotal[otherLane.charAt(j) - Generator.MAN] += 1;
            }

            for (int j = 0; j < currentLane.length(); j++) {
                numTotal[currentLane.charAt(j) - Generator.MAN] += 1;
            }


            if (decideSwerve(scenario, currentLane, otherLane)) {
                for (int j = 0; j < currentLane.length(); j++) {
                    numdead[currentLane.charAt(j) - Generator.MAN] += 1;
                }
            } else {
                for (int j = 0; j < otherLane.length(); j++) {
                    numdead[otherLane.charAt(j) - Generator.MAN] += 1;
                }
            }

            for (int k = 0; k < numTotal.length; k++) {
                percentdead[k] = (numdead[k] / numTotal[k])*100;
            }





        }
        return percentdead;
    }
        public static String killedMost (double[] percentdead)
        {
            double highdeadpercent = 0;
            String mostdead = " ";
            for (int i = 0; i < percentdead.length; i++)
            {
                if (percentdead[i] > highdeadpercent)
                {
                    mostdead = Generator.getMemberName((char)(i + Generator.MAN));
                    highdeadpercent = percentdead[i];
                }
            }
            return mostdead;
        }

        public static String killedLeast (double[] percentdead)
        {
            double lowdeadpercent = 100;
            String leastdead = " ";
            for (int i = 0; i < percentdead.length; i++)
            {
                if (percentdead[i] < lowdeadpercent)
                {
                    leastdead = Generator.getMemberName((char)(i + Generator.MAN));
                    lowdeadpercent = percentdead[i];
                }
            }
            return leastdead;
        }

}

