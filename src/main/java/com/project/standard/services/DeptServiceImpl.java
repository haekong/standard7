package com.project.standard.services;

import com.project.standard.models.DeptDAO;
import com.project.standard.models.DeptDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDAO deptDAO;

    @Override
    public List<DeptDTO> selectDept() {
        return deptDAO.selectDept();
    }
}