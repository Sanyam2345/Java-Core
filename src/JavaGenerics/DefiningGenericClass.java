package JavaGenerics;

class MyData<T> {
    private T data;
    public void setData(T data) {
        this.data = data;
    }
    public T getData() {
        return data;
    }
}

@SuppressWarnings("unchecked")
class MyArray<T> {
    private final T[] arr = (T[]) new Object[10];
    int length = 0;
    public void append (T data) {
        arr[length++] = data;
    }
    public void display() {
        for (int i = 0; i < length; i++) {
            System.out.println(arr[i]);
        }
    }
}
public class DefiningGenericClass {
    public static void main(String[] args) {
        MyData<String> d = new MyData<>();
        d.setData("Hello");
        System.out.println(d.getData());
        MyArray<Integer> a = new MyArray<>();
        a.append(10);
        a.append(20);
        a.append(30);
        a.display();
    }
}
