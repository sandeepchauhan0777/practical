
class Student {
    int roll;
    String name;
    int m1, m2, m3;

    Student(int r, String n, int a, int b, int c) {
        roll = r;
        name = n;
        m1 = a;
        m2 = b;
        m3 = c;
    }

    void display() {
        int total = m1 + m2 + m3;
        System.out.println("Roll: " + roll);
        System.out.println("Name: " + name);
        System.out.println("Total: " + total);
        System.out.println("Percentage: " + total / 3.0 + "%");
    }

    public static void main(String[] args) {
        Student s1 = new Student(1, "Aman", 80, 90, 70);
        Student s2 = new Student(2, "Rahul", 75, 85, 80);
        Student s3 = new Student(3, "Rohit", 90, 95, 85);

        s1.display();
        s2.display();
        s3.display();
    }
}
