package com.spring.demo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.spring.demo.beans.Student;
import com.spring.demo.repo.StudentRepo;

@Controller
public class StudentController {
	@Autowired
	private StudentRepo repo;
	
	@GetMapping("/student")
	public String showHomePage(HttpServletRequest req,HttpServletResponse res) {
		//HttpSession session=req.getSession();
		//session.setAttribute("name", "sreejith");
	return "insert";
	}
	@PostMapping("/insertAction")
	public String student(Student student,Model model) {
		repo.save(student);
		model.addAttribute("student",student);
		System.out.println(student.getUsername());
		System.out.println(student.getPassword());
		return "home";
}
	@GetMapping("/view")
	public String viewStudent(Model model) {
		List<Student> studentList=new ArrayList<Student>();
		//studentList=repo.findAll();
		studentList=repo.findByUsername("sreejith");
		
		model.addAttribute("studentList",studentList);
		for(Student st:studentList)
		System.out.println(st.getUsername());
		//System.out.println(st.getPassword());
		return "view";
	}
	
}
