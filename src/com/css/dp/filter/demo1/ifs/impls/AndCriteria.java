package com.css.dp.filter.demo1.ifs.impls;

import com.css.dp.filter.demo1.ifs.Criteria;
import com.css.dp.filter.demo1.model.Person;

import java.util.List;

public class AndCriteria implements Criteria {

    private Criteria criteria, otherCriteria;

    public AndCriteria (Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> firstCriteriaPersonList = criteria.meetCriteria(personList);
        return otherCriteria.meetCriteria(firstCriteriaPersonList);
    }
}
