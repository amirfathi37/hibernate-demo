package org.example;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "amir_student_table")
public class Student {
    @Id
    private Long studentId;
    private String name;
    @ManyToMany(mappedBy = "student")
    private List<LapTop> laptops = new ArrayList<LapTop>();

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<LapTop> getLaptops() {
        return laptops;
    }

    public void setLaptops(List<LapTop> laptops) {
        this.laptops = laptops;
    }
}
