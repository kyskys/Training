package service;

import java.util.Date;
import java.util.List;

import model.Lection;

public interface LectionService extends BaseService<Lection> {
	void addLectionToCourse (Long idLection, Long idCourse);
	void deleteLectionFromCourse (Long idLection);
	List<Lection> ListOfLectionsOnDate (Date date);
}
