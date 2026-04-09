package Book;

public class Book { 
		String title; 
		boolean borrowed;

public Book (String t) { 
			title = t; 
			borrowed = false;

	}
public void borrowedBook() {
	  borrowed = true;
}
public void returnBook() {
	borrowed = false;
}
public String getTitle() {
	return title;
}
public boolean isBorrowed() {
	return borrowed;
}
}
