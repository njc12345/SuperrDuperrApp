# SuperrDuperrToDoApp
ToDo App Manager supporting multiple toDo lists, addition, deletion and marking complete/restoring toDo Items

# Actions Supported

1. Create new ToDo Lists: User has to input list name and click on 'Add New ToDo List' button. 

2. Create new ToDo: User selects a list from Dropdown, Enters a new ToDo Item and clicks on 'Add New ToDo' button. This will add the ToDoItem to selected ToDoItemList.

Note: User won't be allowed a new ToDo Item without any List. Atleast One List is required before ToDo Items can be added.

3. Expanding/Collapsing: The ToDo Lists are visible as collapsed panels. User clicks on ListName to Expand a List and click again to Collapse a List. 

4: Marking an Item Complete: User can Mark an Item Complete. User can also restore back an Item Marked Complete. 

5: Delete and Item: User can Delete a ToDo Item by Clicking 'Delete' button against it. The list will automatically get deleted once all Items under it are deleted. 

# Angular JS

The front end is designed using AngularJs1, Bootstrap, Javascript. 

# Spring Boot

The rest apis are exposed through a Spring Boot Rest Application. 

The following APIs are supported:

/SuperrDuperr/toDo/addNewList/{toDoItemListName}],methods=[POST]}
/SuperrDuperr/toDo/getAllItems],methods=[GET]}
/SuperrDuperr/toDo/addItem/{toDoItemListName}],methods=[POST]}
/SuperrDuperr/toDo/deleteItem/{toDoItemListName}],methods=[POST]}

The POST request posts ToDoItem object as JSON along with ListName as Path param to identify a unique ToDoItem object in the Service Layer. 

The Response objects are in JSON Format. 



