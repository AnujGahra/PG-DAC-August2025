package tech.codehunt.test.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Account {

    @Id
    private String id;

    @Column(unique = true, length = 16)
    private String accNo;

    @Column(length = 50)
    private String bankName;

    private String ifsc;

    @Column(length = 300)
    private String address;

    private String datetime;

    private String employeeId;
}
