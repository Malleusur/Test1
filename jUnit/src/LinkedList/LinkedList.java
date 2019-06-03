package LinkedList;

public class LinkedList<L> {
    private Element firstElement;

    public Element getFirstElement() {
        return firstElement;
    }

    public LinkedList() {
    }

    public LinkedList(L data) {
        firstElement = new Element(data);
    }

    public void add(L data) {
        Element currentElement = new Element(data);
        if (firstElement != null) {
            Element lastElement = firstElement;
            while (lastElement.pointer != null) {
                lastElement = currentElement.pointer;
            }
            lastElement.pointer = currentElement;
        } else {
            firstElement = currentElement;
        }
    }

    public void remove(int index) {
        if (index == 0) {
            if (firstElement.pointer == null) {
                firstElement = null;
            } else {
                Element secondElement = firstElement.pointer;
                firstElement.pointer = null;
                firstElement = secondElement;
            }
        } else {
            Element currentElement = getElement(index);
            Element previousElement = getElement(index - 1);
            if (currentElement != null) {
                previousElement.pointer = currentElement.pointer;
                currentElement.pointer = null;
            }
        }
    }

    private Element getElement(int index) {
        int currentPosition = 0;
        Element currentElement = firstElement;
        while (currentElement != null) {
            if (currentPosition == index) {
                break;
            } else {
                currentPosition++;
                currentElement = currentElement.pointer;
            }
        }
        if (currentPosition == index) {
            return currentElement;
        } else {
            return null;
        }
    }

    public L get(int index) {
        Element currentElement = getElement(index);
        if (currentElement != null) {
            return (L) currentElement.data;
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        if (firstElement != null) {
            StringBuffer Result = new StringBuffer("");
            Element currentElement = firstElement;
            while (currentElement != null) {
                Result.append(currentElement.data + " ");
                currentElement = currentElement.pointer;
            }
            return Result.toString().trim();
        } else {
            return "The list is empty";
        }
    }
}

