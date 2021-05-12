
public class Main {

	public static void main(String[] args) {

		Tweet t = new Tweet("My cat is cool", "Mr. Fox");

		// t.likes = 100; This is an error bc 'likes' is PRIVATE
		// Instead I can use the method:
		t.like();
		// Or the setter method
		t.setLikes(100);

		// To access the value, I can use the getter method
		System.out.println("This tweet was liked " + t.getLikes() + " times.");

	}

}
