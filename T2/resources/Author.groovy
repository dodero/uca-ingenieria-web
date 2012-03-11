package org.example

class Author {
	static hasMany = [books:Book]
	
	String name
	
	static constraints = {
		name(blank:false)
	}
	
}
