import java.util.Locale;
import java.text.DecimalFormat;

public class GoodStudent
{
    //instance variables
    private String sdtFirst;
    private String sdtLast;
    private int id;
    private double gpa;
    private boolean isCsSdt;

    //constructors
    public GoodStudent(String newSdtFirst, String newSdtLast, int newId, double newGpa, boolean newIsCsSdt)
    {
        sdtFirst = newSdtFirst;
        sdtLast = newSdtLast;
        id = newId;
        gpa = newGpa;
        isCsSdt = newIsCsSdt;
    }
    public GoodStudent(String newSdtFirst, String newSdtLast)
    {
        sdtFirst = newSdtFirst;
        sdtLast = newSdtLast;
        id = 0;
        gpa = 0.0;
        isCsSdt = false;
    }
    public GoodStudent()
    {
        sdtFirst = "";
        sdtLast = "";
        id = 0;
        gpa = 0.0;
        isCsSdt = false;
    }

    //getters
    public String getSdtFirst()
    {
        return sdtFirst;
    }
    public String getSdtLast()
    {
        return sdtLast;
    }
    public int getId()
    {
        return id;
    }
    public double getGpa()
    {
        return gpa;
    }
    public boolean getIsCsSdt()
    {
        return isCsSdt;
    }

    //setters
    public void setSdtFirst(String newSdtFirst)
    {
        sdtFirst = newSdtFirst;
    }
    public void setSdtLast(String newSdtFirst)
    {
        sdtLast = newSdtFirst;
    }
    public void setId(int newId)
    {
        id = newId;
    }
    public void setGpa(double newGpa)
    {
        gpa = newGpa;
    }
    public void setIsCsSdt(boolean newIsCsSdt)
    {
        isCsSdt = newIsCsSdt;
    }

    //brain methods
    public String createId()
    {
        String strId = id + "";
        String digitalId = sdtFirst.toLowerCase();
        digitalId = digitalId.substring(0, 1) + sdtLast.toLowerCase() + strId.substring(strId.length()- 3 ,strId.length()) + "";
        return digitalId;
    }

    public String csGpa()
    {
        String boostedGpa = gpa + "";
        double boostGpa = gpa * 1.15;
        if(isCsSdt)
        {
            DecimalFormat fmt = new DecimalFormat("0.##");
            boostedGpa = fmt.format(boostGpa);
        }
        return boostedGpa;
    }

    //toString method
    public String toString()
    {
        String output = "First Name: " + sdtFirst;
        output += "\nLast Name: " + sdtLast;
        output += "\nID #:" + id;
        output += "\nGPA:" + gpa;
        return output;
    }
}//end of GoodStudent class
