// class for returning values for the LongestCommonSubstringBrute function
public class LongestCommonSubstringReturnHold {
    private int lcsLength;
    private int stringOneStartIndex;
    private int stringTwoStartIndex;

    public LongestCommonSubstringReturnHold(int lcsLength, int stringOneStartIndex, int stringTwoStartIndex)
    {
        this.lcsLength= lcsLength;
        this.stringOneStartIndex = stringOneStartIndex;
        this.stringTwoStartIndex = stringTwoStartIndex;
    }

    public int getLcsLength()
    {
        return this.lcsLength;
    }

    public int getStringOneStartIndex()
    {
        return this.stringOneStartIndex;
    }

    public int getStringTwoStartIndex()
    {
        return this.stringTwoStartIndex;
    }
}
