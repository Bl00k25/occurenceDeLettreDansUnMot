import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
        String mot="anticonstitutionnellement";
        char letterToSearch='t';
        int occurrence = 0 , j=0 ;
        for(int i=0 ; i<mot.length() ; i++)
        {
            if (mot.charAt(i)==letterToSearch)
            {
                occurrence++;
            }
        }
        int[] tPos = new int[occurrence];
        for(int i=0 ; i<mot.length() ; i++)
        {
            if (mot.charAt(i)==letterToSearch)
            {
                tPos[j]=i;
                j++;
            }
        }

        System.out.println("Il existe "+occurrence+" occurrences de '"+letterToSearch+"' dans '"+mot+"' et elles se trouvent chacunes aux positions :"+ Arrays.toString(tPos));
    }
}