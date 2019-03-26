package mvc.beans;

import java.util.ArrayList;
import java.util.List;
import mvc.model.Model;
import mvc.model.TodoList;
import mvc.model.TodoNote;

/**
 * Data for JSP pages (an instance of this class i used in the JSP page)
 * 
 * ***  NOTHING TO DO HERE ***
 * 
 * @author hajo
 */

public class ViewModel {
    
    public List<TodoNote> getTodoList(){
        return Model.INSTANCE.getList().getNotes();
    }
    
}
