package service;

import model.Lector;

public interface LectorService extends BaseService<Lector> {
	void addCourseToLector(Long idLector, Long idCourse);

	void deleteCourseFromLector(Long idLector, Long idCourse);
}
