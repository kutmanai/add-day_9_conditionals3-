package repeattask;

public class Book {
	private String author;
	private int id;
    private String title;
    private int pages;
    
    private static int unknownAuthor;
	public static String capitalize(String word) {
		String arr1="";
		word=word.toUpperCase();
		String[] arr= word.split(" ");
		
		for(String arr2:arr) {
			arr1+=arr2.charAt(0)+arr2.substring(1).toLowerCase() +" ";
		}
		return arr1.trim();
	}
	
	
	public static boolean isTitleWord(String word) {
		String[] arr= {"a","an","the","and","but","for","nor","or","so","yet","at","by","in","into","near","of","on","to","than","via"};
		for(String newarr:arr) {
			if(newarr.equalsIgnoreCase(word)) {
				return false;
			}
		}
		return true;
	}
	
	public Book(int id, String author,String title,int pages) {
		setId(this.id=id);
		setAuthor(this.author=author);
		setTitle(this.title=title);
		setPages(this.pages=pages);
	}
	
	public void setAuthor(String author) {
		if(author.isEmpty()) {
			this.author="Unknown";
			unknownAuthor++;
			
		}else {
			this.author=capitalize(author);
		}
	}
	
	public void setTitle(String word) {
		String []arr=title.split(" ");
		String newTitle="";
		
		if(title.isEmpty()) {
			this.title="";
		}else {
			for(int i=0; i<arr.length;i++) {
				if(i==0) {
					newTitle+=capitalize(arr[i])+" ";
				}else if(isTitleWord(arr[i])) {
					newTitle+=capitalize(arr[i])+" ";
				}else {
					newTitle+=arr[i].toLowerCase()+" ";
				}
			}
		}
		this.title=newTitle.trim();
	}
	public String toString() {
		String str="Book["+"author="+this.author+"," + "" +"title="+this.title+"," + "" + "id"+this.id
	}

}
