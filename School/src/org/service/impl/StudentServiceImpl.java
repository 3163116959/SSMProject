package org.service.impl;

import java.util.List;

import org.entity.Student;
import org.mapper.StudentMapper;
import org.service.StudentService;

public class StudentServiceImpl implements StudentService{
	//service调用mapper
	private StudentMapper studentMapper;
	
	public void setStudentMapper(StudentMapper studentMapper) {
		this.studentMapper = studentMapper;
	}

	//查询全部
	@Override
	public List<Student> queryAll() {
		return studentMapper.queryAll();
	}

	//根据学号查
	@Override
	public List<Student> queryByStuId(String stuId) {
		return studentMapper.queryByStuId(stuId);
	}

	//根据班级查
	@Override
	public List<Student> queryByClassName(String className) {
		return studentMapper.queryByClassName(className);
	}

	//根据姓名查询
	@Override
	public List<Student> queryBystuName(String stuName) {
		return studentMapper.queryBystuName(stuName);
	}

	//根据学号删除学生
	@Override
	public int deleteBystuId(String stuId) {
		return studentMapper.deleteBystuId(stuId);
	}

	//添加学生
	@Override
	public int addStudent(Student student) {
		return studentMapper.addStudent(student);
	}

	//修改学生
	@Override
	public int alterStudent(Student student) {
		return	studentMapper.alterStudent(student);
	
	}

	//查询全部学号
	@Override
	public List<String> queryStuId() {
		return studentMapper.queryStuId();
	}

	
}
