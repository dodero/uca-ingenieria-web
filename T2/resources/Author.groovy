package org.example

class Author {

	String name
	String surname
	
    static constraints = {
		name(blank: false)
		surname(blank: false)
    }
}
