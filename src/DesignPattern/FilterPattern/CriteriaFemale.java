package DesignPattern.FilterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Suheng on 15/5/7.
 */
public class CriteriaFemale implements Criteria {
    List<Person> femalePersons = null;

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        this.femalePersons = new ArrayList<Person>();

        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("FEMALE")) {
                this.femalePersons.add(person);
            }
        }
        return this.femalePersons;
    }
}
