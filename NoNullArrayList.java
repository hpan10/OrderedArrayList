import java.util.ArrayList;

public class NoNullArrayList<T> extends ArrayList<T>{

  public NoNullArrayList(){
    super();
  }

  public NoNullArrayList(int startingCapacity){
    super(startingCapacity);
  }

  public T set(int index, T element){
    if (element == null){
      throw new IllegalArgumentException("You can't input null into a NoNullArrayList!");
    }
    return super.set(index, element);
  }

  public boolean add(T element){
    if (element == null){
      throw new IllegalArgumentException("You can't input null into a NoNullArrayList!");
    }
    return super.add(element);
  }

  public void add(int index, T element){
    if (element == null){
      throw new IllegalArgumentException("You can't input null into a NoNullArrayList!");
    }
    super.add(index, element);
  }

}
