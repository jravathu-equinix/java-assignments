import java.util.*;

public class Hierarchy {

    // Assuming a person is going to have only one person under him.
    static ArrayList<Person> hierarchy = new ArrayList<>();

    /**
     * Given person and his/her manager in the same order, it gets added into the hierarchy.
     * @param currentPerson (person)
     * @param upperPerson (manager)
     */
    public void addToHierarchy(Person currentPerson, Person upperPerson){
        if(hierarchy.isEmpty()){
            hierarchy.add(upperPerson);
            hierarchy.add(currentPerson);
        }
        else if(hierarchy.contains(upperPerson))
        {
            int location = hierarchy.indexOf(upperPerson);
            hierarchy.add(location+1, currentPerson);
        }
    }

    /**
     * Given a person, this method outputs persons under him/her.
     * @param currentperson
     */
    public void getHierarchy(Person currentperson){
        int start = hierarchy.indexOf(currentperson);
        String gap = "";
        for(int i=start; i<hierarchy.size(); i++)
        {
            if(i == start)
                System.out.println("\nHierarchy of " + hierarchy.get(i).name + " :\n");
            System.out.println(gap+"NAME: "+hierarchy.get(i).name);
            hierarchy.get(i).getInfo(gap);
            gap += "    ";
        }
    }
}
