package org.example

class Author {
	static hasMany = [book:Book]
	
	String name
	String surname
	
	static constraints = {
		name(blank:false)
		surname(blank:false)
	}
	
}
