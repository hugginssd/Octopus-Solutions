/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package octopushr.organization;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import octopushr.organization.OrganisationalCalendarController.Category;

/**
 *
 * @author user
 */
public class NewEventsCalendarConstructor {

    private final StringProperty date = new SimpleStringProperty();
    private final ObjectProperty<Category> category = new SimpleObjectProperty<>();
 
    public NewEventsCalendarConstructor(String date, Category category) {
        setDate(date);
        setCategory(category);
    }

    public final StringProperty dateProperty() {
        return this.date;
    }

    public final String getDate() {
        return this.dateProperty().get();
    }

    public final void setDate(final String date) {
        this.dateProperty().set(date);
    }

    public final ObjectProperty<Category> categoryProperty() {
        return this.category;
    }

    public final Category getCategory() {
        return this.categoryProperty().get();
    }

    public final void setCategory(Category category) {
        this.categoryProperty().set(category);
    }
}
