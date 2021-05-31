package Iterator.basic;

public class IteratorConcreteLitsA implements Iterator{

    private String [] nombres;
    private int position;

    public IteratorConcreteLitsA(String [] nombres){
        this.nombres=nombres;
    }

    @Override
    public Object next() {
        return nombres[position++];
    }

    @Override
    public boolean hasNext() {
        return nombres.length != 0 && position < nombres.length ;
    }
}
