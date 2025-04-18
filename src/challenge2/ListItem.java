package challenge2;

public abstract class ListItem {
    protected ListItem rightLink;
    protected ListItem leftLink;
    protected Object value;

    public ListItem(Object value) {
        this.value = value;
    }

    abstract ListItem next();
    abstract ListItem setNext(ListItem next);
    abstract ListItem previous();
    abstract ListItem setPrevious(ListItem previous);
    abstract int compareTo(ListItem item);

    public Object getValue() {
    return value;
    }
    public void setValue(Object value) {
        this.value = value;
    }
}

