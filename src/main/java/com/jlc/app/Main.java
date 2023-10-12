package com.jlc.app;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
        System.out.println("length : " + args.length);
        if (args.length < 1)
        {
            System.out.println("Help");
            System.exit(0);
        }

        if (args.length > 0)
            System.out.println(args[0]);

        Arguments arguments = new Arguments(args);
    }
}
