package DesignPattern.FilterPattern;

import java.util.List;

/**
 * Created by Suheng on 15/5/7.
 */
public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
