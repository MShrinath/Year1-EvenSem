package VotingSystem;

public class VoterInfo {
    private int voterId;
    private String name;
    private int age;
    private String city;
    private String gender;
    private String partySymbol;

    public VoterInfo(int voterId, String name, int age, String city, String gender, String partySymbol) {
        this.voterId = voterId;
        this.name = name;
        this.age = age;
        this.city = city;
        this.gender = gender;
        this.partySymbol = partySymbol;
    }

    public int getVoterId() {
        return voterId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public String getGender() {
        return gender;
    }

    public String getPartySymbol() {
        return partySymbol;
    }
}
