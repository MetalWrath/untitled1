package org.example.dao;

import org.example.dto.CompanyDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;
import java.util.Locale;

@Repository
public class CompanyDAOImpl implements CompanyDAO{
    @Autowired
    EntityManager entityManager;


    @Override
    public List<CompanyDto> getAllCompany() {
        Query query = entityManager.createQuery("FROM CompanyDto");
        List<CompanyDto> companyDtoList = query.getResultList();

        return companyDtoList;
    }

    @Override
    public void saveCompany(CompanyDto companyDto) {
        entityManager.merge(companyDto);
    }


    @Override
    public CompanyDto getOneCompany(String comp) {
        CompanyDto companyDto = entityManager.find(CompanyDto.class, comp.toUpperCase(Locale.ROOT));

        return companyDto;
    }

    @Override
    public void deleteCompany(String comp) {
        Query query = entityManager.createQuery("DELETE FROM CompanyDto WHERE name=:compName");
        query.setParameter("compName", comp);
        query.executeUpdate();
    }
}
