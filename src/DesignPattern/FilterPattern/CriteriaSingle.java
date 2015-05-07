package DesignPattern.FilterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Suheng on 15/5/7.
 */
public class CriteriaSingle implements Criteria {
    List<Person> singlePersons = null;

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        this.singlePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if (person.getMaritalStatus().equalsIgnoreCase("SINGLE")) {
                this.singlePersons.add(person);
            }
        }
        return this.singlePersons;
    }
}
