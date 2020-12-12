public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{

  public OrderedArrayList(){
    super();
  }

  public OrderedArrayList(int startingCapacity){
    super(startingCapacity);
  }

  public boolean add(T element){
    if (element == null){
      throw new IllegalArgumentException("You can't input null into an OrderedArrayList!");
    }
    if (size() == 0){
      return super.add(element);
    }
    for (int i = 0; i < size(); i++){
      if (element.compareTo(get(size()-1)) > 0){
        super.add(element);
        return true;
      }
      if (element.compareTo(get(i)) <= 0){
        super.add(i, element);
        return true;
      }
    }
    return true;
  }

  public void add(int index, T element){
    add(element);
  }

  public T set(int index, T element){
    if (element == null){
      throw new IllegalArgumentException("You can't input null into an OrderedArrayList!");
    }
    T removed = remove(index);
    add(element);
    return removed;
  }

}
