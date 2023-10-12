package entity_one_to_many;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import entity_one_to_many.Employee;

@Entity
@Table(name = "departments")
public class Departament {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "departament_id")
    private int id;

    @Column(name = "departament_name")
    private String name;

    @Column(name = "min_salary")
    private int minSalary;

    @Column(name = "max_salary")
    private int maxSalary;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH , CascadeType.DETACH, CascadeType.MERGE},
            mappedBy = "departament")
    private List<Employee> employeeList;

    public Departament() {
    }

    public Departament(String name, int minSalary, int maxSalary) {
        this.name = name;
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
    }

    public void addEmployeeToDepartment(Employee employee){
        if (employeeList == null){
            employeeList = new ArrayList<>();
        }
        employeeList.add(employee);
        employee.setDepartament(this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(int minSalary) {
        this.minSalary = minSalary;
    }

    public int getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(int maxSalary) {
        this.maxSalary = maxSalary;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public String toString() {
        return "Departament{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", minSalary=" + minSalary +
                ", maxSalary=" + maxSalary +
                '}';
    }
}
