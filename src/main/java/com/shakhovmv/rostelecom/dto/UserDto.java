package com.shakhovmv.rostelecom.dto;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_user")
@Data
public class UserDto {
    @Id
    private Long id;
    private String name;
    private String surname;
    private Integer age;
    private String sex;

}
