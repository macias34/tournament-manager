enum Title {
	V, IV, III, II, I, M, CM, WCM, FM, WFM, IM, WIM, GM, WGM
}

public class Player {
	private String name;
	private String surname;
	private String dateOfBirth;
	private String club;
	private String FIDERating;
	private String PZSzachRating;
	private Title title;
	private double score;

	public Player(String name, String surname, String dateOfBirth, String club, String fIDERating, String pZSzachRating,
			Title title, double score) {
		this.name = name;
		this.surname = surname;
		this.dateOfBirth = dateOfBirth;
		this.club = club;
		FIDERating = fIDERating;
		PZSzachRating = pZSzachRating;
		this.title = title;
		this.score = score;
	}

}
