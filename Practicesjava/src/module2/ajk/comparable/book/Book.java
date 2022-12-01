package module2.ajk.comparable.book;

public class Book implements Comparable {
	String title;
	int pages;
	public Book(String title,int pages) {
		super();
		// TODO Auto-generated constructor stub
		this.title = title;
		this.pages = pages;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", pages=" + pages + "]";
	}
	@Override
	public int compareTo(Object x) {
		// TODO Auto-generated method stub
		Book b = (Book)x;
//		return pages-b.pages;
		return title.compareTo(b.title);
	}
	
	
	
}
