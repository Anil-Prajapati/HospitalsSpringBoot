package com.spring.operation.model;

import io.swagger.v3.oas.annotations.Hidden;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "student-name-table",indexes = {
		@Index(name="idx_studentName_password", columnList ="student_name,student_password"),
		@Index(name="inx_stuentEmail_address",columnList = "student_email,student_address")
})
@Setter
@Getter
@ToString
@NoArgsConstructor
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Hidden
	@Column(name = "student_id")
	private int id;

	@Column(name = "student_name")
	private String name;

	@Column(name = "student_password")
	private int password;

	@Column(name = "student_number")
	private long phoneNumber;

	@Column(name = "student_email")
	private String email;

	@Column(name = "student_address")
	private String address;

	public Student(String name, int password, long phoneNumber, String email, String address) {
		super();
		this.name = name;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.address = address;
	}

}
