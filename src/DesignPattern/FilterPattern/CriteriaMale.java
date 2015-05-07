package DesignPattern.FilterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Suheng on 15/5/7.
 */
public class CriteriaMale implements Criteria {
    List<Person> malePersons = null;

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        this.malePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("MALE")) {
                this.malePersons.add(person);
            }
        }
        return this.malePersons;
    }
}
