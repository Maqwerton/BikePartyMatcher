import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by martin on 2017-05-17.
 */
public class BikePartyMatcher {

    public BikePartyMatcher()   {

    }

    public void parser() throws IOException {
        BufferedReader br = null;
        FileReader fr = null;

        try {
            fr = new FileReader("~/stab/cykelfest/CykelFestMatcher");
            br = new BufferedReader(fr);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String line = br.readLine();
        int i = 0;
        while((line = br.readLine()) != null)    {

        }
    }

    private class BikeGroup   {
        int GroupID;
        int mebers;
        int mentorGroup;
        int area;
        int course;

        private BikeGroup(int GroupID, int members, int mentorGroup, int area)    {
        this.GroupID = GroupID;
        this.mebers = members;
        this.mentorGroup = mentorGroup;
        this.area = area;
        }

        public void setCourse(int course)   {
            this.course = course;
        }

    }


    public static void main(String [] args) {

    }
}
