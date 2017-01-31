package service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import dao.BaseDAO;
import dao.CourseDAO;
import dao.LectionDAO;
import dao.impl.CourseDAOImpl;
import dao.impl.LectionDAOImpl;
import service.LectionService;
import model.Course;
import model.Lection;

public class LectionServiceImpl extends BaseServiceImpl<Lection> implements
		LectionService {
	private CourseDAO courseDAO = new CourseDAOImpl();
	private LectionDAO lectionDAO = new LectionDAOImpl();

	@Override
	protected BaseDAO<Lection> getBaseDAO() {
		return lectionDAO;
	}

	@Override
	public void addLectionToCourse(Long idLection, Long idCourse) {
		Lection lection = lectionDAO.get(idLection);
		Course course = courseDAO.get(idCourse);
		lection.setCourse(course);
		course.getLections().add(lection);
	}

	@Override
	public void deleteLectionFromCourse(Long idLection) {
		Lection lection = lectionDAO.get(idLection);
		Course course = courseDAO.get(lection.getCourse().getId());
		course.getLections().remove(lection);
		lection.setCourse(null);
	}

	@Override
	public List<Lection> ListLecionOnDate(Date date) {
		List<Lection> list = new ArrayList<Lection>();
		for (Lection l : lectionDAO.getAll()) {
			if (l.getDate().compareTo(date) == 0) {
				list.add(l);
			}
		}
		return list;
	}

	
}
