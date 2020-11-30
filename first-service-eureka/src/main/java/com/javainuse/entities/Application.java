package com.javainuse.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "Application")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Application {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @PrimaryKeyJoinColumn
    private Long id;
    @Column(name="name", length = 100)
    private String name;
    @Column(name="phone", length = 11)
    private String phone;
    @Column(name="identityNo", length = 11)
    private String identityNo;
    @Column(name="salary", length = 15)
    private Long salary;
    @Column(name="checkState", length = 15)
    private String checkState;
    @Column(name="creditLimit", length = 15)
    private Long creditLimit;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIdentityNo() {
        return identityNo;
    }

    public void setIdentityNo(String identityNo) {
        this.identityNo = identityNo;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public String getCheckState() {
        return checkState;
    }

    public void setCheckState(String checkState) {
        this.checkState = checkState;
    }

    public Long getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(Long creditLimit) {
        this.creditLimit = creditLimit;
    }
}
