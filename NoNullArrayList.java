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

  public static void main(String[] args) {
    NoNullArrayList<String> a = new NoNullArrayList<String>();
    a.add("hi");
    System.out.println(a.get(0));
    System.out.println(a.set(0, "bye"));
    System.out.println(a.get(0));
  }
}
