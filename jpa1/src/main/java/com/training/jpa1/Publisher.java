package com.training.jpa1;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
@Access(AccessType.FIELD)
@SequenceGenerator(name = "generator_publisher_id_seq", sequenceName = "publisher_id_seq", allocationSize = 1)
public class Publisher {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generator_publisher_id_seq")
	private int id;
	private String name;
	private String address;
	private String city;

	@Column(name = "zip_code")
	private String zipCode;

	// When FetchType is EAGER, observe that it retrieves the Book details also
	// along with the Publisher.
	// When FetchType is LAZY (default for Collection types), observe that Book
	// details will not be fetched along with the Publisher. When you try to
	// first access the books (through getBooks()), then it makes a fresh
	// database call and retrieves and the Books. If EntityManager is closed by
	// then, it will throw LazyInitializationException.
	@OneToMany(mappedBy = "publisher", targetEntity = Book.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Collection<Book> books;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public Collection<Book> getBooks() {
		return books;
	}

	public void setBooks(Collection<Book> books) {
		this.books = books;
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();

		sb.append("Name = " + this.name + "\n");
		sb.append("Address = " + this.address + "\n");
		sb.append("City = " + this.city + "\n");
		sb.append("ZipCode = " + this.zipCode + "\n");

		return sb.toString();
	}
}
