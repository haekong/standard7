package com.project.standard.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class DeptDTO implements Serializable {
    private int deptno;
    private String dname;
}
