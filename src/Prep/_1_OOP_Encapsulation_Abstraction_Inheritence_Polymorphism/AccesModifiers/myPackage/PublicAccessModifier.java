package Prep._1_OOP_Encapsulation_Abstraction_Inheritence_Polymorphism.AccesModifiers.myPackage;

/**
 * Created by jeffjorgensen on 22/12/2016.
 */
public class PublicAccessModifier {
    String defaultString = "default String";
    public String publicString = "public String";
    private String privateString = "private String";
    protected String protectedString = "protected String";

    protected void msg(){
        System.out.println("hi");
    }
}
