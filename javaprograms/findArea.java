import java.io.*;

interface Area {
    final float pi = 3.14f;

    float area(int r);
}

class areaCircle implements Area {
    public float area(int r) {
        return (pi * r * r);
    }
}

class areaSphere implements Area {
    public float area(int r) {
        return (4 * pi * r * r);
    }
}

class findArea {
    public static void main(String arg[]) {
        int r;
        BufferedReader din = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Enter radius to find area of circle and sphere:");
            r = Integer.parseInt(din.readLine());
            areaCircle a1= new areaCircle();
            areaSphere a2= new areaSphere();
            System.out.println("Area of Circle:" + a1.area(r));
            System.out.println("Area of Sphere:" + a2.area(r));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}