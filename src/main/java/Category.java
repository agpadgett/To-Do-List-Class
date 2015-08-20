import java.util.ArrayList;

public class Category {

  private static ArrayList<Category> instances = new ArrayList<Category>();
  private ArrayList<Task> mTasks;
  private String mName;
  private int mId;

  public Category(String name){
    mName = name;
    instances.add(this); //add the Category you just created to the array list 'instances'
    mId = instances.size(); //mId = the number of things in the Array List 'instances'
    mTasks = new ArrayList<Task>(); //creates an empty array list of Tasks, nothing has been added yet
  }

  public String getName(){
    return mName;
  }

  public int getId(){
    return mId;
  }

  public ArrayList<Task> getTasks(){
    return mTasks;
  }

  public void addTask(Task task){
    mTasks.add(task);// add a 'Task' object called 'task' to the mTask array list.
  }

  public static ArrayList<Category> all() {
   return instances;
 }

  public static void clear(){
    instances.clear();
  }

  public static Category find(int id){
    try {
      return instances.get(id - 1);
    } catch (IndexOutOfBoundsException exception){
      return null;
    } // when using 'find', you input an int, and it spits out a Category,
    // try to return the Category at position id-1 (remember, the FIRST thing in an array is at Position 0, and ID is set by SIZE of the array)
    // if you can't find a Category, return 'null'
  }


}
