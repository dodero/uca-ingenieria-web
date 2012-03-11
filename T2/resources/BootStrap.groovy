import org.example.Book

class BootStrap { 
	
 def init = { servletContext -> 
  // Check whether the test data already exists. 
   if (!Book.count()) { 
     new Book(author: "John R. R. Tolkien", title: "The Simarillion").save(failOnError: true)
     new Book(author: "John R. R. Tolkien", title: "The Hobbit").save(failOnError: true)
     new Book(author: "John R. R. Tolkien", title: "The Lord of the Rings").save(failOnError: true)
     new Book(author: "George R. R. Martin", title: "A Song of Ice and Fire: 1 A Game of Thrones").save(failOnError: true)
     new Book(author: "George R. R. Martin", title: "A Song of Ice and Fire: 2 A Clash of Kings").save(failOnError: true) 
     new Book(author: "George R. R. Martin", title: "A Song of Ice and Fire: 3 A Storm of Swords").save(failOnError: true)
     new Book(author: "George R. R. Martin", title: "A Song of Ice and Fire: 4 A Feast for Crows").save(failOnError: true)
   } 
 }

 def destroy = { 
 } 
}
