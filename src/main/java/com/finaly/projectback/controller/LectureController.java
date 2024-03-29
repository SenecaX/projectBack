package com.finaly.projectback.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.finaly.projectback.entity.LectureEntity;
import com.finaly.projectback.repo.LectureRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4201")
public class LectureController {
	
	@Autowired
	private LectureRepository lectureRepository;
	
	@GetMapping("/lectures")
	@ResponseBody
	public List<LectureEntity> getLectures() {
		return (List<LectureEntity>) lectureRepository.findAll();
	}
	
	@PostMapping("/lectures")
	void addLecture(@RequestBody LectureEntity lecture) {
		System.out.println(lecture);
		lectureRepository.save(lecture);
	}
	
}
