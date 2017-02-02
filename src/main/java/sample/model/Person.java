package sample.model;

import javafx.beans.Observable;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.util.Callback;
import sample.gui.GUIRepresentable;

/**
 * Created by No3x on 01.02.2017.
 */
public class Person implements GUIRepresentable {

    private final IntegerProperty id = new SimpleIntegerProperty(this, "id");
    private final StringProperty name = new SimpleStringProperty(this, "name");

    public Person(String s) {
        this.name.set(s);
    }

    public String getName() {
        return name.get();
    }
    public void setName(String name) {
        this.name.set(name);
    }
    public StringProperty nameProperty() {
        return name;
    }

    @Override
    public String getTitle() {
        return name.getValue();
    }

    public static Callback<Person, Observable[]> extractor() {
        return (Person p) -> new Observable[]{p.nameProperty()};
    }

    @Override
    public String toString() {
        return name.getValue();
    }
}
