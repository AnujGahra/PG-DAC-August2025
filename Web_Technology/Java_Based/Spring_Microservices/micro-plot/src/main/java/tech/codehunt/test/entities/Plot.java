package tech.codehunt.test.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Plot {
	
	
	@Id
	private String id;

	@Column( length = 30)
	private String area;

	@Column(length = 100)
	private String coloneyName;

	@Column(length = 100)
	private String cityName;

	private int pincode;

	private String datetime;

	private String employeeId;

}
