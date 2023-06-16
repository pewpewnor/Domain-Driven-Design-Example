package service.factory;

import model.Student;

public class StudentFactory extends Factory {

	public static Student createStudent(int id, String name, String email, String password, int courseId) {
		return new Student(id, name, email, password, courseId);
	}

}