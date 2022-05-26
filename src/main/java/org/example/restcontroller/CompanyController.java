package org.example.restcontroller;

import org.example.dto.CompanyDto;
import org.example.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Locale;

@RestController
@RequestMapping("/api")
public class CompanyController {

    @Autowired
    private CompanyService companyService;


    @GetMapping("/companies")
    public List<CompanyDto> getCompany(){
        return companyService.getAllCompany();
    }


    @GetMapping("/companies/{companyName}")
    public CompanyDto getOneCompany(@PathVariable String companyName){
        return companyService.getOneCompany(companyName.toUpperCase(Locale.ROOT));
    }


    @DeleteMapping("/companies/{companyName}")
    public void deleteOneCompany(@PathVariable String companyName){
        companyService.deleteCompany(companyName.toUpperCase(Locale.ROOT));
    }


    @PostMapping("/companies")
    public void createCompany(@RequestBody CompanyDto companyDto){
        companyService.saveCompany(companyDto);
    }
}
