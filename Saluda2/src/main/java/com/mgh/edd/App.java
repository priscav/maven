package com.mgh.edd;

public class App 
{
    public static void main( String[] args )
    {
        String nombre=args.length>0?args[0]:"";
        Saluda.saluda(nombre);
    }
}
