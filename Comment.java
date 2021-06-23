package proje;

public class Comment {
	private String text;
	public Comment(String t) {
		text = t;
	}
	private int numberOfLikes;
	private int numberOfDislikes;
	private boolean isReported = false;
	private String commentOwner;
	
	/**
	 * Audience i�in ekledim.
	 */
	public void report()
	{
		if(!isReported)
			isReported = true;
		else
			System.out.println("This comment is already reported!");
	}
	/**
	 * Audience i�in ekledim.
	 */
	public void incrementLike()
	{
		numberOfLikes++;
	}
	/**
	 * Audience i�in ekledim.
	 */
	public void incrementDislike()
	{
		numberOfDislikes++;
	}
	/**
	 * Audience i�in ekledim.
	 */
	public int getNumberOfLikes()
	{
		return numberOfLikes;
	}
	/**
	 * Audience i�in ekledim.
	 */
	public int getNumberOfDislikes()
	{
		return numberOfDislikes;
	}
	@Override
	/**
	 * Audience i�in ekledim.
	 */
	public String toString()
	{
		return String.format(text + "\nCommented by " + commentOwner);
	}
}
