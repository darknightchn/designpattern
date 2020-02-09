package com.css.dp.filter.demo1.ifs.impls;

import com.css.dp.filter.demo1.ifs.Criteria;
import com.css.dp.filter.demo1.model.Person;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        if (personList == null || personList.isEmpty()) {
            return personList;
        }
        List<Person> res = new ArrayList<>(personList.size());
        for (int i = 0; i < personList.size(); i ++) {
            Person person = personList.get(i);
            if ("male".equalsIgnoreCase(person.getGender())) {
                res.add(person);
            }
        }
        return res;
    }
}
