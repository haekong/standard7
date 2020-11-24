package com.project.standard.services;

import com.project.standard.models.DeptDTO;

import java.util.List;

public interface DeptService {
    List<DeptDTO> selectDept();
}