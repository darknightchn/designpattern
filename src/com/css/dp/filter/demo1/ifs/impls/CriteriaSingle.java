package com.css.dp.filter.demo1.ifs.impls;

import com.css.dp.filter.demo1.ifs.Criteria;
import com.css.dp.filter.demo1.model.Person;
import com.css.dp.utils.ListUtil;

import java.util.ArrayList;
import java.util.List;

public class CriteriaSingle implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        if (ListUtil.isLstEmpty(personList)) {
            return personList;
        }
        List<Person> res = new ArrayList<>(personList.size());
        for (int i = 0; i < personList.size(); i ++) {
            Person person = personList.get(i);
            if ("SINGLE".equalsIgnoreCase(person.getMaritalStatus())) {
                res.add(person);
            }
        }
        return res;
    }
}
