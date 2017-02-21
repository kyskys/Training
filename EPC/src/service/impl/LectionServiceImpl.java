package service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import dao.BaseDAO;
import dao.CourseDAO;
import dao.LectionDAO;
import resourses.DependencyManager;
import service.LectionService;
import sort.SortByName;
import sort.SortLectionByDate;
import sort.SortParams;
import model.Course;
import model.Lection;

public class LectionServiceImpl extends BaseServiceImpl<Lection> implements
		LectionService {
	private CourseDAO courseDAO = DependencyManager
			.getInstance(CourseDAO.class);
	private LectionDAO lectionDAO = DependencyManager
			.getInstance(LectionDAO.class);

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
	public List<Lection> ListOfLectionsOnDate(Date date) {
		List<Lection> list = new ArrayList<Lection>();
		for (Lection l : lectionDAO.getAll()) {
			if (l.getDate().compareTo(date) == 0) {
				list.add(l);
			}
		}
		return list;
	}

	@Override
	public void sort(SortParams params, List<Lection> list) {
		if (params != null) {
			switch (params) {
			case NAME: {
				list.sort(new SortByName());
				break;
			}
			case DATE: {
				list.sort(new SortLectionByDate());
				break;
			}
			default:
				break;
			}
		}
	}
}
