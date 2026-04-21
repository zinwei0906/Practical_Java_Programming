package P5Q1.ADT;

/**
 *
 * @author RSD2G6 TAN ZIN WEI
 */
public class LinkedList<T> implements ListInterface<T> {

    private Node FirstNode;
    private int SizeOfElement;

    public LinkedList() {
        this.FirstNode = null;
        this.SizeOfElement = 0;
    }

    //1
    public int getSizeOfElement() {
        return SizeOfElement;
    }

    //2
    public boolean add(T AddElement) {
        Node AddNode = new Node(AddElement);
        if (isEmpty() == true) {
            this.FirstNode = AddNode;
        } else {
            Node CurrentNode = this.FirstNode;
            while (CurrentNode.getNext() != null) {
                CurrentNode = CurrentNode.getNext();
            }
            CurrentNode.setNext(AddNode);
        }
        this.SizeOfElement += 1;
        return true;
    }

    //3
    public boolean add(int AddPosition, T AddElement) {
        if (AddPosition <= 0 || AddPosition > this.SizeOfElement + 1) {
            return false;
        } else {
            Node AddNode = new Node(AddElement);
            if (isEmpty() == true) {
                this.FirstNode = AddNode;
            } else if (AddPosition == 1) {
                AddNode.setNext(this.FirstNode);
                this.FirstNode = AddNode;
            } else {
                Node CurrentNode = this.FirstNode;
                for (int number = 1; number < AddPosition - 1; number++) {
                    CurrentNode = CurrentNode.getNext();
                }
                AddNode.setNext(CurrentNode.getNext());
                CurrentNode.setNext(AddNode);
            }
            this.SizeOfElement += 1;
            return true;
        }
    }

    //4
    public T remove(int RemovePosition) {
        if (validPosition(RemovePosition) == false) {
            return null;
        } else {
            T RemoveElement = null;
            if (RemovePosition == 1) {
                RemoveElement = (T) FirstNode.getData();
                this.FirstNode = this.FirstNode.getNext();
            } else {
                Node CurrentNode = this.FirstNode;
                for (int number = 1; number < RemovePosition - 1; number++) {
                    CurrentNode = CurrentNode.getNext();
                }
                RemoveElement = (T) CurrentNode.getData();
                CurrentNode.setNext(CurrentNode.getNext().getNext());
            }
            this.SizeOfElement -= 1;
            return RemoveElement;
        }
    }

    //5
    public boolean replace(int ReplacePosition, T ReplaceElement) {
        if (validPosition(ReplacePosition) == false) {
            return false;
        } else {
            Node CurrentNode = this.FirstNode;
            for (int number = 0; number < ReplacePosition - 1; number++) {
                CurrentNode = CurrentNode.getNext();
            }
            CurrentNode.setData(ReplaceElement);
            return true;
        }
    }

    //6
    public T getElement(int GetPosition) {
        if (validPosition(GetPosition) == false) {
            return null;
        } else {
            Node GetNode = this.FirstNode;
            for (int number = 0; number < GetPosition - 1; number++) {
                GetNode = GetNode.getNext();
            }
            return (T) GetNode.getData();
        }
    }

    //7
    public boolean contains(T ContainElement) {
        Node CurrentNode = this.FirstNode;
        while (CurrentNode != null) {
            if (CurrentNode.getData().equals(ContainElement)) {
                return true;
            }
            CurrentNode = CurrentNode.getNext();
        }
        return false;
    }

    //8
    public void clear() {
        this.FirstNode = null;
        this.SizeOfElement = 0;
    }

    //9
    public boolean isEmpty() {
        if (this.SizeOfElement == 0) {
            return true;
        } else {
            return false;
        }

    }

    //10
    private boolean validPosition(int Position) {
        if (Position <= 0) {
            return false;
        }
        if (Position > this.SizeOfElement) {
            return false;
        }
        return true;
    }
}
