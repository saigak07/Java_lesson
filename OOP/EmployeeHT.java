package OOP;

class EmployeeHT {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public EmployeeHT (String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public int getAge() {
        return age;
    }
   @Override
    public String toString(){
        return(name+ " -"
                +position+ " -"
                +email+ " -"
                +phone+ " -"
                +salary+ " -"
                +age);
    }

}