package com.fathi;

import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "amir_citizen")
public class Citizen {
    @Id
    @GeneratedValue
    private Long citizenId;
    private String citizenName;
    @OneToMany(mappedBy = "owner" ,fetch = FetchType.EAGER)
    private List<Car> cars = new ArrayList<Car>();

    public Long getCitizenId() {
        return citizenId;
    }

    public void setCitizenId(Long citizenId) {
        this.citizenId = citizenId;
    }

    public String getCitizenName() {
        return citizenName;
    }

    public void setCitizenName(String citizenName) {
        this.citizenName = citizenName;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }


}
