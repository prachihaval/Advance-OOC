class Student {
    int rollNo;

    void setRollNo(int r) {
        rollNo = r;
    }

    int getRollNo() {
        return rollNo;
    }
}

class Test extends Student {
    float sub1, sub2;

    void setMarks(float m1, float m2) {
        sub1 = m1;
        sub2 = m2;
    }

    void getMarks() {
        System.out.println("Subject 1: " + sub1);
        System.out.println("Subject 2: " + sub2);
    }
}

interface Sports {
    float sMarks = 50;
    void set();
}

class Result extends Test implements Sports {

    public void set() {
        System.out.println("Sports Marks: " + sMarks);
    }

    void display() {
        float total = sub1 + sub2 + sMarks;
        System.out.println("Roll No: " + getRollNo());
        getMarks();
        set();
        System.out.println("Total Marks: " + total);
    }
}

public class ResultProgram {
    public static void main(String[] args) {
        Result r = new Result();

        r.setRollNo(101);
        r.setMarks(75, 85);
        r.display();
    }
}