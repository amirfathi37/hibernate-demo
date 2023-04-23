package org.example;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "amir_laptop_table")
public class LapTop {
    @Id
    private Long laptopId;
    private String brand;
    @ManyToMany()
    private List<Student> student;

    public Long getLaptopId() {
        return laptopId;
    }

    public void setLaptopId(Long laptopId) {
        this.laptopId = laptopId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public List<Student> getStudent() {
        return student;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }
}
