// Author - Himank Jeshwar
// Written - 9/8/21

class Program13
{
    public static void main(String[] args) 
    {
        double a=5.0;
        double b=5.5;
        String c="L";
        String d="a";
        String e="n";
        String f="g";
        String g="u";
        String h="a";
        String i="g";
        String j="e";
        char p='y';
        char y='o';
        char t='y';
        char m='o';
        System.out.println(c+d+e+f+g+h+i+j);
        System.out.print(p);
        System.out.print(y);
        System.out.print(t);
        System.out.print(m+("\n"));
        a=a+0.5;
        System.out.println(b==a); // Answer will be true as a=b
        System.out.println(b<a); // Answer will be false as a=b 
        System.out.println(b>a); // Answer will be false as a=b 
        System.out.println(a==b); //Answer will be true
        System.out.println(!(a==b)); // Answer will be false
        System.out.println(a==b||a>b); // Answer will be true as a==b is true
        System.out.println(a==b&& !(a>b)); // Answer will be true 
        System.out.println(a==b&&a>b); // Answer will be false bcz both needs to be true
    }
}