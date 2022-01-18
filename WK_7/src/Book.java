
public class Book {
	String btitle;
	String bauthor;
	String bNumber_of_pages;
	String bpublisher;
	
	public String getbtitle() {
		return btitle;
	}
	
	public void setbtitle(String btitle) {
		this.btitle = btitle;
	}
	
	public String getbauthor() {
		return bauthor;
	}
	
	public void setbauthor(String bauthor) {
		this.bauthor = bauthor;
	}
	
	public String getbNumber_of_pages() {
		return bNumber_of_pages;
	}
	
	public void setbNumber_of_pages(String bNumber_of_pages) {
		this.bNumber_of_pages = bNumber_of_pages;
	}
	
	public String getbpublisher() {
		return bpublisher;
	}
	
	public void setbpublisher(String bpublisher) {
		this.bpublisher = bpublisher;
	}
	
	public static void main(String[] args) {
		Book b1 = new Book();
		b1.setbtitle("Alice in Wonderland");
		b1.setbauthor("Lewis Carroll");
		b1.setbNumber_of_pages("208");
		b1.setbpublisher("Macmillan");
		
		System.out.println(b1.getbtitle());
		System.out.println(b1.getbauthor());
		System.out.println(b1.getbNumber_of_pages());
		System.out.println(b1.getbpublisher());
		
	}
}
