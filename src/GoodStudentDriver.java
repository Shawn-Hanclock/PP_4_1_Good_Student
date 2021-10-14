public class GoodStudentDriver
{
    public static void main(String[] args)
    {
        GoodStudent alan = new GoodStudent("Alan", "Turning", 191254,3.56, true);
        GoodStudent florence = new GoodStudent("Florence", "Nightingale", 182010,3.89, false);
        GoodStudent grace = new GoodStudent("Grace", "Hopper", 190692,3.99, true);

        System.out.println(alan.toString() + "\n");

        florence.setId(95366);
        florence.setGpa(3.92);

        System.out.println(grace.getSdtFirst() + ", " + grace.getIsCsSdt() + "\n");

        System.out.println(alan.createId());
        System.out.println(florence.createId());
        System.out.println(grace.createId() + "\n");

        System.out.println(alan.csGpa());
        System.out.println(florence.csGpa());
        System.out.println(grace.csGpa());
    }//end of main method
}//end of good student driver class
