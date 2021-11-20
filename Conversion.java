class Conversion
{
    public static void main(String args[])
    {
        String str1="25",str2="4.32", str3="1.4142";
        int n1=Integer.valueOf(str1);
        float n2=Float.valueOf(str2);
        double n3=Double.valueOf(str3);
        System.out.println("String to Int: "+n1);
        System.out.println("String to Float: "+n2);
        System.out.println("String to Double: "+n3);
    }
}