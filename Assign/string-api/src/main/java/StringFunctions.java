public class StringFunctions {
    public  static String  reverseString(String args)
    {   StringBuffer sbr = new StringBuffer(args);
        sbr.reverse(); // To reverse the string
        return  sbr.toString();
    }
    public  static int  sizeOfString(String args)
    {
        return  args.length();
    }
}
