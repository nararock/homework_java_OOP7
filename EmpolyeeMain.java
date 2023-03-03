public class EmpolyeeMain {
    public static void main(String[] args) {
        Employee e1 = new Employee("Anna", "Smith", "Personnel Service", 1000);
        Employee e2 = new Employee("Anna", "Smith", "Technical Department", 1200);
        Employee e3 = new Employee("Anna", "Verdi", "Technical Department", 1200);

        System.out.println("e1: " + e1 + "\ne2: " + e2 + "\nрезультат сравнения (equals):" + e1.equals(e2) + "\n");
        System.out.println("e2: " + e2 + "\ne3: " + e3 + "\nрезультат сравнения (equals):" + e2.equals(e3) + "\n");

        System.out.println(e1.hashCode() == e2.hashCode());
        System.out.println(e2.hashCode() == e3.hashCode());
    }
}
