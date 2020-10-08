package com.Assignment.JPADemo.Controller;


import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.Assignment.JPADemo.Repository.EmployeeRepo;
import com.Assignment.JPADemo.model.Employee;




@RestController
public class MyController {
	@Autowired
	EmployeeRepo employeeRepository;

	@PostMapping("/save")
	public String saveEmp(@RequestBody Employee emp){
		employeeRepository.save(emp);
		return "Saved";
		
	}
	
	
	
    @PostMapping("/uploadfile")
    public String insertImage(@RequestParam MultipartFile file) throws IllegalStateException, IOException {
       
        String fileName=file.getOriginalFilename();
        File f=new File("C:\\Users\\hp\\Desktop\\ImageTest\\"+fileName);
        file.transferTo(f);
        String fileLocation = f.getAbsolutePath();
        System.out.println(fileLocation);
        return "Image inserted";
    }
   
     
}
