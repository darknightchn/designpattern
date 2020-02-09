package com.css.dp.filter.demo1.ifs;

import com.css.dp.filter.demo1.model.Person;

import java.util.List;

public interface Criteria {

    public List<Person> meetCriteria (List<Person> personList);

}
