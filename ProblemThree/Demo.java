package ProblemThree;

public class Demo {
    public static void main(String[] args) {
        Point p1 = new Point();
        System.out.println(p1); // Output: (0.0,0.0)

        Point p2 = new Point(2.3f, 4.6f);
        System.out.println(p2); // Output: (2.3,4.6)

        MovablePoint mp1 = new MovablePoint();
        System.out.println(mp1); // Output: (0.0,0.0),speed=(0.0,0.0)

        MovablePoint mp2 = new MovablePoint(1.0f, 2.0f);
        System.out.println(mp2); // Output: (0.0,0.0),speed=(1.0,2.0)

        MovablePoint mp3 = new MovablePoint(3.0f, 4.0f, 5.0f, 6.0f);
        System.out.println(mp3); // Output: (3.0,4.0),speed=(5.0,6.0)

        mp3.move();
        System.out.println(mp3); // Output after move: (8.0,10.0),speed=(5.0,6.0)

        mp3.move();
        System.out.println(mp3); // Output after another move: (13.0,16.0),speed=(5.0,6.0)
    }
}
