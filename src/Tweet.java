
public class Tweet {
	// Instance variables should be PRIVATE
	// This means they cannot be accessed directly from outside the class
	private String text;
	private String author;
	private int likes;

	// Class method are usually PUBLIC
	// This allows the outside world to interact with our objects
	public Tweet() {
		text = "";
		author = "";
		likes = 0;
	}

	public Tweet(String text, String author) {
		this.text = text;
		this.author = author;
		likes = 0;
	}

	// GETTER and SETTER methods allow us to access and change the instance
	// variables without making them public
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public void like() {
		likes++;
		System.out.println("You liked this");
	}

	// Post: appends reply and name to text
	public void addReply(String reply, String name) {
		text += "\n > " + reply + "\n  -" + name;
	}

	// Post: Returns the object as a String
	public String toString() {
		return author + " tweeted \n" + text + "\n" + likes + " likes";
	}

}
