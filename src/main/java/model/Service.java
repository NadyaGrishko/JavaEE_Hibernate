package model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "service")
public class Service {
    @Id
    @GeneratedValue
    private int serviceId;

    @Column(name = "firstname")
    private String firstname;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "birth_date")
    private Date birthDate;

    @Column(name = "cell_phone")
    private String cellphone;

    public Service(String firstname, String lastname, Date birthDate, String cellphone) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthDate = birthDate;
        this.cellphone = cellphone;
    }

    public int getServiceId() {
        return serviceId;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }
}