package org.example.dao;

import org.example.dto.CompanyDto;

import java.util.List;

public interface CompanyDAO {

    List<CompanyDto> getAllCompany();

    void saveCompany(CompanyDto companyDto);

    CompanyDto getOneCompany(String comp);

    void deleteCompany(String comp);

}
