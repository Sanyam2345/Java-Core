package JavaGenerics;
@SuppressWarnings("unchecked")
public class IntroductionToGenerics<T>{
    T[] data = (T[]) new Object[3];

    public static void main(String[] args){
        IntroductionToGenerics<Integer> obj = new IntroductionToGenerics<>();
        obj.data[0] = 56;
        obj.data[1] = 45;
        obj.data[2] = 23;
        for (int i = 0; i < obj.data.length; i++) {
            System.out.println(obj.data[i]);
        }

    }
}
