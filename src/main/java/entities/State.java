package entities;

public class State {
	private int Id;
	private String stateName;
	private String abbreviation;
	private String capital;
	private int stateHood;

	public State(int id, String stateName, String abbreviation, String capital, int stateHood) {
		super();
		Id = id;
		this.stateName = stateName;
		this.abbreviation = abbreviation;
		this.capital = capital;
		this.stateHood = stateHood;
	}

	public State() {
		super();
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getAbbreviation() {
		return abbreviation;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public int getStateHood() {
		return stateHood;
	}

	public void setStateHood(int stateHood) {
		this.stateHood = stateHood;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	@Override
	public String toString() {
		return "State [Id=" + Id + ", stateName=" + stateName + ", abbreviation=" + abbreviation + ", capital="
				+ capital + ", stateHood=" + stateHood + "]";
	}

}
