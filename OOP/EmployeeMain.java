package OOP;

public class EmployeeMain {
    public static void main(String[] args) {

        EmployeeHT[] division = new EmployeeHT[5];

        division[0]  = new EmployeeHT("Alexey Sitnikov", "Engineer" , "asitnikov@mail.ru", "8-906609", 65000, 26);
        division[1]  = new EmployeeHT("Viktor Dolin", "Worker" , "vdolin@mail.ru", "8-906639", 45000, 41);
        division[2]  = new EmployeeHT("Oleg Starikov", "Driver" , "starikov@mail.ru", "8-903639", 85000, 39);
        division[3]  = new EmployeeHT("Rodion Melnikov", "Director" , "melnikov@mail.ru", "8-906669", 44000, 30);
        division[4]  = new EmployeeHT("Ivan Tokarev", "Accountant" , "tokarev@mail.ru", "8-906739", 47000, 22);

        printEmployee(division[3]);

        System.out.println("---------------------------------------------------------------------------");

        printEmployeeOlder40(division);

    }

    public static void printEmployee (EmployeeHT emp){
                System.out.println(emp);
    }



    public static void printEmployeeOlder40 (EmployeeHT division[]){
        for (EmployeeHT temp : division)
            if (temp.getAge()>40)
                System.out.println(temp);

    }
}