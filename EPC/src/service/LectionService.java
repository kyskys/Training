package service;

import model.Lection;

public interface LectionService extends BaseService<Lection> {
	void addLectionToCourse (Long idLection, Long idCourse);
	void deleteLectionFromCourse (Long idLection);
	
}
