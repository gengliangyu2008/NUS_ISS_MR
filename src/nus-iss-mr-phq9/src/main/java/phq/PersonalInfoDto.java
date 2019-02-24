package phq;

public class PersonalInfoDto {
    private boolean gender;
    private int age;
    private String ethnicity;
    private String maritalStatus;
    private String chronicPhysicalCdn;

    public PersonalInfoDto(boolean gender, int age, String ethnicity, String maritalStatus, String chronicPhysicalCdn) {
        this.gender = gender;
        this.age = age;
        this.ethnicity = ethnicity;
        this.maritalStatus = maritalStatus;
        this.chronicPhysicalCdn = chronicPhysicalCdn;
    }

    public PersonalInfoDto() {
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public void setChronicPhysicalCdn(String chronicPhysicalCdn) {
        this.chronicPhysicalCdn = chronicPhysicalCdn;
    }

    public boolean isGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getEthnicity() {
        return ethnicity;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public String getChronicPhysicalCdn() {
        return chronicPhysicalCdn;
    }
}
