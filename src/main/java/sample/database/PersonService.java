package sample.database;

import com.google.common.collect.Lists;
import sample.model.Person;

import java.util.List;

/**
 * Created by No3x on 01.02.2017.
 */
public class PersonService {

    public List<Person> getAll() {
        return Lists.newArrayList(
            new Person("User 1"),
            new Person("User 2")
        );
    }
}
