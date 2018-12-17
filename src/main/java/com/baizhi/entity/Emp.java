package com.baizhi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "emp")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Emp implements Serializable {
    @Id
    private Integer id;
    private String name;
    private Double salary;
    private Integer age;
}
