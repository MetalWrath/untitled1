package org.example.service;

import org.example.dao.CompanyDAO;
import org.example.dto.CompanyDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;



@Service
public class CompanyServiceImpliment implements CompanyService{

    @Autowired
    private CompanyDAO companyDAO;


    @Override
    @Transactional
    public List<CompanyDto> getAllCompany() {
        return companyDAO.getAllCompany();
    }

    @Override
    @Transactional
    public void saveCompany(CompanyDto companyDto) {
        companyDAO.saveCompany(companyDto);
    }


    @Override
    @Transactional
    public CompanyDto getOneCompany(String comp) {
        return companyDAO.getOneCompany(comp);
    }

    @Override
    @Transactional
    public void deleteCompany(String comp) {
        companyDAO.deleteCompany(comp);
    }
}
