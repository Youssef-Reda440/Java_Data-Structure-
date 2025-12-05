public class List {

    private int[] arr;
    private int size;

    public List(int capacity) {
        this.arr = new int[capacity];
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == arr.length;
    }

    private void resize() {
        int[] newArr = new int[arr.length * 2];
        for (int i = 0; i < size; i++)
            newArr[i] = arr[i];
        arr = newArr;
    }

    public void add(int index, int value) {
        if (index < 0 || index > size) {
            System.out.println("Invalid index");
            return;
        }

        if (isFull())
            resize();

        for (int i = size; i > index; i--)
            arr[i] = arr[i - 1];

        arr[index] = value;
        size++;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index");
            return;
        }

        for (int i = index; i < size - 1; i++)
            arr[i] = arr[i + 1];

        arr[size - 1] = 0;
        size--;
    }

    public int Array_Size() {
        return size;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index");
            return 0;
        }
        return arr[index];
    }

    public void set(int index, int value) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index");
            return;
        }
        arr[index] = value;
    }

  
    public void clear() {
        for (int i = 0; i < size; i++)
            arr[i] = 0;
        size = 0;
    }

    public int search(int value) {
        for (int i = 0; i < size; i++) {
            if (arr[i] != 0 && arr[i] == value)
                return i;
        }
        return -1;
    }

    public void display() {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
