public class Verification {


    public static boolean verifyAll()
    {
        boolean [] testValues = new boolean[10];
        // initializing strings to use in verification
        // test 1
        String wordToFind = "tacokingguy";
        String stringOne = "a;asldfj las flasfeif" + wordToFind+"qwieria;sfajkldskf";
        String stringTwo = "asklfj lfs dfeia;eriqjweih"+wordToFind+"lkas;fklasjdf;askjfek";
        testValues[0] = verifyLongestCommonSubstringBrute(stringOne,stringTwo, wordToFind);
        testValues[1] = verifyLongestCommonSubstringNotBrute(stringOne,stringTwo,wordToFind);
        // test 2
        String noMatchOne = "a;fjdsalsfjklsafdlkasjkfdd";
        String noMatchTwo = "`````````````````````````````";
        testValues[2] = verifyLongestCommonSubstringBrute(noMatchOne, noMatchTwo,"");
        testValues[3] = verifyLongestCommonSubstringNotBrute(noMatchOne,noMatchTwo,"");
        // test 3
        String moreThanOneMatch = "asfk;ldj cmiealdjafILOVETAKISieiareTOMATOalsjkfleiaSoupalsfdja;";
        String moreThanOneMatchTwo ="0928410420147890ILOVETAKIS12830947081924892134778912347TOMATO8q00123478293490124713849741872138794SOUPi2384";
        testValues[4] = verifyLongestCommonSubstringBrute(moreThanOneMatch,moreThanOneMatchTwo,"ILOVETAKIS");
        testValues[5] = verifyLongestCommonSubstringNotBrute(moreThanOneMatch,moreThanOneMatchTwo, "ILOVETAKIS");
        // test 4
        String greaterThanHalfLongest = "IMVERYHUNGRYWHILEIDOTHISlkasfjlkfkklsjf";
        String greaterThanHalfLongestTWO = "TACOBELLSOUNDSGOODIMVERYHUNGRYWHILEIDOTHIS";
        testValues[6] = verifyLongestCommonSubstringNotBrute(greaterThanHalfLongest,greaterThanHalfLongestTWO, "IMVERYHUNGRYWHILEIDOTHIS");
        testValues[7] = verifyLongestCommonSubstringBrute(greaterThanHalfLongest,greaterThanHalfLongestTWO, "IMVERYHUNGRYWHILEIDOTHIS");

        // test 5
        String largerStrings = "lkafsd;ljasdfjds;fj;asjfeiawera;jsdfljaslcjaskljdflsadjflksadjacmlkdmalksjdf;lkjeiariq;rjsdlkmcadskljflkasjdfaeiwqetweryteritoeryutosdhjfklhaflksadjcbnaskjdfaskjfbadskjdfhasdlfjadslfjaslkcjelkajewrlkjasiofsasifajsfkasjfd;asfkj;elnaslkcjaslk;dflewyraskjfa" +
                "lasd;jflkadsjfl;adsjfkladsjfladsfjladskd;fadshfljladskjdflasddjfcasldflksdlakfjasdlktkasshterhjl;dshfiashf;asidfasjkcjads;dfjas;dfidsahfla;sdfhiafa;jkfjs;acjads;flajsf;lasjfslacj;adsdkcmas;lkdfj;aslkfjeira;kfsd;ljfas;kldjlcadsmcklasjdfkljasd;lcasmdlkckasdlkfjadskljckasmdc;lasdljfaklscas;lcjasldckmasd;lfkjas;ljdfas" +
                "alkdfs;lasjfas;fkljasflkjads;kajcl;asjfj;eklasdjf;askdfjas;ldjcasklcmas;flasjfieas;fdjaskljclkamsldkfaslkckmads;lfjalksjcklasmads;lfjkaslckmaslkdfj;aslfamkl;asjfcjasdlkdfjieareewrueurerieuowri;fajs;lfjas;lclalk;sdfjas;lfjask;lcasklfjadsklcmaskldfjaskljcmasldkf;jal;cmlaksjdf;lamcal;sdfjakl;cmaslk;dfkjasl;kcmalksdfjalcmaslk;dkfjaslcmas;l" +
                "lkasjdf;lasjfkladsjlfkieieieieieieieids;fasjkfas;fjaskfjsad kcjd cadsfaslk;dfjlamc;ladsf;aslc;ladsfjsaf TACOCABASAISWHERETHEYMETINBREAKINGBADa;lkfjasklfjsa;f js54sad;lfj;asfklasf" +
                ";aklfl;kasjfkljasfjas;dfajskfjas;lfjslaf;jsadfksafd;jaslkjfas;lfjsalfasdf";
        String largerStringsTwo = "ldlieikdkdkdiijfadskjfdkadsjfksadjfkadsjkfjsadk;lfjasdfckl jsdlkjasdfk;laskdl favskj fc askl jfaskvfk;l asj flkasjvfk aslkfjcalskx caslkdjfklsgjljafskljfa sjdsjal;fadsjckjas ;ldcj klasj c;lajsdfljda f;asl fask;ljc lkasj flk;sajc ladskjfas;kljclkasj dfklajs fl;jl c;asj dlk;j f" +
                "askljdfalk;sfjalsf ak;lkas;ldfj lkasjclkadsjfk;lasjf;sakc as;klfjslakcjasljflksajfTACOCABASAISWHERETHEYMETINBREAKINGBAD;alfdjkajf;askfj;asjfaksfjsd;fieeirueirueiudkdcmxm,xlldllkdlfkdfeiejriajskfasl;cmdkcmaslk;dfkjas;cmaskads;lfasmcsal;dlkfjask;lcmas;ldcklmas;lkdfa" +
                "kadsjflnadskjfhladsjfsad;dfjskclmasclk;ascjsd;klfjasdljclasmc;lsdjafjsadklfjklasjc;las";
        testValues[8] = verifyLongestCommonSubstringBrute(largerStrings,largerStringsTwo, "TACOCABASAISWHERETHEYMETINBREAKINGBAD");
        testValues[9] = verifyLongestCommonSubstringNotBrute(largerStrings,largerStringsTwo, "TACOCABASAISWHERETHEYMETINBREAKINGBAD");
        // checking how many were correct
        int tracker = 0;
        for(int i =0; i < testValues.length; i++)
        {
            if(testValues[i])
            {
                tracker++;
            }
        }

        System.out.println(tracker);
        // if all tests worked return true if not return false
        if(tracker == testValues.length)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    private static boolean checkAll(String stringOne, String stringTwo, String wordToFind)
    {
        // finding longest substring and verifying it worked correctly
        boolean checkBruteForce = verifyLongestCommonSubstringBrute(stringOne,stringTwo, wordToFind);
        boolean checkNotBruteForce = verifyLongestCommonSubstringNotBrute(stringOne, stringTwo, wordToFind);
        // if worked tell user it worked if it didn't tell them it didn't
        if(checkBruteForce && checkNotBruteForce)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    // comparing words and calling longestCommonSubstring functions
    private static boolean verifyLongestCommonSubstringBrute(String stringOne, String stringTwo, String wordToFind)
    {
        LongestCommonSubstringReturnHold hold = LongestCommonSubstringFunctions.longestCommonSubstringBrute(stringOne,stringTwo);
        boolean check = compareWords(stringOne,stringTwo,hold,wordToFind);
        return check;
    }

    private static boolean verifyLongestCommonSubstringNotBrute(String stringOne, String stringTwo, String wordToFind)
    {
        LongestCommonSubstringReturnHold hold = LongestCommonSubstringFunctions.longestCommonSubstring(stringOne,stringTwo);
        String returnValue = stringOne.substring(hold.getStringOneStartIndex(), hold.getStringOneStartIndex() + hold.getLcsLength());
        System.out.println("longest common substring from not brute force " + returnValue);
        if(wordToFind.equals(returnValue))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    //comparing the words gotten from the function to ensure they are the same
    private static boolean compareWords(String stringOne, String stringTwo, LongestCommonSubstringReturnHold hold, String wordToFind)
    {
        String stringOneFind = "";
        String stringTwoFind = "";

            stringOneFind += stringOne.substring(hold.getStringOneStartIndex(), hold.getStringOneStartIndex() + hold.getLcsLength());
            stringTwoFind += stringTwo.substring(hold.getStringTwoStartIndex(), hold.getStringTwoStartIndex() + hold.getLcsLength());

        System.out.println("longest common substring (given): " + wordToFind);
        System.out.println("longest common substring from Brute force " + stringOneFind);

        if (wordToFind.equals(stringOneFind) && wordToFind.equals(stringTwoFind))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
