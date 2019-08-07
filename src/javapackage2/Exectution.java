package javapackage2;

public class Exectution {


    //Naming Convension
    //- Package - Starts with lowerCase
    //- Class - Starts with UpperCase
    //- VariableName = Starts with LowerCase

    public static void main(String[] args) {

        //call from the main class
        //desired class /Laptop/
        //Class name + referrence Variable = new (keyword) + classname(){constructor of the class};

        Laptop refVar = new Laptop();

        // Laptop laptop = new Laptop();
        //to recall the datatype from another table/project or another programm.
        //System.out.println(laptop.brand);
        System.out.println(refVar.m);

    }
}
