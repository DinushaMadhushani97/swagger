package lk.icta.swagger.swagger.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import io.swagger.annotations.ApiOperation;
import lk.icta.swagger.swagger.entity.Course;
import lk.icta.swagger.swagger.service.CourseService;

@RestController
@RequestMapping("/course")
public class CourseController {
	
	@Autowired
	private CourseService service;
	
	@PostMapping("/save")
//	@ApiOperation(value="it is saving new course")
	public String saveCourse( @RequestBody Course course ) {
		
		return service.saveCourse(course);
		
	}
	
	
   @GetMapping("/getCourse")
//   @ApiOperation(value="it will fetch all courses")
	public List<Course> getAllCourses() {
		return service.getAllCourse();
	}

  @DeleteMapping("/deleteCourse/{courseId}")
//  @ApiOperation(value= "it will delete course with id")
  public List<Course> deleteCourseById(@PathVariable int courseId)
  {
	return service.deleteCourseById(courseId);
  }


}