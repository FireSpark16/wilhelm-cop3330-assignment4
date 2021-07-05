/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Xander Wilhelm
 */

package ucf.assignments;

import javafx.event.ActionEvent;

/*
 * To the TA grading this -
 * Note: These classes access levels will all be set to public
 * for the planning part of this assignment. Once I have a more
 * refined idea of how everything is going to work together, I
 * will try to change these as needed to their correct accesses.
 */

public class TodoModel {
    public void useTextOutput(String input) {
        /*
         * Update Method: Change textOutput's text to new string
         */
    }

    public void useTextInput(String input) {
        /*
         * Get Method: Get what's in the textInput box
         * Set Method: Change textInput's text to new string
         */
    }

    public void useCornerBox(String input) {
        /*
         * Update Method: Change cornerBox's text to new string
         */
    }

    public void useSelectedListView() {
        /*
         * Get Method: Retrieve selected item from listView
         * Set Method: Display passed todoList to listView
         */
    }

    public void createNewList() {
        /*
         * Create new instance of TodoList
         * Prompt for list name
         * Wait for submit to be pressed
         * Get text from textInput
         * Set text to listName
         */
    }

    public void loadList() {
        /*
         * Prompt user for list name
         * Wait for submit to be pressed
         * Get text from textInput
         * Check directory for list name
         * If found, read it
         * Assign values from .txt file to new lists using createNewList()
         */
    }

    public void loadMultipleLists() {
        /*
         * Prompt user for list names, separated in some fashion (commas?)
         * Wait for submit to be pressed
         * Get text from textInput
         * Check directory for list names one by one
         * If found, read it
         * Assign list name
         * Assign values from .txt file to new lists using createNewList()
         * (I may be able to extend this from loadList())
         */
    }

    public void saveList() {
        /*
         * Prompt user for list they want to save
         * Wait for submit to be pressed
         * Get text from textInput
         * Check current lists to see if name exists
         * If found, create a new file named [listName].txt
         * Print list name to new file
         * Print item values to list, separated by new lines
         */
    }

    public void saveMultipleLists() {
        /*
         * Prompt user for lists they want to save, separated in some fashion (commas?)
         * Wait for submit to be pressed
         * Get text from textInput
         * Check current lists to see if name exists one by one
         * If found, create a new file named [listName].txt
         * Print list name to new file
         * Print item values to list, separated by new lines
         * (I may be able to extend this from saveList())
         */
    }

    public void deleteList() {
        /*
         * Prompt user for list they would like to delete
         * Wait for submit to be pressed
         * Get text from textInput
         * Search both for both the list and file with that name
         * If either are found, delete them
         * If one is deleted, display deletion message to textOutput
         */
    }

    public void help() {
        /*
         * Note: This may not make it into the final product
         * Output information regarding how to use program
         * Ex: How to edit an item description
         *     Step 1: Have an opened list
         *     Step 2: Select item from list
         *     Step 3: Click edit list description
         * (Depending on how many items there are for this section,
         *  it may output to either textOutput or selectedListView)
         */
    }

    public void editListName() {
        /*
         * Check if list is opened
         * If so, prompt user for new list name via textOutput
         * Wait for submit to be pressed
         * Get text from textInput
         * Change list name to new name
         */
    }

    public void editItemDescription() {
        /*
         * Check if list is opened
         * Check if item is selected
         * If so, prompt user for new item description via textOutput
         * Wait for submit to be pressed
         * Get text from textInput
         * Change item description to new description
         */
    }

    public void editItemDueDate() {
        /*
         * Check if list is opened
         * Check if item is selected
         * If so, prompt user for new item due date via textOutput
         * Wait for submit to be pressed
         * Get text from textInput
         * Change item due date to new due date
         */
    }

    public void deleteItem() {
        /*
         * Check if list is opened
         * Check if item is selected
         * If so, prompt user for the item they wish to delete via textOutput
         * Wait for submit to be pressed
         * Get text from textInput
         * Check for an item that matches the string
         * If found, delete
         * If deleted, display deletion message using textOutput
         */
    }

    public void displayList() {
        /*
         * Prompt user for list name
         * Wait for submit to be pressed
         * Get text from textInput
         * Check if a list exists with that name
         * If so, display it's items one by one to selectedListView
         * If so, also update cornerBox with new title
         * If not, output that it was not found
         */
    }

    public void displayAllItems() {
        /*
         * Check if list is being displayed
         * If so, clear selectedListView and output all list items
         */
    }

    public void displayCompletedItems() {
        /*
         * Check if list is being displayed
         * If so, clear selectedListView and output all list items with completed...
         * ...values set to true
         */
    }

    public void displayIncompleteItems() {
        /*
         * Check if list is being displayed
         * If so, clear selectedListView and output all list items with completed...
         * ...values set to false
         */
    }

    public void markAsComplete() {
        /*
         * Check if list is opened
         * Check if item is selected
         * If so, set item's completed value to true
         */
    }

    public void markAsIncomplete() {
        /*
         * Check if list is opened
         * Check if item is selected
         * If so, set item's completed value to false
         */
    }

    public void addItem() {
        /*
         * Check if list is opened
         * If so, create new instance of todoItem
         * Prompt for description
         * Wait for submit to be pressed
         * Get text from textInput
         * Set text to item description
         * Prompt for due date (MM/DD/YYYY)
         * Wait for submit to be pressed
         * Get text from textInput
         * Set text to item due date
         * Set completed to false by default
         * Add item to the open list
         */
    }

    public void submit() {
        /*
         * return true
         * (The point of this is to wait until a user has inputted...
         *  ...something before they continue. This way, the program...
         *  ...grabs something only after it has been typed in the box.)
         */
    }
}
