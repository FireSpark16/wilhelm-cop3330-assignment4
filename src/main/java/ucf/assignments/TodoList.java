/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Xander Wilhelm
 */

package ucf.assignments;

import javafx.collections.ObservableList;

public class TodoList {
    String listName;
    ObservableList todoList;

    class TodoItem
    {
        String description;
        String dueDate;
        boolean completed;
    }
}
