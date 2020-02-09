package com.css.dp.filter.demo1.ifs.impls;

import com.css.dp.filter.demo1.ifs.Criteria;
import com.css.dp.filter.demo1.model.Person;

import java.util.List;

public class OrCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria (Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> firstCriteriaPersonList = criteria.meetCriteria(personList);
        List<Person> secondCriteriaPersonList = otherCriteria.meetCriteria(personList);
        for (int i = 0; i < secondCriteriaPersonList.size(); i ++) {
            Person person = secondCriteriaPersonList.get(i);
            if (!firstCriteriaPersonList.contains(person)) {
                firstCriteriaPersonList.add(person);
            }
        }
        return firstCriteriaPersonList;
    }
}
