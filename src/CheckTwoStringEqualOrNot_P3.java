public class CheckTwoStringEqualOrNot_P3
{
    public static void main(String[] args)
    {
        //declare two string
        String name="Java";
        String name1="java";
        System.out.println("String is Equal or not :- ");

        //First method to check string is equal or not
        boolean b=true;
        System.out.println(name==name1); //Check using ==(comparison operator) two String is equal or not

        //second method is to check using equals method two string is equal or not
        //System.out.println(name.equals(name1));
    }
}
