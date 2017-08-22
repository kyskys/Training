package model;

import java.io.Serializable;

import annotation.PrintableField;

public class BaseModel implements Serializable {
	@PrintableField(name = "name")
	private String name;
	@PrintableField(name = "id", order = 2)
	private Long id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		BaseModel bm = (BaseModel) obj;
		if (id != null && bm != null && bm.getId() != null) {
			return id.equals(bm.getId());
		}
		return false;
	}
}
