package org.example.service;

import org.example.dto.CompanyDto;

import java.util.List;


public interface CompanyService {
    List<CompanyDto> getAllCompany();

    void saveCompany(CompanyDto companyDto);

    CompanyDto getOneCompany(String comp);

    void deleteCompany(String comp);
}
