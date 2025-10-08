package main;
public class Main {
    public static void main(String[] args) {
        //deklarasi class emplloyee
        Employee employee1 = new Employee();
        Employee employee2 = new Employee(1, "Rif'an Habibi", 15000);

        //menampilkan data
        employee1.displayData();
        System.out.println("Yearly salary: $" + employee1.yearSalary());
        System.out.println("====================================================");
        employee2.displayData();
        System.out.println("Yearly salary: $" + employee1.yearSalary(400));
    }
}

class Employee{ //class karyawan
    //deklarasi private variable
    private int id;
    private String name;
    private double salary;

    //non-argument constructor
    public Employee(){
        id = 0;
        name = "New Employee";
        salary = 0.0;
    }

    //parameterized constructor
    public Employee(int id, String name, double salary){
        this.id = id;
        this. name = name;
        this.salary = salary;
    }

    //overloading methods: gaji tahunan tanpa bonus
    public double yearSalary(){
        return this.salary * 12;
    }

    //gaji tahunan dengan bonus
    public double yearSalary(double bonuses){
        return (this.salary + bonuses) * 12;
    }

    //menampilkan data karyawan
    public void displayData(){
        System.out.println("Employee id: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Salary: $" + this.salary);
    }
}
