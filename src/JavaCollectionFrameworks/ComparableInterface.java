package JavaCollectionFrameworks;
import java.util.*;

class Point implements Comparable {
    int x;
    int y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
    public int compareTo(Object o) {
        Point p = (Point)o;
        if (this.x < p.x) {
            return -1;
        }
        else if (this.x > p.x) {
            return 1;
        }
        else {
            if (this.y < p.y) {
                return -1;
            }
            else if (this.y > p.y) {
                return 1;
            }
            else {
                return 0;
            }
        }
    }
}

public class ComparableInterface {
    public static void main(String[] args) {
        TreeSet<Point> set = new TreeSet<Point>();
        set.add(new Point(1, 2));
        set.add(new Point(3, 4));
        set.add(new Point(5, 6));
        set.add(new Point(7, 8));

        System.out.println(set);
    }
}
