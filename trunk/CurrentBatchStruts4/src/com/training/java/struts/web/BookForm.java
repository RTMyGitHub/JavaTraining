package com.training.java.struts.web;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class BookForm extends ActionForm {

	private String title;
	private String author;
	private String isbn;
	private int pages;
	private int id;
	private boolean updateFlag;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isUpdateFlag() {
		return updateFlag;
	}

	public void setUpdateFlag(boolean updateFlag) {
		this.updateFlag = updateFlag;
	}

	@Override
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {

		ActionErrors errors = new ActionErrors();

		if (StringUtils.isBlank(this.title)) {
			errors.add("title.missing", new ActionMessage(
					"error.title.required"));
		}
		if (StringUtils.isBlank(this.author)) {
			errors.add("author.missing", new ActionMessage(
					"error.author.required"));
		}
		if (StringUtils.isBlank(this.isbn)) {
			errors.add("isbn.errors", new ActionMessage("error.isbn.required"));
		}

		return errors;
	}

}
